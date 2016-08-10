package com.khtn.tapdoclophai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnClickOnMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnClickOnMe = (Button) findViewById(R.id.btnClick);
        btnClickOnMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sText = "Author by Team 1 HCMUS";
                Toast.makeText(MainActivity.this,sText,Toast.LENGTH_LONG).show();
            }
        });
    }
}
