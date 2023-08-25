package com.idetech.appbest.twentyways;

import static com.pesonal.adsdk.AppManage.ADMOB_N;
import static com.pesonal.adsdk.AppManage.FACEBOOK_N;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pesonal.adsdk.AppManage;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    //    private EditText searchBar;
    RecyclerView rcv;
    DrawerLayout draw_lay;
    //    ImageView menu_btn;
    myadapter adapter;
    Spinner search;
    String[] books = {"Search", "Blogging", "Publish book", "Phone Photography", "Udemy", "Ebay", "Amazone Associate", "Afflicate Marketing", "Kindle Ebook", "Whatsapp", "Membership Site", "Mobile app", "Email- Marketing", "Social Media", "Facebook Marketing", "Translation", "Refer & Earn", "Domain Names", "Dropshipping", "Become an influencer", "Wordpress Themes"};
    LinearLayout native_ads1;
    String SpinnerValue;
    //    String Info="Blogging";
    ImageView searchview_icon, logout, blogging, publish_book, phone_photography, udemy, ebay, amazon, affilicate_marketing, kindle_ebook, whatsapp, membership_site, mobile_app, email_marketing, social_media, facebook_marketing, translation, refer_and_earn, domain_names, dropshipping, become_an_influencer, wordpress_themes;
    TextView t2, blogging_text, publish_book_text, phone_photography_text, udemy_text, ebay_text, amazon_text, affilicate_marketing_text, kindle_ebook_text, whatsapp_text, membership_site_text, mobile_app_text, email_marketing_text, social_media_text, facebook_marketing_text, translation_text, refer_and_earn_text, domain_names_text, dropshipping_text, become_an_influencer_text, wordpress_themes_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
//        AppManage.getInstance(DashboardActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads1), ADMOB_N[1], FACEBOOK_N[1]);
        AppManage.getInstance(DashboardActivity.this).showNative((ViewGroup) findViewById(R.id.native_ads), ADMOB_N[0], FACEBOOK_N[0]);
        AppManage.getInstance(DashboardActivity.this).loadInterstitialAd(this);
        logout = findViewById(R.id.logout);
        searchview_icon = findViewById(R.id.searchview_icon);
        search = (Spinner) findViewById(R.id.search);
        t2 = findViewById(R.id.t2);
//        ArrayAdapter<CharSequence> spinadapter=ArrayAdapter.createFromResource(this,R.array.books, android.R.layout.simple_spinner_item);
//        spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        search.setAdapter(spinadapter);
//        search.setOnItemSelectedListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ArrayAdapter<String> spinadapter = new ArrayAdapter<String>(DashboardActivity.this, android.R.layout.simple_list_item_1, books);

        search.setAdapter(spinadapter);

        //Adding setOnItemSelectedListener method on spinner.
        search.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                SpinnerValue = (String) search.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

        searchview_icon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                switch (SpinnerValue) {

                    case "Blogging":
                        Intent intent = new Intent(DashboardActivity.this, BloggingActivity.class);
                        startActivity(intent);
                        break;

                    case "Publish book":
                        intent = new Intent(DashboardActivity.this, PublishBookActivity.class);
                        startActivity(intent);
                        break;

                    case "Phone Photography":
                        intent = new Intent(DashboardActivity.this, PhonePhotographyActivity.class);
                        startActivity(intent);
                        break;
                    case "Udemy":
                        intent = new Intent(DashboardActivity.this, UdemyActivity.class);
                        startActivity(intent);
                        break;
                    case "Ebay":
                        intent = new Intent(DashboardActivity.this, EbayActivity.class);
                        startActivity(intent);
                        break;
                    case "Amazone Associate":
                        intent = new Intent(DashboardActivity.this, AmazonAssociateActivity.class);
                        startActivity(intent);
                        break;
                    case "Afflicate Marketing":
                        intent = new Intent(DashboardActivity.this, AffilicateMarketing.class);
                        startActivity(intent);
                        break;
                    case "Kindle Ebook":
                        intent = new Intent(DashboardActivity.this, KindleEbookActivity.class);
                        startActivity(intent);
                        break;
                    case "Whatsapp":
                        intent = new Intent(DashboardActivity.this, WhatsappActivity.class);
                        startActivity(intent);
                        break;
                    case "Membership Site":
                        intent = new Intent(DashboardActivity.this, MembershipSiteActivity.class);
                        startActivity(intent);
                        break;
                    case "Mobile app":
                        intent = new Intent(DashboardActivity.this, MobileAppActivity.class);
                        startActivity(intent);
                        break;
                    case "Email- Marketing":
                        intent = new Intent(DashboardActivity.this, EmailMarketingActivity.class);
                        startActivity(intent);
                        break;
                    case "Social Media":
                        intent = new Intent(DashboardActivity.this, SocialMediaActivity.class);
                        startActivity(intent);
                        break;
                    case "Facebook Marketing":
                        intent = new Intent(DashboardActivity.this, FacebookMarketingActivity.class);
                        startActivity(intent);
                        break;
                    case "Translation":
                        intent = new Intent(DashboardActivity.this, TranslationActivity.class);
                        startActivity(intent);
                        break;
                    case "Refer & Earn":
                        intent = new Intent(DashboardActivity.this, ReferAndEarnActivity.class);
                        startActivity(intent);
                        break;
                    case "Domain Names":
                        intent = new Intent(DashboardActivity.this, DomainNamesActivity.class);
                        startActivity(intent);
                        break;
                    case "Dropshipping":
                        intent = new Intent(DashboardActivity.this, DropShippingActivity.class);
                        startActivity(intent);
                        break;
                    case "Become an influencer":
                        intent = new Intent(DashboardActivity.this, BecomeAnInfluencerActivity.class);
                        startActivity(intent);
                        break;
                    case "Wordpress Themes":
                        intent = new Intent(DashboardActivity.this, WordpressThemesActivity.class);
                        startActivity(intent);
                        break;


                }
            }
        });

//        native_ads1=findViewById(R.id.native_ads1);
//        t1=findViewById(R.id.t1);
//        help=findViewById(R.id.help);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ExitActivity.class);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ExitActivity.class);
                startActivity(intent);
            }
        });
//        help.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        t1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        rcv = (RecyclerView) findViewById(R.id.rcv);
//        searchBar=(EditText) findViewById(R.id.searchBar);
//        searchBar.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                filter(s.toString());
//            }
//        });

//        menu_btn = findViewById(R.id.menu_btn);
        draw_lay = findViewById(R.id.draw_lay);
        blogging = findViewById(R.id.blogging);
        blogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, BloggingActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        blogging_text = findViewById(R.id.blogging_text);
        blogging_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, BloggingActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        publish_book = findViewById(R.id.publish_book);
        publish_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, PublishBookActivity.class);
                startActivity(intent);

            }
        });
        publish_book_text = findViewById(R.id.publish_book_text);
        publish_book_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, PublishBookActivity.class);
                startActivity(intent);

            }
        });
        phone_photography = findViewById(R.id.phone_photography);
        phone_photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, PhonePhotographyActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        phone_photography_text = findViewById(R.id.phone_photography_text);
        phone_photography_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, PhonePhotographyActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        udemy = findViewById(R.id.udemy);
        udemy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, UdemyActivity.class);
                startActivity(intent);

            }
        });
        udemy_text = findViewById(R.id.udemy_text);
        udemy_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, UdemyActivity.class);
                startActivity(intent);

            }
        });
        ebay = findViewById(R.id.ebay);
        ebay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, EbayActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        ebay_text = findViewById(R.id.ebay_text);
        ebay_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, EbayActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        amazon = findViewById(R.id.amazon);
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, AmazonAssociateActivity.class);
                startActivity(intent);


            }
        });
        amazon_text = findViewById(R.id.amazon_text);
        amazon_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, AmazonAssociateActivity.class);
                startActivity(intent);
            }
        });
        affilicate_marketing = findViewById(R.id.affilicate_marketing);
        affilicate_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, AffilicateMarketing.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        affilicate_marketing_text = findViewById(R.id.affilicate_marketing_text);
        affilicate_marketing_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, AffilicateMarketing.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        kindle_ebook = findViewById(R.id.kindle_ebook);
        kindle_ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, KindleEbookActivity.class);
                startActivity(intent);


            }
        });
        kindle_ebook_text = findViewById(R.id.kindle_ebook_text);
        kindle_ebook_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, KindleEbookActivity.class);
                startActivity(intent);
            }
        });
        whatsapp = findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, WhatsappActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        whatsapp_text = findViewById(R.id.whatsapp_text);
        whatsapp_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, WhatsappActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        membership_site = findViewById(R.id.membership_site);
        membership_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, MembershipSiteActivity.class);
                startActivity(intent);


            }
        });
        membership_site_text = findViewById(R.id.membership_site_text);
        membership_site_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, MembershipSiteActivity.class);
                startActivity(intent);

            }
        });
        mobile_app = findViewById(R.id.mobile_app);
        mobile_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, MobileAppActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        mobile_app_text = findViewById(R.id.mobile_app_text);
        mobile_app_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, MobileAppActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        email_marketing = findViewById(R.id.email_marketing);
        email_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, EmailMarketingActivity.class);
                startActivity(intent);


            }
        });
        email_marketing_text = findViewById(R.id.email_marketing_text);
        email_marketing_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, EmailMarketingActivity.class);
                startActivity(intent);

            }
        });
        social_media = findViewById(R.id.social_media);
        social_media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, SocialMediaActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        social_media_text = findViewById(R.id.social_media_text);
        social_media_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, SocialMediaActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        facebook_marketing = findViewById(R.id.facebook_marketing);
        facebook_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, FacebookMarketingActivity.class);
                startActivity(intent);


            }
        });
        facebook_marketing_text = findViewById(R.id.facebook_marketing_text);
        facebook_marketing_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, FacebookMarketingActivity.class);
                startActivity(intent);

            }
        });
        translation = findViewById(R.id.translation);
        translation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, TranslationActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        translation_text = findViewById(R.id.translation_text);
        translation_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, TranslationActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        refer_and_earn = findViewById(R.id.refer_and_earn);
        refer_and_earn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, ReferAndEarnActivity.class);
                startActivity(intent);

            }
        });
        refer_and_earn_text = findViewById(R.id.refer_and_earn_text);
        refer_and_earn_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, ReferAndEarnActivity.class);
                startActivity(intent);

            }
        });
        domain_names = findViewById(R.id.domain_names);
        domain_names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, DomainNamesActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        domain_names_text = findViewById(R.id.domain_names_text);
        domain_names_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, DomainNamesActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        dropshipping = findViewById(R.id.dropshipping);
        dropshipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, DropShippingActivity.class);
                startActivity(intent);


            }
        });
        dropshipping_text = findViewById(R.id.dropshipping_text);
        dropshipping_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, DropShippingActivity.class);
                startActivity(intent);

            }
        });
        become_an_influencer = findViewById(R.id.become_an_influencer);
        become_an_influencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, BecomeAnInfluencerActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);

            }
        });
        become_an_influencer_text = findViewById(R.id.become_an_influencer_text);
        become_an_influencer_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppManage.getInstance(DashboardActivity.this).showInterstitialAd(DashboardActivity.this, new AppManage.MyCallback() {
                    public void callbackCall() {
                        Intent intent = new Intent(DashboardActivity.this, BecomeAnInfluencerActivity.class);
                        startActivity(intent);
                    }
                }, "", AppManage.app_mainClickCntSwAd);
            }
        });
        wordpress_themes = findViewById(R.id.wordpress_themes);
        wordpress_themes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, WordpressThemesActivity.class);
                startActivity(intent);


            }
        });
        wordpress_themes_text = findViewById(R.id.wordpress_themes_text);
        wordpress_themes_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, WordpressThemesActivity.class);
                startActivity(intent);

            }
        });
        rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new myadapter(dataque(), getApplicationContext());
        rcv.setAdapter(adapter);

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw_lay.openDrawer(Gravity.LEFT);
            }
        });
//        if(getIntent().getStringExtra("Info")!=null)
//            Info=getIntent().getStringExtra("Info");

    }

    private void ExitApp() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(DashboardActivity.this);

        View view = LayoutInflater.from(DashboardActivity.this).inflate(R.layout.exit_dailog, null);
        TextView cancel_btn = view.findViewById(R.id.cancel_btn);
        TextView rate_btn = view.findViewById(R.id.rate_btn);
        TextView yes_btn = view.findViewById(R.id.yes_btn);
        dialog.setView(view);
        AlertDialog dialog1 = dialog.create();
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.show();

        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });

        rate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName())));
            }
        });

        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
                startActivity(new Intent(getApplicationContext(), SampleActivity.class));
                finish();
            }
        });


    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(DashboardActivity.this, ExitActivity.class);
        startActivity(intent);

    }

    private void filter(String text) {
        ArrayList<Model> filterList = new ArrayList<>();
        for (Model items : dataque()) {
            if (items.getHeader().toLowerCase().contains(text.toLowerCase())) {
                filterList.add(items);
            }
//            if(items.getHeader() == "Blogging"){
//                Intent intent=new Intent(DashboardActivity.this,SocialMediaActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
//            }else{
//                Intent intent=new Intent(DashboardActivity.this,PublishBookActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
//            }

        }
        adapter.filterList(filterList);

    }


    public ArrayList<Model> dataque() {
        ArrayList<Model> holder = new ArrayList<>();
        Model ob1 = new Model();
        ob1.setHeader("Blogging");
        ob1.setImgname(R.drawable.one);
        holder.add(ob1);


        Model ob2 = new Model();
        ob2.setHeader("Social Media");
        ob2.setImgname(R.drawable.two);
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setHeader("Email- Marketing");
        ob3.setImgname(R.drawable.three);
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setHeader("Publish book");
        ob4.setImgname(R.drawable.four);
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setHeader("Phone Photography");
        ob5.setImgname(R.drawable.five);
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setHeader("Ebay");
        ob6.setImgname(R.drawable.six);
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setHeader("Membership Site");
        ob7.setImgname(R.drawable.seven);
        holder.add(ob7);

        Model ob8 = new Model();
        ob8.setHeader("Translation");
        ob8.setImgname(R.drawable.eight);
        holder.add(ob8);

        Model ob9 = new Model();
        ob9.setHeader("Facebook Marketing");
        ob9.setImgname(R.drawable.nine);
        holder.add(ob9);

        Model ob10 = new Model();
        ob10.setHeader("Refer & Earn");
        ob10.setImgname(R.drawable.ten);
        holder.add(ob10);

        Model ob11 = new Model();
        ob11.setHeader("Dropshipping");
        ob11.setImgname(R.drawable.eleven);
        holder.add(ob11);

        Model ob12 = new Model();
        ob12.setHeader("Domain Names");
        ob12.setImgname(R.drawable.twelve);
        holder.add(ob12);

        Model ob13 = new Model();
        ob13.setHeader("Whatsapp");
        ob13.setImgname(R.drawable.thirteen);
        holder.add(ob13);

        Model ob14 = new Model();
        ob14.setHeader("Kindle Ebook");
        ob14.setImgname(R.drawable.fourteen);
        holder.add(ob14);

        Model ob15 = new Model();
        ob15.setHeader("Udemy");
        ob15.setImgname(R.drawable.fifteen);
        holder.add(ob15);

        Model ob16 = new Model();
        ob16.setHeader("Afflicate Marketing");
        ob16.setImgname(R.drawable.sixteen);
        holder.add(ob16);

        Model ob17 = new Model();
        ob17.setHeader("Amazone Associate");
        ob17.setImgname(R.drawable.seventeen);
        holder.add(ob17);

        Model ob18 = new Model();
        ob18.setHeader("Mobile app");
        ob18.setImgname(R.drawable.eighteen);
        holder.add(ob18);

        Model ob19 = new Model();
        ob19.setHeader("Wordpress Themes");
        ob19.setImgname(R.drawable.nineteen);
        holder.add(ob19);

        Model ob20 = new Model();
        ob20.setHeader("Become an influencer");
        ob20.setImgname(R.drawable.twenty);
        holder.add(ob20);
        return holder;
    }

}