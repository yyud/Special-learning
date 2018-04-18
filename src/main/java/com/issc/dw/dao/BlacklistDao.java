package com.issc.dw.dao;

import com.issc.dw.entity.BlacklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlacklistDao extends JpaRepository<BlacklistEntity,Long>{
    BlacklistEntity findByPlatenum(String paltenum);
}
