package com.example.marcelo.tilapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        setToolbar(); // Reemplazar toolbar

        //setupWindowAnimation();
    }

    private void setupWindowAnimation(){
        //Aqui creamos las transiciones
    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    public void siguiente(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",1);
        startActivity(intent);
    }

    public void siguiente2(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",2);
        startActivity(intent);
    }

    public void siguiente3(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",3);
        startActivity(intent);
    }

    public void siguiente4(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",4);
        startActivity(intent);
    }

    public void siguiente5(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",5);
        startActivity(intent);
    }

    public void siguiente6(View view){
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("dato",6);
        startActivity(intent);
    }
}
