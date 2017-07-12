package com.example.rish.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainScreenActivity extends AppCompatActivity {
    Button buttonintroduction,buttonsyllabus,buttonquestionpapers,buttonbooks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        buttonintroduction=(Button)findViewById(R.id.buttonintroduction);
       buttonsyllabus=(Button)findViewById(R.id.buttonsyllabus);
        buttonquestionpapers=(Button)findViewById(R.id.buttonquestionpapers);
       buttonbooks=(Button)findViewById(R.id.buttonbooks);
       buttonbooks.setOnClickListener(clickobject);
        buttonintroduction.setOnClickListener(clickobject);
        buttonsyllabus.setOnClickListener(clickobject);
        buttonquestionpapers.setOnClickListener(clickobject);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intro_one_time_launcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            FirebaseAuth firebaseAuth= FirebaseAuth.getInstance();
            firebaseAuth.signOut();
            Toast.makeText(getApplicationContext(),"Signed out",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private View.OnClickListener clickobject=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
      switch(v.getId()){

          case R.id.buttonintroduction:
              startActivity(new Intent(getApplicationContext(),IntroActivity.class));

              break;
          case R.id.buttonsyllabus:
              startActivity(new Intent(getApplicationContext(),SyllabusActivity.class));

              break;
          case R.id.buttonquestionpapers:
              startActivity(new Intent(getApplicationContext(),PreviousYearActivity.class));
              break;
          case R.id.buttonbooks:
              startActivity(new Intent(getApplicationContext(),BooksActivity.class));



      }
        }
    };

}
