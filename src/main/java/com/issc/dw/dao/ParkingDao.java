package com.issc.dw.dao;

import com.issc.dw.entity.ParkingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yyud
 * @version V1.0
 * @Description: 停车位dao
 * @Date 14:15 2018/4/19
 */
@Repository
public interface ParkingDao extends JpaRepository<ParkingEntity,Long>{
}
