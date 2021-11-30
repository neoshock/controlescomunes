package com.example.trabajouno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        //Llamamos a la función para la obtncion de datos del Activity anterior
        getDataFromMainAcivity();
    }

    void getDataFromMainAcivity(){

        //Llamada a los text view del activiy Bienvenida
        TextView nombrePersona = (TextView) findViewById(R.id.nombreResultTxt);
        TextView generoPersona = (TextView) findViewById(R.id.generoResultTxt);
        TextView fechaPersona = (TextView) findViewById(R.id.fechaResultTxt);
        TextView telefonoPersona = (TextView) findViewById(R.id.telefonoResultTxt);

        //Obtenemos los datos del activity anterior
        Bundle bundle = this.getIntent().getExtras();

        //Insertamos los datos obtenidos a los view text de este activity
        nombrePersona.setText("Hola!, Bienvenido " + bundle.getString("nombre"));
        generoPersona.setText("Género: " + bundle.getString("genero"));
        fechaPersona.setText("Fecha Nacimiento: " + bundle.getString("fecha"));
        telefonoPersona.setText("Telefono: " + bundle.getString("telefono"));
    }
}