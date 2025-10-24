public class Ejercicio9 {
    /**
     * Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
     * función del eje X. Es decir, la matriz
     * 1 3 5 6
     * 4 2 0 8
     * 4 2 0 8
     * 1 3 5 6
     * es simétrica en función de su eje X, porque si invirtiésemos el orden en el que leemos las
     * filas, la matriz se vería igual.
     * Pero la matriz
     * 1 4 6
     * 2 1 3
     * no es simétrica, pues no cumple dicha propiedad.
     */
    static void main(String[] args) {
        int[][] matriz = {{1, 2, 1}, {1, 2, 3}};
        System.out.println("Aqui la matriz");
        MiEntradaSalida.imprimirMatriz(matriz);
        if (comprobarEjeX(matriz)){
            System.out.println("La matriz es simetrica en funcion de su eje X, porque si invirtiesemos el orden en el que leemos las filas, la matriz se veria igual");
        }
        else {
            System.out.println("La matriz no es simetrica");
        }

    }

    public static boolean comprobarEjeX(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[(matriz.length - 1) - i][j]) {
                    return false;
                }

            }

        }
        return true;
    }
}
