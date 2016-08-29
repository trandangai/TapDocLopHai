package com.khtn.tapdoclophai;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.khtn.tapdoclophai.dao.CauHoiDAO;
import com.khtn.tapdoclophai.pojo.CauHoi;

import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */

public class CauHoiDetailActivity extends AppCompatActivity {

    private TextView tvCauHoi;
    private TextView tvCauHoiTL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cauhoi_detail);

        tvCauHoi = (TextView) findViewById(R.id.tvCau1);
        tvCauHoiTL = (TextView) findViewById(R.id.tvCau1TL);

        CauHoiDAO chDAO = new CauHoiDAO(getApplicationContext());
        ArrayList<CauHoi> listCH = chDAO.getAllCauHoi();

        tvCauHoi.setText(listCH.get(0).getCauHoi());
        tvCauHoiTL.setText("Gợi ý: " + listCH.get(0).getGoiYTraLoi());
    }
}
