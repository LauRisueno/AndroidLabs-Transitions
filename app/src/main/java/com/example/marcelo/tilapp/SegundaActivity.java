package com.example.marcelo.tilapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.view.View;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        setToolbar(); // Reemplazar toolbar

        setupWindowAnimation();
    }

    private void setupWindowAnimation(){
        getWindow().setEnterTransition(new Explode());
        getWindow().setReenterTransition(new Explode());
        getWindow().setExitTransition(new Explode());
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void siguiente(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",1);
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
    }

    public void siguiente2(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",2);
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
    }

    public void siguiente3(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",3);
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
    }

    public void siguiente4(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",4);
        View imageSharded = view.findViewById(R.id.imagen_compartida);
        ActivityOptions opcion = ActivityOptions.makeSceneTransitionAnimation(this, imageSharded, imageSharded.getTransitionName());
        startActivity(intent, opcion.toBundle());
    }

    public void siguiente5(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",5);
        View imageSharded = view.findViewById(R.id.imagen_compartida2);
        ActivityOptions opcion2 = ActivityOptions.makeSceneTransitionAnimation(this, imageSharded, imageSharded.getTransitionName());
        startActivity(intent, opcion2.toBundle());
    }

    public void siguiente6(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",6);
        View imageSharded = view.findViewById(R.id.imagen_compartida3);
        ActivityOptions opcion3 = ActivityOptions.makeSceneTransitionAnimation(this, imageSharded, imageSharded.getTransitionName());
        startActivity(intent, opcion3.toBundle());
    }
}
