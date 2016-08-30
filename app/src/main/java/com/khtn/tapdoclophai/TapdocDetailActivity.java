package com.khtn.tapdoclophai;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.khtn.tapdoclophai.pojo.BaiDoc;
import com.khtn.tapdoclophai.pojo.BaiHoc;

import java.io.InputStream;

public class TapdocDetailActivity extends AppCompatActivity {

    TextView txtNoiDungBaiDoc;
    ImageView imgDetailBaiDoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tapdoc_detail);

        txtNoiDungBaiDoc = (TextView) findViewById(R.id.txtNoiDungBaiDoc);
        imgDetailBaiDoc = (ImageView) findViewById(R.id.imgbaidocDetails);

        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("BaiDocBundle");

        BaiDoc baiDoc = (BaiDoc) bundle.getSerializable("BaiDocDetails");

        txtNoiDungBaiDoc.setText(baiDoc.getNoiDung());
        try{
            InputStream inputStream = getAssets().open("img/"+baiDoc.getImgMinhHoa());
            Drawable drawable = Drawable.createFromStream(inputStream,null);
            imgDetailBaiDoc.setImageDrawable(drawable);
        }
        catch (Exception ex)
        {
            Log.d("Error loading img : ",ex.toString());
        }
    }
}
