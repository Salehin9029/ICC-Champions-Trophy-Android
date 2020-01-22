package com.example.salehinrahmankhan.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        Button button3=(Button) findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                intent1.addCategory(Intent.CATEGORY_BROWSABLE);
                intent1.setData(Uri.parse("http://twitter.com/BdLed"));
                startActivity(intent1);



            }
        });

        Button button1=(Button) findViewById(R.id.button);


        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent intent2 = new Intent();
                intent2.setAction(Intent.ACTION_VIEW);
                intent2.addCategory(Intent.CATEGORY_BROWSABLE);
                intent2.setData(Uri.parse("http://www.facebook.com/ledbangladesh/"));
                startActivity(intent2);



            }
        });


        Button button4=(Button) findViewById(R.id.button4);

        Intent myIntent5;
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){


                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.ledbangladesh.com"));
                startActivity(intent);



            }
        });
    }
}
