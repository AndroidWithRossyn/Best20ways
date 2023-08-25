package com.idetech.appbest.twentyways;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}