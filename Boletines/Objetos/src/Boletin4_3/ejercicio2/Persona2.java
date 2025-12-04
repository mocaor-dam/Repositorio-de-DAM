package Boletin4_3.ejercicio2;

import Exceptions.MensajeException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Persona2 {
    private String nombre;
    private Mensaje[] buzonMensajesRecibidos;
    private Mensaje[] buzonMensajesEnviados;

    public Persona2(String nombre) {
        this.nombre = nombre;
        this.buzonMensajesRecibidos = new Mensaje[5];
        this.buzonMensajesEnviados = new Mensaje[5];
    }

    public void enviarMensaje(Persona2 destinatario, String cuerpo, String asunto) throws MensajeException {
        if (asunto.isBlank()) {
            throw new MensajeException("El mensaje no puede estar vacio");
        }
        if (destinatario == null) {
            throw new MensajeException("El mensaje no tiene destinatario!!!");
        }
        if (cuerpo.isBlank()) {
            throw new MensajeException("El mensaje no tiene cuerpo");
        }

        if (destinatario.buzonMensajesRecibidos[4] != null) {
            throw new MensajeException("El Buzon esta lleno");
        }
        if (buzonMensajesEnviados[4] != null) {
            throw new MensajeException("El Buzon esta lleno");
        }
        Mensaje mensaje = new Mensaje(asunto, cuerpo, this, destinatario, LocalDateTime);
        mensaje.setRemitente(this);
        mensaje.setFechaEnvio(LocalDateTime.now());
        System.out.println("Se ha enviado correctamente");

        for (int i = 0; i < buzonMensajesEnviados.length; i++) {
            if (buzonMensajesEnviados[i] == null) {
                buzonMensajesEnviados[i] = mensaje;
                break;
            }
        }
        for (int i = 0; i < destinatario.buzonMensajesRecibidos.length; i++) {
            if (destinatario.buzonMensajesRecibidos[i] == null) {
                destinatario.buzonMensajesRecibidos[i] = mensaje;
                break;
            }
        }
    }

    public void borrarMensajeRecibidoMasAntiguo() {
        for (int i = 0; i < buzonMensajesRecibidos.length - 1 && buzonMensajesRecibidos[i] != null; i++) {
            buzonMensajesRecibidos[i] = buzonMensajesRecibidos[i + 1];
        }
        buzonMensajesRecibidos[buzonMensajesRecibidos.length - 1] = null;
    }

    public void borrarMensajeeEnviadoMasAntiguo() {
        for (int i = 0; i < buzonMensajesEnviados.length - 1 && buzonMensajesEnviados[i] != null; i++) {
            buzonMensajesEnviados[i] = buzonMensajesEnviados[i + 1];
        }
        buzonMensajesEnviados[buzonMensajesEnviados.length - 1] = null;
    }

}
