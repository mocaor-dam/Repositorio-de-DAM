package Boletin4_2.Ejercicio6;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Main {
    static void main(String[] args) {
        Producto producto = new Producto(1,"NINTENDO SWITCH 2",500);

        System.out.println("Producto 1: " + producto.getDescripcion() + "\n Codigo: " + producto.getCodigo());
        System.out.printf("Precio sin IVA: %.2f€%n", producto.cambiarPrecioSinIva(500*0.2));
        System.out.printf("Precio con IVA: %.2f€%n", producto.precioVenta());

    }





}
