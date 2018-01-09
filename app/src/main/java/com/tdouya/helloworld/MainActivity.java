package com.tdouya.helloworld;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_hello = findViewById(R.id.tv_hello);
        tv_hello.setText("这是田豆芽智慧工厂的管理端测试程序哦，不敢相信吧。");
        tv_hello.setTextColor(Color.RED);
        tv_hello.setTextSize(30);


        Log.i("田豆芽智慧工厂","启动终了");

        Button btn_TestToast = (Button) findViewById(R.id.btn_TestToast);
        btn_TestToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "这是一个Toask测试消息",Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_AboutMe = (Button) findViewById(R.id.btn_AboutMe);
        btn_AboutMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Intent intent = new Intent(MainActivity.this,AboutmeActivity.class);
                Intent intent = new Intent("com.tdouya.helloworld.ABOUTME");
                intent.addCategory("com.tdouya.helloworld.ABOUT_ME");
                startActivity(intent);
            }
        });

        Button btn_HelloPMP = (Button) findViewById(R.id.btn_HelloPMP);
        btn_HelloPMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://hellopmp.com"));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_exit:
                finish();
        }

        return true;
    }
}
