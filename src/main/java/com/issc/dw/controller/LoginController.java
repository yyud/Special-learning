package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.issc.dw.entity.AdminEntity;
import com.issc.dw.entity.MessageResponse;
import com.issc.dw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login(String Username, String Password) {
        MessageResponse messageResponse = adminService.Login(Username, Password);
        System.out.println(Username);
        return JSON.toJSONString(messageResponse);
    }

    @RequestMapping(value = "/find", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String find(){
        List<AdminEntity> adminEntities=adminService.find();
        return JSON.toJSONString(adminEntities);
    }
    @RequestMapping("/jie")
    public String jie(){
        return "/jsp/login";
    }
}
