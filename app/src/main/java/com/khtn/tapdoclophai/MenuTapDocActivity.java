package com.khtn.tapdoclophai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.khtn.tapdoclophai.utility.MenuBaiHoc;
import com.khtn.tapdoclophai.utility.MenuBaiHocArrayAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenuTapDocActivity extends AppCompatActivity {


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
        ArrayList<MenuBaiHoc> arrMenuBaiHoc = new ArrayList<MenuBaiHoc>();
        arrMenuBaiHoc.add(new MenuBaiHoc("1","Có công mài sắt"));
        arrMenuBaiHoc.add(new MenuBaiHoc("2","Phần thưởng"));
        arrMenuBaiHoc.add(new MenuBaiHoc("3","Bạn của nai nhỏ"));
        arrMenuBaiHoc.add(new MenuBaiHoc("4","Bím tóc đuôi sam"));


        MenuBaiHocArrayAdapter adapter = new MenuBaiHocArrayAdapter
                (MenuTapDocActivity.this,R.layout.customlayout_menubaihoc,arrMenuBaiHoc);

        lvListbaiHoc.setAdapter(adapter);
    }
}
