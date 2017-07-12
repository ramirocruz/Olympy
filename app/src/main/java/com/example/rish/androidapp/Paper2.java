package com.example.rish.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Paper2 extends AppCompatActivity {

    ListView listview;
    PDFAdapterWeb arraypdf;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper2);


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
            "inmo-2000",
            "inmo-2001",
            "inmo-2002",
            "inmo-2003",
            "inmo-2004",
            "inmo-2005",
            "inmo-2006",
            "inmo-2007",
            "inmo-2008",
            "inmo-2009",
            "inmo-2010",
            "inmo-2011",
            "inmo-2012",
            "inmo-2013",

    };








    private final String[] listitemurl={
            "https://drive.google.com/open?id=0B5sOqfMxLg8ubXVPejh1VHl3YkE",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uNGU3QVlTWTRObHc",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uME1HN2l0Vl9qMm8",
            "https://drive.google.com/open?id=0B5sOqfMxLg8ud1dKOFVFdVowUXM",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uSG5BSUVoN1JrTjQ",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uc1BaRkNPU0x4d0k",
            "https://drive.google.com/open?id=0B5sOqfMxLg8ub2h1SEkzbHVBdkk",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uVnFHMFVxeHlGazQ",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uRGJHeEpvVm9fVlk",
            "https://drive.google.com/open?id=0B5sOqfMxLg8ucHB4S0NWLVVwNkU",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uTk5sMGxtMlQwdUU",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uSVJHNnl3ckduWDA",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uazI3dFU5Y3BIbHc",
            "https://drive.google.com/open?id=0B5sOqfMxLg8ueUpBV0pjOEZTc2M",

    };
}

