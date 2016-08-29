package com.khtn.tapdoclophai.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.khtn.tapdoclophai.R;
import com.khtn.tapdoclophai.pojo.BaiHoc;

import java.util.ArrayList;

/**
 * Created by CuongLe on 8/29/2016.
 */
public class MenuBaiHocArrayAdapter extends ArrayAdapter<BaiHoc> {

    Activity contex = null;
    ArrayList<BaiHoc> arrBaiHoc =null;
    int layoutID;

    public MenuBaiHocArrayAdapter(Activity context,int layoutID,ArrayList<BaiHoc> arr)
    {
        super(context, layoutID, arr);
        this.contex =context;
        this.layoutID=layoutID;
        this.arrBaiHoc = arr;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = contex.getLayoutInflater();
        convertView=inflater.inflate(layoutID,null);

        final TextView txtcustomMenuBaihoc =
                (TextView) convertView.findViewById(R.id.txtCustomBaiHoc);
        final BaiHoc item = arrBaiHoc.get(position);
        txtcustomMenuBaihoc.setText(item.toString());

        return convertView;
    }
}
