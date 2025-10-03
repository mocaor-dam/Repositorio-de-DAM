import java.util.Scanner;

public class Ejercicio6 {
    private static final double ALUMNOS_CLASE = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        int suspensos = 0;
        int aprobados = 0;

        for (int i = 0; i < ALUMNOS_CLASE ; i++) {
            System.out.println("Introduce la nota del alumno " +i+ " entre 0 y 10");
            nota = sc.nextFloat();
            while (nota > 10 || nota < 0){
                System.out.println("La nota del alumno " +i+ " debe estar entre 0 y 10, por favor introduzca de nuevo");
                nota = sc.nextFloat();

            }
            if (nota >= 5){
                aprobados++;

            }else {
                suspensos++;
            }
        }
        System.out.println("aprobados = " + aprobados);
        System.out.println("suspensos = " + suspensos);
        double porcentajeAprobados = ((double) (aprobados / ALUMNOS_CLASE)) * 100;
        System.out.println("porcentajeAprobados = " + porcentajeAprobados + " %");

        double porcentajeSuspensos = (suspensos / ALUMNOS_CLASE) * 100;
        System.out.println("porcentajeSuspensos = " + porcentajeSuspensos + " %");

    }
}
