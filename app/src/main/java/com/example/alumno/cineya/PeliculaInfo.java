package com.example.alumno.cineya;

public class PeliculaInfo {

    private String opcionCine;
    private String peliculaCine;

    /*public PeliculaInfo(String opCine, String pelCine){
        opcionCine = opCine;
        peliculaCine = pelCine;
    }*/

    public void setOpcionCine(String opcionCine) {
        this.opcionCine = opcionCine;
    }

    public String getOpcionCine(){
        return opcionCine;
    }

    public void setPeliculaCine(String peliculaCine) {
        this.peliculaCine = peliculaCine;
    }

    public String getPeliculaCine(){
        return peliculaCine;
    }
}
