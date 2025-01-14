package com.laura.screenmatch.modelos;

import com.laura.screenmatch.calculos.Classificable;

public class Pelicula extends Titulo implements Classificable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
