package com.khtn.tapdoclophai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MenuThongTin extends AppCompatActivity {

    RelativeLayout imgThongtin;
    TextView txtThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_thong_tin);

        imgThongtin = (RelativeLayout)findViewById(R.id.ImgThongTin);
        imgThongtin.setBackgroundResource(R.drawable.thongtin);

        txtThongTin = (TextView) findViewById(R.id.txtThongTin);

        txtThongTin.setText("");
    }
}
