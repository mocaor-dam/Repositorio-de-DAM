public class Ejercicio2 {
    static void main(String[] args) {
        int[] num = {-1, 1, -4, 4, -5, 5, -6, 6};
        int negativos = 0;
        /*for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                negativos++;
            }

        }*/
        for (int numero : num) {
            if (numero < 0){
                negativos++;
            }
        }
        System.out.println("Hay " + negativos + " negativos");
    }
}
