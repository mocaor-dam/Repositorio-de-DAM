public class Ejercicio11 {
    /**
     * Crea un metodo que reciba dos matrices, y compruebe si son matrices inversas, es decir,
     * si tienen los mismos valores en los índices inversos:
     */
    static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matriz2 = {{12, 11, 10, 9}, {8, 7, 6, 5}, {4, 3, 2, 1}};
        MiEntradaSalida.imprimirMatriz(matriz1);
        System.out.println();
        MiEntradaSalida.imprimirMatriz(matriz2);
        if (comprobarInverso(matriz1, matriz2)){
            System.out.println("Las matrices son inversas ");
        }
        else{
            System.out.println("Las matrices NO son inversas :(");
        }
    }

    public static boolean comprobarInverso(int[][] matriz1, int[][] matriz2) {
        if (Ejercicio7.comprobarValoresDeMatriz(matriz1, matriz2)) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    if (matriz1[i][j] != matriz2[matriz2.length - 1 -i][matriz2[i].length - 1 - j]){
                        return false;
                    }
                }

            }
        } else {
            return false;
        }
        return true;
    }
}
