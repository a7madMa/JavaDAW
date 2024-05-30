package todoDelExamen;

import java.util.ArrayList;

public class MetodoListas {

	public static void main(String[] args) {

		ArrayList<ClienteListas> clientes = new ArrayList<>();

		ClienteListas cliente1 = new ClienteListas("pascal", "pedro", "12154");
		ClienteListas cliente2 = new ClienteListas("salas", "paco", "12154");
		ClienteListas cliente3 = new ClienteListas("bernart", "alberto", "12154");

		// Añdimos los clientes al ArrayList

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);

		// Para mostrar los clientes usamos un for-each

		for (ClienteListas clienteListas : clientes) {
			System.out.println(clienteListas.toString());

		}

	}

}
