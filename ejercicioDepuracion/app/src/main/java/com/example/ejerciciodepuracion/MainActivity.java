package com.example.ejerciciodepuracion;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pedidos> pedidos = new ArrayList<>();
    Random aleatorio = new Random();
    Pedidos pedido = new Pedidos();

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

        // Llamar a crearPedidos
        pedido.crearPedidos();
    }

    public class Pedidos {
        private int id;

        public Pedidos(int id) {
            this.id = id;
        }
        public Pedidos() {

        }
        public int getId() {
            return this.id;
        }


        public void crearPedidos() {
            int cantidadGenerados = aleatorio.nextInt(11);
            Pedidos pedido = new Pedidos(cantidadGenerados);
            pedidos.add(pedido);

            for (int i=1; i < cantidadGenerados; i++){
                int idAnterior = pedidos.get(i-1).getId();
                Pedidos pedidillo = new Pedidos(idAnterior*idAnterior);
                pedidos.add(pedidillo);

            }
        }

    }


}
