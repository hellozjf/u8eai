package com.hellozjf.test.u8eai.controller;

import com.alibaba.fastjson.JSON;
import com.hellozjf.test.u8eai.domain.jaxb.ReceiveSendType.Ufinterface.Receivesendtype;
import com.hellozjf.test.u8eai.service.ReceiveSendTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class ReceiveSendTypeController {

    @Autowired
    private ReceiveSendTypeService receiveSendTypeService;

    @RequestMapping(value = "/ReceiveSendType/list")
    public ModelAndView listReceiveSendType(HttpServletRequest request) {
        List<Receivesendtype> receiveSendTypes = receiveSendTypeService.listReceiveSendTypes();
        String json = JSON.toJSON(receiveSendTypes).toString();
        request.getSession().setAttribute("json", json);
        return new ModelAndView("ReceiveSendType/list");
    }

    @RequestMapping(value = "/ReceiveSendType/del")
    public ModelAndView delReceiveSendType(HttpServletRequest request, Receivesendtype receivesendtype) {
        boolean ret = receiveSendTypeService.delReceiveSendType(receivesendtype);
        request.getSession().setAttribute("ret", ret);
        return new ModelAndView("ReceiveSendType/del");
    }

    @RequestMapping(value = "/ReceiveSendType/add")
    public ModelAndView addReceiveSendType(HttpServletRequest request, Receivesendtype receivesendtype) {
        boolean ret = receiveSendTypeService.addReceiveSendType(receivesendtype);
        request.getSession().setAttribute("ret", ret);
        return new ModelAndView("ReceiveSendType/add");
    }

    @RequestMapping(value = "/ReceiveSendType/change")
    public ModelAndView changeReceiveSendType(HttpServletRequest request, Receivesendtype receivesendtype) {
        boolean ret = receiveSendTypeService.changeReceiveSendType(receivesendtype);
        request.getSession().setAttribute("ret", ret);
        return new ModelAndView("ReceiveSendType/change");
    }
}
