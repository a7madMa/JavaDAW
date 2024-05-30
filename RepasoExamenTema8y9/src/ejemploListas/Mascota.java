package ejemploListas;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, raza);
	}

	// TODO: Crear un metodo equals que compare dos mascotas mirando sus tres
	// atributos.

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

		// Castin de objeto obj para poder despues comparar.
		Mascota mascota = (Mascota) obj;

		return nombre.equals(mascota.nombre) && edad == mascota.edad && raza.equals(mascota.raza);
	}

	public static void main(String[] args) {

		// Creamos dos objetos de tipo Mascotas con los mismos atributos
		Mascota mascota1 = new Mascota("Jazz", "Labrador", 10);
		Mascota mascota2 = new Mascota("Jazz", "Labrador", 10);

		// Probamos si los objetos son iguales usando el método equals()
		boolean sonIguales = mascota1.equals(mascota2);
		System.out.println("¿Las mascotas son iguales? " + sonIguales); // Debería salir "true"

		// Creamos dos objetos de tipo Mascotas con diferentes atributos
		Mascota mascota3 = new Mascota("Funky", "Pitbull", 3);
		Mascota mascota4 = new Mascota("Jazz", "Labrador", 10);

		// Probamos si los objetos son iguales usando el método equals
		sonIguales = mascota3.equals(mascota4);
		System.out.println("¿Las mascotas son iguales? " + sonIguales); // Debería salir "false"
	}
}
