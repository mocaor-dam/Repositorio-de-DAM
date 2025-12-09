package Examenes;

import Exceptions.PeliculaException;

import java.util.Arrays;

public class Biblioteca {
    public final static int TAMAÑO=20;

    private Pelicula[] peliculas = new Pelicula[TAMAÑO];

    public void añadirPelicula(Pelicula pelicula) throws PeliculaException {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] == null) {
                peliculas[i] = pelicula;
                return;
            }
        }
    }
    public String buscarPeliculaPorEtiquetas() throws  PeliculaException {
        StringBuilder devolver = new StringBuilder();
        for (int i = 0; i < peliculas.length; i++) {
            String[] etiquetas = peliculas[i].getEtiquetas().split(",");
            for (int j = 0; j < etiquetas.length; j++) {
                if (etiquetas[j].equals(etiquetas)) {
                    devolver.append(peliculas[i].getTitulo());

                }
            }
        }
        if (devolver.toString().isEmpty()) {
            throw new PeliculaException("Pelicula no encontrada con esas etiquetas");
        }
        return devolver.toString();
    }

    public String buscarPeliculaPorTitulo(String titulo) throws PeliculaException {
        for (int i = 0; i < peliculas.length; i++) {
            if (titulo.equals(peliculas[i].getTitulo())) {
                return peliculas[i].getTitulo();
            }
        }
        throw new PeliculaException("Esa pelicula no esta en la biblioteca");
    }

    public String buscarPeliculaPorPresupuestoMaximo(double)

    @Override
    public String toString() {
        return "Biblioteca{" +
                "peliculas=" + Arrays.toString(peliculas) +
                '}';
    }
}
