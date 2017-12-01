package com.example.alumno.cineya;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

/**
 * Created by Nayla on 29/11/2017.
 */

class CineInfoOnClickListener implements View.OnClickListener {

    private Context context;
    private CineInfo cineInfo;

    public CineInfoOnClickListener(Context context, CineInfo cineInfo) {
        this.context = context;
        this.cineInfo = cineInfo;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, cineInfo.getOpcionPelicula(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(context, DetailsCine.class);
        String cineInfoSerializado = new Gson().toJson(cineInfo);
        intent.putExtra("cineInfo", cineInfoSerializado);
        context.startActivity(intent);
    }
}
