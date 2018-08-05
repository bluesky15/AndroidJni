package com.kalinga.apps.androidjnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public native String helloWorld();
static {
    System.loadLibrary("ndktest");
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView msgView = findViewById(R.id.msg);
        msgView.setText(helloWorld());
    }
}
