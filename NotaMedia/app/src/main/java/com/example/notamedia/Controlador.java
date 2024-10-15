package com.example.notamedia;

import android.content.pm.verify.domain.DomainVerificationManager;
import android.view.View;
import android.widget.EditText;

import androidx.core.content.ContextCompat;

public class Controlador implements View.OnClickListener {
    private MainActivity activity;
    private Logica logica;

    public Controlador(MainActivity activity) {
        this.activity = activity;
        this.logica = new Logica();
    }

    @Override
    public void onClick(View view) {
        enviarNombre(activity.getNombreEditText());
        enviarApellidos(activity.getApellidosEditText());
    }

    public String enviarNombre(View nom) {
        EditText nomb = nom.findViewById(R.id.introducirNombre);
        String nombre = nomb.getText().toString();

        return nombre;
    }

    public String enviarApellidos(View apell){
        EditText ape = apell.findViewById(R.id.introducirApellidos);
        String apellidoString = ape.getText().toString();

        return apellidoString;
    }

    public String getNombre()  {
        return activity.getNombre();
    }


    public String getApellidos()  {
        return activity.getApellidos();
    }

    setTextColor(ContextCompat.getColor(this, color));

}
