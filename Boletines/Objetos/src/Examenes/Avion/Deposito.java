package Examenes.Avion;

import Exceptions.AvionException;

public class Deposito {
    private final int CAPACIDAD_MAXIMA;
    private double cantidadActual;

    public Deposito(double cantidadActual, int capacidadMaxima) throws AvionException {
        if (capacidadMaxima <= 0) { throw new AvionException("Capacidad maxima debe ser positivo"); }
        this.cantidadActual = cantidadActual;
        this.CAPACIDAD_MAXIMA = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) throws AvionException {
        if (cantidadActual < 0){
            throw new AvionException("Cantidad debe ser positivo");
        }
        if (cantidadActual > CAPACIDAD_MAXIMA){
            throw new AvionException("Cantidad debe ser menor que la Maxima");
        }
        this.cantidadActual = cantidadActual;
    }

}
