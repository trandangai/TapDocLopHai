package com.khtn.tapdoclophai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.khtn.tapdoclophai.dao.BaiDocDAO;
import com.khtn.tapdoclophai.dao.BaiHocDAO;
import com.khtn.tapdoclophai.pojo.BaiDoc;
import com.khtn.tapdoclophai.pojo.BaiHoc;
import com.khtn.tapdoclophai.adapter.MenuBaiHocArrayAdapter;

import java.util.ArrayList;

public class MenuTapDocActivity extends AppCompatActivity {

    private BaiDocDAO baiDocDAO;
    private ArrayList<BaiDoc> arrBaiDocDetails;
    ListView lvListbaiHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_tap_doc);

        lvListbaiHoc = (ListView) findViewById(R.id.lvListBaiHoc);

        addControl();
        addEvents();

        baiDocDAO = new BaiDocDAO(getApplicationContext());
        arrBaiDocDetails = baiDocDAO.getAllBaiDoc();
        //Toast.makeText(MenuTapDocActivity.this,arrBaiDocDetails.size()+"",Toast.LENGTH_LONG).show();
    }
    public void addControl()
    {
        ArrayList<BaiHoc> arrBaiHoc = new ArrayList<BaiHoc>();
        arrBaiHoc.add(new BaiHoc("1","Có công mài sắt, có ngày nên kim"));
        arrBaiHoc.add(new BaiHoc("2","Tự thuật"));
        arrBaiHoc.add(new BaiHoc("3","Ngày hôm qua đâu rồi"));
        arrBaiHoc.add(new BaiHoc("4","Phần thưởng"));
        arrBaiHoc.add(new BaiHoc("5","Làm việc thật là vui"));
        arrBaiHoc.add(new BaiHoc("6","Mít làm thơ"));
        arrBaiHoc.add(new BaiHoc("7","Bạn của nai nhỏ"));
        arrBaiHoc.add(new BaiHoc("8","Gọi bạn"));
        arrBaiHoc.add(new BaiHoc("9","Bím tóc đuôi xam"));
        arrBaiHoc.add(new BaiHoc("10","Trên chiếc bè"));
        arrBaiHoc.add(new BaiHoc("11","Chiếc bút mực"));
        arrBaiHoc.add(new BaiHoc("12","Mục lục sách"));
        arrBaiHoc.add(new BaiHoc("13","Cái trống trường em"));
        arrBaiHoc.add(new BaiHoc("14","Mẫu giấy vụn"));
        arrBaiHoc.add(new BaiHoc("15","Ngồi trường mới"));
        arrBaiHoc.add(new BaiHoc("16","Người thầy cũ"));
        arrBaiHoc.add(new BaiHoc("17","Thời khóa biểu"));
        arrBaiHoc.add(new BaiHoc("18","Cô giáo lớp em"));
        arrBaiHoc.add(new BaiHoc("19","Sáng kiến của bé Hà"));
        arrBaiHoc.add(new BaiHoc("20","Ngày lễ"));
        arrBaiHoc.add(new BaiHoc("21","Bưu thiếp"));
        arrBaiHoc.add(new BaiHoc("22","Ông và cháu"));
        arrBaiHoc.add(new BaiHoc("23","Kể ngắn về người thân"));
        arrBaiHoc.add(new BaiHoc("24","Ôn tập"));
        arrBaiHoc.add(new BaiHoc("25","Bà cháu"));
        arrBaiHoc.add(new BaiHoc("26","Cây xoài của ông em"));
        arrBaiHoc.add(new BaiHoc("27","Chia buồn an ủi"));
        arrBaiHoc.add(new BaiHoc("28","Sự tích cây vú sữa"));
        arrBaiHoc.add(new BaiHoc("29","Mẹ"));
        arrBaiHoc.add(new BaiHoc("30","Bông hoa niềm vui"));
        arrBaiHoc.add(new BaiHoc("31","Quà của bố"));
        arrBaiHoc.add(new BaiHoc("32","Bà cháu"));
        arrBaiHoc.add(new BaiHoc("33","Câu chuyện bó đũa"));
        arrBaiHoc.add(new BaiHoc("34","Bà cháu"));
        arrBaiHoc.add(new BaiHoc("35","Hai anh em"));
        arrBaiHoc.add(new BaiHoc("36","Bé Hoa"));
        arrBaiHoc.add(new BaiHoc("37","Con chó nhà hàng xóm"));
        arrBaiHoc.add(new BaiHoc("38","Thời gian biểu"));
        arrBaiHoc.add(new BaiHoc("39","Tìm ngọc"));
        arrBaiHoc.add(new BaiHoc("40","Gà tỉ tê với gà"));
        MenuBaiHocArrayAdapter adapter = new MenuBaiHocArrayAdapter
                (MenuTapDocActivity.this,R.layout.customlayout_menubaihoc, arrBaiHoc);

        lvListbaiHoc.setAdapter(adapter);
    }



    public void addEvents()
    {
        lvListbaiHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MenuTapDocActivity.this,TapdocDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("BaiDocDetails",arrBaiDocDetails.get(position));
                intent.putExtra("BaiDocBundle",bundle);
                startActivity(intent);
            }
        });
    }
}
