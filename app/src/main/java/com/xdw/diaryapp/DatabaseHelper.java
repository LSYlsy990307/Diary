package com.xdw.diaryapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private final static String DATABASE_NAME="diariesdb";
    private final static int DATABASE_VERSION=1;

    public DatabaseHelper(Context context){  //构造函数
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    private final static String SQL_CREATE_DATABASE="CREATE TABLE "+Diaries.Diary.TABLE_NAME+" ("+Diaries.Diary._ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"
            +Diaries.Diary.COLUMN_NAME_DATE+" TEXT"+","+ Diaries.Diary.COLUMN_NAME_WEATHER+" TEXT"+","+Diaries.Diary.COLUMN_NAME_CONTENT+" TEXT"+" )";
    private final static String SQL_DELETE_DATABASE="DROP TABLE IF EXISTS "+Diaries.Diary.TABLE_NAME;

    public void onCreate(SQLiteDatabase sqLiteDatabase) {  //创建数据库
        sqLiteDatabase.execSQL(SQL_CREATE_DATABASE);
    }

    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {  //升级数据库
        sqLiteDatabase.execSQL(SQL_DELETE_DATABASE);
        onCreate(sqLiteDatabase);
    }



}
