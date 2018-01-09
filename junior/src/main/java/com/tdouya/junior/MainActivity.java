package com.tdouya.junior;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_result = (TextView) findViewById(R.id.tv_result);
        tv_result.setText("屏幕的宽度是：" + Utils.getScreenWidth(this) + "；" + "屏幕的高度是：" + Utils.getScreenHight(this) + ";" + "像素密度是：" + Utils.getScreenDensity(this) + "。");
    }
}
