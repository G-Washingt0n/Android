package com.pgmail.martsulg.data.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by lenovo on 06.09.2017.
 */

public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "test";
    public static final int VERSION =1;
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e("DBHelper", "OnCreate");

       // db.beginTransaction(); Транзакция
       // db.endTransaction();


        db.execSQL("CREATE TABLE user('id' INTEGER PRIMARY KEY AUTOINCREMENT , 'name' TEXT, 'age' INTEGER, 'countryId' INTEGER) ");

        db.execSQL("CREATE TABLE country('id' INTEGER PRIMARY KEY AUTOINCREMENT , 'name' TEXT) ");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.e("DBHelper", "OnUpgrade");

    }
}
