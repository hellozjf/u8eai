package com.hellozjf.test.u8eai.tools;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;  
  
public class JAXBUtil {  
    private static final String ENCODING = "UTF-8";  
    private static final Log logger = LogFactory.getLog(JAXBUtil.class);  
  
    public static <T> T formXML(Class<T> clazz, String xml) {  
        JAXBContext jaxbContext = null;  
        T object = null;  
        if (xml != null && !"".equals(xml)) {  
            try {  
                jaxbContext = JAXBContext.newInstance(clazz);  
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes(ENCODING));  
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();  
                JAXBElement<T> jaxbElement = unmarshaller.unmarshal(new StreamSource(byteArrayInputStream), clazz);  
                object = (T) jaxbElement.getValue();  
            } catch (Exception e) {  
                logger.error("error when unmarshalling from a xml string");  
            }  
        }  
        return object;  
    }  
  
    public static <T> String toXML(T object) {  
        String xml = "";  
        try {  
            JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());  
            Marshaller marshaller = jaxbContext.createMarshaller();  
            // 是否格式化生成xml  
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
            // 设置编码方式  
            marshaller.setProperty(Marshaller.JAXB_ENCODING, ENCODING);  
  
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();  
            marshaller.marshal(object, byteArrayOutputStream);  
            byte[] buf = byteArrayOutputStream.toByteArray();  
            xml = new String(buf, 0, buf.length, ENCODING);  
        } catch (Exception e) {  
            logger.error("error when marshalling to a xml string");  
        }  
        return xml;  
    }  
}  