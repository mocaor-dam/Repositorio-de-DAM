import java.util.Arrays;

/**
 * Crea un método que acepte 2 arrays, y devuelva un nuevo array con los elementos
 * que ambos arrays tienen en común.
 */
public class Ejercicio11 {
    static void main(String[] args) {
        int[] array1 = {10, 42, 74, 32, 61, 93, 22};
        int[] array2 = {42, 31, 99, 45, 22, 82, 55, 77};
        System.out.println(Arrays.toString(elementosEnComun(array1, array2)));
    }

    public static boolean encuentraElelemento(int[] array, int valorEncontrado) {
        for (int elemento : array) {
            if (elemento == valorEncontrado) { // le damos una condicion del elemento dentro  del array si esta o no esta
                return true; // entodo caso de que esté  devuelve verdadero
            }
        }
        return false; // en caso de que no está  devuelve falso
    }

    public static int[] elementosEnComun(int[] array1, int[] array2) {
        int contador = 0;
        int[] arrayNuevo = new int[array1.length];
        int comparar = Math.min(array1.length, array2.length);
        for (int i = 0; i < comparar; i++) {
            if (encuentraElelemento(array1, array2[i]) && !encuentraElelemento(arrayNuevo, array2[i])) {
                arrayNuevo[contador++]=array2[i];
            }
        }
        arrayNuevo = Arrays.copyOf(arrayNuevo,contador);
        return arrayNuevo;
    }
}