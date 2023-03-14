package com.example.charrityapptanzania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mybutton1, mybutton2, mybutton3, mybutton4, mybutton5, mybutton6, mybutton7, mybutton8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mybutton1 = findViewById(R.id.btn1);
        mybutton2 = findViewById(R.id.btn2);
        mybutton3 = findViewById(R.id.btn3);
        mybutton4 = findViewById(R.id.btn4);
        mybutton5 = findViewById(R.id.btn5);
        mybutton6 = findViewById(R.id.btn6);
        mybutton7 = findViewById(R.id.btn7);
        mybutton8 = findViewById(R.id.btn8);



        mybutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),DONATE.class);
                startActivity(intent);
            }
        });



        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),COMPAIGNS.class);
                startActivity(intent);
            }
        });
    }

}