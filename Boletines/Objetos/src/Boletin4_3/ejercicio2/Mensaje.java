package Boletin4_3.ejercicio2;

import java.time.LocalDate;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDate fechaEnvio;
    private Persona2 remitente;
    private Persona2 destinatario;

    public Mensaje(String asunto, String cuerpo, LocalDate fechaEnvio, Persona2 remitente, Persona2 destinatario) {
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

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
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
