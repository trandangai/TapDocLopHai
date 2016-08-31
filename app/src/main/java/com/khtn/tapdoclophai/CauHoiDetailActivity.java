package com.khtn.tapdoclophai;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.khtn.tapdoclophai.pojo.CauHoi;

import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */

public class CauHoiDetailActivity extends AppCompatActivity {

    private LinearLayout lnlCauHoi;
    private TextView tvCauHoi;
    private TextView tvCauHoiTL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cauhoi_detail);

        Intent intent = getIntent();
        int idBaiHoc = intent.getIntExtra("id_baihoc", 1);

        lnlCauHoi = (LinearLayout) findViewById(R.id.lnlCauHoi);

        tvCauHoi = (TextView) findViewById(R.id.tvCau1);
        tvCauHoiTL = (TextView) findViewById(R.id.tvCau1TL);

        //CauHoiDAO chDAO = new CauHoiDAO(getApplicationContext());
        //ArrayList<CauHoi> listCH = chDAO.getListCauHoi(idBaiHoc);
        ArrayList<CauHoi> listCH = new ArrayList<>();
        listCH.add(new CauHoi("1. Lúc đầu, cậu bé học hành thế nào?", "Lúc đầu, cậu bé rất làm biếng, làm việc gì cũng mau chán, bỏ dở giữa chừng.","Tập đọc #1", ""));
        listCH.add(new CauHoi("2. Cậu bé thấy bà cụ đang làm gì?", "Cậu bé thấy bà cụ đang cầm thỏi sắt mải miết mài vào tảng đá ven đường.","Tập đọc #1", ""));
        listCH.add(new CauHoi("3. Bà cụ giảng giải như thế nào?", "Mỗi ngày mài thỏi sắt nhỏ đi một tí, sẽ có ngày nó thành kim. Giống như đi học, mỗi ngày học một ít, sẽ có ngày thành tài.","Tập đọc #1", ""));
        listCH.add(new CauHoi("4. Câu chuyện này khuyên em điều gì?", "Câu chuyện khuyên em làm việc, học tập chăm chú.","Tập đọc #1", ""));
        listCH.add(new CauHoi("Những chữ nào trong bài chính tả được viết hoa?", "Những chữ ở đầu câu và sau dấu chấm được viết hoa.","Chính tả #1", ""));
        listCH.add(new CauHoi("...im khâu, ...ậu bé, ...iên nhẫn, bà ...ụ", "kim khâu, cậu bé, kiên nhẫn, bà cụ","Chính tả #1", "Điền chỗ trống"));
        listCH.add(new CauHoi("", "","", ""));
        listCH.add(new CauHoi("", "","", ""));

        tvCauHoi.setText(listCH.get(0).getCauHoi());
        tvCauHoiTL.setText("Trả lời: " + listCH.get(0).getGoiYTraLoi());

        TextView tv1 = createCustom(listCH.get(1).getCauHoi(), "#2f67ff", false);
        TextView tv1tl = createCustom("Trả lời: " + listCH.get(1).getGoiYTraLoi(), "#44ba29", true);

        TextView tv2 = createCustom(listCH.get(2).getCauHoi(), "#2f67ff", false);
        TextView tv2tl = createCustom("Trả lời: " + listCH.get(2).getGoiYTraLoi(), "#44ba29", true);

        TextView tv3 = createCustom(listCH.get(3).getCauHoi(), "#2f67ff", false);
        TextView tv3tl = createCustom("Trả lời: " + listCH.get(3).getGoiYTraLoi(), "#44ba29", true);

        lnlCauHoi.addView(tv1);
        lnlCauHoi.addView(tv1tl);

        lnlCauHoi.addView(tv2);
        lnlCauHoi.addView(tv2tl);

        lnlCauHoi.addView(tv3);
        lnlCauHoi.addView(tv3tl);

        TextView tvChinhTa = createCustomTitle("Chính tả");
        lnlCauHoi.addView(tvChinhTa);

        TextView tv4 = createCustom(listCH.get(4).getCauHoi(), "#2f67ff", false);
        TextView tv4tl = createCustom("Trả lời: " + listCH.get(4).getGoiYTraLoi(), "#44ba29", true);

        TextView tvdct = createCustom("Điền vào chỗ trống: ", "#000000", false);
        TextView tv5 = createCustom(listCH.get(5).getCauHoi(), "#2f67ff", false);
        TextView tv5tl = createCustom("Trả lời: " + listCH.get(5).getGoiYTraLoi(), "#44ba29", true);

        lnlCauHoi.addView(tv4);
        lnlCauHoi.addView(tv4tl);

        lnlCauHoi.addView(tvdct);
        lnlCauHoi.addView(tv5);
        lnlCauHoi.addView(tv5tl);
    }

    private TextView createCustom(String text, String color, boolean margin)
    {
        TextView tv = new TextView(getApplicationContext());
        TextViewCompat.setTextAppearance(tv, android.R.style.TextAppearance_Medium);
        tv.setTextColor(Color.parseColor(color));
        tv.setText(text);

        if(margin) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(0, 0, 0, 10);
            tv.setLayoutParams(params);
        }

        return tv;
    }

    private TextView createCustomTitle(String text)
    {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 10, 0, 10);

        TextView tv = new TextView(getApplicationContext());
        TextViewCompat.setTextAppearance(tv, android.R.style.TextAppearance_Large);
        tv.setLayoutParams(params);
        tv.setTextColor(Color.BLACK);
        tv.setText(text);

        return tv;
    }
}
