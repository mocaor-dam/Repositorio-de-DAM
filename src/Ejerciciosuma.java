public class Ejerciciosuma {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i < 101; i++) {
            num += i++;

        }
        System.out.println("La suma de los 100 primeros numeros es " + num);
    }
}
