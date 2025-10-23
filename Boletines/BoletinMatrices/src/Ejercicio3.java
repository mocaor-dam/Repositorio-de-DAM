public class Ejercicio3 {
    /**
     * Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
     * misma, leídos por filas
     */
    static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("La matriz tiene estos numeros:");
        MiEntradaSalida.imprimirMatriz(matriz);
        System.out.println("En una fila: " + recorrerEnUnaFila(matriz));
    }

    public static String recorrerEnUnaFila(int[][] matriz) {
        //Para poder añadir o quitar cosas en una cadena de texto
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Para añadir a la variable los numeros
                linea.append(matriz[i][j]).append("");

            }
        }

        return linea.toString();
    }
}
