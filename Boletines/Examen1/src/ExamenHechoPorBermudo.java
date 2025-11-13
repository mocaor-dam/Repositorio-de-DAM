import java.security.PublicKey;

public class ExamenHechoPorBermudo {
    private static final int TAM = 4;
    private static final int MAX_INTENTOS = 6;
    private static final char CHAR_OCULTO = '?';

    private static int[][] parejas = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
    private static boolean[][] visibles = new boolean[TAM][TAM];

    static void main(String[] args) {
        int intentos = 0;

        while (intentos < MAX_INTENTOS){
            mostrarMatriz();
        // Pedir la primera coordenada
            boolean coordenadasCorrecta = false;
            int fila1, columna1, fila2, columna2;
            while (!coordenadasCorrecta){
                fila1 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la primera fila: ", 1,4) -1;
                columna1 = MiEntradaSalida.solicitarEnteroEnRango("Introduce columna: ", 1, 4) -1;

                if (visibles[fila1][columna1]){
                    System.out.println("La casilla ya estaba levantada. Vuelve a introducir otra");
                }
                else {
                    coordenadasCorrecta = true;
                }



                //Pedir la segunda coordenada
                fila2 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la fila 2: ", 1, 4) -1;
                columna2 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la columna 2: ", 1, 4) -1;




                //Comprobar si acierto
            }

        }
    }
    public static void mostrarMatriz(){
        for (int i = 0; i < parejas.length ; i++) {
            for (int j = 0; j < parejas[i].length; j++) {
                if (visibles[i][j]){
                    System.out.printf("%d ",parejas[i][j]);
                }
                else {
                    System.out.println(CHAR_OCULTO + " ");
                }
            }
            System.out.println();
        }
    }
}
