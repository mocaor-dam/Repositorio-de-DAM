package Boletin1;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(num1 + "*" + i + "=" + num1 * i);

        }

    }
}
