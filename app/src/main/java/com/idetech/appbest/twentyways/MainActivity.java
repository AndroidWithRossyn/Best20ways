package com.idetech.appbest.twentyways;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pesonal.adsdk.AppManage;

public class MainActivity extends AppCompatActivity {
    ImageView get_started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        get_started=findViewById(R.id.get_started);
        AppManage.getInstance(MainActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(MainActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent=new Intent(MainActivity.this,OverviewActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(MainActivity.this).showInterstitialAd(MainActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                Intent intent=new Intent(MainActivity.this,ExitActivity.class);
                startActivity(intent);
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}