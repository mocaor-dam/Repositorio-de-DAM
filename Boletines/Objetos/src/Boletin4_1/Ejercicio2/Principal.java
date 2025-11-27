package Boletin4_1.Ejercicio2;

import Exceptions.CuentaException;
import utils.MiEntradaSalidaBermudo;

public class Principal {
    public static void main(String[] args) {
        Cuenta c = null;
        while (c == null) {
            try {
                double saldoInicial = MiEntradaSalidaBermudo.solicitarEnteroPositivo("Introduce el saldo inicial");
                c = new Cuenta(saldoInicial);
            } catch (CuentaException e) {
                System.out.println(e.getMessage());
            }
        }

        int opcion;

        do {
            mostarMenu();

            opcion = MiEntradaSalidaBermudo.solicitarEnteroEnRango("Escribe una opción: ", 0, 3);

            switch (opcion) {
                case 1:
                    int dineroARetirar = MiEntradaSalidaBermudo.solicitarEnteroPositivo("¿Cuánto dinero desea retirar?");
                    try {
                        c.reintegro(dineroARetirar);
                        System.out.printf("Su saldo actual es de %.2f%n", c.getSaldo());
                    } catch (CuentaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Gracias por utilizar este cajero. Adiós.");

                break;
                case 2:
                    int dineroAIngresar = MiEntradaSalidaBermudo.solicitarEnteroPositivo("¿Cuánto dinero desea ingresar?");
                    try {
                        c.ingreso(dineroAIngresar);
                        System.out.printf("Su saldo actual es de %.2f%n", c.getSaldo());
                    }catch (CuentaException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    c.consulta();
            }
        } while (opcion != 0);
    }

    public static void mostarMenu() {
        System.out.println("¿Qué desea hacer?");
        System.out.println("0. Salir");
        System.out.println("1. Retirar");
        System.out.println("2. Ingresar");
        System.out.println("3. Consulta");
    }
}