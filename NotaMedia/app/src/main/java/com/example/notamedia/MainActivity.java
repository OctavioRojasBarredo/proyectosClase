package com.example.notamedia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText apellidos;
    private Button validar;
    private ArrayList<String> notas;
    private Controlador controlador;
    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private float media;
    private TextView mensajeMedia;

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
        notas = new ArrayList<>();
        mensajeMedia = findViewById(R.id.media);
        mensajeMedia.setVisibility(TextView.INVISIBLE);
        nota1 = findViewById(R.id.nota1);
        nota2 = findViewById(R.id.nota2);
        nota3 = findViewById(R.id.nota3);

        nombre = findViewById(R.id.introducirNombre);
        apellidos = findViewById(R.id.introducirApellidos);
        validar = findViewById(R.id.boton);

        controlador = new Controlador(this);

        validar.setOnClickListener(controlador);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle("Logo");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setIcon(R.mipmap.ic_logo_round);
        }
    }

    public EditText getNombreEditText()  {
        return nombre;
    }

    public void recibirMedia(float media){
        this.media = controlador.enviarMedia(media);
    }

    public void mostrarMedia(){

        mensajeMedia.setText(mensajeMedia.getText().toString()+media);
        mensajeMedia.setVisibility(TextView.VISIBLE);
    }

    public void guardarNotas(){
        notas.add(nota1.getText().toString());
        notas.add(nota2.getText().toString());
        notas.add(nota3.getText().toString());
    }

    public ArrayList<String> getNotas(){
        return notas;
    }

    public void setNombre(String nombre){
        this.nombre.setText(nombre.toString());
    }

    public void setApellidos(String apellidos){
        this.apellidos.setText(apellidos.toString());
    }


    public String getNombre()  {
        return nombre.getText().toString();
    }

    public Button getBoton()  {
        return validar;
    }

    public String getApellidos()  {
        return apellidos.getText().toString();
    }

    public EditText getApellidosEditText()  {
        return apellidos;
    }
}