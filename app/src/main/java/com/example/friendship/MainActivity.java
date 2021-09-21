package com.example.friendship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int max=100;
        int min=80;
        final Random myRandom = new Random();


        Button buttonGenerate = (Button)findViewById(R.id.generate);
        final TextView textGenerateNumber = (TextView)findViewById(R.id.generatenumber);

        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(100)));
            }
        });

        }
}