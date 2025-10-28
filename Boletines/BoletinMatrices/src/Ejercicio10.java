public class Ejercicio10 {
    /**
     * Crea un metodo que compruebe si una matriz pasada por parámetro es simétrica en
     * función del eje Y. Es decir, la matriz
     * 1 3 0 3 1
     * 4 2 7 2 4
     * 6 1 9 1 6
     * 0 8 8 8 0
     * es simétrica en función de su eje Y, porque si invirtiésemos el orden en el que leemos las
     * columnas, la matriz se vería igual.
     * Pero la matriz
     * 1 4 6
     * 2 1 3
     * no es simétrica, pues no cumple dicha propiedad.
     */
    public static void main(String[] args) {
        int[][] matrizSimetrica = {{1, 3, 0, 3, 1}, {4, 2, 7, 2, 4}, {6, 1, 9, 1, 6}, {0, 8, 8, 8, 0}};

        // Llamada al metodo y mensaje descriptivo
        if (esSimetricaY(matrizSimetrica)) {
            System.out.println("La matriz es simétrica respecto al eje Y.");
        } else {
            System.out.println("La matriz NO es simétrica respecto al eje Y.");
        }
    }
    public static boolean esSimetricaY(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length  / 2; j++) {
                    if (matriz[i][j] != matriz[i][matriz[0].length - 1 - j]) {
                        return false;
                    }
                }
            }
            return true;
        }


}

