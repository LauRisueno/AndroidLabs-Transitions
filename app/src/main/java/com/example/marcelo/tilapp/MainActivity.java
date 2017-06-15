package com.example.marcelo.tilapp;

import android.animation.Animator;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    View myView;
    Button boton;
    TextInputLayout tilUsuario, tilPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilUsuario = (TextInputLayout) findViewById(R.id.til_usuario);
        tilPassword = (TextInputLayout) findViewById(R.id.til_password);

        myView = (View) findViewById(R.id.reveal);
        boton = (Button) findViewById(R.id.boton_intro);

    }

    public void ingresar(View view){
        String usuario = tilUsuario.getEditText().getText().toString();
        String password = tilUsuario.getEditText().getText().toString();

        if(TextUtils.isEmpty(usuario)){
            tilUsuario.setError("Ingrese el nombre de usuario");
            return;
        }else if (TextUtils.isEmpty(password)){
            tilPassword.setError("Ingrese una contraseña");
            return;
        }else{

            tilUsuario.setError(null);
            tilPassword.setError(null);

            revealView();

            Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
            startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());
        }

    }

    @Override
    protected void onResume() {
        super.onResume();

        myView.setVisibility(View.INVISIBLE);
        boton.setVisibility(View.VISIBLE);

    }

    public void revealView(){

        int cx = (myView.getLeft() + myView.getRight()) / 2;
        int cy = (myView.getTop() + myView.getBottom()) / 2;

        int finalRadius = Math.max(myView.getWidth(), myView.getHeight());

        Animator anim =
                ViewAnimationUtils.createCircularReveal(myView, cx, cy, 0, finalRadius);

        anim.setDuration(500);

        myView.setVisibility(View.VISIBLE);
        boton.setVisibility(View.INVISIBLE);

        anim.start();
    }
}
