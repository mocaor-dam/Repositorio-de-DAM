import util.MiEntradaSalida;

public class JuegoString {
    private static final int TAM = 4;
    private static final int MAX_INTENTOS = 1;
    private static final String CHAR_OCULTO = "?";

    private static String[][] parejas = new String[TAM][TAM];
    private static String[][] visibles = new String[TAM][TAM];

    public static void main(String[] args) {
        int intentos = 0;

        for (int i = 0; i < TAM/2; i++) {
            for (int j = 0; j < TAM; j++) {
                parejas[i][j] = String.valueOf(TAM * i + j + 1);
                parejas[i + TAM/2][j] = String.valueOf(TAM * i + j + 1);
                visibles[i][j] = CHAR_OCULTO;
                visibles[i + TAM/2][j] = CHAR_OCULTO;
            }
        }

        while(intentos < MAX_INTENTOS && !haGanado()){
            mostrarMatriz();

            System.out.printf("Te quedan %d intentos%n", MAX_INTENTOS - intentos);

            //Pedir la primera coordenada
            boolean coordenadaCorrecta = false;
            int fila1 = 0, col1 = 0, fila2 = 0, col2 = 0;
            while (!coordenadaCorrecta){
                fila1 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la primera fila: ", 1, 4) - 1;
                col1 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la primera columna: ", 1, 4) - 1;

                if (!visibles[fila1][col1].equals(CHAR_OCULTO)){
                    System.out.println("La casilla ya estaba levantada. Vuelve a introducir otra.");
                }
                else {
                    // Pongo la casilla visible
                    visibles[fila1][col1] = parejas[fila1][col1];
                    coordenadaCorrecta = true;
                }
            }

            //Pedir la segunda coordenada
            mostrarMatriz();
            coordenadaCorrecta = false;
            while (!coordenadaCorrecta){
                fila2 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la segunda fila: ", 1, 4) - 1;
                col2 = MiEntradaSalida.solicitarEnteroEnRango("Introduce la segunda columna: ", 1, 4) - 1;

                if (fila1 == fila2 && col1 == col2){
                    System.out.println("Has elegido las mismas coordenadas que para la primera casilla");
                }
                else if (!visibles[fila2][col2].equals(CHAR_OCULTO)){
                    System.out.println("La casilla ya estaba levantada. Vuelve a introducir otra.");
                }
                else {
                    // Pongo visible la segunda casilla
                    visibles[fila2][col2] = parejas[fila2][col2];
                    coordenadaCorrecta = true;
                }
            }
            mostrarMatriz();

            //Comprobar si acierto
            if (parejas[fila1][col1].equals(parejas[fila2][col2])){
                //acierto
                System.out.println("Has adivinado una pareja");
            }
            else {
                System.out.println("¡Qué mal! No has acertado esta vez");
                intentos++;
                // oculto las filas
                visibles[fila1][col1] = CHAR_OCULTO;
                visibles[fila2][col2] = CHAR_OCULTO;

            }
        }

        if (intentos == MAX_INTENTOS){
            System.out.println("Oooooooh, has perdido. Esta era la solución");
            mostrarMatrizCompleta();
        }
        else {
            System.out.println("Eres un p*** crack");
        }

    }

    public static void mostrarMatriz() {
        for (int i = 0; i < parejas.length; i++) {
            for (int j = 0; j < parejas[i].length; j++) {
                if (!visibles[i][j].equals(CHAR_OCULTO)){
                    System.out.printf("%s " , parejas[i][j]);
                }
                else {
                    System.out.print(CHAR_OCULTO + " ");
                }
            }
            System.out.println();
        }
    }

    public static void mostrarMatrizCompleta() {
        for (int i = 0; i < parejas.length; i++) {
            for (int j = 0; j < parejas[i].length; j++) {
                System.out.printf("%s " , parejas[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean haGanado() {
        for (int i = 0; i < visibles.length; i++) {
            for (int j = 0; j < visibles[i].length; j++) {
                if (visibles[i][j].equals(CHAR_OCULTO)){
                    return false;
                }
            }
        }
        return true;
    }
}
