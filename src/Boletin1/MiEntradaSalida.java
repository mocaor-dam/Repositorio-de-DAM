package Boletin1;

import java.util.Scanner;

public class MiEntradaSalida {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero mostrando el mensaje pasado como parámetro
     *
     * @param mensaje El mensaje a mostrar
     * @return el entero leido por teclado
     */
    public static int leerEntero(String mensaje) {
        System.out.println("Introduce un numero: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int a;
        do {
            a = MiEntradaSalida.leerEntero("Introduce un numero: ");
            if (a <= 0) {
                System.out.println("El numero introducido es erroneo ");
            }
        } while (a < 0);
    }


}
