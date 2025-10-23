public class Ejercicio5 {
    /**
     * Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
     * misma, pero leídos por columnas:
     */
    static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("La matriz tiene estos numeros:");
        MiEntradaSalida.imprimirMatriz(matriz);
        System.out.println("En una fila: " + recorrerPorColumnas(matriz));
    }

    public static String recorrerPorColumnas(int[][] matriz) {
        //Para poder añadir o quitar cosas en una cadena de texto
        StringBuilder linea = new StringBuilder();
        //Para este ejercicio copiamos lo que hicimos en el ejercicio3 y cambiamos el orden de los bucles for para recorrerlo por columnas, pero tenemos que poner la fila 0
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                //Para añadir a la variable los numeros
                linea.append(matriz[i][j]).append("");

            }
        }
        return linea.toString();
    }
}
