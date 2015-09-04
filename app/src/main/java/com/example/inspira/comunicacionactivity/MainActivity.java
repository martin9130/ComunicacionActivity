package com.example.inspira.comunicacionactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent ibm = new Intent(this, ActividadHermanito2.class);
        ibm.putExtra("sendwl", "Hola");
        startActivity(ibm);


    }


}
