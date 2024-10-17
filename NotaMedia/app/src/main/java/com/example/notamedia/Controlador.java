package com.example.notamedia;

import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class Controlador implements View.OnClickListener {
    private MainActivity activity;
    private Logica logica;

    public Controlador(MainActivity activity) {
        this.activity = activity;
        this.logica = new Logica(this);
    }

    @Override
    public void onClick(View view) {
        enviarNombre(activity.getNombreEditText());
        enviarApellidos(activity.getApellidosEditText());
        guardarNotas();
        recibirMedia();
    }

    public void guardarNotas(){
        activity.guardarNotas();
        for (int i=0, i<activity.getNotas().length(); i++){
            ArrayList<String> notas = activity.getNotas();
            pasarNotas(notas);
        }

    }

    public ArrayList<String> pasarNotas(ArrayList<String> notas) {
        return notas;
    }

    public void recibirMedia() {
        float media = logica.enviarMedia();
        enviarMedia(media);
        logica.hacerMedia(activity.getNotas());
        activity.mostrarMedia();
    }

    public float enviarMedia(float media){
        return media;
    }

    public void enviarNombre(View nom) {
        EditText nomb = nom.findViewById(R.id.introducirNombre);
        String nombre = nomb.getText().toString();

        logica.ponerMayusculasNombre(nombre);
    }

    public void enviarApellidos(View apell){
        EditText ape = apell.findViewById(R.id.introducirApellidos);
        String apellidoString = ape.getText().toString();

        logica.ponerMayusculasApellidos(apellidoString);
    }

    public void enviarNombreActivity(String nombre){
        activity.setNombre(nombre);
    }

    public void enviarApellidosActivity(String apellidos){
        activity.setApellidos(apellidos);
    }

    public String getNombre()  {
        return activity.getNombre();
    }


    public String getApellidos()  {
        return activity.getApellidos();
    }


}
