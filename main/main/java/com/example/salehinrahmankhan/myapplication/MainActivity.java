package com.example.salehinrahmankhan.myapplication;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

//Remove notification bar


//set content view AFTER ABOVE sequence (to avoid crash)
        this.setContentView(R.layout.activity_main);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        Button button1=(Button) findViewById(R.id.button1);

        Intent myIntent1;
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent myIntent1 = new Intent(MainActivity.this, fixture.class);
                startActivity(myIntent1);




            }
        });


        Button button2=(Button) findViewById(R.id.button2);

        Intent myIntent2;
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent myIntent2 = new Intent(MainActivity.this, about.class);
                startActivity(myIntent2);




            }
        });



//        alarm activity

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        Intent notificationIntent = new Intent("android.media.action.DISPLAY_NOTIFICATION");
        notificationIntent.addCategory("android.intent.category.DEFAULT");

        PendingIntent broadcast = PendingIntent.getBroadcast(this, 100, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar cal = null;
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            cal = Calendar.getInstance();
//            cal.add(Calendar.SECOND, 15);
//            cal.add(Calendar.HOUR_OF_DAY, 9);
            alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 21600000, broadcast);

        }

    }
}