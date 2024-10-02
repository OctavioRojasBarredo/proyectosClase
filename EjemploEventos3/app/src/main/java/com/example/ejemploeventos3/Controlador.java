package com.example.ejemploeventos3;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Controlador implements View.OnClickListener{
    private Context context;
    public Controlador(Context c) {
        this.context=c;
    }
    public void onClick(View view) {
        Toast.makeText(context, "Gang", Toast.LENGTH_LONG).show();
    }
}
