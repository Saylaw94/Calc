package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button plus, minus, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plus:{
                Intent i = new Intent(MainActivity.this, PlusActivity.class);
                startActivity(i);
            }break;
            case R.id.minus:{
                Intent i = new Intent(MainActivity.this, MinusActivity.class);
                startActivity(i);
            }break;
            case R.id.multiply:{
                Intent i = new Intent(MainActivity.this, MultiplyActivity.class);
                startActivity(i);
            }break;
            case R.id.divide:{
                Intent i = new Intent(MainActivity.this, DivideActivity.class);
                startActivity(i);
            }break;
        }
    }
}
