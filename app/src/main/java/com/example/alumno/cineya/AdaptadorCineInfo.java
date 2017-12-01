package com.example.alumno.cineya;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdaptadorCineInfo extends BaseAdapter {

    //Constructor de la clase AdaptadorCine
    private Context context;
    List<CineInfo> cineInfoList;

    public AdaptadorCineInfo(Context context, List<CineInfo> cineInfoList){
        this.context = context;
        this.cineInfoList = cineInfoList;
    }


    @Override
    public int getCount() {
        return cineInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return cineInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return cineInfoList.get(position).getOpcionPelicula().hashCode();
    }

    //Método para asignar cada elemento del lista_cines a datosCine
    @Override
    public View getView(final int i, View cineInfoView, ViewGroup viewgroup){
        cineInfoView = LayoutInflater.from(context).inflate(R.layout.cine_info, viewgroup, false);
        //LayoutInflater inflater = context.getLayoutInflater();
        //View item = inflater.inflate(R.layout.cine_info, viewgroup, false);

        TextView OpcionPelicula = (TextView) cineInfoView.findViewById(R.id.opcionPelicula);

        TextView HorarioPelicula = (TextView) cineInfoView.findViewById(R.id.horarioPelicula);

        CineInfo cineInfo = cineInfoList.get(i);

        OpcionPelicula.setText(cineInfoList.get(i).getOpcionPelicula());

        HorarioPelicula.setText(cineInfoList.get(i).getHorarioPelicula());

        cineInfoView.setOnClickListener(new CineInfoOnClickListener(context, cineInfo));

        return cineInfoView;
    }



}
