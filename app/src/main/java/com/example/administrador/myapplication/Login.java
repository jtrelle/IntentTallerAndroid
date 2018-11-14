package com.example.administrador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        String[] message = intent.getStringArrayExtra("strings");




        TextView textView = findViewById(R.id.bienvenido);
        textView.setText("Hola "+message[0]+"\n"+ "Contraseña:"+message[1]+"\n"+"Código:"+message[2] );
    }
}
