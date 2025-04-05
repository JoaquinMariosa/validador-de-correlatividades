package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class InscripcionTest {
    Materia algebra = new Materia("Algebra", null);
    Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", null);
    Materia paradigmas = new Materia("Paradigmas de Programacion", List.of(algoritmos));
    Materia disenoDeSistemas = new Materia("Diseño de Sistemas", List.of(paradigmas));
    Materia administracionDeSistemas = new Materia("Administracion de Sistemas", List.of(disenoDeSistemas));

    Alumno alumno = new Alumno("Joaquin", "Mariosa", 2154500, List.of(algoritmos, paradigmas));
    Alumno alumnoSinMateriasAprobadas = new Alumno("Jorge", "Cuevas", 1687409, null);

    @Test
    @DisplayName("Test inscripcion aprobada")
    public void InscripcionAprobada() {
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(disenoDeSistemas));

        Assertions.assertEquals(true, inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion con muchas materias aprobada")
    public void InscripcionConMuchasMateriasAprobada() {
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(algebra, disenoDeSistemas));

        Assertions.assertEquals(true, inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion no aprobada")
    public void InscripcionNoAprobada() {
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(administracionDeSistemas));

        Assertions.assertEquals(false, inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion con muchas materias no aprobada")
    public void InscripcionConMuchasMateriasNoAprobada() {
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(algebra, disenoDeSistemas, administracionDeSistemas));

        Assertions.assertEquals(false, inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion sin correlatividades")
    public void InscripcionSinCorrelativas() {
        Inscripcion inscripcion = new Inscripcion(alumnoSinMateriasAprobadas, List.of(algoritmos));

        Assertions.assertEquals(true, inscripcion.aprobada());
    }
}