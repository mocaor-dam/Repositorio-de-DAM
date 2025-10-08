public class Ejercicio8 {
    public static void main(String[] args) {
        double a = MiEntradaSalida.leerEntero( "Introduce tu primer numero:");
        double b = MiEntradaSalida.leerEntero("Introduce tu segundo numero:");
        double c = MiEntradaSalida.leerEntero("Introduce tu tercer numero:");

        double raiz = (b * b) - 4 * a * c;

        if (raiz > 0) {
            System.out.println("Tiene 2 resultados");
        }else if ( raiz == 0) {
            System.out.println("Tiene una solucion");
        } else {
            System.out.println("No tiene solucion");

        }
    }


}
