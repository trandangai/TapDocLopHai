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
        arrMenuBaiHoc.add(new MenuBaiHoc("1","Có công mài sắt có ngày nên kim"));
        arrMenuBaiHoc.add(new MenuBaiHoc("3","Ngày hôm qua đâu rồi"));
        arrMenuBaiHoc.add(new MenuBaiHoc("4","Phần thưởng"));
        arrMenuBaiHoc.add(new MenuBaiHoc("5","Làm việc thật là vui"));
        arrMenuBaiHoc.add(new MenuBaiHoc("6","Mít làm thơ"));
        arrMenuBaiHoc.add(new MenuBaiHoc("7","Bạn của nai nhỏ"));
        arrMenuBaiHoc.add(new MenuBaiHoc("8","Gọi bạn"));
        arrMenuBaiHoc.add(new MenuBaiHoc("9","Bím tóc đuôi xam"));
        arrMenuBaiHoc.add(new MenuBaiHoc("10","Trên chiếc bè"));
        arrMenuBaiHoc.add(new MenuBaiHoc("11","Chiếc bút mực"));
        arrMenuBaiHoc.add(new MenuBaiHoc("12","Mục lục sách"));
        arrMenuBaiHoc.add(new MenuBaiHoc("13","Cái trống trường em"));
        arrMenuBaiHoc.add(new MenuBaiHoc("14","Mẫu giấy vụn"));
        arrMenuBaiHoc.add(new MenuBaiHoc("15","Ngồi trường mới"));
        arrMenuBaiHoc.add(new MenuBaiHoc("16","Người thầy cũ"));
        arrMenuBaiHoc.add(new MenuBaiHoc("17","Thời khóa biểu"));
        arrMenuBaiHoc.add(new MenuBaiHoc("18","Cô giáo lớp em"));
        arrMenuBaiHoc.add(new MenuBaiHoc("19","Sáng kiến của bé Hà"));
        arrMenuBaiHoc.add(new MenuBaiHoc("20","Ngày lễ"));
        arrMenuBaiHoc.add(new MenuBaiHoc("21","Bưu thiếp"));
        arrMenuBaiHoc.add(new MenuBaiHoc("22","Ông và cháu"));
        arrMenuBaiHoc.add(new MenuBaiHoc("23","Kể ngắn về người thân"));
        arrMenuBaiHoc.add(new MenuBaiHoc("24","Ôn tập"));
        arrMenuBaiHoc.add(new MenuBaiHoc("25","Bà cháu"));
        arrMenuBaiHoc.add(new MenuBaiHoc("26","Cây xoài của ông em"));
        arrMenuBaiHoc.add(new MenuBaiHoc("27","Chia buồn an ủi"));
        arrMenuBaiHoc.add(new MenuBaiHoc("28","Sự tích cây vú sữa"));
        arrMenuBaiHoc.add(new MenuBaiHoc("29","Mẹ"));
        arrMenuBaiHoc.add(new MenuBaiHoc("30","Bông hoa niềm vui"));
        arrMenuBaiHoc.add(new MenuBaiHoc("31","Quà của bố"));
        arrMenuBaiHoc.add(new MenuBaiHoc("32","Bà cháu"));
        arrMenuBaiHoc.add(new MenuBaiHoc("33","Câu chuyện bó đũa"));
        arrMenuBaiHoc.add(new MenuBaiHoc("34","Bà cháu"));
        arrMenuBaiHoc.add(new MenuBaiHoc("35","Hai anh em"));
        arrMenuBaiHoc.add(new MenuBaiHoc("36","Bé Hoa"));
        arrMenuBaiHoc.add(new MenuBaiHoc("37","Con chó nhà hàng xóm"));
        arrMenuBaiHoc.add(new MenuBaiHoc("38","Thời gian biểu"));
        arrMenuBaiHoc.add(new MenuBaiHoc("39","Tìm ngọc"));
        arrMenuBaiHoc.add(new MenuBaiHoc("40","Gà tỉ tê với gà"));
        MenuBaiHocArrayAdapter adapter = new MenuBaiHocArrayAdapter
                (MenuTapDocActivity.this,R.layout.customlayout_menubaihoc,arrMenuBaiHoc);

        lvListbaiHoc.setAdapter(adapter);
    }
}
