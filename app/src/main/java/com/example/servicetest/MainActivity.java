package com.example.servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CursorAdapter;

public class MainActivity extends AppCompatActivity {

    public Button btnSetNoRand, btnSetRand, btnResult, btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, MyService.class);
        Intent ii = new Intent(this, MainActivity2.class);
        startService(intent);
        MyService mm = new MyService();

        Log.e("AAA Start"," is rand : "+ mm.isRad());

        btnSetRand = findViewById(R.id.btn_set_rand);
        btnSetNoRand = findViewById(R.id.btn_set_no_rand);
        btnResult = findViewById(R.id.btn_result);
        btnGo = findViewById(R.id.btn_got);

        btnSetRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm.setRand(true);
            }
        });

        btnSetNoRand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mm.setRand(false);
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("AAA Start"," is rand ? : "+ mm.isRad());
//                Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
//                String[] projection = {
//                    MediaStore.Audio.Media.ALBUM,
//                    MediaStore.Audio.Media.TITLE,
//                    MediaStore.Audio.Media.DURATION,
//                    MediaStore.Audio.Media.DATA,
//                    MediaStore.Audio.Media.ARTIST,
//                };
//
//                Log.e("AAA Start"," : "+projection[0]);
//                Log.e("AAA Start"," : "+projection[1]);
//                Log.e("AAA Start"," : "+projection[2]);
//                Log.e("AAA Start"," : "+projection[3]);
//                Log.e("AAA Start"," : "+projection[4]);
            }
        });

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent ii = new Intent(this, MainActivity2.class);
                startActivity(ii);
            }
        });

    }
}