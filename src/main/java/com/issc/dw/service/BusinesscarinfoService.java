package com.issc.dw.service;

import com.issc.dw.dao.BusinesscarinfoDao;
import com.issc.dw.entity.BusinesscarinfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 14:09 2018/4/16
 */
@Service
public class BusinesscarinfoService {
    @Autowired
    private BusinesscarinfoDao businesscarinfoDao;


    @RequestMapping("findall")
    @ResponseBody
    public List<BusinesscarinfoEntity> findAll(){
         List<BusinesscarinfoEntity> list = businesscarinfoDao.findAll();
        return list;
    }
}
