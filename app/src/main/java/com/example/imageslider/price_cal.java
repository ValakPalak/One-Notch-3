package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

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

        int num1 = Integer.parseInt(area.getText().toString());
        //Result = (Total Price/Total area)*req area
        int Result = 100*num1;
        result.setText("Rs " + Result + "");
    }
}