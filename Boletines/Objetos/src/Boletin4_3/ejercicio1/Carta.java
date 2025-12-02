package Boletin4_3.ejercicio1;

public class Carta {
    private String palo;
    private String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
