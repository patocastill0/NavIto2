package com.example.navito;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    //Es para instanciar el archivo xml de la lista
    private static LayoutInflater inflater=null;
    Context contexto;
    String[][] datos;

    public Adaptador (Context conexto,String [][] datos ){
            this.contexto=conexto;
            this.datos=datos;
            inflater= (LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_lista_rutactiva,null);

        TextView ruta = (TextView)vista.findViewById(R.id.id_ruta);
        TextView destino= (TextView)vista.findViewById(R.id.id_destino);
        TextView calle = (TextView)vista.findViewById(R.id.id_calle);

        ruta.setText(datos[i][0]);
        destino.setText(datos[i][1]);
        calle.setText(datos[i][2]);
        return vista;
    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
