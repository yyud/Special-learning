package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.BusinesspriceEntity;
import com.issc.dw.service.BusinesspriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description: 商家收费
 * @Date 11:47 2018/4/16
 */

@Controller
@RequestMapping("businessprice")
public class BusinesspriceController {
    @Autowired
    private BusinesspriveService businesspriveService;

    //保存
    @RequestMapping("save")
    @ResponseBody
    public String save(BusinesspriceEntity businesspriceEntity){
        businesspriveService.save(businesspriceEntity);
        return "true";
    }

    //查询所有的商家收费信息
    @RequestMapping("findAll")
    @ResponseBody
    public String findAll(){
        List<BusinesspriceEntity> list = businesspriveService.findall();
        return JSONArray.toJSONString(list);
    }




    //通过商家id查询商家收费类型返回收费类型对象
    @RequestMapping("findmoney")
    @ResponseBody
    public String getMoney( Long id){
        BusinesspriceEntity money = businesspriveService.getMoney(id);
        return JSON.toJSONString(money);
    }

    //更新数据操作
    @RequestMapping("update")
    @ResponseBody
    public String update(Long id,String pricetype,Double price){
        //return JSON.toJSONString(businesspriveService.update(businesspriceEntity.getId(),businesspriceEntity.getPricetype(),businesspriceEntity.getPrice()));
        businesspriveService.update(id,pricetype,price);
        return "ture";
    }
}
