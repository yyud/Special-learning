package com.issc.dw.controller;

import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.ParkingEntity;
import com.issc.dw.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description:  停车位
 * @Date 14:14 2018/4/19
 */
@Controller
@RequestMapping("parking")
public class ParkingController {
    @Autowired
    private ParkingService parkingService;

    @RequestMapping("findAll")
    @ResponseBody
    public String findAll(){
        List<ParkingEntity> list = parkingService.findAll();
        if(list == null){
            System.out.println("数据查询错误");
        }
        return JSONArray.toJSONString(list);
    }
}
