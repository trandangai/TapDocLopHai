package com.khtn.tapdoclophai.pojo;

import java.io.Serializable;

/**
 * Created by CuongLe on 8/30/2016.
 */
public class BaiDoc implements Serializable{
    private String tenBai;
    private String noiDung;
    private int idBaiHoc;
    private String imgMinhHoa;
    private String audio;

    public String getTenBai() {
        return tenBai;
    }

    public void setTenBai(String tenBai) {
        this.tenBai = tenBai;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public int getIdBaiHoc() {
        return idBaiHoc;
    }

    public void setIdBaiHoc(int idBaiHoc) {
        this.idBaiHoc = idBaiHoc;
    }

    public String getImgMinhHoa() {
        return imgMinhHoa;
    }

    public void setImgMinhHoa(String imgMinhHoa) {
        this.imgMinhHoa = imgMinhHoa;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public BaiDoc(String tenBai, String noiDung, int idBaiHoc, String imgMinhHoa, String audio) {
        this.tenBai = tenBai;
        this.noiDung = noiDung;
        this.idBaiHoc = idBaiHoc;
        this.imgMinhHoa = imgMinhHoa;
        this.audio = audio;
    }
}
