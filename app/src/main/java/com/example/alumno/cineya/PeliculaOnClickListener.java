package com.example.alumno.cineya;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

/**
 * Created by Nayla on 29/11/2017.
 */

class PeliculaOnClickListener implements View.OnClickListener {

    private Context context;
    private Pelicula pelicula;

    public PeliculaOnClickListener(Context context, Pelicula pelicula) {

        this.context = context;
        this.pelicula = pelicula;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, pelicula.getNombrePelicula(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(context, PeliculaBuscar.class);
        String cineSerializado = new Gson().toJson(pelicula);
        intent.putExtra("pelicula", cineSerializado);
        context.startActivity(intent);
    }
}
