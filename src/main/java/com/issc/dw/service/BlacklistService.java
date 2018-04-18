package com.issc.dw.service;

import com.issc.dw.dao.BlacklistDao;
import com.issc.dw.entity.BlacklistEntity;
import com.issc.dw.entity.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistService {
    @Autowired
    private BlacklistDao blacklistDao;

    //查找全部
    public List<BlacklistEntity> find(){
        return blacklistDao.findAll();
    }

    //通过车牌号查找
    public MessageResponse<BlacklistEntity> findByPlatenum(String platenum){
        BlacklistEntity blacklistEntity=blacklistDao.findByPlatenum(platenum);
        MessageResponse<BlacklistEntity> response=new MessageResponse<>();
        if(blacklistEntity!=null){
            response.setCode(1);
            response.setData(blacklistEntity);
        }
        else {
            response.setCode(0);
        }
        return response;
    }

    //添加
    public MessageResponse<BlacklistEntity> addBlacklist(BlacklistEntity blacklistEntity){
        MessageResponse<BlacklistEntity> response=new MessageResponse<>();
        try{
            blacklistDao.save(blacklistEntity);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }

    //删除
    public MessageResponse<BlacklistEntity> deleteBlacklist(long id){
        MessageResponse<BlacklistEntity> response=new MessageResponse<>();
        try{
            blacklistDao.delete(id);
        }catch(Exception e){
            response.setCode(0);
            return response;
        }
        response.setCode(1);
        return response;
    }
}
