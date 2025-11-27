package Boletin4_2.Ejercicio6;

import Exceptions.ProductoException;

import java.util.IllegalFormatCodePointException;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Producto {

    private int codigo;
    private String descripcion;
    private int precioSinIva;
    public static double IVA = 0.2;

    public Producto(int codigo, String descripcion, int precioSinIva) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioSinIva = precioSinIva;
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

    public int getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(int precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) throws ProductoException{
        if (precioSinIva < 0){
            throw new ProductoException("Error el precio no puede ser menor que 0");
        }
    }

    public void cambiarPrecioSinIva(double nuevoPrecio) throws ProductoException{
        if (nuevoPrecio<0){
            throw new ProductoException("Error: no puede ser negativo");
        }
    }

    public void getIva()

}
