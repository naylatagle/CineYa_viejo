package com.example.alumno.cineya;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

/**
 * Created by Nayla on 29/11/2017.
 */

class PeliculaInfoOnClickListener implements View.OnClickListener {

    private Context context;
    private PeliculaInfo peliculaInfo;

    public PeliculaInfoOnClickListener(Context context, PeliculaInfo peliculaInfo) {
        this.context = context;
        this.peliculaInfo = peliculaInfo;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, peliculaInfo.getOpcionCine(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(context, DetailsPelicula.class);
        String peliculaInfoSerializada = new Gson().toJson(peliculaInfo);
        intent.putExtra("peliculaInfo", peliculaInfoSerializada);
        context.startActivity(intent);
    }
}
