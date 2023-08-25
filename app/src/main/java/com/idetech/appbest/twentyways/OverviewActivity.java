package com.idetech.appbest.twentyways;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pesonal.adsdk.AppManage;

public class OverviewActivity extends AppCompatActivity {
    ImageView start_now;
    TextView privacy_policy;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        start_now=findViewById(R.id.start);
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        privacy_policy=findViewById(R.id.privacy_policy);
        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://techiemediaadvertising.blogspot.com/2022/06/techiemedia-inc.html");
            }
        });
        AppManage.getInstance(OverviewActivity.this).loadInterstitialAd(this);
        AppManage.getInstance(OverviewActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);


        start_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()==true){
                    Toast.makeText(OverviewActivity.this, "Accepted", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(OverviewActivity.this,DashboardActivity.class);
                    startActivity(intent);
                } else {
                    // change color_secondary to make the check box red.
                    Toast.makeText(OverviewActivity.this, "Please Accept Privacy Policy", Toast.LENGTH_SHORT).show();
                }

//                AppManage.getInstance(OverviewActivity.this).showInterstitialAd(OverviewActivity.this, new AppManage.MyCallback() {
//                    public void callbackCall() {
//                        if(checkBox.isChecked()){
//                            Toast.makeText(OverviewActivity.this, "Accepted", Toast.LENGTH_SHORT).show();
//                        } else {
//                            // change color_secondary to make the check box red.
//                            checkBox.setText("Please Accept the Privacy policy");
//                            checkBox.setTextColor(Color.parseColor("#FF0000"));
//                        }
//                        Intent intent=new Intent(OverviewActivity.this,DashboardActivity.class);
//                        startActivity(intent);
//                    }
//                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
//    @Override
//    public void onBackPressed () {
//        AppManage.getInstance(OverviewActivity.this).showInterstitialAd(OverviewActivity.this, new AppManage.MyCallback() {
//            public void callbackCall() {
//                OverviewActivity.super.onBackPressed();
//            }
//        }, "", AppManage.app_innerClickCntSwAd);
//    }
}