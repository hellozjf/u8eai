package com.hellozjf.test.u8eai.tools;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class CreateJAXB {
    
    public static String getCurrentProjectPath() throws Exception {
        File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        return courseFile;
    }
    
    public static void createXSD(File xmlFile) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("xsd.exe " + xmlFile + " /outputdir:xsd");
    }
    
    public static Element getXsComplexType(Document document) throws Exception {
        Element root = document.getRootElement();
        List<Element> elements = root.elements();
        for (Element element : elements) {
            if (element.attribute("name").getValue().equals("ufinterface")) {
                Element e2 = element.element("complexType");
                return e2.element("sequence");
            }
        }
        return null;
    }
    
    public static void generateXSD() throws Exception {
        File dir = new File("xsd");
        File[] files = dir.listFiles();
        
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(files[0]);
        Element xsSequence = getXsComplexType(document);
        
        for (int i = 1; i < files.length; i++) {
            Document tmpDoc = saxReader.read(files[i]);
            Element tmpXsSeq = getXsComplexType(tmpDoc);
            if (tmpXsSeq != null) {
                List<Element> elements = tmpXsSeq.elements();
                for (int j = 0; j < elements.size(); j++) {
                    Element element = (Element) elements.get(j).clone();
                    try {
                        if (element.attribute("name").equals("accept")) {
                            System.out.println("accept");
                        }
                        xsSequence.add(element);
                    } catch (Exception e) {
                        System.out.println(element.asXML());
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }
        
        File output = new File("output.xsd");
        PrintWriter writer = new PrintWriter(output);
        writer.print(document.asXML());
        writer.close();
    }

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

}
