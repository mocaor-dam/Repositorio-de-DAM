import java.util.Scanner;

public class Ejer9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textoDivisores = "";
        int num;
        do {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        } while (num <= 0);
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
                if (textoDivisores.isEmpty()) {
                    textoDivisores = textoDivisores + i;
                } else {
                    textoDivisores = textoDivisores + "+" + i;
                }
            }
        }
        if (suma == num) {
            System.out.println("El numero " + num + " es perfecto :D, porque es igual que " + textoDivisores + "=" + num);

        } else {
            System.out.println("El numero " + num + " no es perfecto :(, ya que " + textoDivisores + "=" + suma);
        }


    }
}
