package com.issc.dw.service;

import com.issc.dw.dao.TenantDao;
import com.issc.dw.entity.MessageResponse;
import com.issc.dw.entity.TenantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService {
    @Autowired
    private TenantDao tenantdao;
    /*//登录
    public MessageResponse<TenantEntity> Login(String name, String password){
        TenantEntity tenantEntity=tenantdao.findByUsernameAndPassword(name,password);
        MessageResponse<TenantEntity> response=new MessageResponse<>();
        if(tenantEntity!=null){
            response.setCode(1);
            response.setMessage("success");
        }
        else{
            response.setCode(0);
            response.setMessage("fail");
        }
        return response;
    }*/

    //删除用户
    public MessageResponse<TenantEntity> deleteUser(List<TenantEntity> tenantEntities){
        MessageResponse<TenantEntity> response=new MessageResponse<>();
        try{
            tenantdao.delete(tenantEntities);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
    //添加
    public MessageResponse<TenantEntity> addUser(TenantEntity tenantEntity){
        MessageResponse<TenantEntity> response=new MessageResponse<>();
        try{
            tenantdao.save(tenantEntity);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
    //查找全部
    public List<TenantEntity> find(){
        return tenantdao.findAll();
    }
}
