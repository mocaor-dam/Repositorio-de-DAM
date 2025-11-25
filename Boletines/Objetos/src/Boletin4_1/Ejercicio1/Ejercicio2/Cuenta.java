package Boletin4_1.Ejercicio1.Ejercicio2;

import Exceptions.CuentaException;

public class Cuenta {
    private double saldo;
    private int numRetiradas;
    private int numIngresos;

    public Cuenta() throws CuentaException {
        setSaldo(0);
        setNumIngresos(0);
        setNumRetiradas(0);
    }

    public Cuenta(double saldoInicial) throws CuentaException {
        setSaldo(saldoInicial);
        setNumRetiradas(0);
        setNumIngresos(0);
    }

    private void setSaldo(double saldo) throws CuentaException {
        if (saldo < 0) {
            throw new CuentaException("Tu saldo debe ser positivo");
        }
        this.saldo = saldo;
    }

    public int getNumRetiradas() {
        return numRetiradas;
    }

    public void setNumRetiradas(int numRetiradas) {
        this.numRetiradas = numRetiradas;
    }

    public int getNumIngresos() {
        return numIngresos;
    } 

    public void setNumIngresos(int numIngresos) {
        this.numIngresos = numIngresos;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numRetiradas=" + numRetiradas +
                ", numIngresos=" + numIngresos +
                '}';
    }

    public void reintegro(double dineroRetirado) throws CuentaException {
        if (dineroRetirado < 0) {
            throw new CuentaException("No puedes introducir numeros negativos");
        }
        if (dineroRetirado > saldo) {
            throw new CuentaException("Saldo insuficiente. La cantidad a retirar es mayor que el saldo actual.");
        }
        this.saldo -= dineroRetirado;
        this.numRetiradas++;

    }

    public void ingreso(double dineroIngreso) throws CuentaException {
        if (dineroIngreso < 0) {
            throw new CuentaException("No puedes ingresar dinero negativo");
        }
        this.saldo += dineroIngreso;
        this.numIngresos++;
    }
    public void consulta(){
        System.out.println(toString());
    }


}
