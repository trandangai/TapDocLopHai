package com.khtn.tapdoclophai.utility;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.khtn.tapdoclophai.R;

import java.util.ArrayList;

/**
 * Created by CuongLe on 8/29/2016.
 */
public class MenuBaiHocArrayAdapter extends ArrayAdapter<MenuBaiHoc> {

    Activity contex = null;
    ArrayList<MenuBaiHoc> arrMenuBaiHoc=null;
    int layoutID;

    public MenuBaiHocArrayAdapter(Activity context,int layoutID,ArrayList<MenuBaiHoc> arr)
    {
        super(context, layoutID, arr);
        this.contex =context;
        this.layoutID=layoutID;
        this.arrMenuBaiHoc = arr;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = contex.getLayoutInflater();
        convertView=inflater.inflate(layoutID,null);

        final TextView txtcustomMenuBaihoc =
                (TextView) convertView.findViewById(R.id.txtCustomBaiHoc);
        final MenuBaiHoc item = arrMenuBaiHoc.get(position);
        txtcustomMenuBaihoc.setText(item.toString());

        return convertView;
    }
}
