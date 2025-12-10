package Examenes.Avion;

import java.time.LocalDate;

public class Revision {
    private LocalDate fecha;
    private boolean estado;
    private int validez;

    public Revision(LocalDate fecha, boolean estado, int validez) {
        this.fecha = fecha;
        this.estado = estado;
        this.validez = validez;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getValidez() {
        return validez;
    }
}
