package com.example.myjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView resText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        resText = findViewById(R.id.resText2);
        Bundle arguments = getIntent().getExtras();
        assert arguments != null;
        double res = arguments.getDouble("res");
        resText.setText(String.valueOf(res));
    }
}