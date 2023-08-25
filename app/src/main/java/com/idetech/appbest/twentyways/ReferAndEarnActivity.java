package com.idetech.appbest.twentyways;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.pesonal.adsdk.AppManage;

public class ReferAndEarnActivity extends AppCompatActivity {
    ImageView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer_and_earn);
        share=findViewById(R.id.share);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        AppManage.getInstance(ReferAndEarnActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(ReferAndEarnActivity.this).loadInterstitialAd(this);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(ReferAndEarnActivity.this).showInterstitialAd(ReferAndEarnActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        startActivity(new Intent(getApplicationContext(), DashboardActivity.class));
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Best 20+ Ways");
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
            }
        });
    }
    @Override
    public void onBackPressed () {
        AppManage.getInstance(ReferAndEarnActivity.this).showInterstitialAd(ReferAndEarnActivity.this, new AppManage.MyCallback() {
            public void callbackCall() {
                ReferAndEarnActivity.super.onBackPressed();
            }
        }, "", AppManage.app_innerClickCntSwAd);
    }
}