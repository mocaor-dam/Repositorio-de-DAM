import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las posiciones que tendra el array: ");
        int num = sc.nextInt();
        int posicion = 0;

        int[] lista = new int[num];
       //Busca el numero mayor y menor
        int mayor = lista[0];
        int menor = lista[0];
        double suma = 0;

        for (int i = 0; i < lista.length; i++) {
            posicion++;
            System.out.println("Introduzca el numero  " + posicion);
            lista[i] = sc.nextInt();
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
            if (lista[i] < menor) {
                menor = lista[i];
            }
            suma += lista[i];


        }
        double media = suma / num;

        int repMayor = 0;
        int repMenor = 0;
        for (int i = 0; i < num; i++) {
            if (lista[i] == mayor) {
                repMayor++;

            }
            if (lista[i] == menor) {
                repMenor++;

            }

        }
        System.out.println("El numero mas grande introducido es " + mayor);
        if (repMayor > 1) {
            System.out.println(" se repite " + repMayor + " veces");

        }
        System.out.println();

        System.out.println("El menor numero introducido es " + menor);
        if (repMenor > 1) {
            System.out.println(" se repite " + repMenor + " veces");
        }
        System.out.println();
        System.out.println("La media de los numeros introducidos es: " + media);
    }
}