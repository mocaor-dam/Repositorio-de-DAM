import java.util.Random;

public class Ejercicio5 {
    static void main(String[] args) {

    }
    public static int[] generaArrayAleatorio (int tamano){
        int [] array = new int[tamano];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);
        }
        return array;
    }
}
