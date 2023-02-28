package com.example.lesson4_ex1.model;

public class Staff {
    String maNv, tenNv, sex;

    public Staff(String maNv, String tenNv, String sex) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.sex = sex;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
