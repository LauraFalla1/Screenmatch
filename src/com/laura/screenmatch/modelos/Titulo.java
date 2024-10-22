package com.laura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private int sumaEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(miTituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,2));
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {}

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la pelicula: " + nombre);
        System.out.println("\nFecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("\nDuración en Minutos: " + getDuracionEnMinutos());
    }

    public void evalua (double nota){
        sumaEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia (){
        return sumaEvaluaciones / totalDeLasEvaluaciones;
    }


    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre= '" + nombre + '\'' +
                ", fechaDeLanzamiento= " + fechaDeLanzamiento +
                ", duracion= "+duracionEnMinutos;
    }
}
