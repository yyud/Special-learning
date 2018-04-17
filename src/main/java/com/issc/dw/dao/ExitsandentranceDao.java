package com.issc.dw.dao;

import com.issc.dw.entity.ExitsandentranceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 10:25 2018/4/11
 */
@Repository
public interface ExitsandentranceDao extends JpaRepository<ExitsandentranceEntity,Long>{
   //查询所有进出口
    List<ExitsandentranceEntity> findAll();

    //保存
    ExitsandentranceEntity save(ExitsandentranceEntity exitsandentranceEntity);
    ExitsandentranceEntity saveAndFlush(ExitsandentranceEntity exitsandentranceEntity);

    //删除一个进、出口
    void delete(ExitsandentranceEntity exitsandentranceEntity);
}
