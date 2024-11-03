package com.example.ejerciciojuguetes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    ListView lista;
    ArrayList<Juguetes> juguetesList;
    Button btnList;
    Button btnGrid;

    public ListViewActivity(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recogerInformacion();
        crearLista();
        configurarToolbar();
        recogerElementosGraficos();


        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListViewActivity.this, GridViewActivity.class);
                intent.putExtra("juguetes", juguetesList);
                startActivity(intent);
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ListViewActivity.this, "Ya estás en esta vista", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void recogerInformacion(){
        Bundle bundle = getIntent().getExtras();

        if (bundle != null && bundle.getSerializable("juguetes") != null){
            juguetesList = (ArrayList<Juguetes>) bundle.getSerializable("juguetes");
        }
    }

    public void crearLista(){
        if (juguetesList != null) {
            lista = findViewById(R.id.lista);
            Adaptador adaptador = new Adaptador(this, R.layout.lista_normal_layout, juguetesList);
            lista.setAdapter(adaptador);
        } else {
            System.out.println("Lista nula");
        }
    }

    public void configurarToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Juguetes");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void recogerElementosGraficos(){
        btnGrid = findViewById(R.id.button2);
        btnList = findViewById(R.id.button);
    }

}