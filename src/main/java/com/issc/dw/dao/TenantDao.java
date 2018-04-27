package com.issc.dw.dao;

import com.issc.dw.entity.TenantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantDao extends JpaRepository<TenantEntity,Long>{
}
