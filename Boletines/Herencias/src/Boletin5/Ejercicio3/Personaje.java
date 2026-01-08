package Boletin5.Ejercicio3;

import Exceptions.PersonajeException;

public class Personaje {
    private String nombre;
    private Raza raza;
    private int fuerza;
    private int inteligencia;
    private int puntosDeVidaMaximos;
    private int puntosDeVidaActuales;

    public Personaje(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMaximos, int puntosDeVidaActuales) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.puntosDeVidaMaximos = puntosDeVidaMaximos;
        this.puntosDeVidaActuales = puntosDeVidaActuales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getFuerza() {

        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < 0 || fuerza > 20){
            throw new PersonajeException("Los valores de fuerza deben ser entre 0 y 20");
        }
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 0 || inteligencia > 20){
            throw new PersonajeException("Los valores de inteligencia deben ser entre 0 y 20");
        }
        this.inteligencia = inteligencia;
    }

    public int getPuntosDeVidaMaximos() {
        return puntosDeVidaMaximos;
    }

    public void setPuntosDeVidaMaximos(int puntosDeVidaMaximos) throws PersonajeException {
        if (puntosDeVidaMaximos < 0 || puntosDeVidaMaximos > 100){
            throw new PersonajeException("Los valores de la vida maxima deben ser entre 0 y 100");
        }
        this.puntosDeVidaMaximos = puntosDeVidaMaximos;
    }

    public int getPuntosDeVidaActuales() {
        return puntosDeVidaActuales;
    }

    public void setPuntosDeVidaActuales(int puntosDeVidaActuales) throws PersonajeException {
        if (puntosDeVidaActuales < 0 || puntosDeVidaActuales > puntosDeVidaMaximos){
            throw new PersonajeException("Los valores de la vida actual deben ser entre 0 y los puntos de vida maximos");
        }
        this.puntosDeVidaActuales = puntosDeVidaActuales;
    }
}
