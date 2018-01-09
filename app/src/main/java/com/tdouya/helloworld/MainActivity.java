package com.tdouya.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = (TextView) findViewById(R.id.tv_hello);
        tv_hello.setText("这是田豆芽智慧工厂的管理端测试程序哦，不敢相信吧。");
        tv_hello.setTextColor(Color.RED);
        tv_hello.setTextSize(30);
    }
}
