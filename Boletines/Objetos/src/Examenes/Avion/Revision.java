package Examenes.Avion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAmount;

public class Revision {
    private LocalDate fecha;
    private boolean estado;
    private Period validez;

    public Revision(LocalDate fecha, boolean estado, Period validez) {
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

    public Period getValidez() {
        return validez;
    }
}
