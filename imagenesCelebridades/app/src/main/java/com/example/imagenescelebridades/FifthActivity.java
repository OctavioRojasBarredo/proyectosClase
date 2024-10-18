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

public class FifthActivity extends AppCompatActivity {

    private String nombre = "Will";
    private Button botonEinstein;
    private Button botonPenelope;
    private Button botonObama;
    private Button botonRafa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fifth);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            botonPenelope = findViewById(R.id.penelope);
            botonPenelope.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(FifthActivity.this, ThirdActivity.class);

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
                    Intent intent = new Intent(FifthActivity.this, FourthActivity.class);

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
                    Intent intent = new Intent(FifthActivity.this, MainActivity.class);

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
                    Intent intent = new Intent(FifthActivity.this, SecondActivity.class);

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