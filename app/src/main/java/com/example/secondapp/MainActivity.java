package com.example.secondapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //attempts to launch activity from within own app
        Button secondActivityBtn=(Button)findViewById(R.id.SecondActivitybtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartIntent= new Intent(getApplicationContext(),SecondActivity.class);
                //show how to pass information to another activity
                StartIntent.putExtra("com.example.secondapp.Something","Hello Guys!");
                startActivity(StartIntent);

            }
        });

        //Attempt to launch activity outside app

        Button googleBtn=(Button)findViewById(R.id.googlebtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google="http://www.google.com";
                Uri webaddress= Uri.parse(google);

                Intent gotoGoogle=new Intent(Intent.ACTION_VIEW,webaddress);
                if (gotoGoogle != null)
                {
                    startActivity(gotoGoogle);
                }
            }
        });
    }
}