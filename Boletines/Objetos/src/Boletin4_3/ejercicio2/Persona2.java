package Boletin4_3.ejercicio2;

import Exceptions.MensajeException;

import java.time.LocalDate;

public class Persona2 {
    private String nombre;
    private Mensaje[] mensajeRecibidos;
    private Mensaje[] mensajeEnviados;

    public Persona2(String nombre) {
        this.nombre = nombre;
        this.mensajeRecibidos = new Mensaje[5];
        this.mensajeEnviados = new Mensaje[5];
    }

    public void enviarMensaje(Persona2 destinatario, Mensaje mensaje) throws MensajeException {
        if (mensaje.getAsunto().isBlank()){
            throw new MensajeException("El mensaje no puede estar vacio");
        }
        if (destinatario == null){
            throw new MensajeException("El mensaje no tiene destinatario!!!");
        }
        if (mensaje.getCuerpo().isBlank()){
            throw new MensajeException("El mensaje no tiene cuerpo");
        }
        if (mensajeRecibidos){

        }
    }

}
