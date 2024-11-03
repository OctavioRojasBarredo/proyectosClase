package com.example.ejerciciojuguetes;


import android.content.Intent;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    MainActivity activity;
    ArrayList<Juguetes> juguetesList = new ArrayList<>();
    public Controlador(MainActivity activity){
        this.activity = activity;
    }

    public void botonAnadirPulsado(){
        if (!activity.getNombre().getText().toString().equals("") && !activity.getCantidad().getText().toString().equals("") && !activity.getTipo().getText().toString().equals("")) {
            String nombre = activity.getNombre().getText().toString();
            int cantidad = Integer.parseInt(activity.getCantidad().getText().toString());
            String tipo = activity.getTipo().getText().toString();
            Juguetes juguete = new Juguetes(nombre, tipo, cantidad);
            juguetesList.add(juguete);
        } else {
            Toast.makeText(activity, "Introduce correctamente los datos", Toast.LENGTH_SHORT).show();
        }


    }

    public void crearJuguetes(){
        Juguetes juguete1 = new Juguetes("Pelota de fútbol", "Pelota", 5);
        juguetesList.add(juguete1);
        Juguetes juguete2 = new Juguetes("Pelota de basket", "Pelota", 3);
        juguetesList.add(juguete2);
        Juguetes juguete3 = new Juguetes("Pelota de tenis", "Pelota", 15);
        juguetesList.add(juguete3);
        Juguetes juguete4 = new Juguetes("Playmobil", "Muñeco", 9);
        juguetesList.add(juguete4);
        Juguetes juguete5 = new Juguetes("Barriguita", "Muñeco", 5);
        juguetesList.add(juguete5);
        Juguetes juguete6 = new Juguetes("Monopoly", "Juego de mesa", 5);
        juguetesList.add(juguete6);
        Juguetes juguete7 = new Juguetes("Parchís", "Juego de mesa", 5);
        juguetesList.add(juguete7);
        Juguetes juguete8 = new Juguetes("Dominó", "Juego de mesa", 5);
        juguetesList.add(juguete8);
    }

    public ArrayList<Juguetes> getJuguetesList() {
        return juguetesList;
    }
}
