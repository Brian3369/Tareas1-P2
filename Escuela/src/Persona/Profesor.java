package Persona;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
	private List<Curso> cursos;
	
	public Profesor(String nombre) {
		super(nombre);
		this.cursos = new ArrayList<>();
	}
	
	public List<Curso> getCursos(){
		return cursos;
	}
	
	public void agregarCurso(Curso curso) {
		cursos.add(curso);
	} 
	
	public List<Curso> getCursosProfesor(){
		return cursos;
	}
}
