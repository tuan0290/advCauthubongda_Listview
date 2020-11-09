package com.example.advcauthubongda_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    FootballAdapter adapter;
    List<football> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        init();
    }

    private void init() {
        list=new ArrayList<>();
        list.add(new football(R.drawable.vietnam,R.drawable.congphuong,"Nguyễn Công Phượng","25") );
        list.add(new football(R.drawable.vietnam,R.drawable.xuantruong,"Lương Xuân Trường","25") );
        list.add(new football(R.drawable.bodaonha,R.drawable.rolando,"Cristiano Ronaldo","35") );
        list.add(new football(R.drawable.argentina,R.drawable.messi,"Lionel Messi","33") );
        list.add(new football(R.drawable.hanquoc,R.drawable.songiongmin,"Son Heung-min","28") );
        list.add(new football(R.drawable.brazill,R.drawable.naymar,"Neymar","28") );
        list.add(new football(R.drawable.taybannha,R.drawable.degea,"David de Gea","29") );
        adapter=new FootballAdapter(MainActivity.this,R.layout.activity_football,list);
        lv.setAdapter(adapter);
    }

    private void mapping() {
        lv=findViewById(R.id.lview);
    }
}