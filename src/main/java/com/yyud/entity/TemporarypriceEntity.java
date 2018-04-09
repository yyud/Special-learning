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
@Table(name = "temporaryprice", schema = "parking", catalog = "")
public class TemporarypriceEntity {
    private long id;
    private String cartype;
    private double price;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cartype")
    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemporarypriceEntity that = (TemporarypriceEntity) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(cartype, that.cartype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, cartype, price);
    }
}
