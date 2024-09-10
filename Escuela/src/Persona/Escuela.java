package Persona;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
	private List<Clase> clases;
	
	public Escuela () {
        this.clases = new ArrayList<>();
	}
	
	public List<Clase> getClases() {
		return clases;
	}
	
	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}
	
	public void agregarClase(Clase clase) {
		clases.add(clase);
	}
	
	public void mostrarClases(Escuela escuela) {
        for (Clase clase : escuela.getClases()) {
        	System.out.println("-----------------------------------");
            System.out.println("Clase: " + clase.getIdentificadorCurso());
            System.out.println("Profesores:");
            for (Profesor profesor : clase.getProfesores()) {
                System.out.println(" - " + profesor.getNombre());
                for (Curso curso : profesor.getCursos()) {
                    System.out.println("   Curso: " + curso.getNombreCurso());
                }
            }
            System.out.println("Estudiantes:");
            for (Estudiante estudiante : clase.getEstudiantes()) {
                System.out.println(" - " + estudiante.getNombre() + " (Matricula: " + estudiante.getMatricula() + ")");
            }
        }
	}
}
