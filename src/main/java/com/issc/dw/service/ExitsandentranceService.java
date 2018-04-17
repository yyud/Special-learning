package com.issc.dw.service;

import com.issc.dw.dao.ExitsandentranceDao;
import com.issc.dw.entity.ExitsandentranceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 10:40 2018/4/11
 */

@Service
public class ExitsandentranceService {
    @Autowired
    private ExitsandentranceDao exitsandentranceDao;

    /**
     * 查询数据
     * @return 查询数据list
     */
    public List<ExitsandentranceEntity> findAll(){
        return exitsandentranceDao.findAll();
    }

    /**
     * 删除数据
     * @param exitsandentranceEntity 需要删除的数据
     */
    public void deteleDate(ExitsandentranceEntity exitsandentranceEntity){
        exitsandentranceDao.delete(exitsandentranceEntity);
    }

    /**
     * 保存数据
     * @param exitsandentranceEntity
     */
    public void saveDate(ExitsandentranceEntity exitsandentranceEntity){
        exitsandentranceDao.saveAndFlush(exitsandentranceEntity);
}
}
