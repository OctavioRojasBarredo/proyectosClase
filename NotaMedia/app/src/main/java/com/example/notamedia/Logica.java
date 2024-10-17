package com.example.notamedia;

import android.widget.EditText;

import java.util.ArrayList;

public class Logica {
    float media = 0;
    private Controlador controlador;

    public Logica(Controlador controlador) {
        this.controlador = controlador;
    }

    public void ponerMayusculasNombre(String texto) {
        texto = texto.toUpperCase();
        controlador.enviarNombreActivity(texto);
    }

    public void ponerMayusculasApellidos(String texto) {
        texto = texto.toUpperCase();
        controlador.enviarApellidosActivity(texto);
    }

    public void hacerMedia(ArrayList<String> notas){
        int contador = 0;
        int sumaNotas = 0;

        for (String notasString : notas) {
            int nota = Integer.parseInt(notasString);
            if (nota > 0 && nota <= 10) {
                sumaNotas = +nota;
                contador++;
            } else {
                nota = 0;
                sumaNotas = +nota;
                contador++;
            }
        }

        media = sumaNotas / contador;
    }

    public float enviarMedia(){
        return media;
    }
}
