package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intentAction(View view){
//        this.startActivity(intentRed);
        switch (view.getId()){
            case R.id.redIntentButton:
                Intent intentRed = new Intent(this,RedActivity.class);
                Toast.makeText(this, "Lets go Red", Toast.LENGTH_SHORT).show();
                this.startActivity(intentRed);
                break;
            case R.id.greenIntentButton:
                Intent intentGreen = new Intent(this,GreenActivity.class);
                Toast.makeText(this, "Lets go Green", Toast.LENGTH_SHORT).show();
                this.startActivity(intentGreen);
                break;
            case R.id.blueIntentButton:
                Intent intentBlue = new Intent(this,BlueActivity.class);
                Toast.makeText(this, "Lets go Blue", Toast.LENGTH_SHORT).show();
                this.startActivity(intentBlue);
                break;

        }
    }
}