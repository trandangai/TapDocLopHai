package com.khtn.tapdoclophai.pojo;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class CauHoi {

    private String cauHoi;
    private String traLoi;
    private int idBaiHoc;
    private String phanBH;
    private String loaiCH;
    private String imgPath;

    public CauHoi(String cauHoi, String traLoi, String phanBH, String loaiCH) {
        this.cauHoi = cauHoi;
        this.traLoi = traLoi;
        this.phanBH = phanBH;
        this.loaiCH = loaiCH;
    }

    public CauHoi(String cauHoi, String traLoi, int idBaiHoc, String phanBH, String loaiCH) {
        this.cauHoi = cauHoi;
        this.traLoi = traLoi;
        this.phanBH = phanBH;
        this.loaiCH = loaiCH;
        this.idBaiHoc = idBaiHoc;
    }

    public CauHoi(String cauHoi, String traLoi, int idBaiHoc, String phanBH, String loaiCH, String imgPath) {
        this.cauHoi = cauHoi;
        this.traLoi = traLoi;
        this.phanBH = phanBH;
        this.loaiCH = loaiCH;
        this.idBaiHoc = idBaiHoc;
        this.imgPath = imgPath;
    }

    public String getCauHoi() {
        return cauHoi;
    }

    public void setCauHoi(String cauHoi) {
        this.cauHoi = cauHoi;
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

    public String getLoaiCH() {
        return loaiCH;
    }

    public void setLoaiCH(String loaiCH) {
        this.loaiCH = loaiCH;
    }

    public int getIdBaiHoc() {
        return idBaiHoc;
    }

    public void setIdBaiHoc(int idBaiHoc) {
        this.idBaiHoc = idBaiHoc;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
}
