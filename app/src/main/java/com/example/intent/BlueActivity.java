package com.example.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BlueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);
    }
    public void goBack(View view){
        this.finish();
    }
}