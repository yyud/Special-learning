package com.issc.dw.dao;

import com.issc.dw.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Admindao extends JpaRepository<AdminEntity,Long> {
    //查询用户名和密码
    AdminEntity findByUsernameAndPassword(String username,String password);
    //保存一个用户实体
    AdminEntity save(AdminEntity adminEntity);

}
