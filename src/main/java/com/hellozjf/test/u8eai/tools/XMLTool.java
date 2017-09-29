package com.hellozjf.test.u8eai.tools;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XMLTool {

    public static Log log = LogFactory.getLog(XMLTool.class);

    public static Document getDocumentByPath(String path) throws Exception {
        log.debug("path=" + path);
        SAXReader reader = new SAXReader();
        Document document = reader.read(new FileInputStream(path));
        return document;
    }

    public static Document getDocumentByInputStream(InputStream inputStream) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(inputStream);
        return document;
    }

    public static void removeComment(Document document) {
        List<Node> rmNodes = new ArrayList<Node>();
        for (Iterator<Node> iterator = document.nodeIterator(); iterator.hasNext(); ) {
            Node node = iterator.next();
            if (node.getNodeType() == Node.COMMENT_NODE) {
                rmNodes.add(node);
            }
        }
        for (Node node : rmNodes) {
            document.remove(node);
        }
    }

    public static void removeChildElements(Element root) {
        List<Element> elements = root.elements();
        for (Element element : elements) {
            root.remove(element);
        }
    }

    public static Element getChildElement(Element root) {
        List<Element> elements = root.elements();
        return elements.get(0);
    }
}
