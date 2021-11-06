package com.example.servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    public Button btn, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MyService myService = new MyService();
        btn = findViewById(R.id.btn_result);
        btnBack = findViewById(R.id.btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            MyService mmm = new MyService();
            @Override
            public void onClick(View v) {
                Log.e("AAA BBB"," is rand ? : "+ mmm.isRad());
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("AAA Finish"," is rand ? : ");
                finish();
            }
        });
    }
}