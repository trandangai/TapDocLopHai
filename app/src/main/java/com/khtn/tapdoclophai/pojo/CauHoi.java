package com.khtn.tapdoclophai.pojo;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class CauHoi {

    private String cauHoi;
    private String goiYTraLoi;
    //private String traLoi;
    private String phanBH;
    private String loaiCH;

    public CauHoi(String cauHoi, String goiYTraLoi, String phanBH, String loaiCH) {
        this.cauHoi = cauHoi;
        this.goiYTraLoi = goiYTraLoi;
        //this.traLoi = traLoi;
        this.phanBH = phanBH;
        this.loaiCH = loaiCH;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
    }

    public String getGoiYTraLoi() {
        return goiYTraLoi;
    }

    public void setGoiYTraLoi(String goiYTraLoi) {
        this.goiYTraLoi = goiYTraLoi;
    }

    //public String getTraLoi() {
    //    return traLoi;
    //}

    //public void setTraLoi(String traLoi) {
    //    this.traLoi = traLoi;
    //}

    public String getPhanBH() {
        return phanBH;
    }

    public void setPhanBH(String phanBH) {
        this.phanBH = phanBH;
    }

    public String getLoaiCH() {
        return loaiCH;
    }

    public void setLoaiCH(String loaiCH) {
        this.loaiCH = loaiCH;
    }
}
