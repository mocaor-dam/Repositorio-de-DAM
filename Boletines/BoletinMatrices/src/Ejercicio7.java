public class Ejercicio7 {
    /**
     * Crea un metodo que reciba dos matrices, y compruebe si son exactamente iguales.
     */
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Aqui la matriz 1");
        MiEntradaSalida.imprimirMatriz(matriz1);
        System.out.println("Aqui la matriz 2");
        MiEntradaSalida.imprimirMatriz(matriz2);
        if (comprobarValoresDeMatriz(matriz1, matriz2)){
            System.out.println("Son exactamente iguales :D");
        }
        else{
            System.out.println("No son exactamente iguales :(");
        }

    }


    public static boolean comprobarValoresDeMatriz(int [][] matriz1, int [][] matriz2){
        if (comprobarSiSonIguales(matriz1, matriz2)){
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        return false;
                    }

                }

            }
                return true;
        }
        return false;
    }


     public static boolean comprobarSiSonIguales(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length) {
            return false;
        }
        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }

        }
            return true;
        }
}
