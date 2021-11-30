package com.example.trabajouno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        getDataFromMainAcivity();
    }

    void getDataFromMainAcivity(){
        TextView nombrePersona = (TextView) findViewById(R.id.nombreResultTxt);
        TextView generoPersona = (TextView) findViewById(R.id.generoResultTxt);
        TextView fechaPersona = (TextView) findViewById(R.id.fechaResultTxt);
        TextView telefonoPersona = (TextView) findViewById(R.id.telefonoResultTxt);

        Bundle bundle = this.getIntent().getExtras();

        nombrePersona.setText("Hola!, Bienvenido " + bundle.getString("nombre"));
        generoPersona.setText("Género: " + bundle.getString("genero"));
        fechaPersona.setText("Fecha Nacimiento: " + bundle.getString("fecha"));
        telefonoPersona.setText("Telefono: " + bundle.getString("telefono"));
    }
}