package Boletin4_2.Ejercicio7;

import Exceptions.PartidoException;

public class Partido {
    private final Equipo equipoLocal;
    private final Equipo equipoVisitante;
    private final int jornada;
    private Integer golesEquipoLocal;
    private Integer golesEquipoVisitante;
    private Character quiniela;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int jornada) throws PartidoException {
        if (equipoLocal == null || equipoVisitante == null)
            throw new PartidoException("Los equipos no pueden ser nulos");
        if (equipoLocal.getNombre().equals(equipoVisitante.getNombre()))
            throw new PartidoException("Los equipos local y visitante deben ser diferentes");
        if (jornada < 1 || jornada > 38)
            throw new PartidoException("Jornada debe estar entre 1 y 38");

        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.jornada = jornada;
        this.golesEquipoLocal = null;
        this.golesEquipoVisitante = null;
        this.quiniela = null;
    }

    public void ponerResultado(String resultado) throws PartidoException {
        if (resultado == null || !resultado.matches("\\d+-\\d+"))
            throw new PartidoException("Formato de resultado incorrecto, debe ser \"x-y\" con números");

        String[] partes = resultado.split("-");
        int golesLocal = Integer.parseInt(partes[0]);
        int golesVisitante = Integer.parseInt(partes[1]);

        this.golesEquipoLocal = golesLocal;
        this.golesEquipoVisitante = golesVisitante;

        // Actualizar quiniela y partidos ganados
        if (golesLocal > golesVisitante) {
            this.quiniela = '1';
            equipoLocal.incrementarPartidosGanados();
        } else if (golesLocal < golesVisitante) {
            this.quiniela = '2';
            equipoVisitante.incrementarPartidosGanados();
        } else {
            this.quiniela = 'X';
        }
    }

    @Override
    public String toString() {
        if (golesEquipoLocal == null || golesEquipoVisitante == null) {
            return "Partido entre equipo local " + equipoLocal.getNombre() +
                    " y equipo visitante " + equipoVisitante.getNombre() +
                    " todavía no se ha jugado";
        } else {
            return "Partido entre equipo local " + equipoLocal.getNombre() +
                    " y el equipo visitante " + equipoVisitante.getNombre() +
                    " jugado en el estadio " + equipoLocal.getNombre() +
                    " de la ciudad " + equipoLocal.getNombre() +
                    " ha finalizado con " + golesEquipoLocal +
                    " goles de equipo local y " + golesEquipoVisitante +
                    " goles de equipo visitante. Resultado quiniela= " + quiniela;
        }
    }
}
