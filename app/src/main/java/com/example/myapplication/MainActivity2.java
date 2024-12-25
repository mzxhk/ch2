package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2x);
        TextView tv2_hello = findViewById(R.id.tv2_hello);
        tv2_hello.setText("欢迎来到第二个页面！");
    }
}