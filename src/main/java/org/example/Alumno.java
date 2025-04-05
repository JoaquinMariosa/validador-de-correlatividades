package org.example;

import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private int legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, int legajo, List<Materia> materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
