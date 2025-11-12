import java.util.Scanner;

public class Examen {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Variables de las filas, mi intencion es usarlas para darle ese valor o indicarle ese valor a la matriz
        int fila1 = 0;
        int columna1 = 0;
        int fila2 = 0;
        int columna2 = 0;

        //Matrices
        int intentos = 0;
        int[][] parejas = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        String[][] matrizString = {
                {"?", "?", "?", "?"},
                {"?", "?", "?", "?"},
                {"?", "?", "?", "?"},
                {"?", "?", "?", "?"}
        };
        //Bucle do-while en el que le pido las filas y columnas
        do {
            fila1 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la fila: ", 0, 3);
            columna1 = MiEntradaSalida.solicitarEnteroEnRango("Introduce columna: ", 0, 3);
            //Aqui quiero mostrar la matriz con los cambios mostrados, que mi intencion era ponerlo asi MiEntradaSalida2.imprimirMatrizString(matrizString[fila1][columna1]); , pero me da error
            MiEntradaSalida2.imprimirMatrizString(matrizString);

            fila2 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la fila 2: ", 0, 3);
            columna2 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la columna 2: ", 0, 3);
            MiEntradaSalida2.imprimirMatrizString(matrizString);
            //Variable para ir contando la cantidad de intentos
            intentos++;
            System.out.println("Llevas " + intentos + " intentos, te quedan " + (6 - intentos));
        } while (intentos >= 6);
        //Recorro la matriz
        for (int i = 0; i < parejas.length; i++) {
            for (int j = 0; j < parejas[i].length; j++) {
                //Pongo que si lo que hay en la posicion fila1 y columna1 es igual a
                if (parejas[fila1][columna1] == parejas[fila2][columna2]){
                    matrizString[i][j] = matrizString[fila1][columna1];
                }

            }

        }
        MiEntradaSalida2.imprimirMatriz(parejas);


    }


}
