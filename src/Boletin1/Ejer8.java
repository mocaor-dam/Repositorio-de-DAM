package Boletin1;

import java.util.Locale;
import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        int menor = num;
        while (continuar) {

            System.out.println("¿Desea introducir más numeros?(S/N)");
            String respuesta = sc.next().toUpperCase();

            if (respuesta.equalsIgnoreCase("S")) {
                System.out.println("Introduce un numero entonces");
                num = sc.nextInt();
                if (num < menor){
                    menor = num;
                }
            } else if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("Aqui termina");
                continuar =  false;
            }
            else{
                System.out.println("El caracter debe ser S/N");
            }

        }
        System.out.println("El numero menor de los introducidos es " + menor);

        sc.close();
    }
}
