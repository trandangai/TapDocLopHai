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

        txtThongTin.setText("1. Nhóm phát triển phần mềm: Nhóm 01 - lớp QLQTPM 15HCB1 của thầy Ngô Huy Biên. " +
                "2. Giới thiệu ứng dụng: Ứng dụng hỗ trợ học sinh lóp 2 tập đọc theo giáo trình của Bộ GD và ĐT gồm 3 chức năng chính" +
                ". Tập đọc: Bao gồm tất cả các bài tập đọc, kể cả bài đọc thêm. Khi học sinh chọn đọc 1 bài bất kì thì ứng dụng sẽ hiện lên nội dung của bài đọc tương ứng bài đọc trong SGK của Bộ Giáo Dục phát hành. Bấm chọn biểu tượng âm thanh bên dưới, ứng dụng sẽ hỗ trợ âm thanh đọc cho cả bài đọc đó" +
                ". Câu hỏi: Bao gồm 18 bộ câu hỏi, tương ứng với 18 tuần bài đọc chính trong SGK. Học sinh chọn bộ câu hỏi tương ứng với bài đọc đã đọc. Ứng dụng sẽ hiện ra những câu hỏi của bài đọc đó và một số gợi ý. Bấm chọn biểu tượng đáp án, ứng dụng sẽ hiển thị đáp án tương ứng cho câu hỏi đó" +
                ". Bài tập: Chờ Update sản phẩm cuối cùng" +
                "------------------------");
    }
}
