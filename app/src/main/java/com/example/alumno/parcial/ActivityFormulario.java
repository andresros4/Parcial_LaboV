package com.example.alumno.parcial;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class ActivityFormulario extends AppCompatActivity {

    public Button btnEditar;
    public EditText etNombre;
    public EditText etPrecio;
    public EditText etCantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("Editar producto");

        this.etNombre = (EditText) findViewById(R.id.etNombre);
        this.etPrecio = (EditText) findViewById(R.id.etPrecio);
        this.etCantidad = (EditText) findViewById(R.id.etCantidad);

        this.btnEditar = (Button) findViewById(R.id.btnEditar);
        MyListener listener = new MyListener(this);
        this.btnEditar.setOnClickListener(listener);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){
        if(android.R.id.home == menuItem.getItemId()){
            super.finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }


}
