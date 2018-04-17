package com.issc.dw.entity;

import javax.persistence.*;
import java.util.Objects;


/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 20:37 2018/4/9
 */
@Entity
@Table(name = "business", schema = "parking", catalog = "")
public class BusinessEntity {
    private long businessid;
    private String businessname;
    private String phone;
    private String pricetype;
    private String remark;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "businessid")
    public long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(long businessid) {
        this.businessid = businessid;
    }

    @Basic
    @Column(name = "businessname")
    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
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
        BusinessEntity that = (BusinessEntity) o;
        return businessid == that.businessid &&
                Objects.equals(businessname, that.businessname) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(pricetype, that.pricetype) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(businessid, businessname, phone, pricetype, remark);
    }
}
