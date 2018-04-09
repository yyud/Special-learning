package com.yyud.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author yyud
 * @version V1.0
 * @Description:
 * @Date 20:37 2018/4/9
 */
@Entity
@Table(name = "temporarycarinfo", schema = "parking", catalog = "")
public class TemporarycarinfoEntity {
    private String platenum;
    private String color;
    private String cartype;

    @Id
    @Column(name = "platenum")
    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum;
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
        TemporarycarinfoEntity that = (TemporarycarinfoEntity) o;
        return Objects.equals(platenum, that.platenum) &&
                Objects.equals(color, that.color) &&
                Objects.equals(cartype, that.cartype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(platenum, color, cartype);
    }
}
