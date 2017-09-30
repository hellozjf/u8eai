package com.hellozjf.test.u8eai.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.hellozjf.test.u8eai.domain.jaxb.saleorder.Ufinterface;
import com.hellozjf.test.u8eai.domain.jaxb.saleorder.Ufinterface.Saleorder;
import com.hellozjf.test.u8eai.tools.EAITool;
import com.hellozjf.test.u8eai.tools.JAXBUtil;

@Service
public class SaleOrderService {

    private static final Log LOG = LogFactory.getLog(SaleOrderService.class);
    private static final String ROOTTAG = "saleorder";
    
    public List<Saleorder> list() {
        List<Saleorder> list = new ArrayList<Saleorder>();
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
            String sendXML = EAITool.sendXML(EAITool.DEFAULT_URL, JAXBUtil.toXML(sendUfinterface));
            LOG.debug(sendXML);
            
            // 将XML发送给EAI服务器，并获取返回的XML
            String recvXML = EAITool.sendXML(EAITool.DEFAULT_URL, sendXML);
            LOG.debug("recvXML: " + recvXML);
            
            // 将查询得到XML结果转换成Ufinterface，返回里面的列表
            Ufinterface recvUfinterface = JAXBUtil.formXML(Ufinterface.class, sendXML);
            list = recvUfinterface.getSaleorder();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
