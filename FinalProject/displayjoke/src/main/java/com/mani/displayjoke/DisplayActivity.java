package com.mani.displayjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_display);
        Intent intent  = getIntent();
        String text = intent.getStringExtra("jokes");
        TextView tv = findViewById(R.id.jokes_tv);
        if(text!=null && !text.isEmpty()){
            tv.setText(text);
        }
    }
}
