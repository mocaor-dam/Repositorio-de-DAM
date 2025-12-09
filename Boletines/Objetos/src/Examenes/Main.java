package Examenes;

import Exceptions.MiEntradaSalidaException;
import Exceptions.PeliculaException;
import utils.MiEntradaSalida;

public class Main {
    public static void main(String[] args) throws PeliculaException {
        boolean peliculeando =  true;
        boolean opcionEscogida =  false;
        Biblioteca biblioteca = new Biblioteca();



        while (peliculeando){
            int opcion = 1;
            System.out.println("Bienvenido a el CINE\n");
            System.out.println("Aqui tienes lo que puedes hacer\n");
            System.out.println("\t1. Añadir pelicula\n");
            System.out.println("\t2. Consultar biblioteca\n");
            System.out.println("\t3. Buscar pelicula por etiquetas\n");
            System.out.println("\t4. Buscar pelicula por titulo\n");
            System.out.println("\t5. Buscar pelicula con presupuesto máximo\n");
            System.out.println("\t6. Salir\n");
            while(!opcionEscogida){
                try {
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
                    break;
                case 2:
                    System.out.println(biblioteca.mostrarTodas());
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

}
