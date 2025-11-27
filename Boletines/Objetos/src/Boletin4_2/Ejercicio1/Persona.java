package Boletin4_2.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Moises Cabanillas Ortega
 * @Version 1.0
 */
public class Persona {
    //Atributos
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private int dni;
    private char sexo;
    private float altura;
    private float peso;

    public Persona(String nombre, LocalDate fechaDeNacimiento, int dni, char sexo, float altura, float peso) {
        setNombre(nombre);
        setFechaDeNacimiento(fechaDeNacimiento);
        setDni(dni);
        setSexo(sexo);
        setAltura(altura);
        setPeso(peso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public char getLetraDni(){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return letras.charAt(resto);
    }

    //Metodo para calcular el indice de masa corporal
    public float calcularIMC(){
        return (float) (peso / Math.pow(altura,2));
    }

    public int calcularEdad(){
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
