package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.issc.dw.entity.MessageResponse;
import com.issc.dw.entity.TenantEntity;
import com.issc.dw.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tenant")
public class TenantController {
    @Autowired
    private TenantService tenantService;

    @RequestMapping(value = "/find", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String find(){
        List<TenantEntity> tenantEntities=tenantService.find();
        return JSON.toJSONString(tenantEntities);
    }
    //根据id删除用户
    @ResponseBody
    @RequestMapping(value="/delete", produces = "text/html;charset=utf-8")
    public String deleteUser(@RequestBody List<TenantEntity> tenantEntities){
        MessageResponse messageResponse =tenantService.deleteUser(tenantEntities);;

        return JSON.toJSONString(messageResponse);
    }
    //添加
    @ResponseBody
    @RequestMapping(value="/add", produces = "text/html;charset=utf-8")
    public String addUser(TenantEntity tenantEntity){
        MessageResponse messageResponse =tenantService.addUser(tenantEntity);;
        return JSON.toJSONString(messageResponse);
    }

    @RequestMapping("/display")
    public String jie(){
        return "jsp/tenant";
    }

}
