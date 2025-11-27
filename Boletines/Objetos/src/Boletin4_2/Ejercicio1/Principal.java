package Boletin4_2.Ejercicio1;

import java.time.LocalDate;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Principal {
    static void main() {
        Persona persona = new Persona("Moises", LocalDate.of(2007,5,21),29622084, 'M', 1.75f, 70.0f);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("DNI completo: " + persona.getDni() + persona.getLetraDni());
        System.out.println("IMC: " + String.format("%.2f", persona.calcularIMC()));
        System.out.println("Edad: " + persona.calcularEdad() + " años");

        System.out.println("\n" + persona.toString());
    }
}
