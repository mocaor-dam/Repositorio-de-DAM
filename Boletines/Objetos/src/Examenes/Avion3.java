package Examenes;

import Exceptions.AvionException;

public class Avion3 {
    private String marca;
    private String modelo;
    private int consumo;
    private Deposito3 deposito;
    private Revision3[] revision;

    public Avion3(String marca, String modelo, int consumo, Deposito3 deposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.deposito = deposito;
        this.revision = new Revision3[5];
    }

    public int indiceUltimaRevision() throws AvionException {
        for (int i = revision.length - 1; i >= 0; i--) {
            if (revision[i] != null) {
                return i;
            }
        }
        throw new AvionException("No hay revisiones");
    }

    private boolean estaListo() {
        try {
            return revision[indiceUltimaRevision()].isEstado();
        } catch (AvionException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void añadirRevision(Revision3 r)throws AvionException{
        for (int i = 0; i < revision.length; i++) {
            if (revision[i] == null){
                revision[i] = r;
                return;
            }
        }
        throw new AvionException("Hay demasiadas revisiones");
    }


    public boolean puedeVolar(double distancia){
        if (!estaListo() || distancia * consumo > deposito.getCantidadActual() || distancia<0){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avion3{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", deposito=" + deposito +
                ", revision=" + estaListo() +
                '}';
    }
}

