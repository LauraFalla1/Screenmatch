package com.laura.screenmatch.calculos;


import com.laura.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
