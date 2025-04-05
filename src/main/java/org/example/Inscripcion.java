package org.example;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public boolean aprobada() {
        for (Materia materia : materias) {
            if (materia.getCorrelativas() != null && !alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas())) {
                return false;
            }
        }

        return true;
    }
}
