package com.example.imageslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import javax.xml.transform.Result;

public class Detail extends AppCompatActivity  {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView ans = (TextView) findViewById(R.id.ans);
        TextView price = (TextView) findViewById(R.id.Price);
        TextView area = (TextView) findViewById(R.id.Area);
       // int Price=Integer.parseInt(price.getText().toString());
        //int Area=Integer.parseInt(area.getText().toString());
        bottomNavigationView=findViewById(R.id.bottom_navigation_view);
        //int Result=Price/Area;
        //ans.setText(Result + "");
        TextView textView = (TextView) bottomNavigationView.findViewById(R.id.bottom_navigation_view).findViewById(R.id.largeLabel);
        textView.setTextSize(20);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {

                }
                return false;
            }
        });
    }

}