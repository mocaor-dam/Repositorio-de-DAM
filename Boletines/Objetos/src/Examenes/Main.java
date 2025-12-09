package Examenes;

import Exceptions.MiEntradaSalidaException;
import utils.MiEntradaSalida;

public class Main {
    public static void main(String[] args) {
        boolean peliculeando =  true;
        boolean opcionEscogida =  false;
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Bienvenido a el CINE\n");
        System.out.println("Aqui tienes lo que puedes hacer\n");
        System.out.println("\t1. Añadir pelicula\n");
        System.out.println("\t2. Consultar biblioteca\n");
        System.out.println("\t3. Buscar pelicula por etiquetas\n");
        System.out.println("\t4. Buscar pelicula por titulo\n");
        System.out.println("\t5. Buscar pelicula con presupuesto máximo\n");
        System.out.println("\t6. Salir\n");

        while (peliculeando){
            int opcion = 1;
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
                    biblioteca.añadirPelicula();
                  break;
                case 2:
                    System.out.println();

            }
        }
    }
    public static Pelicula crearPelicula(){
        boolean crearPelicula = true;
        while (!crearPelicula){
            String titulo = MiEntradaSalida.leerLinea("Introduce el titulo:\n");
            int año = MiEntradaSalida.leerEntero("Introduce el año:\n");
            String director = MiEntradaSalida.leerLinea("Introduce el director:\n");
            double presupuesto = MiEntradaSalida.leerDouble("Introduce el presupuesto:\n");
            double recaudacion = MiEntradaSalida.leerDouble("Introduce la recaudacion:\n");
            String sinopsis = MiEntradaSalida.leerLinea("Introduce el sinopsis:\n");
            String etiquetas = MiEntradaSalida.leerLinea("Introduce el etiquetas:\n");
        }
    }
}
