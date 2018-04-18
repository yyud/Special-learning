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
@RequestMapping("/cha")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/find", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String find(){
        List<AdminEntity> adminEntities=adminService.find();
        return JSON.toJSONString(adminEntities);
    }
    //根据id删除用户
    @ResponseBody
    @RequestMapping(value="/delete", produces = "text/html;charset=utf-8")
    public String deleteUser(long id){
        MessageResponse messageResponse =adminService.deleteUser(id);;

        return JSON.toJSONString(messageResponse);
    }
    //添加
    @ResponseBody
    @RequestMapping(value="/add", produces = "text/html;charset=utf-8")
    public String addUser(AdminEntity adminEntity){
        MessageResponse messageResponse =adminService.addUser(adminEntity);;
        return JSON.toJSONString(messageResponse);
    }

    @RequestMapping("/display")
    public String jie(){
        return "/jsp/admin";
    }

}
