package com.issc.dw.controller;

import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.BusinessEntity;
import com.issc.dw.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Date 9:15 2018/4/16
 * @Description:商家控制器
 */

@Controller
@RequestMapping("business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    //显示页面
    @RequestMapping("display")
    public String getString() {
        return "/jsp/display";
    }

    //创建页面
    @RequestMapping("create")
    public String getNewString() {
        return "/jsp/newdata";
    }

    @RequestMapping("findall")
    @ResponseBody
    public String findAll(){
        String str = null;
        List<BusinessEntity> list = businessService.findall();
        return JSONArray.toJSONString(list);
    }



}
