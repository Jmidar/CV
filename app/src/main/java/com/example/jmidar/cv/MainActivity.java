package com.example.jmidar.cv;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity.this,Profile.class);
        startActivity(intent);
    }

    public void Education(View view) {
        Intent intent = new Intent(MainActivity.this,Exception.class);
        startActivity(intent);
    }

    public void Experience(View view) {
        Intent intent = new Intent(MainActivity.this,Exception.class);
        startActivity(intent);
    }


    public void Contract(View view) {
        Intent intent = new Intent(MainActivity.this,Contract.class);
        startActivity(intent);
    }
}
