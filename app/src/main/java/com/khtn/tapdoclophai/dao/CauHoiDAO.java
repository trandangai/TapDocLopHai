package com.khtn.tapdoclophai.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.khtn.tapdoclophai.pojo.CauHoi;
import com.khtn.tapdoclophai.sqlite.MySQLiteHelper;

import java.util.ArrayList;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class CauHoiDAO {

    private SQLiteDatabase database;
    private static final String TABLE_NAME = "CauHoi";
    private static final String COL_ID = "ID";
    private static final String COL_CauHoi = "CauHoi";
    private static final String COL_TraLoi = "TraLoi";
    private static final String COL_PhanBH = "PhanBH";
    private static final String COL_IDBaiHoc = "IDBaiHoc";
    private static final String COL_LoaiCH = "LoaiCH";
    private static final String COL_IMGPATH = "Image";

    public CauHoiDAO(Context context) {

        MySQLiteHelper helper = new MySQLiteHelper(context);
        helper.createDatabase();
        database = helper.openDatabase();
    }

    public ArrayList<CauHoi> getAllCauHoi() {
        ArrayList<CauHoi> listCH = new ArrayList<CauHoi>();

        String sql = "SELECT *"
                + " FROM " + TABLE_NAME;

        Cursor cursor = database.rawQuery(sql, null);

        if (cursor.moveToFirst()) {

            while (!cursor.isAfterLast()) {

                String cauHoi = cursor.getString(cursor
                        .getColumnIndex(COL_CauHoi));
                String traLoi = cursor.getString(cursor
                        .getColumnIndex(COL_TraLoi));
                String phanBH = cursor.getString(cursor
                        .getColumnIndex(COL_PhanBH));
                String loaiCH = cursor.getString(cursor
                        .getColumnIndex(COL_LoaiCH));
                int idBH = cursor.getInt(cursor
                        .getColumnIndex(COL_IDBaiHoc));
                String imgPath = cursor.getString(cursor
                        .getColumnIndex(COL_IMGPATH));

                CauHoi ch = new CauHoi(cauHoi, traLoi, idBH, phanBH, loaiCH, imgPath);
                listCH.add(ch);

                cursor.moveToNext();
            }
        }

        return listCH;
    }

    public ArrayList<CauHoi> getListCauHoi(long baiHoc) {
        Log.d("test", baiHoc +"");
        ArrayList<CauHoi> listCH = new ArrayList<CauHoi>();

        String sql = "SELECT *"
                + " FROM " + TABLE_NAME
                + " WHERE " + COL_IDBaiHoc + "=" + baiHoc
                + " ORDER BY " + COL_PhanBH;

        Cursor cursor = database.rawQuery(sql, null);

        if (cursor.moveToFirst()) {

            while (!cursor.isAfterLast()) {

                String cauHoi = cursor.getString(cursor
                        .getColumnIndex(COL_CauHoi));
                String traLoi = cursor.getString(cursor
                        .getColumnIndex(COL_TraLoi));
                String phanBH = cursor.getString(cursor
                        .getColumnIndex(COL_PhanBH));
                String loaiCH = cursor.getString(cursor
                        .getColumnIndex(COL_LoaiCH));
                int idBH = cursor.getInt(cursor
                        .getColumnIndex(COL_IDBaiHoc));
                String imgPath = cursor.getString(cursor
                        .getColumnIndex(COL_IMGPATH));

                CauHoi ch = new CauHoi(cauHoi, traLoi, idBH, phanBH, loaiCH, imgPath);
                listCH.add(ch);

                cursor.moveToNext();
            }
        }

        return listCH;
    }
}
