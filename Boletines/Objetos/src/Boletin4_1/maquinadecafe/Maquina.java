package Boletin4_1.maquinadecafe;

import Exceptions.MaquinaDeCafeException;

public class Maquina {
    //Atributos
    private int depLeche;
    private int depCafe;
    private int depVasos;
    private double monedero;
    //Constantes
    public static final double PRECIOCAFE = 1;
    public static final double PRECIOLECHE = 0.8;
    public static final double PRECIOCAFECONLECHE = 1.5;

    private final int MAXDOSISCAFE;
    private final int MAXDOSISLECHE;
    private final int MAXVASOS;
    private final double MAXMONEDERO;

    public Maquina(double monederoInicial, int maxdosiscafe, int maxdosisleche, int maxvasos, double maxmonedero) {
        this.MAXDOSISCAFE = maxdosiscafe;
        this.MAXDOSISLECHE = maxdosisleche;
        this.MAXVASOS = maxvasos;
        this.MAXMONEDERO = maxmonedero;
        this.depCafe = maxdosiscafe;
        this.depLeche = maxdosisleche;
        this.depVasos = maxvasos;
        this.monedero = monederoInicial;
    }

    public void llenarDepositos(int maxdosiscafe, int maxdosisleche, int maxvasos) {
        depCafe = maxdosiscafe;
        depLeche = maxdosisleche;
        depVasos = maxvasos;
        System.out.println("Los depositos han sido rellenados.");
    }

    public void vaciarMonedero() {
        monedero = 0.0;
        System.out.println("El monedero ha sido vaciado");
    }

    //Servir Cafe Solo
    public double servirCafeSolo(double pago) throws MaquinaDeCafeException {

        if (depCafe <1){
            throw new MaquinaDeCafeException("Error: No hay cafe en el deposito");
        }
        if (depVasos < 1) {
            throw new MaquinaDeCafeException("Error:No hay vasos en el deposito");
        }

        if (pago < PRECIOCAFE) {
            throw new MaquinaDeCafeException("Error: Dinero introducido insuficiente");
        }
        double cambio = pago - PRECIOCAFE;

        if (!hayCambio(cambio)) {
            throw new MaquinaDeCafeException("No hay suficiente cambio en la maquina, prueba a introducir una menor cantidad.");
        }

        depCafe--;
        depVasos--;
        monedero += PRECIOCAFE;
        monedero -= cambio;

        return cambio;
    }

    private boolean hayCambio(double cambio) {
        return monedero >= cambio;
    }

    //Servir Leche
    public  double servirLeche(double pago) throws MaquinaDeCafeException {
        if (depLeche < 1) {
            throw new MaquinaDeCafeException("Error: No hay leche en el deposito");
        }
        if (depVasos < 1) {
            throw new MaquinaDeCafeException("Error:No hay vasos en el deposito");
        }
        if (pago < PRECIOLECHE) {
            throw new MaquinaDeCafeException("Error: Dinero introducido insuficiente");
        }
        double cambio = pago - PRECIOLECHE;
        if (!hayCambio(cambio)) {
            throw new MaquinaDeCafeException("No tienes cambio.");
        }
        depLeche--;
        depVasos--;
        monedero += PRECIOLECHE;
        monedero -= cambio;

        return cambio;
    }

    //Servir Cafe con Leche
    public double servirCafeConLeche(double pago) throws MaquinaDeCafeException{
        if (depLeche < 1){
            throw new MaquinaDeCafeException("Error: No hay leche en el deposito");
        }
        if (depCafe < 1) {
            throw new MaquinaDeCafeException("Error:No hay cafe en el deposito");
        }
        if (depVasos < 1) {
            throw new MaquinaDeCafeException("Error:No hay vasos en el deposito");
        }

        double cambio = pago - PRECIOCAFECONLECHE;
        if (!hayCambio(cambio)){
            throw new MaquinaDeCafeException("No tienes cambio.");
        }

        depCafe--;
        depLeche--;
        depVasos--;
        monedero += PRECIOCAFECONLECHE;
        monedero -= cambio;

        return cambio;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "monedero=" + monedero +
                ", depVasos=" + depVasos +
                ", depCafe=" + depCafe +
                ", depLeche=" + depLeche +
                '}';
    }

    //Consultar estado maquina
    public String consultarEstadoMaquina(){
        return toString();
    }

}
