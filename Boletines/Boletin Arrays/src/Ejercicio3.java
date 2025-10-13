import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las posiciones que tendra el array: ");
        int num = sc.nextInt();
        int posicion = 0;
        int[] x = new [num];
        int mayor = numeros[0];
        int menor = numeros[0];
        double suma = 0;

        for (int i = 0; i < x.length; i++) {
            posicion++;
            System.out.println("Introduzca el numero  " + posicion);
            x[i] = sc.nextInt();
            if (x[i] > mayor) {
                mayor = x[i];
            }
            if (x[i] < menor) {
                menor = x[i];
            }
            suma += x[i];


        }
        double media = suma / num;

        int repMayor = 0;
        int repMenor = 0;
        for (int i = 0; i < num; i++) {
            if (x[i] == mayor){
                repMayor++;

        }
            if (x[i] == menor){
                repMenor++;

            }

        }
        System.out.println("El numero mas grande introducido es " + mayor);
        if (repMayor > 1) {
            System.out.println(" se repite " +repMayor+ " veces");

        }
        System.out.println();

        System.out.println("El menor numero introducido es " + menor);
        if (repMenor > 1){
            System.out.println(" se repite " +repMenor+ " veces");
        }
        System.out.println();
        System.out.println("La media de los numeros introducidos es: " + media);
    }
}