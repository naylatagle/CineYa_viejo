package com.example.alumno.cineya;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;


public class DetailsCine extends Activity {

    /*private static CineInfo[]  datosCineInfo = new CineInfo[]{
            new CineInfo("Pelicula1", "18:00 | 22:20 | 00:10")};*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cine_details);

        Bundle extras = getIntent().getExtras();

        //titulo del cine
        String cineSerializado = getIntent().getExtras().getString("cine");
        Cine cine = new Gson().fromJson(cineSerializado, Cine.class);

        //datos de la listview
        String cineInfoSerializado = getIntent().getExtras().getString("cineInfo");
        CineInfo cineInfo = new Gson().fromJson(cineInfoSerializado, CineInfo.class);

        TextView titulo = (TextView) findViewById(R.id.nombre_cine);
        titulo.setText(cine.getNombreCine());

        TextView opcionP = (TextView) findViewById(R.id.opcionPelicula);
        opcionP.setText(cineInfo.getOpcionPelicula());
        TextView horarioP = (TextView) findViewById(R.id.horarioPelicula);
        opcionP.setText(cineInfo.getHorarioPelicula());

    }
}
