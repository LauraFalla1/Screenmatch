package com.laura.screenmatch.principal;

import com.laura.screenmatch.modelos.Pelicula;
import com.laura.screenmatch.modelos.Serie;
import com.laura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Bajo la misma estrella", 2010);
        pelicula1.evalua(9);
        Serie chicaIndiscreta = new Serie("Chica Indiscreta", 2001);
        Pelicula pelicula2 = new Pelicula("Sirenita", 2000);
        pelicula2.evalua(8);

        List<Titulo> lista = new ArrayList<>();
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(chicaIndiscreta);
        System.out.println(lista);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula ){
                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Andres Cepeda");
        listaDeArtistas.add("Morat");
        listaDeArtistas.add("Greicy");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println(listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada :" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Ordenada por fecha de Lanzamiento:" + lista);
    }
}
