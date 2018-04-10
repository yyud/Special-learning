package com.issc.dw.dao;

import com.issc.dw.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Admindao extends JpaRepository<AdminEntity,Long> {
    AdminEntity findByUsernameAndPassword(String username,String password);
}
