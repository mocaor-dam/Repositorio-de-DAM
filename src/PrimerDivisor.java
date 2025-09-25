import java.util.Scanner;

public class PrimerDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int num = sc.nextInt();
        int comprobar = 2;
        while (comprobar <= num / 2 && num % comprobar != 0) {
            comprobar++;
        }
        if (num % comprobar == 0) {
            System.out.println("El primer divisor de " + num + " es " + comprobar);

        } else
            System.out.println("El numero %d es primo".formatted(num));
    }

}