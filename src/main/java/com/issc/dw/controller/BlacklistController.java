package com.issc.dw.controller;

import com.alibaba.fastjson.JSON;
import com.issc.dw.entity.BlacklistEntity;
import com.issc.dw.entity.MessageResponse;
import com.issc.dw.service.BlacklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/blacklist")
public class BlacklistController {
    @Autowired
    private BlacklistService blacklistService;

    @RequestMapping(value = "/find" , produces = "text/html;charset=utf-8")
    @ResponseBody
    public String find(){
        List<BlacklistEntity> blacklistEntityList=blacklistService.find();
        return JSON.toJSONString(blacklistEntityList);
    }
    //按车牌查找
    @RequestMapping(value = "/findplate" , produces = "text/html;charset=utf-8")
    @ResponseBody
    public String findByPlatenum(String platenum){
        MessageResponse<BlacklistEntity> response=blacklistService.findByPlatenum(platenum);
        return JSON.toJSONString(response);
    }
    //按车牌删除
    @RequestMapping(value = "/delete" , produces = "text/html;charset=utf-8")
    @ResponseBody
    public String delete(long id){
        MessageResponse<BlacklistEntity> response=blacklistService.deleteBlacklist(id);
        return JSON.toJSONString(response);
    }

    //添加
    @RequestMapping(value = "/add" , produces = "text/html;charset=utf-8")
    @ResponseBody
    public String addBlacklist(BlacklistEntity blacklistEntity){
        MessageResponse<BlacklistEntity> response=blacklistService.addBlacklist(blacklistEntity);
        return JSON.toJSONString(response);
    }

    @RequestMapping("/display")
    public String jie(){
        return "jsp/blacklist";
    }
}
