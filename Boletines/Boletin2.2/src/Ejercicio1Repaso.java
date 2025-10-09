import java.util.Scanner;

public class Ejercicio1Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros para sumarlos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de " +num1+ " y " +num2+ " es " + suma);
    }
}
