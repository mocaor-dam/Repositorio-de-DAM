package Boletin4_2.Ejercicio6;

import Exceptions.ProductoException;

import java.util.IllegalFormatCodePointException;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Producto {

    private static int contador = 1;
    private static double IVA = 0.2;

    private int codigo;
    private String descripcion;
    private double precioSinIva;

    public Producto(String descripcion, double precioSinIva)throws ProductoException {
        this.codigo = contador++;
        this.descripcion = descripcion;
        setPrecioSinIva(precioSinIva);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) throws ProductoException {
        if (precioSinIva < 0) {
            throw new ProductoException("Error el precio no puede ser menor que 0");
        }
        this.precioSinIva = precioSinIva;
    }

    public static double getIVA(){
        return IVA;
    }

    public double precioVenta(){
        return precioSinIva * (1+IVA);
    }
}
