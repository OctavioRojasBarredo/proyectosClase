package com.example.ejerciciojuguetes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Juguetes> juguetesList;
    public Adaptador(Context context, int layout, ArrayList<Juguetes> juguetesList){
        this.context = context;
        this.layout = layout;
        this.juguetesList = juguetesList;
    }

    @Override
    public int getCount() {
        return juguetesList.size();
    }

    @Override
    public Object getItem(int i) {
        return juguetesList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        ViewHolder holder;

        if (v==null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            v=layoutInflater.inflate(this.layout, null);

            holder=new ViewHolder();

            holder.nombre = v.findViewById(R.id.nombre);
            holder.cantidad = v.findViewById(R.id.cantidad);
            holder.tipo = v.findViewById(R.id.tipo);
            holder.imagen = v.findViewById(R.id.imagen);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        Juguetes juguete = juguetesList.get(i);
        holder.nombre.setText(juguete.getDescripcion());
        holder.cantidad.setText(String.valueOf(juguete.getCantidad()));
        holder.tipo.setText(juguete.getTipo());
        if (holder.tipo.getText().equals("Muñeco")){
            holder.imagen.setImageResource(R.drawable.ic_muneco_playstore);
        } else if (holder.tipo.getText().equals("Juego de mesa")){
            holder.imagen.setImageResource(R.drawable.ic_juego_mesa_playstore);
        }



        return v;
    }

    static class ViewHolder{
        private TextView nombre;
        private TextView tipo;
        private TextView cantidad;
        private ImageView imagen;
    }
}
