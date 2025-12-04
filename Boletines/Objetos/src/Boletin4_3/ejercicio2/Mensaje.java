package Boletin4_3.ejercicio2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDateTime fechaEnvio;
    private Persona2 remitente;
    private Persona2 destinatario;

    public Mensaje(String asunto, String cuerpo, Persona2 remitente, Persona2 destinatario, LocalDateTime fechaEnvio) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fechaEnvio = fechaEnvio;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Persona2 getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona2 remitente) {
        this.remitente = remitente;
    }

    public Persona2 getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona2 destinatario) {
        this.destinatario = destinatario;
    }
}
