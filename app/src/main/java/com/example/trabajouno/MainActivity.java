package com.example.trabajouno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private String genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Evento que se ejecuta al hacere clic en el boton del Main Activity
    public void enviarDatos(View view){
        Bundle bundle = new Bundle();

        //Llamada al activity Bienvenida
        Intent intent = new Intent(MainActivity.this, Bienvenida.class);

        //Recoger los valores de los imput text
        EditText nombre = (EditText) findViewById(R.id.nombreTxt);
        EditText telefono = (EditText) findViewById(R.id.telefonoTxt);
        EditText fechaNacimiento = (EditText) findViewById(R.id.fechaNacimientoDate);

        RadioButton femenino = (RadioButton) findViewById(R.id.femeninoRb);

        //Determinar si cual genero esta seleccionado
        if(femenino.isChecked()){
            genero = "Femenino";
        }else {
            genero = "Masculino";
        }

        //Agregamos los campos ingresados en los Inputs al bundle
        bundle.putString("nombre", nombre.getText().toString());
        bundle.putString("telefono", telefono.getText().toString());
        bundle.putString("fecha", fechaNacimiento.getText().toString());
        bundle.putString("genero", genero);

        //Ingresamos la coleccion de datos al intent
        intent.putExtras(bundle);

        //Llamada a a la siguiente actividad
        startActivity(intent);
    }
}