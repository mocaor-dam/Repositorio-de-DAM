package Examenes.Avion;

import Exceptions.AvionException;

import java.time.LocalDate;
import java.time.Period;

public class Avion {
    private static final int NUM_REVISIONES = 5;

    private String marca;
    private String modelo;
    private double consumo;
    private Deposito deposito;
    private double capacidadMaxima;
    private Revision[] revision;
    private int totalRevisiones = 0;


    public Avion(String marca, String modelo, double consumo, double capacidadMaxima, Deposito deposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.capacidadMaxima = capacidadMaxima;
        this.deposito = deposito;
        this.revision = new Revision[NUM_REVISIONES];
    }

    public int registrarRevision(Revision revision) throws AvionException {
        if (totalRevisiones >= revision.length) {
            throw new AvionException("Se ha alcanzado el maximo de revisiones");
        }
        revision[totalRevisiones] = revision;
        totalRevisiones++;
        return totalRevisiones;
    }

    public boolean estaListo() {
        try{
            Revision ultimaRevision = getUltimaRevision();
            return getUltimaRevision().isEstado() && !ultimaRevision.getFecha().plus(ultimaRevision.getValidez()).isBefore(LocalDate.now());
        } catch (AvionException e){
            return false;
        }

    }

    private Revision getUltimaRevision() throws AvionException {
        for (int i = revision.length -1; i >= 0; i--) {
            if (revision[i] != null) {
                return revision[i];
            }

        }
        throw new AvionException("No tiene revisiones");

    }

    public boolean puedeVolarPorDistancia(double distancia){
        double combustibleNecesario = this.consumo*distancia;
        if (combustibleNecesario <= deposito) {
         int ultimaRevision = totalRevisiones -1;
        }
    }
}
