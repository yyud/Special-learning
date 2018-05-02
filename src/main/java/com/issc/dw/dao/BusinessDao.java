package com.issc.dw.dao;

import com.issc.dw.entity.BusinessEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yyud
 * @version V1.0
 * @Date 9:13 2018/4/16
 * @Description: 商家
 */

@Repository
public interface BusinessDao extends JpaRepository<BusinessEntity,Long> {
    @Override
    List<BusinessEntity> findAll();
}
