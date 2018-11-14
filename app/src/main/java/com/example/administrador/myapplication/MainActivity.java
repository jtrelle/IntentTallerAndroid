package com.example.administrador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



//    public void Enviar(View botton){
//
//
//        EditText nomUser = (EditText) findViewById(R.id.user);
//        EditText claveUser = (EditText) findViewById(R.id.clave);
//        EditText codigoUser = (EditText) findViewById(R.id.codigo);
//
//        String nom=nomUser.getText().toString();
//        String clave=claveUser.getText().toString();
//        String codigo=codigoUser.getText().toString();
//
//
//        if (nomUser.equals("usuario")&& claveUser.equals("clave"))
//        {
//            Intent intent = new Intent();
//
//           intent.setClass(this,Login.class);
//           intent.putExtra("user",nomUser.getText().toString());
//                   startActivity(intent);
//        }
//
//        else {
//            Toast.makeText(this,"INCORRECTO",Toast.LENGTH_LONG).show();
//
//        }
//    }

     public void enviar(View view) {
         Intent intent = new Intent(this, Login.class);
         EditText nomUser = (EditText) findViewById(R.id.user);
         EditText claveUser = (EditText) findViewById(R.id.clave);
         EditText codigoUser = (EditText) findViewById(R.id.codigo);

        String nom=nomUser.getText().toString();
        String clave=claveUser.getText().toString();
        String codigo=codigoUser.getText().toString();


        //MENSAJE CONCATENADO
          // intent.putExtra(EXTRA_MESSAGE,nom + "_" + clave + "_" + codigo);

       //MENSAJE CON ARREGLO
         String[] unido = new String[]{
                 "  "+nom,
                 "  "+clave,
                 "  "+codigo
         };

            intent.putExtra("strings",unido);
            startActivity(intent);
     }
}
