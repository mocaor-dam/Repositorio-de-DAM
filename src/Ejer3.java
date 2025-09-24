import java.util.Scanner;

public class Ejer3 {
    static void main(String[] args) {
        System.out.println("Introduce cuantos numeros vas a introducir: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        while (num1 <= 0) {
            System.out.println("Introduce otro numero mayor que 0: ");
        }
        for (int i = 0; i < num1; i++) {
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero " + numero + " es par");
            } else {
                System.out.println("El numero " + numero + " es impar");
            }

        }

    }


}
