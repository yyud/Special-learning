package com.issc.dw.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tenant", schema = "parking", catalog = "")
public class TenantEntity {
    private long tenantid;
    private String tenantname;
    private String phone;
    private String pricetype;
    private String remark;

    @Id
    @Column(name = "tenantid")
    public long getTenantid() {
        return tenantid;
    }

    public void setTenantid(long tenantid) {
        this.tenantid = tenantid;
    }

    @Basic
    @Column(name = "tenantname")
    public String getTenantname() {
        return tenantname;
    }

    public void setTenantname(String tenantname) {
        this.tenantname = tenantname;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "pricetype")
    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TenantEntity that = (TenantEntity) o;
        return tenantid == that.tenantid &&
                Objects.equals(tenantname, that.tenantname) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(pricetype, that.pricetype) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tenantid, tenantname, phone, pricetype, remark);
    }
}
