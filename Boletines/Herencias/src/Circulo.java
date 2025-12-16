public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area(){
        return 2 * Math.PI * radio;

    }

    public double getRadio() {
        return radio;
    }
}
