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
@Table(name = "parkingrecord", schema = "parking", catalog = "")
public class ParkingrecordEntity {
    private long recordid;
    private String platenum;
    private String exitid;
    private String entrancetime;
    private String exittime;
    private String enpicture;
    private String expicture;
    private String remark;

    @Id
    @Column(name = "recordid")
    public long getRecordid() {
        return recordid;
    }

    public void setRecordid(long recordid) {
        this.recordid = recordid;
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
    @Column(name = "entrancetime")
    public String getEntrancetime() {
        return entrancetime;
    }

    public void setEntrancetime(String entrancetime) {
        this.entrancetime = entrancetime;
    }

    @Basic
    @Column(name = "exittime")
    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }

    @Basic
    @Column(name = "enpicture")
    public String getEnpicture() {
        return enpicture;
    }

    public void setEnpicture(String enpicture) {
        this.enpicture = enpicture;
    }

    @Basic
    @Column(name = "expicture")
    public String getExpicture() {
        return expicture;
    }

    public void setExpicture(String expicture) {
        this.expicture = expicture;
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
        ParkingrecordEntity that = (ParkingrecordEntity) o;
        return recordid == that.recordid &&
                Objects.equals(platenum, that.platenum) &&
                Objects.equals(exitid, that.exitid) &&
                Objects.equals(entrancetime, that.entrancetime) &&
                Objects.equals(exittime, that.exittime) &&
                Objects.equals(enpicture, that.enpicture) &&
                Objects.equals(expicture, that.expicture) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(recordid, platenum, exitid, entrancetime, exittime, enpicture, expicture, remark);
    }
}
