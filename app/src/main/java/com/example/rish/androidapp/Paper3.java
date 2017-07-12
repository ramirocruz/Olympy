package com.example.rish.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Paper3 extends AppCompatActivity {

    ListView listview;
    PDFAdapterWeb arraypdf;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper3);


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
            "rmo-2000",
            "rmo-2001",
            "rmo-2002",
            "rmo-2003",
            "rmo-2004",
            "rmo-2005",
            "rmo-2006",
            "rmo-2007",
            "rmo-2008",
            "rmo-2009",
            "rmo-2010",
            "rmo-2011",
            "rmo-2012-mumbai-region",
            "rmo-2013-mumbai-region",
    };








    private final String[] listitemurl={
            "https://drive.google.com/open?id=0B5sOqfMxLg8ubGR6dlJkQ3VPRFE",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uWjZqc04wZW5CQ2s",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uWS05bzkxald3b3M",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uS1RJdzgwZldTeDQ",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uYVRVZzlqaDFNN00",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uVkVqQ0trdGtFU2s",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uSVRFc1lXb3B6emc",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uSVlaZ0IwTm52VWM",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uNFdTU0RacWFiRG8",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uVjNKN29jMUtiSlU",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uLXlGLTVlZ3lrNlk",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uZGxWMGgySFNVNDQ",
            "https://drive.google.com/open?id=0B5sOqfMxLg8udm1qUklNRGVaaUU",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uakk1ckI1LXpBNnc",
    };
}
