public class Ejercicio16 {

    public static int[][] contarParesAdyacentes(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];

        // Desplazamientos para revisar las 8 posiciones adyacentes (incluyendo diagonales)
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int contadorPares = 0;
                for (int k = 0; k < 8; k++) {
                    int ni = i + dx[k];
                    int nj = j + dy[k];
                    // Comprobar que la posición vecina esté dentro de la matriz
                    if (ni >= 0 && ni < filas && nj >= 0 && nj < columnas) {
                        // Comprobar si el valor es par (incluyendo el 0)
                        if (matriz[ni][nj] % 2 == 0) {
                            contadorPares++;
                        }
                    }
                }
                resultado[i][j] = contadorPares;
            }
        }
        return resultado;
    }
}
