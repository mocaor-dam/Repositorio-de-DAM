public class Ejercicio6 {
    /**
     * Crea un metodo que reciba una matriz e imprima, en una sola línea, los elementos de la
     * misma, pero leídos por columna, empezando por los últimos índices:
     */
    static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("La matriz tiene estos numeros:");
        MiEntradaSalida.imprimirMatriz(matriz);
        System.out.println("En una fila: " + recorrerEnColumnaAlReves(matriz));
    }

    public static String recorrerEnColumnaAlReves(int[][] matriz) {
        //Para poder añadir o quitar cosas en una cadena de texto
        StringBuilder linea = new StringBuilder();
        //Pongo i = matriz.length -1 para que empiece desde la longitud de la matriz -1, ya que seria (0 al 6 en caso de que fueran 7)
        //Pongo i-- para que vaya en vez de ir subiendo , vaya bajando
        for (int j = matriz[0].length - 1; j >= 0; j--) {
             for (int i = matriz.length - 1; i >= 0; i--) {
                //Para añadir a la variable los numeros
                linea.append(matriz[i][j]).append("");

            }
        }
        return linea.toString();
    }
}


