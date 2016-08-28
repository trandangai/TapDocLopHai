package com.khtn.tapdoclophai;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.khtn.tapdoclophai.utility.AudioPlayer;
import com.khtn.tapdoclophai.utility.ImageLoader;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnTapDoc;
    private AudioPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        TextView tx = (TextView)findViewById(R.id.txtHello);
        TextView tx2 = (TextView)findViewById(R.id.textView);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/HP001_4_hang_bold.ttf");

        tx.setTypeface(custom_font);
        tx2.setTypeface(custom_font);

        //audioPlayer = new AudioPlayer(getApplicationContext(), R.raw.audio_test);

        AssetFileDescriptor afd = null;
        try {
            afd = getAssets().openFd("audio/P4_Doan1.m4a");
            audioPlayer = new AudioPlayer(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
        } catch (IOException e) {
            e.printStackTrace();
        }



        btnTapDoc = (ImageButton) findViewById(R.id.imgbtnTapDoc);
        btnTapDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MenuTapDocActivity.class);
                startActivity(intent);
            }
        });

        // CuongLe
        try {
            afd = getAssets().openFd("audio/ThemeSong.mp3");
            audioPlayer = new AudioPlayer(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
            if(audioPlayer.isPlaying()) {
                audioPlayer.restart();
            }
            audioPlayer.play();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    @Override
//    protected void onPause() {
//        super.onPause();
//        if(audioPlayer != null) {
//            audioPlayer.release();
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        if(audioPlayer != null) {
//            audioPlayer.release();
//        }
//    }
}
