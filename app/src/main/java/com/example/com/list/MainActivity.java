package com.example.com.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list);
        ArrayList data = new ArrayList<Data>();
        data.add(new Data("이건 대제목1", "이건 소제목1"));
        data.add(new Data("이건 대제목2", "이건 소제목2"));
        data.add(new Data("이건 대제목3", "이건 소제목3"));
        data.add(new Data("이건 대제목4", "이건 소제목4"));
        data.add(new Data("이건 대제목5", "이건 소제목5"));
        data.add(new Data("이건 대제목6", "이건 소제목6"));
        CustomAdapter adapter = new CustomAdapter(data, this);
        list.setAdapter(adapter);

    }

}


//        ListView list = findViewById(R.id.list);
//        ArrayList data = new ArrayList<String>();
//        data.add("a");
//        data.add("b");
//        data.add("c");
//        data.add("d");
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
//        list.setAdapter(adapter);
