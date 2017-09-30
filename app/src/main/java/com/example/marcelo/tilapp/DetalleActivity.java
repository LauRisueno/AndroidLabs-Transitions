package com.example.marcelo.tilapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    ImageView imagen;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imagen = (ImageView) findViewById(R.id.detail_image);

        intent = getIntent();
        Bundle extra = intent.getExtras();
        int pos = extra.getInt("dato");

        switch (pos){
            case 1:
                setTitle("Toobar");
                imagen.setImageResource(R.drawable.img1);
                //Transición Slide
                break;
            case 2:
                setTitle("Tab Layout");
                imagen.setImageResource(R.drawable.img2);
                //Transición Explode
                break;
            case 3:
                setTitle("NavigationDrawer");
                imagen.setImageResource(R.drawable.img3);
                //Transición Fade
                break;
            case 4:
                setTitle("RecyclerViewx");
                imagen.setImageResource(R.drawable.img4);
                //Transición personalizada
                break;
            case 5:
                setTitle("Transitions");
                imagen.setImageResource(R.drawable.img5);
                //Transición preferida
                break;
            case 6:
                setTitle("FAB");
                imagen.setImageResource(R.drawable.img6);
                //Transición preferida
                break;
        }
    }

    public void iniciarAnimacion(View view){
        Toast.makeText(getApplicationContext(), "Aqui vendra Lottie", Toast.LENGTH_SHORT).show();
    }
}
