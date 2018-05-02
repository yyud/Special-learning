package com.issc.dw.dao;

import com.issc.dw.entity.BusinesspriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 11:41 2018/4/16
 */
@Repository
public interface BusinesspriceDao extends JpaRepository<BusinesspriceEntity,Long> {

    //联表查询商家收费价格
    @Query(value = "select o from BusinesspriceEntity as o where o.pricetype in " +
            "(select j.pricetype from BusinessEntity as j where j.businessid = ?1 )")
    public BusinesspriceEntity getMoney(Long id);


    //修改更新操作
    @Modifying
    @Query("update BusinesspriceEntity o set o.pricetype = ?2,o.price = ?3 where o.id = ?1 ")
    public void update(Long id,String privatype,Double  price);
}

