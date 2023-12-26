package com.example.myjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private Button sah;
    private RadioButton r17, r35, r64;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        a = findViewById(R.id.a);
        sah = findViewById(R.id.sah);

        sah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                float fr = Float.parseFloat(a.getText().toString());
                double res = 0;
                if (r17.isChecked()){
                    res = fr*2000;
                }
                if (r35.isChecked()){
                    res = fr*2500;
                }
                if (r64.isChecked()){
                    res = fr*3500;
                }
                intent.putExtra("res", res);
                startActivity(intent);
            }
        });
    }

    public void onRadioButtonClick(View v) {
        r17 = findViewById(R.id.r17);
        r35 = findViewById(R.id.r35);
        r64 = findViewById(R.id.r64);
    }
}