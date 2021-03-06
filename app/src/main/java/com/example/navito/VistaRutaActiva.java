package com.example.navito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class VistaRutaActiva extends AppCompatActivity {
    ListView lista,lista2;
    Button rutasproximas;
    String [][] datos = {
            {"Ruta 69","1RA. ETAPA U.H.","Centro"},
            {"Ruta 72","COL. MONTE ALBAN","Central de abastos"},
            {"Ruta 75","FRACC. EL ROSARIO","J.P. Garcia"},
            {"Ruta 23","FRACC. BENITO JUAREZ - MONUMENTO","Sta. Lucia"},
            {"Ruta 33","VIGUERA - 1RA. ETAPA","Centro"},
            {"Ruta 43","PANTEON JARDIN - ALAMOS INFONAVIT","Centro"}
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_ruta_activa);
        lista =(ListView)findViewById(R.id.listview1);
        //lista2=(ListView)findViewById(R.id.listview2);;
        lista.setAdapter(new Adaptador(this,datos));
        //lista2.setAdapter(new Adaptador(this,datos));

        rutasproximas=(Button)findViewById(R.id.idproximas);
        rutasproximas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rutasproximas= new Intent(VistaRutaActiva.this,vista_rutas_proximas.class);
                startActivity(rutasproximas);
            }
        });

    }
}
