package com.example.alumno.cineya;

public class CineInfo {

    private String opcionPelicula;
    private String horarioPelicula;

    /*public CineInfo(String opPel, String horPel){
        opcionPelicula = opPel;
        horarioPelicula = horPel;
    }*/

    public String getOpcionPelicula(){
        return opcionPelicula;
    }

    public void setOpcionPelicula(String opcionPelicula) {
        this.opcionPelicula = opcionPelicula;
    }

    public String getHorarioPelicula(){
        return horarioPelicula;
    }

    public void setHorarioPelicula(String horarioPelicula) {
        this.horarioPelicula = horarioPelicula;
    }
}
