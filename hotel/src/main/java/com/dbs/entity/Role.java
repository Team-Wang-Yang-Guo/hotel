package com.dbs.entity;

import java.io.Serializable;

public class Role implements Serializable {
    private int rno;
    private String rname;
    private String rpwd;
    private String rtype;

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRpwd() {
        return rpwd;
    }

    public void setRpwd(String rpwd) {
        this.rpwd = rpwd;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rno=" + rno +
                ", rname='" + rname + '\'' +
                ", rpwd='" + rpwd + '\'' +
                ", rtype='" + rtype + '\'' +
                '}';
    }
}
