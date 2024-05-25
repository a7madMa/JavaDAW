package eval3Prac2Enunciado;

public class Alumno {

	private String nombre;
	private int nota;

	public Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	@Override
	public String toString() {
		if (nota != -1) {
			return nombre + " (" + nota + ")";
		} else {
			return nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
