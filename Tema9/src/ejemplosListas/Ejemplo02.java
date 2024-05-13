package ejemplosListas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02 {

	public static void main(String[] args) {

		// Creamos un ArrayList que va a almacenar objetos Cliente.
		List<Cliente> clientes = new ArrayList<>();

		// Creamos unos clientes.
		Cliente cliente1 = new Cliente("Martínez", "Luis", "22001177H");
		Cliente cliente2 = new Cliente("Fernández", "Amaya", "18922811D");
		Cliente cliente3 = new Cliente("López", "Marta", "16177399A");

		// Los añadimos al ArrayList.
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);

		// Mostramos los valores del ArrayList.
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}

		// Queremos eliminar a Amaya Fernández.
		clientes.remove(new Cliente("Fernández", "Amaya", "18922811D"));

		System.out.println();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}

		// Algunas pruebas con el equals() de Cliente.
//		System.out.println("\n\n");
//		System.out.println(cliente1.equals(cliente1));
//		System.out.println(cliente1.equals(null));
//		System.out.println(cliente1.equals("Pulpo"));

		// Creamos un ArrayList de Mascotas.
		List<Mascota> mascota = new ArrayList<>();

		// Creamos algunos objetos Mascota

		Mascota mascota1 = new Mascota("Tyson", "Rottweiler", 3);
		Mascota mascota2 = new Mascota("Luna", "Husky", 5);
		Mascota mascota3 = new Mascota("Crispy", "Golden", 7);

		// Algunas pruebas con el equals() de Mascota.
		System.out.println("\n\n");
		System.out.println(mascota1.equals(mascota1));
		System.out.println(mascota1.equals(null));
		System.out.println(mascota1.equals("Pulpo"));
	}

}