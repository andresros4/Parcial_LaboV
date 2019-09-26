package com.example.alumno.parcial;

import android.util.Log;
import android.view.View;

import java.util.List;

/**
 * Created by alumno on 26/09/2019.
 */

public class MyListener implements View.OnClickListener {

    ActivityFormulario activityFormulario;

    public MyListener(ActivityFormulario activityFormulario){
        this.activityFormulario=activityFormulario;
    }

    @Override
    public void onClick(View v) {

        Log.d("Listener","Hizo click en editar" + MainActivity.productoSeleccionado);

        ProductoModel p = MainActivity.productos.get(MainActivity.productoSeleccionado);
        Log.d("Listener","Nombre producto" + p.getNombre().toString());
        p.setNombre(activityFormulario.etNombre.getText().toString());
        p.setCantidad(activityFormulario.etCantidad.getText().toString());
        p.setPrecio(activityFormulario.etPrecio.getText().toString());
        activityFormulario.finish();

    }
}
