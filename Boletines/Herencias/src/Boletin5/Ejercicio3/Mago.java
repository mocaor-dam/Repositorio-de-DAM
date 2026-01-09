package Boletin5.Ejercicio3;

import Exceptions.PersonajeException;

import java.security.PublicKey;

public class Mago extends Personaje{
    public static final int DAÑO = -10;
    public static final int TAM_ARRAY_HECHIZOS = 4;

    private String[] hechizos;

    public Mago(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMaximos, int puntosDeVidaActuales) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, puntosDeVidaMaximos, puntosDeVidaActuales);
        if (inteligencia < 17){
            throw new PersonajeException("La inteligencia debe ser mayor 17");
        }
        if (fuerza > 15){
            throw new PersonajeException("La fuerza debe tener un valor menor que 15");
        }

        this.hechizos = new String[TAM_ARRAY_HECHIZOS];

    }

    public void aprendeHechizo(){

    }



}
