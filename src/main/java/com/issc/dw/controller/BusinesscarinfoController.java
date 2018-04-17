package com.issc.dw.controller;

import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.BusinesscarinfoEntity;
import com.issc.dw.service.BusinesscarinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description: 商家车辆信息
 * @Date 14:20 2018/4/16
 */
@Controller
@RequestMapping("businesscarinfo")
public class BusinesscarinfoController {
    @Autowired
    private BusinesscarinfoService businesscarinfoService;

    @RequestMapping("findall")
    @ResponseBody
    public String findAll(){
        List<BusinesscarinfoEntity> list = businesscarinfoService.findAll();
        return JSONArray.toJSONString(list);
    }
}
