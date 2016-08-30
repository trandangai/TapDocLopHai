package com.khtn.tapdoclophai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class MenuThongTin extends AppCompatActivity {

    TextView txtThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_thong_tin);

        txtThongTin = (TextView) findViewById(R.id.txtThongTin);

        txtThongTin.setText("Noi dung gioi thieu nhom/ gioi thieu ung dung ma ong nghi~ ra :)) thi dien vao day");
        // Phan ong lam la dien doan text nay thoi ak :)
        // lam xong thi commmit len repo cua ong , roi pull request cho tui.

    }
}
