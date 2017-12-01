package com.example.alumno.cineya;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Nayla on 29/11/2017.
 */

interface PeliculaApi {

    @GET("peliculas")
    public Call<List<Pelicula>> getPeliculas();
}
