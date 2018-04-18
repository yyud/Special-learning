package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.issc.dw.entity.TenantorderEntity;
import com.issc.dw.service.TenantorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/findorder")
    @ResponseBody
    public String getOrderByPlate(String platenum){
        List<TenantorderEntity> tenantorderEntities= tenantorderService.getOrderBy(platenum);
        return JSON.toJSONString(tenantorderEntities);
    }
}
