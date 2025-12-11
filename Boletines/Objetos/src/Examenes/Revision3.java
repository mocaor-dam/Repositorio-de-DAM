package Examenes;

import java.time.LocalDate;
import java.time.Period;

public class Revision3 {
    private LocalDate fecha;
    private boolean estado;
    private Period periodo;

    public Revision3(LocalDate fecha, Period periodo) {
        this.fecha = fecha;
        this.periodo = periodo;
        estaListaLaItv();
    }

    public void estaListaLaItv(){
        estado = !fecha.plus(periodo).isBefore(LocalDate.now());
    }

    public boolean isEstado() {
        return estado;
    }
}
