package Persona;

public class Main {
	public static void main(String[] args) {
		Escuela escuela = new Escuela();
		
		//Clases
		
		Clase claseA = new Clase("Clase1");
		Clase claseB = new Clase("Clase2");
		
		//Profesores
		
		Profesor profesor1 = new Profesor ("Juan");
		Profesor profesor2 = new Profesor("Luis");
		
		//Cursos
		
		Curso curso1 = new Curso("Programacion 2");
		Curso curso2 = new Curso("Programacion wed");
		
		//Estudiantes
		
		Estudiante estudiante1 = new Estudiante("Brian", 1553);
		Estudiante estudiante2 = new Estudiante("Carlos", 4522);
		
		profesor1.agregarCurso(curso1);
		profesor2.agregarCurso(curso2);
		
		claseA.agregarProfesor(profesor1);
		claseB.agregarProfesor(profesor2);
		
		claseA.agregarEstudiante(estudiante1);
		claseB.agregarEstudiante(estudiante2);
		
		escuela.agregarClase(claseA);
		escuela.agregarClase(claseB);
		
		escuela.mostrarClases(escuela);
	}
}


