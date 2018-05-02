package com.issc.dw.controller;

import com.alibaba.fastjson.JSONArray;
import com.issc.dw.entity.TenantpriceEntity;
import com.issc.dw.service.TenantpriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description:  租户收费类型 控制器
 * @Date 17:52 2018/4/19
 */

@Controller
@RequestMapping("tenantprice")
public class TenantpriceController {
    @Autowired
    private TenantpriceService tenantpriceService;


    //查询所有租户会用类型信息
    @RequestMapping("findAll")
    @ResponseBody
    public String findAll(){
        List<TenantpriceEntity> list = tenantpriceService.findAll();
        return JSONArray.toJSONString(list);
    }


}
