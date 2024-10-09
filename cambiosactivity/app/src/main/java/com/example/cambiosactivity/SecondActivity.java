package com.example.cambiosactivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView = findViewById(R.id.textView2);
        //Recibimos y guardamos la info extra
        Bundle bundle = getIntent().getExtras();

        //Comprobamos que el bundle no está vacío

        if (bundle != null && bundle.getString("Clave") != null) {
            // RECUPERAMOS EL MENSAJE Y HACEMOS LO QUE NECESITAMOS
            String nuevoMensaje = bundle.getString("Clave");
            textView.setText(nuevoMensaje);

        } else {
            // Si no se ha mandado info o se ha mandado pero no con la clave correcta
            Toast.makeText(SecondActivity.this, "Intent no esperado", Toast.LENGTH_LONG).show();
        }
    }
}