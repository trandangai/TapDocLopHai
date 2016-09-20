package com.khtn.tapdoclophai;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.TextViewCompat;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.khtn.tapdoclophai.fragment.CauHoiDetailFragment;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */

public class CauHoiDetailActivity extends FragmentActivity {

    FragmentManager manager;

    private LinearLayout lnlCauHoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cauhoi_detail);
        manager = getSupportFragmentManager();

        Intent intent = getIntent();
        long idBaiHoc = intent.getLongExtra("id_baihoc", 1);

        lnlCauHoi = (LinearLayout) findViewById(R.id.container);

        //CauHoiDAO chDAO = new CauHoiDAO(getApplicationContext());
        //ArrayList<CauHoi> listCH = chDAO.getListCauHoi(idBaiHoc);

        CauHoiDetailFragment fragment = new CauHoiDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("IDBaiHoc", idBaiHoc);
        fragment.setArguments(bundle);

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragment, "cauHoiDetailFragment");
        //transaction.addToBackStack(null);
        transaction.commit();

        /*ArrayList<CauHoi> listCH = new ArrayList<>();
        listCH.add(new CauHoi("1. Lúc đầu, cậu bé học hành thế nào?", "Lúc đầu, cậu bé rất làm biếng, làm việc gì cũng mau chán, bỏ dở giữa chừng.","Tập đọc #1", ""));
        listCH.add(new CauHoi("2. Cậu bé thấy bà cụ đang làm gì?", "Cậu bé thấy bà cụ đang cầm thỏi sắt mải miết mài vào tảng đá ven đường.","Tập đọc #1", ""));
        listCH.add(new CauHoi("3. Bà cụ giảng giải như thế nào?", "Mỗi ngày mài thỏi sắt nhỏ đi một tí, sẽ có ngày nó thành kim. Giống như đi học, mỗi ngày học một ít, sẽ có ngày thành tài.","Tập đọc #1", ""));
        listCH.add(new CauHoi("4. Câu chuyện này khuyên em điều gì?", "Câu chuyện khuyên em làm việc, học tập chăm chú.","Tập đọc #1", ""));
        listCH.add(new CauHoi("Những chữ nào trong bài chính tả được viết hoa?", "Những chữ ở đầu câu và sau dấu chấm được viết hoa.","Chính tả #1", ""));
        listCH.add(new CauHoi("...im khâu, ...ậu bé, ...iên nhẫn, bà ...ụ", "kim khâu, cậu bé, kiên nhẫn, bà cụ","Chính tả #1", "Điền chỗ trống"));
        listCH.add(new CauHoi("", "","", ""));
        listCH.add(new CauHoi("", "","", ""));*/

        /*TextView tvTapDoc = createCustomTitle("Tập đọc");
        lnlCauHoi.addView(tvTapDoc);

        tvCauHoi = createCustom(listCH.get(0).getCauHoi(), "#2f67ff", false);
        tvCauHoiTL = createCustom("Trả lời: " + listCH.get(0).getTraLoi(), "#36ad1b", true);

        TextView tv1 = createCustom(listCH.get(1).getCauHoi(), "#2f67ff", false);
        TextView tv1tl = createCustom("Trả lời: " + listCH.get(1).getTraLoi(), "#36ad1b", true);

        TextView tv2 = createCustom(listCH.get(2).getCauHoi(), "#2f67ff", false);
        TextView tv2tl = createCustom("Trả lời: " + listCH.get(2).getTraLoi(), "#36ad1b", true);

        TextView tv3 = createCustom(listCH.get(3).getCauHoi(), "#2f67ff", false);
        TextView tv3tl = createCustom("Trả lời: " + listCH.get(3).getTraLoi(), "#36ad1b", true);

        lnlCauHoi.addView(tvCauHoi);
        lnlCauHoi.addView(tvCauHoiTL);

        lnlCauHoi.addView(tv1);
        lnlCauHoi.addView(tv1tl);

        lnlCauHoi.addView(tv2);
        lnlCauHoi.addView(tv2tl);

        lnlCauHoi.addView(tv3);
        lnlCauHoi.addView(tv3tl);*/

        /*TextView tvChinhTa = createCustomTitle("Chính tả");
        lnlCauHoi.addView(tvChinhTa);

        TextView tv4 = createCustom(listCH.get(4).getCauHoi(), "#2f67ff", false);
        TextView tv4tl = createCustom("Trả lời: " + listCH.get(4).getTraLoi(), "#44ba29", true);

        TextView tvdct = createCustom("Điền vào chỗ trống: ", "#000000", false);
        TextView tv5 = createCustom(listCH.get(5).getCauHoi(), "#2f67ff", false);
        TextView tv5tl = createCustom("Trả lời: " + listCH.get(5).getTraLoi(), "#44ba29", true);

        lnlCauHoi.addView(tv4);
        lnlCauHoi.addView(tv4tl);

        lnlCauHoi.addView(tvdct);
        lnlCauHoi.addView(tv5);
        lnlCauHoi.addView(tv5tl);*/
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
