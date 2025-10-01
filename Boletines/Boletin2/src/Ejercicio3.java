import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = sc.nextInt();
        int cifras = 0;
        int n = num;
        do {
            num /= 10;
            cifras++;

        } while (Math.abs(num)>0);
        System.out.println("El numero " +n+ " tiene " +cifras);
    }
}
