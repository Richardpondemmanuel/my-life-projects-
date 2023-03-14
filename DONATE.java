package com.example.charrityapptanzania;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DONATE extends AppCompatActivity {
  ListView mylist;
  String[] items={"CHARRITY A","CHARRITY B","CHARRITY C","CHARRITY D","CHARRITY E","CHARRITY F","CHARRITY G","CHARRITY H","CHARRITY I","CHARRITY J","CHARRITY K","CHARRITY L"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        mylist=findViewById(R.id.listview);

        ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,android.R.id.text1,items);
        mylist.setAdapter(ad);
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i=position;

                if (position==0) {
                    Intent intent = new Intent(getApplicationContext(), charrity_A.class);
                    startActivity(intent);

                }
            }
        });
    }
}