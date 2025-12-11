package Examenes.Avion3;

import Exceptions.AvionException;

import java.time.LocalDate;
import java.time.Period;

public class MainAvion {
    public static void main(String[] args) {
        try {
            Deposito3 dep = new Deposito3(1000,800);
            Revision3 rev = new Revision3(LocalDate.now(), Period.ofYears(2));
            Avion3 avion = new Avion3("samsung", "1s12", 12, dep);
            avion.añadirRevision(rev);

            System.out.println("Puede volar? " + avion.puedeVolar(100));
        } catch (AvionException e) {
            System.out.println(e.getMessage());
        }
    }
}
