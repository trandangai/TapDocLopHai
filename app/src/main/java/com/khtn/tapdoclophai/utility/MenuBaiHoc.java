package com.khtn.tapdoclophai.utility;

/**
 * Created by CuongLe on 8/29/2016.
 */
public class MenuBaiHoc {
    private String maBH;
    private String tenBH;

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public MenuBaiHoc(String maBH, String tenBH) {
        this.maBH = maBH;
        this.tenBH = tenBH;
    }

    @Override
    public String toString() {
        return this.maBH+"-"+this.tenBH;
    }
}
