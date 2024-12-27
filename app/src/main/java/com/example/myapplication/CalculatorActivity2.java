package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity2 extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG = "CalculatorActivity";
    private TextView tv_result; // 声明一个文本视图对象
    private String operator = ""; // 运算符
    private String firstNum = ""; // 第一个操作数
    private String secondNum = ""; // 第二个操作数
    private String result = ""; // 当前的计算结果
    private String showText = ""; // 显示的文本内容

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        // 从布局文件中获取名叫tv_result的文本视图
        tv_result = findViewById(R.id.tv_result);
        // 下面给每个按钮控件都注册了点击监听器

    }


    @Override
    public void onClick(View v) {

    }




}
