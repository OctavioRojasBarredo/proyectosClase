package com.example.depurar2024;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            int resultado = check();
            Toast.makeText(this, "El resultado es"+resultado, Toast.LENGTH_LONG).show();

            Persona p= new Persona("Octavio Rojas Barredo");

            return insets;
        });
    }
    private int check() {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a>b) {
            return c;
        }else {
            return b;
        }
    }

    public class Persona{
        private String name;

        public Persona(String name){
            this.name = name;
            System.out.println("La nueva persona se llama"+name);
        }
    }


}