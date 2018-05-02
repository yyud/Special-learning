package com.issc.dw.dao;

import com.issc.dw.entity.BusinesscarinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 14:06 2018/4/16
 */
@Repository
public interface BusinesscarinfoDao extends JpaRepository<BusinesscarinfoEntity,Long> {
}
