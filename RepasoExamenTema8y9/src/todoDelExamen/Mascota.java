package todoDelExamen;

import java.util.Objects;

public class Mascota {

	private int id;
	private String nombre;
	private String especie;

	public Mascota(int id, String nombre, String especie) {
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
	}

	@Override
	public int hashCode() {
		return Objects.hash(especie, id, nombre);
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
		if (id == mascota.id && nombre.equals(mascota.nombre) && especie.equals(mascota.especie)) {
			return true;
		}
		return false;
		// return Objects.equals(especie, other.especie) && id == other.id &&
		// Objects.equals(nombre, other.nombre);
	}

	// Métodos:
	public String toString() {
		return nombre + " " + especie + " (" + id + ")\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}