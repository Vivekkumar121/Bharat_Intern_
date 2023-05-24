package com.example.calculator1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.*;

public class MainActivity extends AppCompatActivity {
private EditText num1;
private EditText num2;
private Button btn1,btn2,btn3,btn4;
private TextView result;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.input1);
        num2 = (EditText) findViewById(R.id.input2);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        result = (TextView) findViewById(R.id.text2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int n1 = Integer.parseInt(num1.getText().toString());
               int n2 = Integer.parseInt(num2.getText().toString());
               int answer = n1 + n2;
               result.setText("Answer is : "+answer);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int answer = n1 - n2;
                result.setText("Answer is : "+answer);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Integer.parseInt(num1.getText().toString());
                double n2 = Integer.parseInt(num2.getText().toString());
                double answer = n1 * n2;
                result.setText("Answer is : "+answer);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Integer.parseInt(num1.getText().toString());
                double n2 = Integer.parseInt(num2.getText().toString());
                double answer = (n1 / n2);
               result.setText("Answer is : "+answer);
//                result.setText("Answer is : "+answer);
            }
        });
    }
}