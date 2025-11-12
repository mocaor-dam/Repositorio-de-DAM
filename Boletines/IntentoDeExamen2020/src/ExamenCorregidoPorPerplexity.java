import java.util.Random;

/**
 * Clase principal que implementa el juego de las parejas (Memory Game).
 * El jugador debe encontrar todas las parejas ocultas en un tablero N x N
 * antes de agotar sus intentos.
 */
public class ExamenCorregidoPorPerplexity {

    // ========== CONSTANTES ==========
    private static final int TAMANO_TABLERO = 4; // Tamaño del tablero (N x N, donde N es par)
    private static final int INTENTOS_INICIALES = 6; // Número de intentos disponibles
    private static final String CASILLA_OCULTA = "?"; // Símbolo para casillas ocultas

    // ========== VARIABLES DE INSTANCIA ==========
    private int[][] tableroSolucion; // Matriz con los valores reales (la solución)
    private boolean[][] tableroDestapado; // Matriz que indica qué casillas están destapadas permanentemente
    private int intentosRestantes; // Intentos que le quedan al jugador
    private int parejasRestantes; // Número de parejas que quedan por encontrar

    /**
     * Constructor: Inicializa el juego
     */
    public void JuegoParejas() {
        this.tableroSolucion = new int[TAMANO_TABLERO][TAMANO_TABLERO];
        this.tableroDestapado = new boolean[TAMANO_TABLERO][TAMANO_TABLERO];
        this.intentosRestantes = INTENTOS_INICIALES;
        this.parejasRestantes = (TAMANO_TABLERO * TAMANO_TABLERO) / 2;
    }

    /**
     * Método principal que ejecuta el juego
     */
    public void jugar() {
        inicializarTablero();
        mostrarBienvenida();

        // Bucle principal del juego
        while (intentosRestantes > 0 && parejasRestantes > 0) {
            ejecutarTurno();
        }

        // Comprobar el resultado final
        if (parejasRestantes == 0) {
            mostrarVictoria();
        } else {
            mostrarDerrota();
        }
    }

    /**
     * Inicializa el tablero con parejas de números colocadas aleatoriamente.
     * PARTE OPCIONAL: Relleno aleatorio de la matriz
     */
    private void inicializarTablero() {
        // Calcular cuántas parejas necesitamos
        int totalCasillas = TAMANO_TABLERO * TAMANO_TABLERO;
        int numeroParejas = totalCasillas / 2;

        // Crear un array temporal con todas las parejas
        int[] valoresTemporales = new int[totalCasillas];
        for (int i = 0; i < numeroParejas; i++) {
            valoresTemporales[i * 2] = i + 1; // Primera aparición del número
            valoresTemporales[i * 2 + 1] = i + 1; // Segunda aparición (pareja)
        }

        // Mezclar el array usando el algoritmo Fisher-Yates
        mezclarArray(valoresTemporales);

        // Rellenar la matriz con los valores mezclados
        int indice = 0;
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                tableroSolucion[i][j] = valoresTemporales[indice];
                tableroDestapado[i][j] = false; // Todas las casillas empiezan ocultas
                indice++;
            }
        }
    }

    /**
     * Implementa el algoritmo Fisher-Yates para mezclar aleatoriamente un array.
     * Este algoritmo garantiza una distribución uniforme de las permutaciones.
     *
     * @param array Array a mezclar
     */
    private void mezclarArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int indiceAleatorio = random.nextInt(i + 1);
            // Intercambiar elementos
            int temp = array[i];
            array[i] = array[indiceAleatorio];
            array[indiceAleatorio] = temp;
        }
    }

    /**
     * Muestra el mensaje de bienvenida al inicio del juego
     */
    private void mostrarBienvenida() {
        System.out.println("Bienvenido al juego de las parejas.");
        System.out.println("Destapa todas las parejas en menos de " + INTENTOS_INICIALES + " intentos y gana!");
        System.out.println();
    }

    /**
     * Ejecuta un turno completo del juego siguiendo el flujo de 6 pasos
     */
    private void ejecutarTurno() {
        // PASO 1: Mostrar el tablero actual
        mostrarTablero(null, null);
        System.out.println("Te quedan " + intentosRestantes + " intentos");

        // PASO 2: Pedir la primera coordenada
        Coordenada coord1 = pedirCoordenada(true, null);

        // PASO 3: Mostrar el tablero revelando la primera casilla temporalmente
        mostrarTablero(coord1, null);

        // PASO 4: Pedir la segunda coordenada
        Coordenada coord2 = pedirCoordenada(false, coord1);

        // PASO 5: Mostrar el tablero revelando ambas casillas
        mostrarTablero(coord1, coord2);

        // PASO 6: Comprobar si es acierto o fallo
        procesarResultado(coord1, coord2);
    }

    /**
     * Muestra el tablero en su estado actual.
     * Puede revelar temporalmente hasta dos coordenadas específicas.
     *
     * @param coord1 Primera coordenada a revelar temporalmente (puede ser null)
     * @param coord2 Segunda coordenada a revelar temporalmente (puede ser null)
     */
    private void mostrarTablero(Coordenada coord1, Coordenada coord2) {
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                // Determinar si esta casilla debe mostrarse
                boolean esCoord1 = (coord1 != null && coord1.fila == i && coord1.columna == j);
                boolean esCoord2 = (coord2 != null && coord2.fila == i && coord2.columna == j);

                if (tableroDestapado[i][j] || esCoord1 || esCoord2) {
                    // Mostrar el número de la casilla
                    System.out.print(tableroSolucion[i][j] + " ");
                } else {
                    // Mostrar la casilla oculta
                    System.out.print(CASILLA_OCULTA + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Solicita al jugador una coordenada válida (fila y columna).
     * Realiza todas las validaciones necesarias.
     *
     * @param esPrimera Indica si es la primera coordenada del turno
     * @param coordenadaPrevia La coordenada ya seleccionada (solo relevante para la segunda)
     * @return La coordenada válida introducida por el jugador
     */
    private Coordenada pedirCoordenada(boolean esPrimera, Coordenada coordenadaPrevia) {
        String orden = esPrimera ? "primera" : "segunda";
        Coordenada coord;

        while (true) {
            // Pedir la fila
            System.out.println("Introduce la " + orden + " fila (del 1 al " + TAMANO_TABLERO + ")");
            int fila = MiEntradaSalida.leerEntero() - 1; // Convertir a índice 0-based

            // Validar que la fila esté en el rango correcto
            if (fila < 0 || fila >= TAMANO_TABLERO) {
                System.out.println("Error: El número debe estar entre 1 y " + TAMANO_TABLERO + ".");
                continue;
            }

            // Pedir la columna
            System.out.println("Introduce la " + orden + " columna (del 1 al " + TAMANO_TABLERO + ")");
            int columna = MiEntradaSalida.leerEntero() - 1; // Convertir a índice 0-based

            // Validar que la columna esté en el rango correcto
            if (columna < 0 || columna >= TAMANO_TABLERO) {
                System.out.println("Error: El número debe estar entre 1 y " + TAMANO_TABLERO + ".");
                continue;
            }

            coord = new Coordenada(fila, columna);

            // Validar que la casilla no esté ya destapada permanentemente
            if (tableroDestapado[fila][columna]) {
                System.out.println("Esta casilla ya está destapada. Elige otra coordenada.");
                continue;
            }

            // Si es la segunda coordenada, validar que no sea la misma que la primera
            if (!esPrimera && coord.equals(coordenadaPrevia)) {
                System.out.println("Has escogido las mismas casillas que antes, vuelve a introducir otra vez la coordenada");
                continue;
            }

            // Coordenada válida
            break;
        }

        return coord;
    }

    /**
     * Procesa el resultado del turno: verifica si hay acierto o fallo
     * y actualiza el estado del juego en consecuencia.
     *
     * @param coord1 Primera coordenada seleccionada
     * @param coord2 Segunda coordenada seleccionada
     */
    private void procesarResultado(Coordenada coord1, Coordenada coord2) {
        int valor1 = tableroSolucion[coord1.fila][coord1.columna];
        int valor2 = tableroSolucion[coord2.fila][coord2.columna];

        if (valor1 == valor2) {
            // ¡ACIERTO! Las dos casillas tienen el mismo número
            System.out.println("¡Bien, has encontrado una pareja!");
            tableroDestapado[coord1.fila][coord1.columna] = true;
            tableroDestapado[coord2.fila][coord2.columna] = true;
            parejasRestantes--;

            // Mostrar el tablero con las parejas destapadas permanentemente
            mostrarTablero(null, null);
        } else {
            // FALLO: Los números son diferentes
            System.out.println("Vaya, no hubo suerte esta vez");
            intentosRestantes--;
        }

        System.out.println();
    }

    /**
     * Muestra el mensaje de victoria cuando el jugador gana
     */
    private void mostrarVictoria() {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║   ¡FELICIDADES, HAS GANADO!       ║");
        System.out.println("║   Encontraste todas las parejas   ║");
        System.out.println("╚═══════════════════════════════════╝");
    }

    /**
     * Muestra el mensaje de derrota y revela la solución completa
     */
    private void mostrarDerrota() {
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║       HAS PERDIDO                 ║");
        System.out.println("║   Se agotaron los intentos        ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.println();
        System.out.println("Esta era la solución:");

        // Mostrar el tablero completo (solución)
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            for (int j = 0; j < TAMANO_TABLERO; j++) {
                System.out.print(tableroSolucion[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Clase interna auxiliar para representar una coordenada (fila, columna)
     */
    private static class Coordenada {
        int fila;
        int columna;

        Coordenada(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }

        /**
         * Comprueba si dos coordenadas son iguales
         */
        boolean equals(Coordenada otra) {
            return this.fila == otra.fila && this.columna == otra.columna;
        }
    }

    /**
     * Método main: Punto de entrada del programa
     */
    public static void main(String[] args) {
        JuegoParejas juego = new JuegoParejas();
        juego.jugar();
    }
}
