package com.example.inspira.comunicacionactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadHermanito2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hermanito2);
        String mensaje = getIntent().getStringExtra("sendwl");
        Log.d("acabo de recibir", mensaje);
    }



}
