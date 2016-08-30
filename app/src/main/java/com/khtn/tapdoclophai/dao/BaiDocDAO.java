package com.khtn.tapdoclophai.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.khtn.tapdoclophai.pojo.BaiDoc;
import com.khtn.tapdoclophai.sqlite.MySQLiteHelper;

import java.util.ArrayList;

/**
 * Created by CuongLe on 8/30/2016.
 */
public class BaiDocDAO {

    private SQLiteDatabase database;
    private static final String TABLE_NAME = "TapDoc";
    private static final String COL_ID = "ID";
    private static final String COL_TenBai = "TenBai";
    private static final String COL_NoiDung = "NoiDung";
    private static final String COL_IDBaiHoc= "IDBaiHoc";
    private static final String COL_img= "Image";
    private static final String COL_audio= "Audio";

    public BaiDocDAO(Context context)
    {
        MySQLiteHelper helper = new MySQLiteHelper(context);
        helper.createDatabase();
        database = helper.openDatabase();
    }

    public ArrayList<BaiDoc> getAllBaiDoc()
    {
        ArrayList<BaiDoc> listBD = new ArrayList<BaiDoc>();

        String sql = "SELECT *"
                + " FROM " + TABLE_NAME;

        Cursor cursor = database.rawQuery(sql, null);

        Log.d("cursor",cursor.getCount()+"");

        if (cursor.moveToFirst()) {

            while (!cursor.isAfterLast()) {

                String _tenBai = cursor.getString(cursor.getColumnIndex(COL_TenBai));
                String _noiDung = cursor.getString(cursor.getColumnIndex(COL_NoiDung));
                int _idBaiHoc = cursor.getInt(cursor.getColumnIndex(COL_IDBaiHoc));
                String _img = cursor.getString(cursor.getColumnIndex(COL_img));
                String _audio = cursor.getString(cursor.getColumnIndex(COL_audio));

                BaiDoc ch = new BaiDoc(_tenBai,_noiDung,_idBaiHoc,_img,_audio);
                listBD.add(ch);
                cursor.moveToNext();
            }
        }

        return listBD;
    }
}
