import java.util.Scanner;

public class Repaso {
    final static String[][] LABERINTO = {
            {" ", "x", "x", "x", "x", "x", "x", "x"},
            {" ", " ", " ", "x", "x", "x", "x", "x"},
            {"x", "x", " ", " ", "x", "x", "x", "x"},
            {"x", "x", "x", " ", " ", "x", "x", "x"},
            {"x", "x", "x", " ", "x", "x", "x", "x"},
            {"x", "x", "x", " ", "x", "x", "x", "x"},
            {"x", "x", "x", " ", " ", " ", " ", "x"},
            {"x", "x", "x", "x", "x", "x", " ", "x"},
    };

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiEntradaSalida2.imprimirMatrizString(LABERINTO);
        boolean jugando = true;
        String comando = sc.next().toLowerCase();
        while (jugando) {
            switch (comando) {
                case "arriba":
                    moverArriba();
                    break;
            }


        }

    }

    public static void imprimirMatrizString(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }

    public static void moverArriba() {
        for (int i = 0; i < LABERINTO.length; i++) {
            for (int j = 0; j < LABERINTO[i].length; j++) {
                if (LABERINTO[i + 1][j + 1] == "") {
                    System.out.println("Te mueves");

                }

            }

        }

    }
}
