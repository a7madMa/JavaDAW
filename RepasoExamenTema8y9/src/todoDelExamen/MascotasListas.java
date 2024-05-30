package todoDelExamen;

import java.util.Objects;

public class MascotasListas {

	private String nombre;
	private String raza;
	private int edad;

	public MascotasListas(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
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
		MascotasListas mascota = (MascotasListas) obj;
		if (nombre.equals(mascota.getNombre()) && raza.equals(mascota.getRaza()) && edad == mascota.getEdad()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad;
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

	public static void main(String[] args) {

		MascotasListas mascota1 = new MascotasListas("PEDRO", "pitbull", 1);
		MascotasListas mascota2 = new MascotasListas("alberto", "huskey", 2);
		MascotasListas mascota3 = new MascotasListas("madrid", "salchicha", 3);
		MascotasListas mascota4 = new MascotasListas("PEDRO", "pitbull", 1);

		ClienteListas cliente1 = new ClienteListas("pascal", "pedro", "12154");
		ClienteListas cliente2 = new ClienteListas("salas", "paco", "12154");
		ClienteListas cliente3 = new ClienteListas("bernart", "alberto", "12154");
		ClienteListas cliente4 = new ClienteListas("pascal", "pedro", "12154");

		System.out.println("Son iguales la mascota1 y la mascota4? " + mascota1.equals(mascota4));

		System.out.println("Son iguales la mascota1 y la mascota2? " + mascota1.equals(mascota2));

		System.out.println("Son iguales el cliente1 y el cliente4? " + cliente1.equals(cliente4));
		System.out.println("Son iguales el cliente1 y el cliente4? " + cliente1.equals(cliente2));

	}

}
