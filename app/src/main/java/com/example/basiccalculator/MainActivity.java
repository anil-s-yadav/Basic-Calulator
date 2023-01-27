package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstValue, etSecondValue;
    TextView tvans;
    Button add, sub, multi, divide;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Simple Calculator");

        etFirstValue = findViewById(R.id.firstValue);
        etSecondValue = findViewById(R.id.secondvalue);

        tvans = findViewById(R.id.tv_1);

        add = findViewById(R.id.btn_plus);
        sub = findViewById(R.id.btn_minus);
        multi = findViewById(R.id.btn_multi);
        divide = findViewById(R.id.btn_divide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue_1, secondvalue_2, ans;

                firstvalue_1=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue_2=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstvalue_1+secondvalue_2;
                tvans.setText("Answer is : "+ans);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue_1, secondvalue_2, ans;

                firstvalue_1=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue_2=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstvalue_1 - secondvalue_2;
                tvans.setText("Answer is : "+ans);

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue_1, secondvalue_2, ans;

                firstvalue_1=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue_2=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstvalue_1 * secondvalue_2;
                tvans.setText("Answer is : "+ans);

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue_1, secondvalue_2, ans;

                firstvalue_1=Integer.parseInt(etFirstValue.getText().toString());
                secondvalue_2=Integer.parseInt(etSecondValue.getText().toString());

                ans=firstvalue_1 / secondvalue_2;
                tvans.setText("Answer is : "+ans);

            }
        });
    }
}