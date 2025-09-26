package Boletin1;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres introducir ");
        int num = sc.nextInt();
        System.out.println("Introduce " +num+ " numeros");
        double suma = 0;

        for (int i = 1; i < num + 1; i++) {
            System.out.println("Introduce el " +i+ " numero:");
            int num1 = sc.nextInt();
            suma += num1;
        }
       double media = suma / num;
        System.out.println("La media de los numeros es " +media);
    }
}
