public class GestorDeEnvios {
    public double calcular(double precio) {
        double envio = 0.0;
        if (precio < 20) envio = 5.0;
        return envio;
    }
}
