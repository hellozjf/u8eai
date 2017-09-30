package com.hellozjf.test.u8eai.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.hellozjf.test.u8eai.domain.jaxb.receivesendtype.Ufinterface.Receivesendtype;
import com.hellozjf.test.u8eai.service.ReceiveSendTypeService;

@RestController
@RequestMapping("/ReceiveSendType")
public class ReceiveSendTypeController {
    
    private static final Log LOG = LogFactory.getLog(ReceiveSendTypeController.class);

    @Autowired
    private ReceiveSendTypeService service;
    
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, Receivesendtype receivesendtype) {
        boolean ret = service.add(receivesendtype);
        request.getSession().setAttribute("json", ret);
        return new ModelAndView("jsonview");
    }
    
    @RequestMapping("/del")
    public ModelAndView del(HttpServletRequest request, Receivesendtype receivesendtype) {
        boolean ret = service.del(receivesendtype);
        request.getSession().setAttribute("json", ret);
        return new ModelAndView("jsonview");
    }
    
    @RequestMapping("/edit")
    public ModelAndView edit(HttpServletRequest request, Receivesendtype receivesendtype) {
        boolean ret = service.edit(receivesendtype);
        request.getSession().setAttribute("json", ret);
        return new ModelAndView("jsonview");
    }
    
    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request) {
        List<Receivesendtype> list = service.list();
        String json = JSON.toJSON(list).toString();
        request.getSession().setAttribute("json", json);
        return new ModelAndView("jsonview");
    }
    
}
