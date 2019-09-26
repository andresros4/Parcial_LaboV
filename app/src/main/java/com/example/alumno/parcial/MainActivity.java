package com.example.alumno.parcial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    static List<ProductoModel> productos;
    MyAdapter myAdapter ;
    ActivityFormulario activityFormulario;
    static int productoSeleccionado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productos = new ArrayList<ProductoModel>();
        for(int i = 0 ; i<12 ; i++){
            productos.add(new ProductoModel("Producto"+i, "Precio:"+((i+1)*1.5) , "Cantidad:"+i*2));
        }
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvProductos);
        myAdapter = new MyAdapter(this.productos , this , activityFormulario);
        rv.setAdapter(myAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    public void mostrarFormulario(int posicion){
        productoSeleccionado=posicion;
        Intent i = new Intent(this, ActivityFormulario.class);
        startActivity(i);
    }



    @Override
    protected void onResume() {
        myAdapter.notifyDataSetChanged();
        super.onResume();
    }
}
