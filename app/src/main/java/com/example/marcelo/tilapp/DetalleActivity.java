package com.example.marcelo.tilapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.widget.Button;
import android.widget.ImageView;

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
                Slide t1 = new Slide();
                getWindow().setEnterTransition(t1);
                break;
            case 2:
                setTitle("Tab Layout");
                imagen.setImageResource(R.drawable.img2);
                Explode t2 = new Explode();
                getWindow().setEnterTransition(t2);
                break;
            case 3:
                setTitle("NavigationDrawer");
                imagen.setImageResource(R.drawable.img3);
                Fade t3 = new Fade();
                getWindow().setEnterTransition(t3);
                break;
            case 4:
                setTitle("RecyclerView");
                imagen.setImageResource(R.drawable.img4);
                Transition t4 = TransitionInflater.from(this).inflateTransition(R.transition.transitionv21);
                getWindow().setEnterTransition(t4);
                break;
            case 5:
                setTitle("Transitions");
                imagen.setImageResource(R.drawable.img5);
                Explode t5 = new Explode();
                getWindow().setEnterTransition(t5);
                break;
            case 6:
                setTitle("FAB");
                imagen.setImageResource(R.drawable.img6);
                Explode t6 = new Explode();
                getWindow().setEnterTransition(t6);
                break;
        }
    }
}
