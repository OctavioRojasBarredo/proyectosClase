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

public class SecondActivity extends AppCompatActivity {
    private String nombre = "Obama";
    private Button botonEinstein;
    private Button botonRafa;
    private Button botonPenelope;
    private Button botonWill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            botonEinstein = findViewById(R.id.einstein);
            botonEinstein.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Parámetros: Origen - Destino
                    Intent intent = new Intent(SecondActivity.this, MainActivity.class);

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
                    Intent intent = new Intent(SecondActivity.this, FourthActivity.class);

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
                    Intent intent = new Intent(SecondActivity.this, FifthActivity.class);

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
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);

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