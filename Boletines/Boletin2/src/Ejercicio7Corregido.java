/**
 * Realizar un programa que solicite dos números enteros mayores que 0, que
 * calcule el máximo común divisor entre ellos mediante el algoritmo de
 * Euclides y que muestre por pantalla el resultado.
 */
public class Ejercicio7Corregido {


        public static void main(String[] args) {
            int n1 = MiEntradaSalida.leerEnteroPositivo("Introduce el primer número: ",false);
            int n2 = MiEntradaSalida.leerEnteroPositivo("Introduce tu segundo número: ", false);
            System.out.println("El m.c.d de "+ n1+ " y "+n2+" es "+ MiEntradaSalida.mcd(n1,n2));
        }
    }


