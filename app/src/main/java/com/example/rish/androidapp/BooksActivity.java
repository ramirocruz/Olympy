package com.example.rish.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class BooksActivity extends AppCompatActivity {

    ListView listview;
    PDFAdapterWeb arraypdf;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);


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
          "geom-080399","KedlayaInequalities","Sato_NumberTheory"
    };








    private final String[] listitemurl={
            "https://drive.google.com/open?id=0B5sOqfMxLg8uU0lnMW5fbTVrTjA",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uSWxab1pTMWg4WFE",
            "https://drive.google.com/open?id=0B5sOqfMxLg8uREMxYzFSX3dGaG8",

    };
}
