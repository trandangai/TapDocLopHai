package com.khtn.tapdoclophai.sqlite;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Sayuri Kurata on 2016/08/29.
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tviet2.db";

    Context context;
    String path;

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        this.context = context;
        path = context.getFilesDir().getParent() + "/databases/"
                + DATABASE_NAME;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public SQLiteDatabase openDatabase() {
        return SQLiteDatabase.openDatabase(path, null,
                SQLiteDatabase.OPEN_READWRITE);
    }

    public void createDatabase() {

        //if (checkDatabase()) {
        //    Log.d("checkDatabase", "Database da ton tai !");
        //} else {
        //    Log.d("checkDatabase", "Database chưa ton tai, tien hanh Copy.");
            getWritableDatabase();
            copyDatabase();
        //}
    }
    public  void reloadDatabse()
    {
        getWritableDatabase();
        copyDatabase();
    }

    private boolean checkDatabase() {
        SQLiteDatabase checkDB = null;
        try {
            checkDB = SQLiteDatabase.openDatabase(path, null,
                    SQLiteDatabase.OPEN_READONLY);
        } catch (Exception ex) {
            Log.d("TV2", ex.getMessage());
        }

        if (checkDB != null) {
            checkDB.close();
        }

        return checkDB != null ? true : false;
    }

    public void copyDatabase() {

        AssetManager assetManager = context.getAssets();

        try {
            InputStream is = assetManager.open("database/" + DATABASE_NAME);

            FileOutputStream fos = new FileOutputStream(path);

            int length = 0;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            fos.flush();
            fos.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}