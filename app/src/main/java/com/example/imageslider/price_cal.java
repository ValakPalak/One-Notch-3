package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class price_cal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_cal);
        EditText area = (EditText) findViewById(R.id.editText);
        TextView result = (TextView) findViewById(R.id.TotalPrice);


        String num = area.getText().toString();
            if(!num.isEmpty()) {
                result.setText(num);
            }
            }
            //int n=Integer.parseInt(num);
            //result.setText("Rs"+n);
}