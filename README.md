# 注意

本人现在没有在做用友相关二次开发工作了，所以无法回答各位的问题，<span style="color:#F56C6C">请勿发邮件咨询问题！</span>

# 文档结构

```
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─hellozjf
│  │  │          └─test
│  │  │              └─u8eai
│  │  │                  ├─controller
│  │  │                  ├─domain
│  │  │                  │  └─jaxb
│  │  │                  ├─service
│  │  │                  └─tools
│  │  ├─resources
│  │  │  └─Template
│  │  └─webapp
│  │      └─WEB-INF
│  │          └─jsp
│  └─test
└─xsd

```

# 文件夹功能介绍

| 文件夹名称                                    | 文件夹功能                                    |
| ---------------------------------------- | ---------------------------------------- |
| src/main/resources                       | 存放了SpringBoot的配置文件以及EAI参考文档              |
| src/main/resources/Template              | 用于存放原始XML文件，这些文件取自用友的Template文件夹         |
| xsd                                      | 用于存放XML文件生成的XSD文件                        |
| src/main/java/com/hellozjf/test/u8eai/domain/jaxb | 用于存放XSD文件生成的Java文件，这些Java文件带有JAXB注释，能够与XML进行转换 |
| src/main/java/com/hellozjf/test/u8eai/tools | 这个文件夹下面有三个工具类：CreateJAXB用于通过XML生成XSD以及Java类；EAITool用于与用友EAI服务器进行交互；JAXBUtil用于将Java类与XML进行转换 |
| src/main/java/com/hellozjf/test/u8eai/service | 实现各个domain类的增删改查功能，为controller提供服务       |
| src/main/java/com/hellozjf/test/u8eai/controller | 调用增删改查功能                                 |
| src/main/webapp/WEB-INF/jsp              | 视图，显示增删改查的结果                             |

# 工程初始化操作

其实下载过来的工程已经是初始化好的了，如果要修改包名，那么可以修改`src/main/java/com/hellozjf/test/u8eai/tools/CreateJAXB.java`的代码，然后运行它生成带JAXB注释的Java类。

下面是CreateJAXB.java的主要代码

```
public static void main(String[] args) throws Exception {
    
    // 在当前工程目录创建xsd目录，之后根据XML生成的XSD文件会放在该目录下
    new File("xsd").mkdir();
    
    // 遍历src/main/resources/Template下面的XML文件
    URL url = CreateJAXB.class.getClassLoader().getResource("Template");
    File dir = new File(url.getPath());
    File[] files = dir.listFiles();
    for (int i = 0; i < files.length; i++) {
        File file = files[i];
        if (file.getName().endsWith(".xml")) {
            
            // 为每个XML文件创建一个XSD文件，注意要自己去网上下载xsd.exe，并把它放到PATH路径下，例如放在C:/Windows/system32
            createXSD(file);
            
            // 获取小写的文件名，因为后面生成的包名最好是按小写来，我的demo也是按小写的包名读取的
            String name = file.getName().replaceAll(".xml", "").toLowerCase();
            
            // 将XSD文件转化为Java文件，包名为com.hellozjf.test.u8eai.domain.jaxb.文件名，并且为UTF-8编码
            Runtime.getRuntime().exec("xjc -encoding utf-8 -d " + getCurrentProjectPath() + "/src/main/java/" + " -p com.hellozjf.test.u8eai.domain.jaxb." + name + " xsd/" + name + ".xsd");
        }
    }
    
}
```

# 添加新的增删改查业务

## Service

查看`src/main/java/com/hellozjf/test/u8eai/service/ReceiveSendTypeService.java` ，这个类实现了完整的增删改查逻辑。

### sender

**注意，我的demo代码使用了001作为sender，所以EAI服务器必须有这个账号。** 添加这个账号的方法如下：
![](http://ody3ivli2.bkt.clouddn.com/2017/09/30/TIM截图20170930192625.png)

![](http://ody3ivli2.bkt.clouddn.com/2017/09/30/TIM截图20170930192841.png)

### Ufinterface

**另外还要注意，代码中有很多中Ufinterface，导入的时候不要搞错了。** 例如

```
import com.hellozjf.test.u8eai.domain.jaxb.receivesendtype.Ufinterface;
import com.hellozjf.test.u8eai.domain.jaxb.receivesendtype.Ufinterface.Receivesendtype;
```

```
import com.hellozjf.test.u8eai.domain.jaxb.saleorder.Ufinterface;
import com.hellozjf.test.u8eai.domain.jaxb.saleorder.Ufinterface.Saleorder;
```

前者是receivesendtype所用到的Ufinterface，后者是saleorder所用到的Ufinterface。每个Ufinterface里面的内部类是不一样的。

## Controller

查看`src/main/java/com/hellozjf/test/u8eai/controller/ReceiveSendTypeController.java` ，这个类调用了Service层的增删改查逻辑，并将执行结果显示在网页上面。

# 验证新增业务是否正确

在Eclipse中Run on Server启动SpringBoot。

## 查询

```
http://localhost:8080/u8eai/ReceiveSendType/list
```

![](http://ody3ivli2.bkt.clouddn.com/2017/09/30/TIM截图20170930200315.png)

## 添加

```
http://localhost:8080/u8eai/ReceiveSendType/add?code=120&name=hellozjf&endFlag=1&sort=2&rsflag=1&bRetail=0
```

![](http://ody3ivli2.bkt.clouddn.com/2017/09/30/TIM截图20170930200046.png)

## 修改

```
http://localhost:8080/u8eai/ReceiveSendType/edit?code=120&name=%E5%91%A8%E9%9D%96%E5%B3%B0&endFlag=1&sort=2&rsflag=1&bRetail=0
```

![](http://ody3ivli2.bkt.clouddn.com/2017/09/30/TIM截图20170930200128.png)

## 删除

```
http://localhost:8080/u8eai/ReceiveSendType/del?code=120
```

![](http://ody3ivli2.bkt.clouddn.com/2017/09/30/TIM截图20170930200230.png)