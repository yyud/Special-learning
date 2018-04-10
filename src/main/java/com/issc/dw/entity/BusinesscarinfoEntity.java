package com.issc.dw.entity;

import javax.persistence.*;
import java.util.Objects;

<<<<<<< HEAD
/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 20:37 2018/4/9
 */
=======
>>>>>>> fb2478b48bd82e4754a8bb0a25afe75c472dab55
@Entity
@Table(name = "businesscarinfo", schema = "parking", catalog = "")
public class BusinesscarinfoEntity {
    private String paltenum;
    private Long businessid;
    private String color;
    private String cartype;

    @Id
    @Column(name = "paltenum")
    public String getPaltenum() {
        return paltenum;
    }

    public void setPaltenum(String paltenum) {
        this.paltenum = paltenum;
    }

    @Basic
    @Column(name = "businessid")
    public Long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "cartype")
    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinesscarinfoEntity that = (BusinesscarinfoEntity) o;
        return Objects.equals(paltenum, that.paltenum) &&
                Objects.equals(businessid, that.businessid) &&
                Objects.equals(color, that.color) &&
                Objects.equals(cartype, that.cartype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(paltenum, businessid, color, cartype);
    }
}
