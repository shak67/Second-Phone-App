package com.example.secondapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("com.example.secondapp.Something"))
        {
            TextView tv= (TextView) findViewById(R.id.textView);
            String text= getIntent().getExtras().getString("com.example.secondapp.Something");
            tv.setText(text);
        }
    }
}