public class Ejercicio2Examen2020 {
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

    public static boolean florece(int[][] jardin, int fila, int col) {  //Función para contar números pares adyacentes
        // Guardamos cada condición en una variable para que sea más fácil de leer
        boolean tieneAgua = hayAgua(jardin, fila, col);
        boolean tieneAbeja = hayAbeja(jardin, fila, col);
        boolean tieneMalaHierba = hayMalaHierba(jardin, fila, col);
        boolean tieneGusano = hayGusano(jardin, fila, col);


        if (tieneAgua && tieneAbeja && (!tieneMalaHierba || tieneGusano)) {
            return true;
        }

        return false;
    }
    //Creamos un metodo en el que creamos lo que vamos a hacer en el resto de metodos para que solo tengamos que llamar a buscaElemento y ya
    public static boolean buscaElemento(int[][] jardin, int fil, int col, int rango, int elemento) {
        for (int i = fil - rango; i <= fil + rango; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
            for (int j = col - rango; j <= col + rango; j++) {
                if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length && jardin[i][j] == elemento) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean hayAgua(int[][] jardin, int fil, int col) {
        return buscaElemento(jardin, fil, col, 1, AGUA);

    }

    public static boolean hayAbeja(int[][] jardin, int fil, int col) {
        return buscaElemento(jardin, fil, col, 3, ABEJA);
    }

    public static boolean hayMalaHierba(int[][] jardin, int fil, int col) {
        return buscaElemento(jardin, fil, col, 1, MALAHIERBA);
    }

    public static boolean hayGusano(int[][] jardin, int fil, int col) {
        return buscaElemento(jardin, fil, col, 1, GUSANO);
    }
}

