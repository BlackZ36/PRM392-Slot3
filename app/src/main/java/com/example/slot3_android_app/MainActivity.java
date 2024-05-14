package com.example.slot3_android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.slot3_android_app.Calculator.CalculatorActivity;
import com.example.slot3_android_app.DisplayData.DisplayDataActivity;
import com.example.slot3_android_app.Login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private Button loginBtn, displayBtn, calculatorBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        displayBtn = findViewById(R.id.displayBtn);
        calculatorBtn = findViewById(R.id.calculatorBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayDataActivity.class);
                startActivity(intent);
            }
        });

        calculatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });


    }
}