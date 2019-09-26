package com.example.alumno.parcial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    List<ProductoModel> productos;
    MainActivity mainActivity;
    ActivityFormulario activityFormulario;

    public MyAdapter(List<ProductoModel> prod, MainActivity mainActivity , ActivityFormulario activityFormulario){
        this.productos=prod;
        this.mainActivity = mainActivity;
        this.activityFormulario=activityFormulario;
    }

   @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item , parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(v,this.mainActivity , activityFormulario);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ProductoModel p = productos.get(position);
        holder.getTvNombre().setText(p.getNombre().toString());
        holder.getTvPrecio().setText(p.getPrecio().toString());
        holder.getTvCantidad().setText(p.getCantidad().toString());
        MainActivity.productoSeleccionado = p.getId();
        holder.setPosicion(position);

    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }
}
