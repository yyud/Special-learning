package com.issc.dw.service;

import com.issc.dw.dao.Admindao;
import com.issc.dw.entity.AdminEntity;
import com.issc.dw.entity.AdminResponse;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private Admindao admindao;
    public AdminResponse<AdminEntity> Login(String name, String password){
        AdminEntity adminEntity=admindao.findByUsernameAndPassword(name,password);
        AdminResponse<AdminEntity>  response=new AdminResponse<>();
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
}
