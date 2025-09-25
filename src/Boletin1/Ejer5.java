package Boletin1;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero(negativo para terminar) ");
        int num = sc.nextInt();
        int total = 0;
        while (num > 0) {
            total++;
            System.out.println("Introduce un numero(negativo para terminar) ");
            num = sc.nextInt();
        }
        System.out.println("Has introducido " +total+ " de numeros positivos");

    }
}
