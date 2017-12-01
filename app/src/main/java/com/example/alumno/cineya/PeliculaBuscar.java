package com.example.alumno.cineya;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class PeliculaBuscar extends Activity {



    OutputStream outStream;

    /*private static Pelicula[]  datosPeliculas = new Pelicula[]{
            new Pelicula(R.drawable.titanic, "Titanic", "Drama"),
            new Pelicula(R.drawable.pulpfiction, "Pulp Fiction", "Suspenso"),
            new Pelicula(R.drawable.elpadrino, "El Padrino", "Drama/Policial")};*/

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE); //para sacar el titulo
        setContentView(R.layout.buscar_pelicula);
        //List<Pelicula> peliculaList = Arrays.asList();
        //AdaptadorPelicula adaptador = new AdaptadorPelicula(this, peliculaList);
        ListView ListaPeliculas = (ListView) findViewById(R.id.listaPeliculas);
        //ListaPeliculas.setAdapter(adaptador);



    }
}
