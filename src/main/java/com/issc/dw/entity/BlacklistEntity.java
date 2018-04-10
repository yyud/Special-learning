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
@Table(name = "blacklist", schema = "parking", catalog = "")
public class BlacklistEntity {
    private long id;
    private String platenum;
    private String remark;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        BlacklistEntity that = (BlacklistEntity) o;
        return id == that.id &&
                Objects.equals(platenum, that.platenum) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, platenum, remark);
    }
}
