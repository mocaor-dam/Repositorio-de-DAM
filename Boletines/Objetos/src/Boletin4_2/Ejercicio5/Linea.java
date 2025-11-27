package Boletin4_2.Ejercicio5;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Linea {
     private Punto puntoA;
     private Punto puntoB;

     public Linea(){
         puntoA = new Punto(0,0);
         puntoB = new Punto(0,0);
     }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    

}
