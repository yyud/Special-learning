package com.issc.dw.service;

import com.issc.dw.dao.ParkingDao;
import com.issc.dw.entity.ParkingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description: 停车位service
 * @Date 14:18 2018/4/19
 */
@Service
public class ParkingService {
    @Autowired
    private ParkingDao parkingDao;

    public List<ParkingEntity> findAll(){
        List <ParkingEntity>list = parkingDao.findAll();
        return list;
    }
}
