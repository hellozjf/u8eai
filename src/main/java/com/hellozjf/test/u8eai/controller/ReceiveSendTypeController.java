package com.hellozjf.test.u8eai.controller;

import com.alibaba.fastjson.JSON;
import com.hellozjf.test.u8eai.domain.ReceiveSendType;
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

    @RequestMapping(value = "/listReceiveSendType")
    public ModelAndView listReceiveSendType(HttpServletRequest request) {
        List<ReceiveSendType> receiveSendTypes = receiveSendTypeService.listReceiveSendType();
        String json = JSON.toJSON(receiveSendTypes).toString();
        request.getSession().setAttribute("json", json);
        return new ModelAndView("ReceiveSendType/list");
    }
}
