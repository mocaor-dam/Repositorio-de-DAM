import java.util.Arrays;

public class Ejercicio2 {
    /**
     *  Crea un metodo que sume todas las posiciones de una matriz y devuelva dicho número.
     */
    static void main(String[] args) {
        int [][] matriz = {{1,2,3,4,12}, {1,23,34,12,8}};
        int resultado = sumarMatriz(matriz);
        System.out.println("La suma de la matriz es: " + resultado);
    }

    public static int sumarMatriz(int[][] matriz){
        //variable para acumular la suma
        int suma = 0;
        //recorrer filas
        for (int i = 0; i < matriz.length; i++) {
            //recorrer columnas
            for (int j = 0; j < matriz[i].length; j++) {
                //sumar elemento
                suma += matriz[i][j];

            }
        }
        //devolver resultado
        return suma;
    }
}
