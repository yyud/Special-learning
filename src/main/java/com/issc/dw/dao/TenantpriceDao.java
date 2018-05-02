package com.issc.dw.dao;

import com.issc.dw.entity.TenantpriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yyud
 * @version V1.0
 * @Description: 租户收费类型dao
 * @Date 17:54 2018/4/19
 */
@Repository
public interface TenantpriceDao extends JpaRepository<TenantpriceEntity,Long> {

}
