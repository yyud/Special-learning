package com.issc.dw.entity;

import javax.persistence.*;


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
    private String businessName;
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
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
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
    public String toString() {
        return "BusinessEntity{" +
                "businessid=" + businessid +
                ", businessName='" + businessName + '\'' +
                ", phone='" + phone + '\'' +
                ", pricetype='" + pricetype + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
