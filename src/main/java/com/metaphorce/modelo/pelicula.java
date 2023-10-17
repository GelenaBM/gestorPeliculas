package com.metaphorce.modelo;

public class pelicula {
    public int id;
    private String nombre;
    private Boolean disponible;

    //Constructor
    public pelicula(String nombre){
        this.nombre = nombre;
    }

    public pelicula(int id, String nombre, Boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.disponible  = disponible;
    }

    //Encapsulamiento get y set
    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public Boolean getDisponible(){
        return this.disponible;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setId(String nombre){
        this.nombre = nombre;
    }

    public void setId(Boolean disponible){
        this.disponible = disponible;
    }
}
