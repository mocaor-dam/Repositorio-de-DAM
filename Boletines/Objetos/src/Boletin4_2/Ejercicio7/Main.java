package Boletin4_2.Ejercicio7;

import Exceptions.PartidoException;

public class Main {
    public static void main(String[] args) {
        // Crear equipos
        Equipo recre = new Equipo("Recreativo de Huelva", "Huelva", "Nuevo Colombino");
        Equipo barcelona = new Equipo("FC Barcelona", "Barcelona", "Camp Nou");
        Equipo sevilla = new Equipo("Sevilla FC", "Sevilla", "Sanchez Pizjuan");

        // 1. Crear primer partido e intentar poner resultado "2-1"
        try {
            Partido p1 = new Partido(recre, barcelona, 16);
            p1.ponerResultado("2-1");
            System.out.println("=== PARTIDO 1 ===");
            System.out.println(p1);
        } catch (PartidoException ex) {
            System.out.println("Error en primer partido: " + ex.getMessage());
        }

        // 2. Crear otros dos partidos con resultados "0-0" y "1-2" (con reintentos)
        Partido p2 = null;
        Partido p3 = null;
        boolean partidosCreados = false;

        do {
            try {
                p2 = new Partido(recre, sevilla, 25);
                p2.ponerResultado("0-0");

                p3 = new Partido(barcelona, recre, 30);
                p3.ponerResultado("1-2");

                partidosCreados = true;
                System.out.println("\n=== PARTIDOS 2 Y 3 CREADOS CORRECTAMENTE ===");
            } catch (Exception ex) {
                System.out.println("Error al crear partidos 2/3: " + ex.getMessage() + ". Reintentando...");
            }
        } while (!partidosCreados);

        // 3. Mostrar información de los partidos
        System.out.println("\n=== INFORMACIÓN DE PARTIDOS ===");
        if (p2 != null) System.out.println(p2);
        if (p3 != null) System.out.println(p3);

        // 4. Mostrar información de los equipos
        System.out.println("\n=== INFORMACIÓN DE EQUIPOS ===");
        System.out.println(recre);
        System.out.println(barcelona);
        System.out.println(sevilla);
    }
}
