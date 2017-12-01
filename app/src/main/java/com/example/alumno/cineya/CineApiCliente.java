package com.example.alumno.cineya;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nayla on 29/11/2017.
 */

public class CineApiCliente {

    private static Context context;
    private static CineApi cliente;

    public static void init(Context con){
        context = con;
    }

    private static CineApi getClient(){
        if(cliente == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.myjson.com/bins/19w0nv")
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .build();
            cliente = retrofit.create(CineApi.class);
        }
        return cliente;
    }

    public static void getCines(final OnSuccessCallback callback){
        getClient().getCines().enqueue(new Callback<List<Cine>>() {
            @Override
            public void onResponse(Call<List<Cine>> call, Response<List<Cine>> response) {
                callback.execute(response.body());
            }

            @Override
            public void onFailure(Call<List<Cine>> call, Throwable throwable) {
                Toast.makeText(context, "Fallo en la conexión con el servidor", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Cierre del programa (App)
                        System.exit(0);
                    }
                }, 2000); //Especifico un delay de 2 segundos ( 2000 milisegundos )
            }
        });
    }
}
