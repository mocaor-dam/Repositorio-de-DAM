package Boletin4_2.Ejercicio7;

public class Equipo {
    private final String nombre;
    private final String ciudad;
    private final String estadio;
    private int partidosGanados;

    public Equipo(String nombre, String ciudad, String estadio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.partidosGanados = 0;
    }

    public void incrementarPartidosGanados() {
        this.partidosGanados++;
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre +
                " | Ciudad: " + ciudad +
                " | Estadio: " + estadio +
                " | Partidos ganados: " + partidosGanados;
    }

    public String getNombre() {
        return nombre;
    }
}
