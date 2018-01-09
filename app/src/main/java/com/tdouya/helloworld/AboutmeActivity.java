package com.tdouya.helloworld;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutmeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        TextView tv_AboutMe = (TextView) findViewById(R.id.tv_AboutMe);
        tv_AboutMe.setText(R.string.text_aboutme);
        tv_AboutMe.setTextSize(12);

        Button btn_CallHelpDesk = (Button) findViewById(R.id.btn_CallHelpDesk);
        btn_CallHelpDesk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(getString(R.string.tel_help_desk)));
                startActivity(intent);
            }
        });
    }
}
