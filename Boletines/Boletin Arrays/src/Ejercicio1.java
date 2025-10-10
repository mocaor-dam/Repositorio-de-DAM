public class Ejercicio1 {
    static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares = 0;
        for (int i = 0; i < num.length; i += 2) {
            pares += num[i];

        }
        System.out.println(pares);

    }
}
