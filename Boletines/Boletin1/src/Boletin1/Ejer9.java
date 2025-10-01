import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";
        int num;
        do {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        } while (num <= 0);
        int suma = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                suma += i;
                if (texto.isEmpty()) {
                    texto = texto + i;
                } else {
                    texto = texto + "+" + i;
                }
            }
        }
        if (suma == num) {
            System.out.println("El numero " + num + " es perfecto :D, porque es igual que " + texto + "=" + num);

        } else {
            System.out.println("El numero " + num + " no es perfecto :(, ya que " + texto + "=" + suma);
        }


    }
}
