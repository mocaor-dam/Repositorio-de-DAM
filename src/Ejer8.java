import java.util.Scanner;

public class Ejer8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int num = sc.nextInt();
        System.out.println("¿Desea introducir más numeros?(S/N)");
        int respuesta = 0;
        boolean continuar = true;
        while (respuesta) {
            System.out.println("Introduce un numero entonces");
            num = sc.nextInt();
        }
        if (respuesta = "N") {
            System.out.println("Aqui termina");
        }
    }
}
