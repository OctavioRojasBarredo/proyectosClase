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

public class ThirdActivity extends AppCompatActivity {

    private String nombre = "Penelope";
    private Button botonEinstein;
    private Button botonRafa;
    private Button botonObama;
    private Button botonWill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            botonRafa = findViewById(R.id.rafa);
            botonRafa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);

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
                    Intent intent = new Intent(ThirdActivity.this, FifthActivity.class);

                    // Enviar información extra
                    intent.putExtra("Nombre", nombre);

                    // Lanzar el intent
                    startActivity(intent);
                }
            });

            botonEinstein = findViewById(R.id.einstein);
            botonEinstein.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(ThirdActivity.this, MainActivity.class);

                    // Enviar información extra
                    intent.putExtra("Nombre", nombre);

                    // Lanzar el intent
                    startActivity(intent);
                }
            });

            botonObama = findViewById(R.id.obama);
            botonObama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);

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