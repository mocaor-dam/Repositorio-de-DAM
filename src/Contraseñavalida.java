import java.sql.SQLOutput;
import java.util.Scanner;

public class Contraseñavalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caracter;
        do{
            System.out.println("Introduce una contraseña");
            String pass = sc.next();
            caracter = pass.length();
            if (caracter < 8 ){
                System.out.println("Contraseña mala");
            }

        }while (caracter < 8);
        System.out.println("Contraseña buena ");




    }
}