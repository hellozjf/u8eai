package com.hellozjf.test.u8eai.service;

import com.hellozjf.test.u8eai.domain.jaxb.ReceiveSendType.Ufinterface;
import com.hellozjf.test.u8eai.domain.jaxb.ReceiveSendType.Ufinterface.Receivesendtype;
import com.hellozjf.test.u8eai.tools.EAITool;
import com.hellozjf.test.u8eai.tools.JAXBUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReceiveSendTypeService {

    public Log log = LogFactory.getLog(this.getClass());

    public boolean addReceiveSendType(Receivesendtype receiveSendType) {
        boolean ret = false;
        try {
            Ufinterface ufinterface = new Ufinterface();
            ufinterface.setRoottag("receivesendtype");
            ufinterface.setSender("001");
            ufinterface.setReceiver("u8");
            ufinterface.setProc("add");
            ufinterface.setCodeexchanged("N");
            ufinterface.setExportneedexch("N");
            ufinterface.setVersion("2.0");
            ufinterface.getReceivesendtype().add(receiveSendType);
            String result = EAITool.sendXML("http://192.168.3.165/u8eai/import.asp", JAXBUtil.toXML(ufinterface));
            log.debug(result);
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public boolean delReceiveSendType(Receivesendtype receiveSendType) {
        boolean ret = false;
        try {
            Ufinterface ufinterface = new Ufinterface();
            ufinterface.setRoottag("receivesendtype");
            ufinterface.setSender("001");
            ufinterface.setReceiver("u8");
            ufinterface.setProc("delete");
            ufinterface.setCodeexchanged("N");
            ufinterface.setExportneedexch("N");
            ufinterface.setVersion("2.0");
            ufinterface.getReceivesendtype().add(receiveSendType);
            String result = EAITool.sendXML("http://192.168.3.165/u8eai/import.asp", JAXBUtil.toXML(ufinterface));
            log.debug(result);
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public boolean changeReceiveSendType(Receivesendtype receiveSendType) {
        boolean ret = false;
        try {
            Ufinterface ufinterface = new Ufinterface();
            ufinterface.setRoottag("receivesendtype");
            ufinterface.setSender("001");
            ufinterface.setReceiver("u8");
            ufinterface.setProc("edit");
            ufinterface.setCodeexchanged("N");
            ufinterface.setExportneedexch("N");
            ufinterface.setVersion("2.0");
            ufinterface.getReceivesendtype().add(receiveSendType);
            String result = EAITool.sendXML("http://192.168.3.165/u8eai/import.asp", JAXBUtil.toXML(ufinterface));
            log.debug(result);
            ret = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public List<Receivesendtype> listReceiveSendTypes() {
        List<Receivesendtype> receiveSendTypes = new ArrayList<Receivesendtype>();
        try {
            Ufinterface ufinterface = new Ufinterface();
            ufinterface.setRoottag("receivesendtype");
            ufinterface.setSender("001");
            ufinterface.setReceiver("u8");
            ufinterface.setProc("query");
            ufinterface.setCodeexchanged("N");
            ufinterface.setExportneedexch("N");
            ufinterface.setVersion("2.0");
            String result = EAITool.sendXML("http://192.168.3.165/u8eai/import.asp", JAXBUtil.toXML(ufinterface));

            log.debug(result);
            Ufinterface receive = JAXBUtil.formXML(Ufinterface.class, result);
            receiveSendTypes = receive.getReceivesendtype();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return receiveSendTypes;
    }

}