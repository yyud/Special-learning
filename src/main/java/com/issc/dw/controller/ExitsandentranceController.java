package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.ExitsandentranceEntity;
import com.issc.dw.service.ExitsandentranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yyud
 * @version V1.0
 * @Description: 进出口控制器
 * @Date 11:43 2018/4/11
 */

@Controller
@RequestMapping("inout")
public class ExitsandentranceController {

    @Autowired
    private ExitsandentranceService exitsandentranceService;
/*
进出口数据查询
 */
    @RequestMapping( value = "find",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String  getAll(){
       return JSONArray.toJSONString(exitsandentranceService.findAll());
    }

    /**
     * 显示页面转发
     * @return url
     */
    @RequestMapping("display")
    public String diaplay(){
        return "jsp/inOutDisplay";
    }

    /**
     * 删除数据
     * @param exitsandentranceEntity 删除对象
     */
    @RequestMapping("deteleDate")
    @ResponseBody
    public String  deteleData(ExitsandentranceEntity exitsandentranceEntity){
        exitsandentranceService.deteleDate(exitsandentranceEntity);
        return JSON.toJSONString("true");
    }

    /**
     * 保存数据
     * @param exitsandentranceEntity 保存对象
     */
    @RequestMapping("save")
    @ResponseBody
    public String  save( ExitsandentranceEntity exitsandentranceEntity){
        exitsandentranceService.saveDate(exitsandentranceEntity);
        return JSON.toJSONString("true");
    }

    /***
     * 修改数据
     * @param exitsandentranceEntity 修改后的对象
     */
    @RequestMapping("update")
    public String  update(ExitsandentranceEntity exitsandentranceEntity){
        exitsandentranceService.saveDate(exitsandentranceEntity);
        return JSON.toJSONString("true");
    }

}
