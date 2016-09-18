package com.khtn.tapdoclophai;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.WindowManager;

import com.khtn.tapdoclophai.fragment.ListTuanFragment;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class CauHoiActivity extends FragmentActivity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

        manager = getSupportFragmentManager();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, new ListTuanFragment(), "listTuanFragment");
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
