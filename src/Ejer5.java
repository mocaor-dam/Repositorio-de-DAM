import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero(negativo para terminar) ");
        int num = sc.nextInt();
        while (num > 0) {
            System.out.println("Introduce un numero(negativo para terminar) ");
            num = sc.nextInt();
        }

    }
}
