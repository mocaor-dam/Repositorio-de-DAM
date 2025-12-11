package Examenes.Pelicula;

import Exceptions.MiEntradaSalidaException;
import Exceptions.PeliculaException;
import utils.MiEntradaSalida;

public class Main {
    public static void main(String[] args) throws PeliculaException {
        boolean peliculeando =  true;
        boolean opcionEscogida =  false;
        Biblioteca biblioteca = new Biblioteca();



        while (peliculeando){
            System.out.println("Bienvenido a el CINE\n");
            int opcion = 1;
            while(!opcionEscogida){
                try {
                    System.out.println("Aqui tienes lo que puedes hacer\n");
                    System.out.println("\t1. Añadir pelicula");
                    System.out.println("\t2. Consultar biblioteca");
                    System.out.println("\t3. Buscar pelicula por etiquetas");
                    System.out.println("\t4. Buscar pelicula por titulo");
                    System.out.println("\t5. Buscar pelicula con presupuesto máximo");
                    System.out.println("\t6. Salir");
                    opcion = MiEntradaSalida.leerEnteroRango("Introduce que quieres hacer (1-6)",1,6);
                    opcionEscogida = true;
                } catch (MiEntradaSalidaException e) {
                    System.out.println(e.getMessage());

                }
            }
            switch (opcion){
                case 1:
                    Pelicula nuevaPelicula = crearPelicula(); // Creamos el objeto
                    biblioteca.anadirPelicula(nuevaPelicula); // Lo guardamos
                    System.out.println("¡Película añadida con éxito!");

                    try {
                        biblioteca.anadirPelicula(nuevaPelicula);
                    } catch (PeliculaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println(biblioteca.consultarBiblioteca());
                    break;
                case 3:
                    String etiqueta = MiEntradaSalida.leerLinea("Introduce la etiqueta a buscar:");
                    System.out.println(biblioteca.buscarPorEtiquetas(etiqueta));
                    break;
                case 4:
                    String titulo = MiEntradaSalida.leerLinea("Introduce el titulo:\n");
                    System.out.println(biblioteca.buscarPorTitulo(titulo));
                    break;
                case 5:
                    double presupuesto = MiEntradaSalida.leerDouble("Introduce el presupuesto:\n");
                    System.out.println(biblioteca.buscarPorPresupuesto(presupuesto));
                    break;
                case 6:
                    peliculeando = false;
                    System.out.println("Hasta luego!");
                    break;
            }
        }
    }
    public static Pelicula crearPelicula() {
        System.out.println("--- Nueva Película ---");
        String titulo = MiEntradaSalida.leerLinea("Introduce el título:");
        int año = MiEntradaSalida.leerEntero("Introduce el año:");
        String director = MiEntradaSalida.leerLinea("Introduce el director:");
        double presupuesto = MiEntradaSalida.leerDouble("Introduce el presupuesto:");
        double recaudacion = MiEntradaSalida.leerDouble("Introduce la recaudación:");
        String sinopsis = MiEntradaSalida.leerLinea("Introduce la sinopsis:");
        String etiquetas = MiEntradaSalida.leerLinea("Introduce etiquetas:");

        return new Pelicula(titulo, año, director, presupuesto, recaudacion, sinopsis, etiquetas);
    }
}


