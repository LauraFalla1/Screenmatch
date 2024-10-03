package com.laura.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra (Classificable classificable){
        if (classificable.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (classificable.getClasificacion() >= 2) {
            System.out.println("popular en el momento");
        }else {
            System.out.println("Colocálo en tu lista para verlo después");
        }

    }
}
