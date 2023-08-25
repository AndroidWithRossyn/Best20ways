package com.idetech.appbest.twentyways;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.pesonal.adsdk.AppManage;

public class AffilicateMarketing extends AppCompatActivity {
    ImageView share;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affilicate_marketing);
        share = findViewById(R.id.share);
        t1 = findViewById(R.id.t1);
//        back=findViewById(R.id.back);
        // Set a toolbar to replace the action bar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        AppManage.getInstance(AffilicateMarketing.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), DashboardActivity.class));


            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent shareIntent1 = new Intent(Intent.ACTION_SEND);
//                shareIntent1.setType("text/plain");
//                shareIntent1.putExtra(Intent.EXTRA_SUBJECT, "Best 20+ Ways \n\n https://play.google.com/store/apps/details?id="+getPackageName());
//                startActivity(Intent.createChooser(shareIntent1, "choose one"));

//                if (AffilicateMarketing.this.t1.getText().toString().isEmpty()) {
//                    Toast.makeText(AffilicateMarketing.this.getApplicationContext(), "Convert text to share", Toast.LENGTH_LONG).show();
//                    return;
//                }
//                Intent shareIntent = new Intent();
//                shareIntent.setAction("android.intent.action.SEND");
//                shareIntent.setPackage("com.whatsapp");
//                shareIntent.putExtra("android.intent.extra.TEXT", AffilicateMarketing.this.t1.getText().toString());
//                shareIntent.setType("text/plain");
//                AffilicateMarketing.this.startActivity(Intent.createChooser(shareIntent, "Select an app to share"));
                try {
                    Intent shareIntent1 = new Intent(Intent.ACTION_SEND);
                    shareIntent1.setType("text/plain");
                    shareIntent1.putExtra(Intent.EXTRA_SUBJECT, "Best 20+ Ways");
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent1.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent1, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }
}