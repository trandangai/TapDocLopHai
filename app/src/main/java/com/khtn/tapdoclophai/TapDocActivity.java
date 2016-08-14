package com.khtn.tapdoclophai;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TapDocActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_tapdoc);

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Bài 1");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);

        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }
}
