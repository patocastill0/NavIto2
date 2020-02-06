package com.example.navito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
        Button segundapagina;
        Spinner spinner1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        segundapagina =(Button)findViewById(R.id.BTNrutaactiva);
        segundapagina.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent segundapagina= new Intent(MainActivity.this,VistaRutaActiva.class);
                startActivity(segundapagina);
            }
        });

        String[] letra = {"Acerca de","Informacion","Nosotros"};
        spinner1=(Spinner) findViewById(R.id.spinner);
        //spinner1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, letra));
        ArrayAdapter<String> adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,letra);
        spinner1.setAdapter(adapter);
    }
}
