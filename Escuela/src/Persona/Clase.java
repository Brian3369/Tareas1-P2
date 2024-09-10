package Persona;
import java.util.ArrayList;
import java.util.List;

public class Clase {
	public String identificadorCurso;
	private List<Profesor> Profesores;
	private List<Estudiante> Estudiantes;
	
	public Clase (String identificadorCurso) {
		this.identificadorCurso = identificadorCurso;
		this.Profesores = new ArrayList<>();
		this.Estudiantes = new ArrayList<>();
	}
	
	public String getIdentificadorCurso() {
		return identificadorCurso;
	}
	
	public void setIdentificadorCurso(String identificadorCurso) {
		this.identificadorCurso = identificadorCurso;
	}
	
	public List<Profesor> getProfesores(){
		return Profesores;
	}
	
	public void setProfesores(List<Profesor> Profesores) {
		this.Profesores = Profesores;
	}
	
	public List<Estudiante> getEstudiantes(){
		return Estudiantes;
	}
	
	public void setEstudiantes(List<Estudiante> Estudiantes) {
		this.Estudiantes = Estudiantes;
	}
	
	public void agregarProfesor(Profesor profesor) {
		this.Profesores.add(profesor);
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		this.Estudiantes.add(estudiante);
	}
}
