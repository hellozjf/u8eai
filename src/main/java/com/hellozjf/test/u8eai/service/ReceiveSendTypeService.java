package com.hellozjf.test.u8eai.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Service;

import com.hellozjf.test.u8eai.domain.ReceiveSendType;

@Service
public class ReceiveSendTypeService {

    public void addReceiveSendType(ReceiveSendType receiveSendType) {

    }

    public List<ReceiveSendType> listReceiveSendType() {
        List<ReceiveSendType> receiveSendTypes = new ArrayList<ReceiveSendType>();
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(getClass().getClassLoader().getResourceAsStream("Template/SaleOrder.xml"));
            Element root = document.getRootElement();
            listNodes(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return receiveSendTypes;
    }
    
    private void listNodes(Element node){  
        System.out.println("当前节点的名称：" + node.getName());  
        //首先获取当前节点的所有属性节点  
        List<Attribute> list = node.attributes();  
        //遍历属性节点  
        for(Attribute attribute : list){  
            System.out.println("属性"+attribute.getName() +":" + attribute.getValue());  
        }  
        //如果当前节点内容不为空，则输出  
        if(!(node.getTextTrim().equals(""))){  
             System.out.println( node.getName() + "：" + node.getText());    
        }  
        //同时迭代当前节点下面的所有子节点  
        //使用递归  
        Iterator<Element> iterator = node.elementIterator();  
        while(iterator.hasNext()){  
            Element e = iterator.next();  
            listNodes(e);  
        }  
    }  
}
