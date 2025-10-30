public class Ejercicio2 {
    public static final int SEMILLA = 1, AGUA = 2, ABEJA = 5, MALAHIERBA = 3, GUSANO = 4;

    static void main(String[] args) {
        int[][] jardin = {
                {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
                {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
                {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
                {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
                {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
                {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
                {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
                {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
                {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
                {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
                {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}
        };
        comprobarQueFlorezca(jardin);
    }

    public static boolean comprobarQueFlorezca(int[][] jardin) {
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                if (jardin[i][j] != SEMILLA) continue;
                if (florece(jardin, i, j)) {
                    System.out.printf("La semilla de la posicion %d, %d florecerá\n", i, j);
                }

            }
        }

        return false;
    }

    public static boolean florece(int[][] matriz, int fila, int col) {  //Función para contar números pares adyacentes
        for (int i = fila - 1; i <= fila + 1; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean hayAgua(int[][] jardin, int fil, int col) {
        for (int i = fil - 1; i <= fil + 1; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
            for (int j = col - 1; j <= col + 1; j++) {
                if (jardin[i][j] == AGUA) {
                    return true;
                } else {
                    return false;
                }
            }
        }

    }
}

