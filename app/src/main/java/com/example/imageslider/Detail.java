package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView ans = (TextView) findViewById(R.id.ans);
        TextView price = (TextView) findViewById(R.id.Price);
        TextView area = (TextView) findViewById(R.id.Area);
        int Result = area / price;
        ans.setText(Result + "");
    }
}