package com.example.alumno.cineya;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorPeliculaInfo extends BaseAdapter{

    //Constructor de la clase AdaptadorCine
    Context context;
    List<PeliculaInfo> peliculaInfoList;

    public AdaptadorPeliculaInfo(Context context, List<PeliculaInfo> peliculaInfoList){
        this.context = context;
        this.peliculaInfoList = peliculaInfoList;
    }


    @Override
    public int getCount() {
        return peliculaInfoList.size();
    }

    @Override
    public Object getItem(int i) {
        return peliculaInfoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return peliculaInfoList.get(i).getOpcionCine().hashCode();
    }

    //Método para asignar cada elemento del lista_cines a datosCine
    @Override
    public View getView(final int i, View peliculaInfoView, ViewGroup viewgroup){
        //LayoutInflater inflater = context.getLayoutInflater();
        //View item = inflater.inflate(R.layout.pelicula_info, parent, false);

        TextView OpcionCine = (TextView) peliculaInfoView.findViewById(R.id.opcionCine);
        TextView PeliculaCine = (TextView) peliculaInfoView.findViewById(R.id.peliculaCine);

        PeliculaInfo peliculaInfo = peliculaInfoList.get(i);

        OpcionCine.setText(peliculaInfoList.get(i).getOpcionCine());
        PeliculaCine.setText(peliculaInfoList.get(i).getPeliculaCine());

        peliculaInfoView.setOnClickListener(new PeliculaInfoOnClickListener(context, peliculaInfo));

        return peliculaInfoView;
    }



}
