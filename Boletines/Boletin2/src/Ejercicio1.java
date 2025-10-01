import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        System.out.println("Introduce tu primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce tu segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce tu tercer numero");
        int num3 = sc.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.printf("El orden es "+num1+ " > " +num2+ " > " +num3);

        }
        else if (num1<num2 && num1 > num3){
            System.out.println("El orden es " +num2+ " > " +num3+ " > "+ num1);
        }
        else if (num1>num2 && num2<num3){
            System.out.printf("El orden es "  +num1+ " > " +num3+ " > "+ num2);

        }

    }
}
