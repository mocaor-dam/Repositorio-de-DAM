import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero<=1){
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero/2 && esPrimo ; i++) {
                if (numero % i == 0) {
                    esPrimo = false;

                }

            }
        }
        if (esPrimo){
            System.out.println("El numero " +numero+ " es primo");

        } else {
            System.out.println("El numero " +numero+ " no es primo");
        }
    }
}
