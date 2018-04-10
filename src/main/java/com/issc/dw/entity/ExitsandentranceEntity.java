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
@Table(name = "exitsandentrance", schema = "parking", catalog = "")
public class ExitsandentranceEntity {
    private long exitid;
    private String exitname;
    private String exitsign;
    private String location;
    private String state;

    @Id
    @Column(name = "exitid")
    public long getExitid() {
        return exitid;
    }

    public void setExitid(long exitid) {
        this.exitid = exitid;
    }

    @Basic
    @Column(name = "exitname")
    public String getExitname() {
        return exitname;
    }

    public void setExitname(String exitname) {
        this.exitname = exitname;
    }

    @Basic
    @Column(name = "exitsign")
    public String getExitsign() {
        return exitsign;
    }

    public void setExitsign(String exitsign) {
        this.exitsign = exitsign;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExitsandentranceEntity that = (ExitsandentranceEntity) o;
        return exitid == that.exitid &&
                Objects.equals(exitname, that.exitname) &&
                Objects.equals(exitsign, that.exitsign) &&
                Objects.equals(location, that.location) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {

        return Objects.hash(exitid, exitname, exitsign, location, state);
    }
}
