package com.example.rodrigo.aboliviapresidentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalle extends AppCompatActivity {


    ImageView imagenDetalle;
    TextView nombre, descripcion;

    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detalle);

            getSupportActionBar().setTitle("Descripción");
            getSupportActionBar().hide();

            imagenDetalle =(ImageView)findViewById(R.id.imagen_detalle);
            nombre= (TextView)findViewById(R.id.texto_detalle);
            descripcion = (TextView) findViewById(R.id.descripcion_detalle);

            Bundle bundle = getIntent().getExtras();
            presidente aplicacion =(presidente) bundle.getSerializable("equipo");

            imagenDetalle.setImageResource(aplicacion.getImagen());
            nombre.setText(aplicacion.getNombre());
            descripcion.setText(aplicacion.getDescripcion());
        }
    }

