package Boletin4_2.Ejercicio6;

import Exceptions.ProductoException;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Main {
    static void main(String[] args) {
        Producto producto = null;
        try {
            producto = new Producto("NINTENDO SWITCH 2",500);
            System.out.println("Producto 1: " + producto.getDescripcion() + "\n Codigo: " + producto.getCodigo());
            System.out.printf("Precio sin IVA: %.2f€%n", producto.getPrecioSinIva());
            System.out.printf("Precio con IVA:  %.2f€%n", producto.precioVenta());
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
        }


    }





}
