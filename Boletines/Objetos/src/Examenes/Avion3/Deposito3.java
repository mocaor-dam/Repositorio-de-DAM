package Examenes.Avion3;

import Exceptions.AvionException;

public class Deposito3 {
    public final double CAPACIDAD_MAXIMA;
    private double cantidadActual;

    public Deposito3(double capacidadMaxima, double cantidadActual) throws AvionException {
        if (capacidadMaxima <= 0) {
            throw new AvionException("La Capacidad es invalida");
        }
        this.CAPACIDAD_MAXIMA = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) throws AvionException {
        if (cantidadActual > CAPACIDAD_MAXIMA) {
            throw new AvionException("Cantidad invalida");
        }
        if (cantidadActual < 0) {
            throw new AvionException("No puede ser negativo...");
        }
        this.cantidadActual = cantidadActual;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "Deposito3{" +
                "CAPACIDAD_MAXIMA=" + CAPACIDAD_MAXIMA +
                ", cantidadActual=" + cantidadActual +
                '}';
    }
}
