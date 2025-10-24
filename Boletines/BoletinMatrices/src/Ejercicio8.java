public class Ejercicio8 {
    /**
     * Crea un metodo que reciba dos matrices, que deben ser de igual tamaño, y sume el
     * contenido de las posiciones en una tercera matriz, que será la que devuelva:
     */
    static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Aqui la matriz 1");
        MiEntradaSalida.imprimirMatriz(matriz1);
        System.out.println("Aqui la matriz 2");
        MiEntradaSalida.imprimirMatriz(matriz2);
        System.out.println("La suma es: ");
        MiEntradaSalida.imprimirMatriz(sumaDeMatrices(matriz1,matriz2));

    }

    public static int[][] sumaDeMatrices(int[][] matriz1, int[][] matriz2) {
        int [][] suma = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];

            }

        }
        return suma;
    }
}
