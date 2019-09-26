package com.example.alumno.parcial;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 26/09/2019.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvNombre;
    private TextView tvPrecio;
    private TextView tvCantidad;
    private Button btnEditar;
    private int posicion;
    MainActivity mainActivity;

    public MyViewHolder(View itemView , MainActivity mainActivity , ActivityFormulario activityFormulario) {
        super(itemView);
        this.tvNombre = (TextView) itemView.findViewById(R.id.tvNombre);
        this.tvPrecio = (TextView) itemView.findViewById(R.id.tvPrecio);
        this.tvCantidad = (TextView) itemView.findViewById(R.id.tvCantidad);
        this.mainActivity = mainActivity;


        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.mainActivity.mostrarFormulario(this.posicion);

    }

    public TextView getTvNombre() {
        return tvNombre;
    }

    public void setTvNombre(TextView tvNombre) {
        this.tvNombre = tvNombre;
    }

    public TextView getTvPrecio() {
        return tvPrecio;
    }

    public void setTvPrecio(TextView tvPrecio) {
        this.tvPrecio = tvPrecio;
    }

    public TextView getTvCantidad() {
        return tvCantidad;
    }

    public void setTvCantidad(TextView tvCantidad) {
        this.tvCantidad = tvCantidad;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
