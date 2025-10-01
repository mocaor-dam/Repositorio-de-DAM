import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponiente;
       do {
        System.out.println("Introduce dos numeros");
        base = sc.nextInt();
        exponiente = sc.nextInt();
       } while (base < 0 || exponiente < 0);
        int multiplicacion = 1;
       for (int i = 0; i < exponiente ; i++) {

            multiplicacion *= base;

        }
        System.out.println("El resultado de " + base + " elevado a " + exponiente+ " es " + multiplicacion);
    }

}
