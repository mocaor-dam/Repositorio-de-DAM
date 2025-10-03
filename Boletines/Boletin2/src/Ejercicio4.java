import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    private static final int MAX_INTENTOS = 5;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int intentos = 0;
        int aleatorio = (int) ((Math.random() * 100) + 1);
        boolean acertado = false;
        while (intentos < MAX_INTENTOS && !acertado) {
            System.out.println("Introduce un numero entre 1 y 100: ");
            int num = sc.nextInt();
            if (num > 100 || num < 1) {
                System.out.println("El numero es invalido");
            } else {
                if (aleatorio < num) {
                    System.out.println("El numero " + num + " es mayor que el mio");

                } else if (aleatorio > num) {
                    System.out.println("El numero " + num + " es menor que el mio");
                }else if (acertado = true){

                    System.out.println("Has acertado");

                } else{
                    System.out.println("Has agotado tus 5 intentos");
                }

                intentos++;


            }
        }


    }
}


