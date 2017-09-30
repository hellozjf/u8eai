package com.hellozjf.test.u8eai.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.hellozjf.test.u8eai.service.SaleTypeService;

@RestController
@RequestMapping("/SaleType")
public class SaleTypeController {
    
    private static final Log LOG = LogFactory.getLog(SaleTypeController.class);

    @Autowired
    private SaleTypeService service;
    
    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request) {
        String json = JSON.toJSON(service.list()).toString();
        request.getSession().setAttribute("json", json);
        return new ModelAndView("jsonview");
    }
    
}
