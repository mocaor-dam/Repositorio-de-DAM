package Examenes.Pelicula;

import Exceptions.PeliculaException;

public class Biblioteca {
    public final static int TAMAÑO = 20;
    private Pelicula[] peliculas = new Pelicula[TAMAÑO];

    // Añadir película
    public void anadirPelicula(Pelicula p) throws PeliculaException {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] == null) { // Buscamos el primer hueco vacío
                peliculas[i] = p;
                return; // Ya la añadimos, nos salimos del metodo
            }
        }
        // Si termina el bucle y no encontró hueco, lanzamos error
        throw new PeliculaException("La biblioteca está llena, no caben más películas.");
    }

    // Consultar (Mostrar todas)
    public String consultarBiblioteca() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) { // IMPORTANTE: Solo mostrar las que existen
                sb.append(peliculas[i].toString()).append("\n");
            }
        }
        if (sb.isEmpty()) {
            return "La biblioteca está vacía.";

        }
        return sb.toString();
    }

    // Buscar por etiquetas
    public String buscarPorEtiquetas(String etiquetaBusqueda) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
                // contains devuelve true si la etiqueta está dentro del texto
                if (peliculas[i].getEtiquetas().contains(etiquetaBusqueda)) {
                    sb.append(peliculas[i].getTitulo()).append("\n");
                }
            }
        }
        return !sb.isEmpty() ? sb.toString() : "No se encontraron películas con esa etiqueta.";
    }

    // Buscar por título (Devuelve todos los datos)
    public String buscarPorTitulo(String titulo) {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null && peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return peliculas[i].toString();
            }
        }
        return "Película no encontrada.";
    }

    // Buscar por presupuesto máximo
    public String buscarPorPresupuesto(double presupuestoMax) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null && peliculas[i].getPresupuesto() <= presupuestoMax) {
                sb.append(peliculas[i].getTitulo()).append("\n");
            }
        }
        return !sb.isEmpty() ? sb.toString() : "No hay películas con ese presupuesto o menos.";
    }
}