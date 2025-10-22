import java.util.Arrays;

public class Ejercicio12 {
    /**
     * Crea un metodo que acepte un array de enteros y devuelva el mismo array ordenado
     * de menor a mayor. Utiliza para ello el metodo de ordenación de la burbuja.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] burbuja = {1, 25, 59, -1, 4};
        metodoBurbuja(burbuja);
        System.out.println(Arrays.toString(burbuja));

    }

    public static void metodoBurbuja(int[] array) {
        int num = array.length;
        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temporal = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporal;
                }
            }
        }
    }
}