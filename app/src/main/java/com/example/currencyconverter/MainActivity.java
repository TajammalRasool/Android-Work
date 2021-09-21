package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e;
    TextView e1;
    Button e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        USD();
        Euro();

    }

    public void USD()
    {
        e2=(Button) findViewById(R.id.button);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e=(EditText) findViewById(R.id.e1);
                TextView textView=(TextView) findViewById(R.id.textView);

                double pk=Float.parseFloat(e.getText().toString());
                double result=(pk*168.10);
                textView.setText(String.valueOf(result)+" PKR");

            }
        });
    }
    public void Euro()
    {
        e2=(Button) findViewById(R.id.button2);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e=(EditText) findViewById(R.id.e1);
                TextView textView=(TextView) findViewById(R.id.textView);

                double pk=Float.parseFloat(e.getText().toString());
                double result=(pk*197.18);
                textView.setText(String.valueOf(result)+" PKR");

            }
        });
    }
}