package com.issc.dw.dao;

import com.issc.dw.entity.TenantorderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TenantorderDao extends JpaRepository<TenantorderEntity,Long>{
        @Query("select o from TenantorderEntity o ,TenantcarinfoEntity j where o.tenantid=j.tenantid and j.platenum=?1")
        //@Query("select o from TenantorderEntity o where o.tenantid in(select j.tenantid from TenantcarinfoEntity j where j.platenum=?1)")
        List<TenantorderEntity> getOderByPlatenum(String platenum);
}
