import java.util.Arrays;

public class Ejercicio1 {
    /**
     * Crea un metodo que compruebe si en una matriz hay algún valor negativo, y devuelva un
     * valor booleano.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] matriz = {{1, -3, 5}, {-2, -1, 3}};
        //Pongo un if para que si el metodo comprobar negativo en matrices es verdadero lo diga
        if (comprobarNegativoEnMatrices(matriz)) {
            System.out.println("Hay un numero negativo o mas en la matriz");
            //Llamo a mientradasalida para mostrar por pantalla los elementos de la matriz
            MiEntradaSalida.imprimirMatriz(matriz);
        } else {
            System.out.println("No hay valores negativos en la matriz");
        }

    }

    public static boolean comprobarNegativoEnMatrices(int[][] matriz) {
        //recorrer filas
        for (int i = 0; i < matriz.length; i++) {
            //recorrer columnas
            for (int j = 0; j < matriz[0].length; j++) {
                //para que si la matriz tiene un numero menor que 0 te lo devuelva como verdadero
                if (matriz[i][j] < 0) {
                    return true;
                }
            }

        }
        return false;
    }

}
