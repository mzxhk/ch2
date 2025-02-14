package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 当前的页面布局采用的是res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
        // 获取名叫tv_hello的TextView控件，注意添加导包语句import android.widget.TextView;
        TextView tv_hello = findViewById(R.id.tv_hello);
        // 设置TextView控件的文字内容
        tv_hello.setText("你好，世界， ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        goNextPage(); // 跳到下个页面
    }

    // 跳到下个页面
    private void goNextPage() {
        TextView tv1_hello = findViewById(R.id.tv1_hello);
        tv1_hello.setText("3秒后进入下个页面...");
        // 延迟3秒（3000毫秒）后启动任务mGoNext
        new Handler(Objects.requireNonNull(Looper.myLooper())).postDelayed(mGoNext, 3000);
    }

    private final Runnable mGoNext = new Runnable() {
        @Override
        public void run() {
            // 活动页面跳转，从MainActivity跳到Main2Activity
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
        }
    };

}