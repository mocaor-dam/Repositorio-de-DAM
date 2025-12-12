import excepciones.NaveException;

import java.util.Objects;

public class Deposito {
    private Cartucho[] cartucho;

    public Deposito(Cartucho[] cartucho) {
        this.cartucho = new Cartucho[5];
    }

    private boolean agregarCartucho(Cartucho c) {
        for (int i = 0; i < cartucho.length; i++) {
            //Compruebo si la posicion del array esta vacia, y si esta vacia añado un cartucho
            if (cartucho[i] == null) {
                //Añado en la posicion vacia el cartucho
                cartucho[i] = c;
                return true;
            }
        }

        return false;
    }

    /*


    private double calcularPotenciaTotal() {
        for (int i = 0; i < cartucho.length; i++) {
            if (cartucho[i] != null) {

            }
        }
    }

     */

    /*
    private double calcularPesoTotal() {

    }

     */

    private int contarCartuchosDeTipo(String tipo) {
        int contador = 0;
        for (int i = 0; i < cartucho.length; i++) {
            //Si lo que hay en la posicion i de cartucho es igual al tipo, se suma 1 al contador, y al final te dice cuantos de ese tipo hay
            /*Lo he intentado Bermudo, lo que pasa que no se como comparar un atributo de un objeto que esta dentro de una posicion de un array
            Y como no se hacer eso no he conseguido hacer ningun metodo
            * */
            if (cartucho[i].equals(tipo)) {
                contador++;

            }

        }
        return contador;
    }


    /*
    private double calcularPesoCartuchoTipo(String tipo) {
        for (int i = 0; i < cartucho.length; i++) {

        }
    }

     */

}
