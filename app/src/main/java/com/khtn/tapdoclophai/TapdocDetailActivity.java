package com.khtn.tapdoclophai;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.khtn.tapdoclophai.pojo.BaiDoc;
import com.khtn.tapdoclophai.pojo.BaiHoc;
import com.khtn.tapdoclophai.utility.AudioPlayer;

import java.io.IOException;
import java.io.InputStream;

public class TapdocDetailActivity extends AppCompatActivity {

    TextView txtNoiDungBaiDoc;
    ImageView imgDetailBaiDoc;
    ImageButton btnimgPlaySound;
    private AssetFileDescriptor afd;
    private AudioPlayer audioPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tapdoc_detail);

        txtNoiDungBaiDoc = (TextView) findViewById(R.id.txtNoiDungBaiDoc);
        imgDetailBaiDoc = (ImageView) findViewById(R.id.imgbaidocDetails);
        btnimgPlaySound = (ImageButton) findViewById(R.id.imgPlaySound);

        try {

        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("BaiDocBundle");
            final BaiDoc baiDoc = (BaiDoc) bundle.getSerializable("BaiDocDetails");
            try {
                afd = getAssets().openFd("audio/"+baiDoc.getAudio());
                audioPlayer = new AudioPlayer(afd.getFileDescriptor(),afd.getStartOffset(),afd.getLength());
                btnimgPlaySound.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(audioPlayer.isPlaying()) {
                            audioPlayer.restart();
                        }
                        audioPlayer.play();
                    }
                });
            } catch (IOException e) {
                Log.d("error sound : ",e.toString());
            }
            txtNoiDungBaiDoc.setText(baiDoc.getNoiDung());

            if (!baiDoc.getImgMinhHoa().isEmpty()) {
                try {
                    InputStream inputStream = getAssets().open("img/" + baiDoc.getImgMinhHoa());
                    Drawable drawable = Drawable.createFromStream(inputStream, null);
                    imgDetailBaiDoc.setImageDrawable(drawable);
                } catch (Exception ex) {
                    Log.d("Error loading img : ", ex.toString());
                }
            }
        }
        catch (Exception ex)
        {
            txtNoiDungBaiDoc.setText("Không tìm thấy nội dung");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(audioPlayer!=null)
        {
            audioPlayer.release();
        }
    }
}
