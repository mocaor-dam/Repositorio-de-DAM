public class Ejercicio4 {
    final static int CANTIDAD_NUMERICA = 6000;

    static void main(String[] args) {
        int[] generados = new int[CANTIDAD_NUMERICA];
        double media;
        double suma = 0;
        int digito;
        for (int i = 0; i < generados.length; i++) {
            generados[i] = MiEntradaSalida.generaAleatorioEntre(0, 100, true);
        }
        for (int n1 : generados) {
            suma += n1;
        }
        media = suma / CANTIDAD_NUMERICA;
        System.out.println("La media es " + media);
        System.out.println();
        int[] digitos = new int[10];
        for (int n2 : generados) {
            digitos[n2 % 10]++;
        }
        int mayor = Integer.MIN_VALUE;
        int mayorIndice = 0;
        for (int i = 0; i < digitos.length; i++) {
            if (digitos[i] > mayor) {
                mayor = digitos[i];
                mayorIndice = i;
            }

        }
        System.out.println("El digito que mas se repite es el " + mayorIndice);
        System.out.println();
        for (int i = 0; i < digitos.length; i++) {
            System.out.printf("El numero %d Se ha repetido %d veces. Esto equivale a un %.2f%%%n", i,digitos[i],((digitos[i] / (double) CANTIDAD_NUMERICA) * 100));
            System.out.println();
        }
    }

}
