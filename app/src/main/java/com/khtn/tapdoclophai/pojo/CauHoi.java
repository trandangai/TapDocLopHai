package com.khtn.tapdoclophai.pojo;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class CauHoi {

    private String cauHoi;
    private String goiYTraLoi;
    private String traLoi;
    private String phanBH;

    public CauHoi(String cauHoi, String goiYTraLoi, String traLoi, String phanBH) {
        this.cauHoi = cauHoi;
        this.goiYTraLoi = goiYTraLoi;
        this.traLoi = traLoi;
        this.phanBH = phanBH;
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

    public String getTraLoi() {
        return traLoi;
    }

    public void setTraLoi(String traLoi) {
        this.traLoi = traLoi;
    }

    public String getPhanBH() {
        return phanBH;
    }

    public void setPhanBH(String phanBH) {
        this.phanBH = phanBH;
    }
}
