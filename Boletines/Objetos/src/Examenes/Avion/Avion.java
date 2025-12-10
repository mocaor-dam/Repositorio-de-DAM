package Examenes.Avion;

import Exceptions.AvionException;

public class Avion {
    private String marca;
    private String modelo;
    private double consumo;
    private double deposito = 0;
    private double capacidadMaxima;
    Revision[] historialRevisiones = new Revision[10];
    private int totalRevisiones = 0;

    public Avion(String marca, String modelo, double consumo, double capacidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int registrarRevision(Revision revision) throws AvionException {
        if (totalRevisiones >= historialRevisiones.length) {
            throw new AvionException("Se ha alcanzado el maximo de revisiones");
        }
        historialRevisiones[totalRevisiones] = revision;
        totalRevisiones++;
        return totalRevisiones;
    }

    public boolean puedeVolarPorDistancia(double distancia){
        double combustibleNecesario = this.consumo*distancia;
        if (combustibleNecesario <= deposito) {

        }
    }
}
