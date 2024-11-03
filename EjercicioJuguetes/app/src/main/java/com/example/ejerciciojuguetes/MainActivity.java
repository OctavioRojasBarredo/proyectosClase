package com.example.ejerciciojuguetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    EditText nombre;
    EditText tipo;
    EditText cantidad;
    Button btnAnadir;
    Button btnMostrar;
    Controlador controlador = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recogerElementosGraficos();
        configurarToolbar();

        controlador = new Controlador(this);
        controlador.crearJuguetes();

        btnAnadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controlador.botonAnadirPulsado();
            }
        });

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarActivity();
            }
        });

    }

    public void cambiarActivity(){
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        ArrayList<Juguetes> juguetes = controlador.getJuguetesList();
        intent.putExtra("juguetes", juguetes);
        startActivity(intent);
    }

    public void recogerElementosGraficos(){
        nombre = findViewById(R.id.nombreProductoEscribir);
        tipo = findViewById(R.id.tipoEscribir);
        cantidad = findViewById(R.id.cantidadEscribir);
        btnAnadir = findViewById(R.id.btnAnadir);
        btnMostrar = findViewById(R.id.btnMostrar);
    }

    public void configurarToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Juguetes");
        }
    }

    public EditText getNombre() {
        return nombre;
    }

    public void setNombre(EditText nombre) {
        this.nombre = nombre;
    }

    public EditText getTipo() {
        return tipo;
    }

    public void setTipo(EditText tipo) {
        this.tipo = tipo;
    }

    public EditText getCantidad() {
        return cantidad;
    }

    public void setCantidad(EditText cantidad) {
        this.cantidad = cantidad;
    }

    public Button getBtnAnadir() {
        return btnAnadir;
    }

    public void setBtnAnadir(Button btnAnadir) {
        this.btnAnadir = btnAnadir;
    }

    public Button getBtnMostrar() {
        return btnMostrar;
    }

    public void setBtnMostrar(Button btnMostrar) {
        this.btnMostrar = btnMostrar;
    }
}