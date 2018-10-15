package com.xdw.diaryapp;

import android.provider.BaseColumns;

public class Diaries {
    public Diaries(){
    }

    public static abstract class Diary implements BaseColumns{
        public static final String TABLE_NAME="diaries";
        public static final String COLUMN_NAME_DATE="date";
        public static final String COLUMN_NAME_WEATHER="weather";
        public static final String COLUMN_NAME_CONTENT="content";
    }
}
