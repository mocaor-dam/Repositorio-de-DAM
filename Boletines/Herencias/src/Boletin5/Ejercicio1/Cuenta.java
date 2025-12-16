package Boletin5.Ejercicio1;

public  class Cuenta {
    public double credito;
    public double saldo;

    public Cuenta(double credito, double saldo) {
        this.credito = credito;
        this.saldo = saldo;
    }

    public double getCredito() {
        if (credito == null){

            credito = 100;
        }
        return credito;
    }

    public double getSaldo() {
        return saldo;
    }
}
