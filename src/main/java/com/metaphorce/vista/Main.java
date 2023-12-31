package com.metaphorce.vista;
import com.metaphorce.modelo.gestorPelicula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gestorPelicula miPelicula = new gestorPelicula("");
        Scanner lectura = new Scanner (System.in);

        System.out.println("Video Case");
        System.out.println("Selecciona una opción");
        System.out.println("1: Lista de películas");
        System.out.println("2: Peliculas disponibles");
        System.out.println("3: Peliculas no disponibles");
        System.out.println("4: Marcar peliculas como disponibles");
        System.out.println("5: Agregar película");
        System.out.println("6: Eliminar película");

        System.out.println("Ingresa tu opción");
        int opc = lectura.nextInt();


        switch (opc) {
            case 1:
                // Lista las películas.
                System.out.println("Lista de películas");
                miPelicula.obtenerPeliculas();
                break;
            case 2:
                // Lista solo las películas disponibles.
                System.out.println("2: Peliculas disponibles");
                miPelicula.obtenerPeliculasDisponibles();
                break;
            case 3:
               // Lista solo las películas no disponibles.
                System.out.println("3: Peliculas no disponibles");
                miPelicula.obtenerPeliculasNoDisponibles();
                break;
            case 4:
                // Cambia la película selecionada no disponible a disponible.
                System.out.println("4: Marcar peliculas como disponibles");
                miPelicula.obtenerPeliculasNoDisponibles();
                System.out.println("Seleccione el id de la pelicula a modificar su disponibilidad");
                String opcId = String.valueOf(lectura.nextInt());
                miPelicula.marcarPeliculaComoDisponibles(opcId);

                break;
            case 5:
                // Agrega una pelicula
                System.out.println("5: Agregar película");
                System.out.println("Nombre de la pelicula a agregar");
                Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
                String addNombre = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner

                System.out.println("1: Disponible");
                System.out.println("2: No disponible");
                String addDisponibilidad = String.valueOf(lectura.next());
                miPelicula.agregarPelicula(addNombre, addDisponibilidad);
                break;
            case 6:
                // Elimina la pelicula selecionada.
                System.out.println("6: Eliminar película");
                miPelicula.obtenerPeliculas();
                System.out.println("Seleccione el id de la pelicula a eliminar");
                String opcDel = String.valueOf(lectura.nextInt());
                miPelicula.eliminarPelicula(opcDel);
                break;
            default:
                break;
                // Default secuencia de sentencias.
        }

    }
}
