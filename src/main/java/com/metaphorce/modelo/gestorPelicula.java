package com.metaphorce.modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class gestorPelicula extends pelicula {
    //Lista

    List<List<String>> list = new ArrayList<List<String>>();

    public void listaPeliculas(){
        for(int i = 0; i <= 2; i++){
            list.add(new ArrayList<String>());
        }
        list.get(0).add("1");
        list.get(1).add("Entrevista con el vampiro");
        list.get(2).add(String.valueOf(true));

        list.get(0).add("2");
        list.get(1).add("Lilo y Stich");
        list.get(2).add(String.valueOf(true));


        list.get(0).add("3");
        list.get(1).add("La Falla de San Andres");
        list.get(2).add(String.valueOf(false));

        list.get(0).add("4");
        list.get(1).add("El Conjuro");
        list.get(2).add(String.valueOf(false));

        list.get(0).add("5");
        list.get(1).add("La Noche del Demonio");
        list.get(2).add(String.valueOf(true));



    }

    public gestorPelicula(int id, String nombre, Boolean disponible) {
        super(id, nombre, disponible);
    }
    public gestorPelicula(String nombre) {
        super(nombre);
    }


    public void obtenerPeliculas(){
        listaPeliculas();
        for (int i = 0; i <= list.get(0).size() - 1; i++) {
            String disponibilidad = "No disponible";
            if(list.get(2).get(i).equals(String.valueOf(true))) disponibilidad = "Disponible";

            System.out.println(
                    "Id: " + list.get(0).get(i) +
                            " Nombre: " + list.get(1).get(i) +
                            " - " + disponibilidad
            );
        }
    }
    public void obtenerPeliculasDisponibles(){
        listaPeliculas();
        for (int i = 0; i <= list.get(0).size() - 1; i++) {
            String disponibilidad = "No disponible";
            if(list.get(2).get(i).equals(String.valueOf(true))){
                System.out.println(
                        "Id: " + list.get(0).get(i) +
                                " Nombre: " + list.get(1).get(i)
                );
            }
        }
    }
    public void obtenerPeliculasNoDisponibles(){
        listaPeliculas();
        for (int i = 0; i <= list.get(0).size() - 1; i++) {
            String disponibilidad = "No disponible";
            if(list.get(2).get(i).equals(String.valueOf(false))){
                System.out.println(
                        "Id: " + list.get(0).get(i) +
                                " Nombre: " + list.get(1).get(i)
                );
            }
        }
    }
    public void agregarPelicula(String addNombre, String addDisponibilidad){
        listaPeliculas();
        int sizeId = list.get(0).size()+1;
        System.out.println("agregarPelicula "+ sizeId);

        list.get(0).add( String.valueOf(sizeId));
        list.get(1).add( addNombre );
        if(Objects.equals(addDisponibilidad, "1")) {
            list.get(2).add(String.valueOf(true));
        }else {
            list.get(2).add(String.valueOf(false));
        }
        listaActualizada();

    }
    public void eliminarPelicula(String id){
        int posicion = Integer.parseInt(String.valueOf(list.get(0).indexOf(id)));
        list.get(0).remove(posicion);
        list.get(1).remove(posicion);
        list.get(2).remove(posicion);


        listaActualizada();

    }

    public void marcarPeliculaComoDisponibles(String id) {
        int posicion = Integer.parseInt(String.valueOf(list.get(0).indexOf(id)));
        list.get(2).set(posicion, String.valueOf(true));
        System.out.println(
                "Id: " + list.get(0).get(posicion) + " Nombre: " + list.get(1).get(posicion)+ " Disponibilidad: " + list.get(2).get(posicion)
                );

        listaActualizada();
    }

    public void listaActualizada(){

        for (int i = 0; i <= list.get(0).size() - 1; i++) {
            String disponibilidad = "No disponible";
            if(list.get(2).get(i).equals(String.valueOf(true))) disponibilidad = "Disponible";


            System.out.println(
                    "Id: " + list.get(0).get(i) +
                            " Nombre: " + list.get(1).get(i) +
                            " - " + disponibilidad
            );
        }
    }
}
