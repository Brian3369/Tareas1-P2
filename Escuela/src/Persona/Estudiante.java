package Persona;

public class Estudiante extends Persona{
	private int matricula;
	
	public Estudiante(String nombre, int matricula) {
		super(nombre);
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
