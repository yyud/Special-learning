package com.issc.dw.service;

import com.issc.dw.dao.BusinessDao;
import com.issc.dw.entity.BusinessEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description: 商家
 * @Date 9:19 2018/4/16
 */

@Service
public class BusinessService {
    @Autowired
    private BusinessDao businessDao;

    /**
     * 查询所有的商家
     * @return 返回商家信息list
     */
    public List<BusinessEntity> findall(){
        List list ;
        list = businessDao.findAll();
        if(list==null){
            System.out.println("数据查询错误");
        }
        return list;
    }

}
