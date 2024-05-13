package ejemplosListas;

import java.util.Objects;

public class Cliente {

	private String apellidos;
	private String nombre;
	private String dni;

	public Cliente(String apellidos, String nombre, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Los dos objetos son el mismo");
			return true;
		}
		if (obj == null) {
			System.out.println("El objeto con el que comparamos es null");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("Las clases de los dos objetos son diferentes");
			return false;
		}

		Cliente cliente = (Cliente) obj;

		if (apellidos.equals(cliente.getApellidos()) && nombre.equals(cliente.getNombre())
				&& dni.equals(cliente.getDni())) {
			return true;
		}

		return false;

	}

	private String getNombre() {
		return nombre;
	}

	private String getApellidos() {
		return apellidos;
	}

	private String getDni() {
		return dni;
	}

}