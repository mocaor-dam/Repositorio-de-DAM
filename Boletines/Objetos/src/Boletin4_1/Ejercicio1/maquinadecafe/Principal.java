package Boletin4_1.Ejercicio1.maquinadecafe;

import Exceptions.MaquinaDeCafeException;

import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el dinero inicial del monedero: ");
        double dineroInicial = sc.nextDouble();
        Maquina maquina = new Maquina(dineroInicial,50,50,100,50);

        boolean encendida = true;
        while (encendida) {
            System.out.println("\nMenú:");
            System.out.println("1. Servir café solo ("+Maquina.PRECIOCAFE+"€)");
            System.out.println("2. Servir leche ("+Maquina.PRECIOLECHE+"€)");
            System.out.println("3. Servir café con leche ("+ Maquina.PRECIOCAFECONLECHE+"€)");
            System.out.println("4. Consultar estado máquina");
            System.out.println("5. Apagar máquina y salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el dinero para café solo: ");
                    double dineroCafe = sc.nextDouble();
                    try {
                        System.out.println("Tu cambio es de " + maquina.servirCafeSolo(dineroCafe) + "€");
                    } catch (MaquinaDeCafeException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    System.out.println("Introduce el dinero de la Leche");
                    double dineroLeche = sc.nextDouble();
                    try {
                        System.out.println("Tu cambio es de " + maquina.servirLeche(dineroLeche) + "€");
                    } catch (MaquinaDeCafeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Introduce el dinero del Cafe con Leche");
                    double dineroCafeConLeche = sc.nextDouble();
                    try {
                        System.out.println("Tu cambio es de " + maquina.servirCafeConLeche(dineroCafeConLeche) + "€");
                    } catch (MaquinaDeCafeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Aqui tienes el estado de la maquina");
                    System.out.println(maquina.consultarEstadoMaquina());
                    break;
                case 5:
                    encendida = false;
            }
        }
    }


}
