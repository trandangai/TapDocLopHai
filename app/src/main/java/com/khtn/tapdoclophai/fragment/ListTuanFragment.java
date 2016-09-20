package com.khtn.tapdoclophai.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.khtn.tapdoclophai.CauHoiDetailActivity;
import com.khtn.tapdoclophai.R;
import com.khtn.tapdoclophai.adapter.MenuBaiHocArrayAdapter;
import com.khtn.tapdoclophai.dao.BaiHocDAO;
import com.khtn.tapdoclophai.pojo.BaiHoc;

import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/09/17.
 */
public class ListTuanFragment extends Fragment {

    ListView lvListbaiHoc;

    public static ListTuanFragment newInstance() {
        return new ListTuanFragment();
    }

    public ListTuanFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_menu_tap_doc, container, false);

        lvListbaiHoc = (ListView) view.findViewById(R.id.lvListBaiHoc);

        addControl();

        return view;
    }

    public void addControl()
    {
        BaiHocDAO bhDAO = new BaiHocDAO(getActivity().getApplicationContext());
        ArrayList<BaiHoc> arrBaiHoc = bhDAO.getAllBaiHoc();

        MenuBaiHocArrayAdapter adapter = new MenuBaiHocArrayAdapter
                (getActivity(), R.layout.customlayout_menubaihoc, arrBaiHoc);

        lvListbaiHoc.setAdapter(adapter);
        lvListbaiHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getActivity(), CauHoiDetailActivity.class);
                intent.putExtra("id_baihoc", id + 1);
                startActivity(intent);
            }
        });
    }
}
