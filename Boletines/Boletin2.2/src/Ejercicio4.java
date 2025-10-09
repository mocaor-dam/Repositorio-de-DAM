import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        int num;
        int num2;
        int num3;
        do {
            System.out.println("Introduce la hora");
            hora = sc.nextInt();
            System.out.println("Introduce los minutos");
            minutos = sc.nextInt();
            System.out.println("Introduce los segundos");
            segundos = sc.nextInt();
        } while (hora < 0 || hora > 23 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60);
        System.out.println("Tu hora actual es " + hora + ":" + minutos + ":" + segundos);

            System.out.println("¿Cuantas horas quieres sumar?");
            num = sc.nextInt();
            System.out.println("Cuantos minutos quieres sumar");
            num2 = sc.nextInt();
            System.out.println("Cuantos segundos quieres sumar");
            num3 = sc.nextInt();

            segundos += num3;
            minutos +


    }
}
