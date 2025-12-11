package Examenes.Pelicula;

import Exceptions.PeliculaException;

public class Pelicula {
    private String titulo;
    private int añoDeEstreno;
    private String director;
    private double presupuesto;
    private double recaudacion;
    private String cadena;
    private String etiquetas;
    private double valoracion;

    public Pelicula(String titulo, int añoDeEstreno, String director, double presupuesto, double recaudacion, String cadena, String etiquetas) {
        this.titulo = titulo;
        this.añoDeEstreno = añoDeEstreno;
        this.director = director;
        this.presupuesto = presupuesto;
        this.recaudacion = recaudacion;
        this.cadena = cadena;
        this.etiquetas = etiquetas;

    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public double setValoracion() {
       double valoracion = (recaudacion*5)/presupuesto;
       if (valoracion>10.0){
            return 10.0;
       }
        return valoracion;
    }


    public void setAñoDeEstreno(int añoDeEstreno) throws PeliculaException {
        if (añoDeEstreno<0){
            throw new PeliculaException("El año de estreno no puede ser negativo");
        }
        
        this.añoDeEstreno = añoDeEstreno;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", añoDeEstreno=" + añoDeEstreno +
                ", director='" + director + '\'' +
                ", presupuesto=" + presupuesto +
                ", recaudacion=" + recaudacion +
                ", cadena='" + cadena + '\'' +
                ", etiquetas='" + etiquetas + '\'' +
                ", valoracion=" + valoracion +
                '}';
    }
}
