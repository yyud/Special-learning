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
@Table(name = "temporaryorder", schema = "parking", catalog = "")
public class TemporaryorderEntity {
    private String orderid;
    private String platenum;
    private String exitid;
    private String paytime;
    private double cost;
    private String orderstate;
    private String remark;

    @Id
    @Column(name = "orderid")
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "platenum")
    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum;
    }

    @Basic
    @Column(name = "exitid")
    public String getExitid() {
        return exitid;
    }

    public void setExitid(String exitid) {
        this.exitid = exitid;
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
    @Column(name = "cost")
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "orderstate")
    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate;
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
        TemporaryorderEntity that = (TemporaryorderEntity) o;
        return Double.compare(that.cost, cost) == 0 &&
                Objects.equals(orderid, that.orderid) &&
                Objects.equals(platenum, that.platenum) &&
                Objects.equals(exitid, that.exitid) &&
                Objects.equals(paytime, that.paytime) &&
                Objects.equals(orderstate, that.orderstate) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderid, platenum, exitid, paytime, cost, orderstate, remark);
    }
}
