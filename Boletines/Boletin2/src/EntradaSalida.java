public class EntradaSalida {
    // Este fichero es para poner los modulos
    public static int generarAleatorio(int max) {
        return (int) (Math.random() * max + 1);
    }
    public static int generarAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;

    }

}

