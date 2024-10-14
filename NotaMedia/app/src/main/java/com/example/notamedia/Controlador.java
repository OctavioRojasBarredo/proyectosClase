package com.example.notamedia;

import android.content.pm.verify.domain.DomainVerificationManager;
import android.view.View;
import android.widget.EditText;

public class Controlador implements View.OnClickListener {
    private MainActivity activity;

    public Controlador(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View view) {
        enviarNombre(activity.getNombre());
        enviarApellidos(activity.getApellidos());

    }

    public EditText enviarNombre(View nom) {
        EditText nomb = nom.findViewById(R.id.introducirNombre);

        return nomb;
    }

    public EditText enviarApellidos(View apell){
        EditText apelli = apell.findViewById(R.id.introducirApellidos);
        return apelli;
    }

}
