package com.dbs.entity;

import java.io.Serializable;

public class Room implements Serializable {
    private int rno;
    private String rloc;
    private String rtype;
    private String requipment;
    private String rstatus;

    @Override
    public String toString() {
        return "Room{" +
                "rno=" + rno +
                ", rloc='" + rloc + '\'' +
                ", rtype='" + rtype + '\'' +
                ", requipment='" + requipment + '\'' +
                ", rstatus='" + rstatus + '\'' +
                '}';
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getRloc() {
        return rloc;
    }

    public void setRloc(String rloc) {
        this.rloc = rloc;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    public String getRequipment() {
        return requipment;
    }

    public void setRequipment(String requipment) {
        this.requipment = requipment;
    }

    public String getRstatus() {
        return rstatus;
    }

    public void setRstatus(String rstatus) {
        this.rstatus = rstatus;
    }
}
