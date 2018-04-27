package com.issc.dw.service;

import com.issc.dw.dao.TenantorderDao;
import com.issc.dw.entity.MessageResponse;
import com.issc.dw.entity.TenantorderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TenantorderService {
    @Autowired
    private TenantorderDao tenantorderDao;

    //查找全部
    public List<TenantorderEntity> findAll(){
        return tenantorderDao.findAll();
    }
    //删除用户
    public MessageResponse<TenantorderEntity> deleteUser(List<TenantorderEntity> tenantorderEntities){
        MessageResponse<TenantorderEntity> response=new MessageResponse<>();
        try{
            tenantorderDao.delete(tenantorderEntities);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
    //添加
    public MessageResponse<TenantorderEntity> addOrder(TenantorderEntity tenantorderEntity){
        MessageResponse<TenantorderEntity> response=new MessageResponse<>();
        try{
            tenantorderDao.save(tenantorderEntity);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
    //按车牌查找
    public List<TenantorderEntity> getOrderBy(String platenum){
        return tenantorderDao.getOderByPlatenum(platenum);
    }
}
