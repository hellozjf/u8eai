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
import com.hellozjf.test.u8eai.domain.jaxb.saleorder.Ufinterface.Saleorder;
import com.hellozjf.test.u8eai.service.SaleOrderService;

@RestController
@RequestMapping("/SaleOrder")
public class SaleOrderController {
    
    private static final Log LOG = LogFactory.getLog(SaleOrderController.class);

    @Autowired
    private SaleOrderService service;
    
    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request) {
        List<Saleorder> list = service.list();
        String json = JSON.toJSON(list).toString();
        request.getSession().setAttribute("json", json);
        return new ModelAndView("jsonview");
    }
    
}
