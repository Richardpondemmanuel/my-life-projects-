package com.example.charrityapptanzania;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class COMPAIGNS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compaigns);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ListView listView=findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("ALL EVENTS ARE AVAILABLE");
        list.add("MAKE THE WORD BETTER PLACE TO LIVE");


        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);


        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(getApplicationContext(),event.class);
                    startActivity(intent);
                }
            }
        });
    }
}