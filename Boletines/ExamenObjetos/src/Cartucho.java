public class Cartucho {
    private String id;
    private String tipo;
    private double potencia;
    private double peso;

    public Cartucho(String id, String tipo, double potencia, double peso) {
        this.id = id;
        this.tipo = tipo;
        this.potencia = potencia;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getPeso() {
        return peso;
    }
}
