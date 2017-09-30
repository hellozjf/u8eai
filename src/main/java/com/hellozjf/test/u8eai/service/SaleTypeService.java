package com.hellozjf.test.u8eai.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.hellozjf.test.u8eai.domain.jaxb.saletype.Ufinterface;
import com.hellozjf.test.u8eai.domain.jaxb.saletype.Ufinterface.Saletype;
import com.hellozjf.test.u8eai.tools.EAITool;
import com.hellozjf.test.u8eai.tools.JAXBUtil;

@Service
public class SaleTypeService {

    private static final Log LOG = LogFactory.getLog(SaleTypeService.class);
    private static final String ROOTTAG = "saletype";
    
    public List<Saletype> list() {
        List<Saletype> list = new ArrayList<Saletype>();
        try {
            Ufinterface sendUfinterface = new Ufinterface();
            sendUfinterface.setRoottag(ROOTTAG);
            sendUfinterface.setSender("001");
            sendUfinterface.setReceiver("u8");
            sendUfinterface.setProc(EAITool.LIST);
            sendUfinterface.setCodeexchanged("N");
            sendUfinterface.setExportneedexch("N");
            sendUfinterface.setVersion("2.0");
            String result = EAITool.sendXML(EAITool.DEFAULT_URL, JAXBUtil.toXML(sendUfinterface));
            LOG.debug(result);
            
            Ufinterface recvUfinterface = JAXBUtil.formXML(Ufinterface.class, result);
            list = recvUfinterface.getSaletype();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
