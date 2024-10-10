package com.example.primerproyectofuncional;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button botonIzquierda;
    private Button botonDerecha;
    private TextView mostrarNombre;
    private EditText nombre;

    private Controlador controlador;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        // Inicializa las vistas
        botonIzquierda = findViewById(R.id.botonIzq);
        botonDerecha = findViewById(R.id.botonDer);
        mostrarNombre = findViewById(R.id.mostrarNombre);
        nombre = findViewById(R.id.nombre);

        // Crea una instancia del Controlador, pasándole las vistas necesarias
        controlador = new Controlador(this);

        // Asigna el controlador a los botones
        botonIzquierda.setOnClickListener(controlador);
        botonDerecha.setOnClickListener(controlador);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void cambiarTexto() {
        mostrarNombre.setText(nombre.getText().toString());
    }

    public void resetearTexto() {
        mostrarNombre.setText("");
    }
}

