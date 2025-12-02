package Boletin4_3.ejercicio1;

public class Juego {
    private Carta[] baraja;
    private int posicionActual = 0;
    private static final String[] PALOS = {"Espadas", "Oros", "Copas", "Bastos"};
    private static final String[] NUMEROS = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

    public Juego() {
        crearBaraja();
    }

    private void crearBaraja() {
        baraja = new Carta[40];
        int index = 0;
        for (String palo : PALOS) {
            for (String numero : NUMEROS) {
                baraja[index++] = new Carta(palo, numero);
            }
        }
    }
}
