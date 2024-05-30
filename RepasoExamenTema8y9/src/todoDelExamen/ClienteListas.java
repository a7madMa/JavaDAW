package todoDelExamen;

import java.util.Objects;

public class ClienteListas {

	private String apellidos;
	private String nombre;
	private String dni;

	public ClienteListas(String apellidos, String nombre, String dni) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
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

		ClienteListas cliente = (ClienteListas) obj;
		if (apellidos.equals(cliente.getApellidos()) && nombre.equals(cliente.getNombre())
				&& dni.equals(cliente.getDni())) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return nombre + " " + apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
