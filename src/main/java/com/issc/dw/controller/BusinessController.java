package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.BusinessEntity;
import com.issc.dw.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Date 9:15 2018/4/16
 * @Description: 商家控制器
 */

@Controller
@RequestMapping("business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @RequestMapping("businessDisplay")
    public String getbusinessString(){
        return "/jsp/businessDisplay";
    }
    //创建页面
    @RequestMapping("create")
    public String getNewString() {
        return "/jsp/newdata";
    }

    //查询所有数据
    @RequestMapping("findAll")
    @ResponseBody
    public String findAll(){
        List<BusinessEntity> list = businessService.findall();
        return JSONArray.toJSONString(list);
    }

    //删除信息并返回未删除所有数据
    @RequestMapping("delete")
    @ResponseBody
    public String delete(List<BusinessEntity> list){
        businessService.delete(list);
        list = businessService.findall();
        return JSONArray.toJSONString(list);
    }


    //保存一个或多个对象   、  修改一个或多个对象
    @RequestMapping(value = "add")
    @ResponseBody
    public String  add(@RequestBody List<BusinessEntity> list, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        businessService.save(list);
        list = businessService.findall();
        System.out.println(list.get(2));
        return JSON.toJSONString(list);
    }
}
