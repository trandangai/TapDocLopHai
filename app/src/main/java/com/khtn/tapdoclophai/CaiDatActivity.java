package com.khtn.tapdoclophai;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import com.khtn.tapdoclophai.sqlite.MySQLiteHelper;

public class CaiDatActivity extends AppCompatActivity {

    private boolean option;
    SharedPreferences sharedPreferences;
    private ImageButton imgSound,imgReloadData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_cai_dat);

        imgSound = (ImageButton) findViewById(R.id.imgbtnSound);
        imgReloadData = (ImageButton) findViewById(R.id.imgbtnReloadData);

        sharedPreferences = getSharedPreferences("soundoption",MODE_PRIVATE);
        addEvents();
        ShowBtnSound();

    }


    private void ShowBtnSound()
    {
        option = sharedPreferences.getBoolean("so",true);
        Log.d("Sound option",option+"");
        if(option)
        {
            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.son);
            imgSound.setImageDrawable(drawable);
        }
        else
        {
            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.soff);
            imgSound.setImageDrawable(drawable);
        }
    }

    private void addEvents()
    {
        imgSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(option) {
                    editor.putBoolean("so", false);
                    editor.commit();
                    ShowBtnSound();
                }
                else
                {
                    editor.putBoolean("so",true);
                    editor.commit();
                    ShowBtnSound();
                }
            }
        });

        imgReloadData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    MySQLiteHelper helper = new MySQLiteHelper(getApplicationContext());
                    helper.reloadDatabse();
                    Toast.makeText(CaiDatActivity.this,
                            "Tải lại dữ liệu thành công",Toast.LENGTH_LONG).show();
                }
                catch (Exception ex)
                {
                    Log.d("Lỗi reload DB",ex.toString());
                    Toast.makeText(CaiDatActivity.this,
                            "Không thể tải lại dữ liệu . Vui lòng kiểm tra lại",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
