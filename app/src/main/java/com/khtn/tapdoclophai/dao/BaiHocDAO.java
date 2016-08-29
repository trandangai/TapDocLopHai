package com.khtn.tapdoclophai.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.khtn.tapdoclophai.pojo.BaiHoc;
import com.khtn.tapdoclophai.sqlite.MySQLiteHelper;

import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class BaiHocDAO {

    private SQLiteDatabase database;
    private static final String TABLE_NAME = "BaiHoc";
    private static final String COL_ID = "ID";
    private static final String COL_TenBai = "TenBai";

    public BaiHocDAO(Context context) {

        MySQLiteHelper helper = new MySQLiteHelper(context);
        helper.createDatabase();
        database = helper.openDatabase();
    }

    public ArrayList<BaiHoc> getAllBaiHoc() {
        ArrayList<BaiHoc> listBH = new ArrayList<BaiHoc>();

        String sql = "SELECT " + COL_ID + ", " + COL_TenBai
                + " FROM " + TABLE_NAME;

        Cursor cursor = database.rawQuery(sql, null);

        if (cursor.moveToFirst()) {

            while (!cursor.isAfterLast()) {

                int baiHocId = cursor.getInt(cursor
                        .getColumnIndex(COL_ID));
                String tenBaiHoc = cursor.getString(cursor
                        .getColumnIndex(COL_TenBai));

                BaiHoc bh = new BaiHoc(String.valueOf(baiHocId), tenBaiHoc);
                listBH.add(bh);

                cursor.moveToNext();
            }
        }

        return listBH;
    }
}
