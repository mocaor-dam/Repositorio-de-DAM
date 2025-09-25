package Boletin1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Boletin1.Calculadora de suma y resta");
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese la operación (suma o resta): ");
        String operacion = scanner.next();

        int resultado;

        if (operacion.equalsIgnoreCase("suma")) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (operacion.equalsIgnoreCase("resta")) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else {
            System.out.println("Operación no válida.");
        }

        scanner.close();
    }
}