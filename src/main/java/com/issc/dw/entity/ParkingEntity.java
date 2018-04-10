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
@Table(name = "parking", schema = "parking", catalog = "")
public class ParkingEntity {
    private long parkingid;
    private long tenantid;
    private String sign;

    @Id
    @Column(name = "parkingid")
    public long getParkingid() {
        return parkingid;
    }

    public void setParkingid(long parkingid) {
        this.parkingid = parkingid;
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
    @Column(name = "sign")
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingEntity that = (ParkingEntity) o;
        return parkingid == that.parkingid &&
                tenantid == that.tenantid &&
                Objects.equals(sign, that.sign);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parkingid, tenantid, sign);
    }
}
