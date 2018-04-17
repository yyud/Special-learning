package com.issc.dw.service;

import com.issc.dw.dao.BusinesspriceDao;
import com.issc.dw.entity.BusinesspriceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 11:42 2018/4/16
 */
@Service
public class BusinesspriveService {
    @Autowired
    private BusinesspriceDao businesspriceDao;

    public void save(BusinesspriceEntity businesspriceEntity){
        businesspriceDao.save(businesspriceEntity);
    }

    //查询所有商家收费类新数据
    public List<BusinesspriceEntity> findall(){
        List<BusinesspriceEntity> list;
        list = businesspriceDao.findAll();
        if(list == null)
        {
            System.out.println("查询数据错误");
        }
        return list;
    }

    //利用id查询对应商家收费类型数据返回对象
    public BusinesspriceEntity getMoney(Long id){
        BusinesspriceEntity money = businesspriceDao.getMoney(id);
        if(money==null){
            System.out.println("查询价格错误");
        }
        return money;
    }

    //更新数据操作
    @javax.transaction.Transactional()
    public void update(Long id,String pricetype,Double price){
        businesspriceDao.update(id,pricetype,price);
    }
}
