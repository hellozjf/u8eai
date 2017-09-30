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
    private static final String ROOTTAG = "receivesendtype";
    
    public boolean add(Receivesendtype receivesendtype) {
        boolean ret = false;
        try {
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender("001");
            sendUfinterface.setReceiver("u8");
            sendUfinterface.setProc(EAITool.ADD);
            sendUfinterface.setCodeexchanged("N");
            sendUfinterface.setExportneedexch("N");
            sendUfinterface.setVersion("2.0");
            sendUfinterface.getReceivesendtype().add(receivesendtype);
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
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
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender("001");
            sendUfinterface.setReceiver("u8");
            sendUfinterface.setProc(EAITool.DEL);
            sendUfinterface.setCodeexchanged("N");
            sendUfinterface.setExportneedexch("N");
            sendUfinterface.setVersion("2.0");
            sendUfinterface.getReceivesendtype().add(receivesendtype);
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
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
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender("001");
            sendUfinterface.setReceiver("u8");
            sendUfinterface.setProc(EAITool.EDIT);
            sendUfinterface.setCodeexchanged("N");
            sendUfinterface.setExportneedexch("N");
            sendUfinterface.setVersion("2.0");
            sendUfinterface.getReceivesendtype().add(receivesendtype);
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
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
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender("001");
            sendUfinterface.setReceiver("u8");
            sendUfinterface.setProc(EAITool.LIST);
            sendUfinterface.setCodeexchanged("N");
            sendUfinterface.setExportneedexch("N");
            sendUfinterface.setVersion("2.0");
            String sendXML = JAXBUtil.toXML(sendUfinterface);
            LOG.debug("sendXML: " + sendXML);
            
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);            
            Ufinterface recvUfinterface = JAXBUtil.formXML(Ufinterface.class, recvXML);
            list = recvUfinterface.getReceivesendtype();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
