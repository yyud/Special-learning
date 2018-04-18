package com.issc.dw.dao;

import com.issc.dw.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<AdminEntity,Long> {
    AdminEntity findByUsernameAndPassword(String username,String password);
    String findPowerByUsername(String power);
}
