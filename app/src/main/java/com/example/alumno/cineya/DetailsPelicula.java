package com.example.alumno.cineya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class DetailsPelicula extends AppCompatActivity {

    /*private static PeliculaInfo[]  datosPeliculaInfo = new PeliculaInfo[]{
            new PeliculaInfo("Cine1", "18:00 | 22:20 | 00:10")};*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pelicula_details);

        Bundle extras = getIntent().getExtras();

        //titulo peli
        String peliculaSerializada = getIntent().getExtras().getString("pelicula");
        Pelicula pelicula = new Gson().fromJson(peliculaSerializada, Pelicula.class);

        //datos listview
        String peliculaInfoSerializada = getIntent().getExtras().getString("peliculaInfo");
        PeliculaInfo peliculaInfo = new Gson().fromJson(peliculaInfoSerializada, PeliculaInfo.class);

        TextView titulo = (TextView) findViewById(R.id.nombre_pelicula);
        titulo.setText(pelicula.getNombrePelicula());

        TextView opcionC = (TextView) findViewById(R.id.opcionCine);
        opcionC.setText(peliculaInfo.getOpcionCine());
        TextView peliculaC = (TextView) findViewById(R.id.peliculaCine);
        peliculaC.setText(peliculaInfo.getPeliculaCine());

        /*List<PeliculaInfo> peliculaInfoList = Arrays.asList(datosPeliculaInfo);
        AdaptadorPeliculaInfo adaptador = new AdaptadorPeliculaInfo(this, peliculaInfoList);
        ListView listaPeliculaInfo = (ListView) findViewById(R.id.listaPeliculaInfo);
        listaPeliculaInfo.setAdapter(adaptador);*/
    }
}
