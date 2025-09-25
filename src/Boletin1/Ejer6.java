package Boletin1;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu primer numero: ");
        int numA = sc.nextInt();
        System.out.println("Introduce tu segundo numero: ");
        int numB = sc.nextInt();

        int total = 0;
        for (int i = 0; i < numB ; i++) {
            total += numA;

        }
        System.out.println("El resultado es " + total);

    }
}
