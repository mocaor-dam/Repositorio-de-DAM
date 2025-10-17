public class Ejercicio7 {
    static void main(String[] args) {
        int[] miarray = {1, 2, 3, 4, 5, 6};
        if (contieneElemento(miarray, 5)) {
            System.out.println("El elemento esta en el array");
        } else {
            System.out.println("El elemento no esta en el array");
        }
    }

    public static boolean contieneElemento(int[] array, int elementoABuscar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementoABuscar) {
                return true;
            }
        }
        return false;

    }
}


