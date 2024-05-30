package todoDelExamen;

import java.util.Objects;

public class Propietario {

	private String dni;
	private String nombre;
	private String apellidos;

	public Propietario(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Propietario propietario = (Propietario) obj;
//		return (dni.equals(propietario.dni) && nombre.equals(propietario.nombre)
//				&& apellidos.equals(propietario.apellidos));
//		

		if (dni.equals(propietario.getDni()) && nombre.equals(propietario.getNombre())
				&& apellidos.equals(propietario.getApellidos())) {
			return true;
		}
		return false;
	}

	// Métodos:
	public String toString() {
		return "\nDNI: " + dni + "\nNombre: " + nombre + "\nApellidos: " + apellidos;
	}

	// getters y setters:
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}