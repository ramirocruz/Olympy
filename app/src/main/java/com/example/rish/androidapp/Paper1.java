package com.example.rish.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Paper1 extends AppCompatActivity {

    ListView listview;
    PDFAdapterWeb arraypdf;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper1);


        listview=(ListView)findViewById(R.id.theListView);
        arraypdf=new PDFAdapterWeb(this,listitemnames);

        listview.setAdapter(arraypdf);
        listview.setOnItemClickListener(itemclick);

    }



    private AdapterView.OnItemClickListener itemclick=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Intent urlintent=new Intent(getApplicationContext(),WebViewActivity.class);
            urlintent.putExtra("URL",listitemurl[position]);
            try{startActivity(urlintent);
            }catch (Exception e){
                Toast.makeText(getApplicationContext(),"Here" + e.toString(),Toast.LENGTH_LONG).show();
            }
        }
    };


    //New links to our database to load webview
    private final String[] listitemnames={
            "crmo-2013-solutions-1",
            "crmo-2013-solutions-2",
            "crmo-2013-solutions-2 (2)",
            "crmo-2013-solutions-4",
            "crmosol-12-1",
            "crmosol-12-2",
            "crmosol-12-3",
            "crmosol-12-4",
            "solutions-to-rmo-2013-mumbai-region",
            "solutions-to-rmo-2013-mumbai-region (2)",

    };








    private final String[] listitemurl={
            "https://drive.google.com/open?id=0B5sOqfMxLg8uU3ZvdjVfQWtWeW8",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uNHpZWXotYzBoRjQ",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uNUkxMTZfazBTZHc",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uZzlYWTN1TldMOWM",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uUV8zQllaR0JfbTQ",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uVVJJc1ZZZVM2cXM",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uS2VsbENLSVgwTVE",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uTTNCOG8zSS0xWms",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uN09VYlpNN2xmT1k",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uVXhWQ09sV2RaODA",

    };
}