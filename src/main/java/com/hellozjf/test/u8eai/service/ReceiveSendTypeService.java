package com.hellozjf.test.u8eai.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.springframework.stereotype.Service;

import com.hellozjf.test.u8eai.domain.jaxb.receivesendtype.Ufinterface;
import com.hellozjf.test.u8eai.domain.jaxb.receivesendtype.Ufinterface.Receivesendtype;
import com.hellozjf.test.u8eai.tools.EAITool;
import com.hellozjf.test.u8eai.tools.JAXBUtil;

@Service
public class ReceiveSendTypeService {

    private static final Log LOG = LogFactory.getLog(ReceiveSendTypeService.class);
    private static final String ROOTTAG = "receivesendtype";        // 这个值要参考一下XML中的具体值
    
    public boolean add(Receivesendtype receivesendtype) {
        boolean ret = false;
        try {
            // 创建需要发送的Ufinterface
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender(EAITool.SENDER);
            sendUfinterface.setReceiver(EAITool.RECEIVER);
            sendUfinterface.setProc(EAITool.PROC_ADD);
            sendUfinterface.setCodeexchanged(EAITool.CODEEXCHANGED);
            sendUfinterface.setExportneedexch(EAITool.EXPORTNEEDEXCH);
            sendUfinterface.setVersion(EAITool.VERSION);
            sendUfinterface.getReceivesendtype().add(receivesendtype);
            
            // 将Ufinterface转化为XML字符串
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            // 将XML发送给EAI服务器，并获取返回的XML
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
            
            // 解析XML，判断执行是否成功
            Document document = DocumentHelper.parseText(recvXML);
            String succeed = document.getRootElement().element("item").attribute("succeed").getValue();
            if (succeed.equals("0")) {
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    public boolean del(Receivesendtype receivesendtype) {
        boolean ret = false;
        try {
            // 创建需要发送的Ufinterface
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender(EAITool.SENDER);
            sendUfinterface.setReceiver(EAITool.RECEIVER);
            sendUfinterface.setProc(EAITool.PROC_DEL);
            sendUfinterface.setCodeexchanged(EAITool.CODEEXCHANGED);
            sendUfinterface.setExportneedexch(EAITool.EXPORTNEEDEXCH);
            sendUfinterface.setVersion(EAITool.VERSION);
            sendUfinterface.getReceivesendtype().add(receivesendtype);
            
            // 将Ufinterface转化为XML字符串
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            // 将XML发送给EAI服务器，并获取返回的XML
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
            
            // 解析XML，判断执行是否成功
            Document document = DocumentHelper.parseText(recvXML);
            String succeed = document.getRootElement().element("item").attribute("succeed").getValue();
            if (succeed.equals("0")) {
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    public boolean edit(Receivesendtype receivesendtype) {
        boolean ret = false;
        try {
            // 创建需要发送的Ufinterface
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender(EAITool.SENDER);
            sendUfinterface.setReceiver(EAITool.RECEIVER);
            sendUfinterface.setProc(EAITool.PROC_EDIT);
            sendUfinterface.setCodeexchanged(EAITool.CODEEXCHANGED);
            sendUfinterface.setExportneedexch(EAITool.EXPORTNEEDEXCH);
            sendUfinterface.setVersion(EAITool.VERSION);
            sendUfinterface.getReceivesendtype().add(receivesendtype);
            
            // 将Ufinterface转化为XML字符串
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            // 将XML发送给EAI服务器，并获取返回的XML
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
            
            // 解析XML，判断执行是否成功
            Document document = DocumentHelper.parseText(recvXML);
            String succeed = document.getRootElement().element("item").attribute("succeed").getValue();
            if (succeed.equals("0")) {
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    
    public List<Receivesendtype> list() {
        List<Receivesendtype> list = new ArrayList<Receivesendtype>();
        try {
            // 创建需要发送的Ufinterface
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender(EAITool.SENDER);
            sendUfinterface.setReceiver(EAITool.RECEIVER);
            sendUfinterface.setProc(EAITool.PROC_LIST);
            sendUfinterface.setCodeexchanged(EAITool.CODEEXCHANGED);
            sendUfinterface.setExportneedexch(EAITool.EXPORTNEEDEXCH);
            sendUfinterface.setVersion(EAITool.VERSION);
            
            // 将Ufinterface转化为XML字符串
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            // 将XML发送给EAI服务器，并获取返回的XML
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);            
            
            // 将查询得到XML结果转换成Ufinterface，返回里面的列表
            Ufinterface recvUfinterface = JAXBUtil.formXML(Ufinterface.class, recvXML);
            list = recvUfinterface.getReceivesendtype();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
