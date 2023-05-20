package com.example.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.io.*;
import java.util.*;

import com.example.tempconverter.R.id;

public class MainActivity extends AppCompatActivity {
private EditText s1;
private Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btn);
        s1 = (EditText) findViewById(R.id.edit1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(s1.getText().toString());
                float a1 = ((n1 * 9.0f / 5.0f) + 32.0f);

                s1.setText("Celsius to Fahrenheit is : "+a1 +" °F");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n2 = Integer.parseInt(s1.getText().toString());
                float a2 = ((n2-32)/1.8f);
                s1.setText("Fahrenheit to celsius is : "+a2 +" °C");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.getText().clear();
            }
        });

    }
}