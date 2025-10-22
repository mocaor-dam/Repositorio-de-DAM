import java.util.Arrays;

public class Ejercicio1 {
    /**
     * Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
     * valor booleano.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] matriz = {{1, -3, 5}, {-2, -1, 3}};
        if (comprobarNegativoEnMatrices(matriz))
            System.out.println("Hay valores negativos en la matriz " + Arrays.deepToString(matriz));

        else {
            System.out.println("No hay valores negativos en la matriz");
        }
    }

    public static boolean comprobarNegativoEnMatrices(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < 0) {
                    return true;
                }
            }

        }
        return false;
    }

}
