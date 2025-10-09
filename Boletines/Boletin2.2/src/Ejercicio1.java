import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int invertido = 0;
        while (num > 0) {
            int digito = num % 10;
            invertido = (invertido * 10) + digito;
            num = num / 10;
        }
        System.out.println("El numero al reves es " + invertido);


    }

}
