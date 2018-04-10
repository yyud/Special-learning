package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.issc.dw.entity.AdminResponse;
import com.issc.dw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login(String Username, String Password) {
        AdminResponse adminResponse = adminService.Login(Username, Password);
        System.out.println(Username);
        return JSON.toJSONString(adminResponse);
    }
    @RequestMapping("/jie")
    public String jie(){
        return "login";
    }
}
