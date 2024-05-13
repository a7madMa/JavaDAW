package ejemplosListas;

import java.util.Objects;

public class Mascota {

	private String nombre;
	private String raza;
	private int edad;

	public Mascota(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	// TODO: Crear un método equals que compare dos mascotas mirando sus tres
	// atributos.

	@Override
	public String toString() {
		return "nombre:" + nombre + ", raza:" + raza + ", edad:" + edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, raza);
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

		Mascota mascota = (Mascota) obj;

		if (nombre.equals(mascota.getNombre()) && raza.equals(mascota.getRaza()) && edad == (mascota.getEdad())) {

			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}

}