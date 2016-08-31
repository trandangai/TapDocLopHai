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

        txtThongTin.setText("+++ THÔNG TIN ỨNG DỤNG +++ \n\n 1. Nhóm phát triển phần mềm: " +
                "Nhóm 01 - lớp QLQTPM 15HCB1 của thầy Ngô Huy Biên. \n " +
                "2. Giới thiệu ứng dụng: Ứng dụng hỗ trợ học sinh lóp 2 tập đọc theo giáo trình của Bộ GD và ĐT gồm" +
                " 3 chức năng chính:  \n**** TẬP ĐỌC: Bao gồm tất cả các bài tập đọc, kể cả bài đọc thêm. " +
                "Khi học sinh chọn đọc 1 bài bất kì thì ứng dụng sẽ hiện lên nội dung của bài đọc tương" +
                " ứng bài đọc trong SGK của Bộ Giáo Dục phát hành. Bấm chọn biểu tượng âm thanh bên dướ" +
                "i, ứng dụng sẽ hỗ trợ âm thanh đọc cho cả bài đọc đó \n**** CÂU HỎI: Bao gồm 18 bộ câu" +
                " hỏi, tương ứng với 18 tuần bài đọc chính trong SGK. Học sinh chọn bộ câu hỏi tương ứng vớ" +
                "i bài đọc đã đọc. Ứng dụng sẽ hiện ra những câu hỏi của bài đọc đó và một số gợi ý. Bấm chọn " +
                "biểu tượng đáp án, ứng dụng sẽ hiển thị đáp án tương ứng cho câu hỏi đó \n" +
                "**** BÀI TẬP: Chờ Update sản phẩm cuối cùng  +\n");
    }
}
