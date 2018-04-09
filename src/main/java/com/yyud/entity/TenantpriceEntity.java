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
@Table(name = "tenantprice", schema = "parking", catalog = "")
public class TenantpriceEntity {
    private long id;
    private String pricetype;
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
    @Column(name = "pricetype")
    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype;
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
        TenantpriceEntity that = (TenantpriceEntity) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(pricetype, that.pricetype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, pricetype, price);
    }
}
