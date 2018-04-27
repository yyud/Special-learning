package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.issc.dw.entity.MessageResponse;
import com.issc.dw.entity.TenantorderEntity;
import com.issc.dw.service.TenantorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/tenantorder")
public class TenantorderController {
    @Autowired
    private TenantorderService tenantorderService;

    @RequestMapping("/find")
    @ResponseBody
    public String findAll(){
        List<TenantorderEntity> tenantorderEntities= tenantorderService.findAll();
        return JSON.toJSONString(tenantorderEntities);
    }

    //添加
    @ResponseBody
    @RequestMapping(value="/add", produces = "text/html;charset=utf-8")
    public String addOrder(TenantorderEntity tenantEntity){
        MessageResponse messageResponse =tenantorderService.addOrder(tenantEntity);;
        return JSON.toJSONString(messageResponse);
    }

    @ResponseBody
    @RequestMapping(value="/delete", produces = "text/html;charset=utf-8")
    public String deleteUser(@RequestBody List<TenantorderEntity> tenantEntities){
        MessageResponse messageResponse =tenantorderService.deleteUser(tenantEntities);;

        return JSON.toJSONString(messageResponse);
    }

    @RequestMapping("/findorder")
    @ResponseBody
    public String getOrderByPlate(@RequestParam(required = false) String platenum){
        List<TenantorderEntity> tenantorderEntities;
        if(platenum==null){
            tenantorderEntities= tenantorderService.findAll();
        }
            else
            tenantorderEntities= tenantorderService.getOrderBy(platenum);
        return JSON.toJSONString(tenantorderEntities);
    }
    @RequestMapping("/display")
    public String jie(){
        return "jsp/tenantorder";
    }
}
