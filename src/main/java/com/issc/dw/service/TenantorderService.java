package com.issc.dw.service;

import com.issc.dw.dao.TenantorderDao;
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

    public List<TenantorderEntity> getOrderBy(String platenum){
        return tenantorderDao.getOderByPlatenum(platenum);
    }
}
