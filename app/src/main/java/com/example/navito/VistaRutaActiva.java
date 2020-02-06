package com.example.navito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class VistaRutaActiva extends AppCompatActivity {
    ListView lista;

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

        lista.setAdapter(new Adaptador(this,datos));
    }
}
