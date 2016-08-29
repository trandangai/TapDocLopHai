package com.khtn.tapdoclophai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import com.khtn.tapdoclophai.adapter.MenuBaiHocArrayAdapter;
import com.khtn.tapdoclophai.dao.BaiHocDAO;
import com.khtn.tapdoclophai.pojo.BaiHoc;

import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class CauHoiActivity extends AppCompatActivity {

    ListView lvListbaiHoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_tap_doc);

        lvListbaiHoc = (ListView) findViewById(R.id.lvListBaiHoc);

        addControl();
    }
    public void addControl()
    {
        ArrayList<BaiHoc> arrBaiHoc = new ArrayList<BaiHoc>();
        BaiHocDAO bhDAO = new BaiHocDAO(getApplicationContext());
        arrBaiHoc = bhDAO.getAllBaiHoc();

        MenuBaiHocArrayAdapter adapter = new MenuBaiHocArrayAdapter
                (CauHoiActivity.this,R.layout.customlayout_menubaihoc, arrBaiHoc);

        lvListbaiHoc.setAdapter(adapter);
        lvListbaiHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(CauHoiActivity.this, CauHoiDetailActivity.class);
                startActivity(intent);
            }
        });
    }

}
