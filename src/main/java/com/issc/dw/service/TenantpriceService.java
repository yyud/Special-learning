package com.issc.dw.service;

import com.issc.dw.dao.TenantpriceDao;
import com.issc.dw.entity.TenantpriceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description: 租户收费类型service
 * @Date 17:59 2018/4/19
 */
@Service
public class TenantpriceService {
    @Autowired
    private TenantpriceDao tenantpriceDao;

    //查询所有类型
    public List<TenantpriceEntity> findAll(){
        List<TenantpriceEntity> list = tenantpriceDao.findAll();
        if(list ==null){
            System.out.println("数据查询错误！");
        }
        return list;
    }

    //保存一条数据huo 修改一条数据
    public void save(TenantpriceEntity tenantpriceEntity){
        tenantpriceDao.save(tenantpriceEntity);
    }

    //保存一个list 或者修改一个list里面的数据
    public void save(List<TenantpriceEntity> list){
        tenantpriceDao.save(list);
    }

    //删除一条数据
    public void delete(TenantpriceEntity tenantpriceEntity){
        tenantpriceDao.delete(tenantpriceEntity);
    }

    //删除一个list 数据
    public void delete(List<TenantpriceEntity> list){
        tenantpriceDao.delete(list);
    }


}
