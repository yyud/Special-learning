package com.issc.dw.service;

import com.issc.dw.dao.AdminDao;
import com.issc.dw.entity.AdminEntity;
import com.issc.dw.entity.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminDao admindao;
    //登录
    public MessageResponse<AdminEntity> Login(String name, String password){
        AdminEntity adminEntity=admindao.findByUsernameAndPassword(name,password);
        MessageResponse<AdminEntity> response=new MessageResponse<>();
        if(adminEntity!=null){
            response.setCode(1);
            response.setMessage("success");
        }
        else{
            response.setCode(0);
            response.setMessage("fail");
        }
        return response;
    }

    //删除用户
    public MessageResponse<AdminEntity> deleteUser(List<AdminEntity> adminEntities){
        MessageResponse<AdminEntity> response=new MessageResponse<>();
        try{
            admindao.delete(adminEntities);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
    //添加
    public MessageResponse<AdminEntity> addUser(AdminEntity adminEntity){
        MessageResponse<AdminEntity> response=new MessageResponse<>();
        try{
            admindao.save(adminEntity);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
    //查找全部
    public List<AdminEntity> find(){
        return admindao.findAll();
    }
}
