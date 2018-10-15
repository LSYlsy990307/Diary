package com.xdw.diaryapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Map;

public class SearchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        ArrayList<Map<String,String>> items=(ArrayList<Map<String, String>>)bundle.getSerializable("result");

        SimpleAdapter simpleAdapter=new SimpleAdapter(this,items,R.layout.item,new String[]{Diaries.Diary._ID,Diaries.Diary.COLUMN_NAME_DATE,Diaries.Diary.COLUMN_NAME_WEATHER,Diaries.Diary.COLUMN_NAME_CONTENT},
                new int[]{R.id.textViewId,R.id.textViewDate,R.id.textViewWeather,R.id.textViewContent});
        ListView listView=findViewById(R.id.searchContent);
        listView.setAdapter(simpleAdapter);
    }

}
