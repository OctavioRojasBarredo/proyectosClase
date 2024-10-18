package com.example.imagenescelebridades;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String nombre = "Einstein";
    private Button botonObama;
    private Button botonRafa;
    private Button botonPenelope;
    private Button botonWill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            botonObama = findViewById(R.id.obama);
            botonObama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    // Enviar información extra
                    intent.putExtra("Nombre", nombre);

                    // Lanzar el intent
                    startActivity(intent);
                }
            });

            botonRafa = findViewById(R.id.rafa);
            botonRafa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(MainActivity.this, FourthActivity.class);

                    // Enviar información extra
                    intent.putExtra("Nombre", nombre);

                    // Lanzar el intent
                    startActivity(intent);
                }
            });

            botonWill = findViewById(R.id.will);
            botonWill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(MainActivity.this, FifthActivity.class);

                    // Enviar información extra
                    intent.putExtra("Nombre", nombre);

                    // Lanzar el intent
                    startActivity(intent);
                }
            });

            botonPenelope = findViewById(R.id.penelope);
            botonPenelope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(MainActivity.this, ThirdActivity.class);

                    // Enviar información extra
                    intent.putExtra("Nombre", nombre);

                    // Lanzar el intent
                    startActivity(intent);
                }
            });

            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}