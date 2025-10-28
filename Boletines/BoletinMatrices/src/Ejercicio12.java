import java.util.Arrays;

public class Ejercicio12 {
    /**
     * Crea un metodo que transforme una matriz CUADRADA (tienes que realizar dicha
     * comprobación) que recibe por parámetro, en otra, que debe ser su reflejo en diagonal (de
     * arriba a la izquierda a abajo a la derecha):
     */
    static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizReflejada = reflejarMatriz(matriz);
        System.out.println("Matriz original:");
        MiEntradaSalida.imprimirMatriz(matriz);
        System.out.println("Matriz invertida");
        MiEntradaSalida.imprimirMatriz(matrizReflejada);



    }

    public static int[][] reflejarMatriz(int[][] matriz) {
        //Comprobamos que sea cuadrada
        if (matriz.length != matriz[0].length) {
            System.out.println("Error, la matriz no es cuadrada");
            return null;
        }
        int tamaño = matriz.length;
        int[][] reflejo = new int[tamaño][tamaño];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                reflejo[j][i] = matriz[i][j];


            }

        }
        return reflejo;

    }
}
