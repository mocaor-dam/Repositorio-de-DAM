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

        // Esta es la lógica correcta
        // 1. Debe tener agua Y
        // 2. Debe tener abeja Y
        // 3. (No debe tener mala hierba O debe tener un gusano)

        if (tieneAgua && tieneAbeja && (!tieneMalaHierba || tieneGusano)) {
            return true;
        }

        return false;
}


public static boolean hayAgua(int[][] jardin, int fil, int col) {
    for (int i = fil - 1; i <= fil + 1; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
        for (int j = col - 1; j <= col + 1; j++) {
            if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length && jardin[i][j] == AGUA) {
                return true;
            }
        }
    }
    return false;

}

public static boolean hayAbeja(int[][] jardin, int fil, int col) {
    for (int i = fil - 3; i <= fil + 3; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
        for (int j = col - 3; j <= col + 3; j++) {
            if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length && jardin[i][j] == ABEJA) {
                return true;
            }
        }
    }
    return false;

}

public static boolean hayMalaHierba(int[][] jardin, int fil, int col) {
    for (int i = fil - 1; i <= fil + 1; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
        for (int j = col - 1; j <= col + 1; j++) {
            if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length && jardin[i][j] == MALAHIERBA) {
                return true;
            }
        }
    }
    return false;
}

public static boolean hayGusano(int[][] jardin, int fil, int col) {
    for (int i = fil - 1; i <= fil + 1; i++) {  //Dentro del rango de filas y columnas detecta las adyacentes incluidas las diagonales
        for (int j = col - 1; j <= col + 1; j++) {
            if (i >= 0 && i < jardin.length && j >= 0 && j < jardin[0].length && jardin[i][j] == GUSANO) {
                return true;
            }
        }
    }
    return false;
}
}

