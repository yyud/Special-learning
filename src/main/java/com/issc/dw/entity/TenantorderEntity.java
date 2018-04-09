package com.issc.dw.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tenantorder", schema = "parking", catalog = "")
public class TenantorderEntity {
    private long orderid;
    private long tenantid;
    private String createtime;
    private String effectivetime;
    private String cutoftime;
    private String paytime;
    private String paystate;
    private Double cost;
    private String remark;

    @Id
    @Column(name = "orderid")
    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "tenantid")
    public long getTenantid() {
        return tenantid;
    }

    public void setTenantid(long tenantid) {
        this.tenantid = tenantid;
    }

    @Basic
    @Column(name = "createtime")
    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "effectivetime")
    public String getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(String effectivetime) {
        this.effectivetime = effectivetime;
    }

    @Basic
    @Column(name = "cutoftime")
    public String getCutoftime() {
        return cutoftime;
    }

    public void setCutoftime(String cutoftime) {
        this.cutoftime = cutoftime;
    }

    @Basic
    @Column(name = "paytime")
    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    @Basic
    @Column(name = "paystate")
    public String getPaystate() {
        return paystate;
    }

    public void setPaystate(String paystate) {
        this.paystate = paystate;
    }

    @Basic
    @Column(name = "cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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
        TenantorderEntity that = (TenantorderEntity) o;
        return orderid == that.orderid &&
                tenantid == that.tenantid &&
                Objects.equals(createtime, that.createtime) &&
                Objects.equals(effectivetime, that.effectivetime) &&
                Objects.equals(cutoftime, that.cutoftime) &&
                Objects.equals(paytime, that.paytime) &&
                Objects.equals(paystate, that.paystate) &&
                Objects.equals(cost, that.cost) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderid, tenantid, createtime, effectivetime, cutoftime, paytime, paystate, cost, remark);
    }
}
