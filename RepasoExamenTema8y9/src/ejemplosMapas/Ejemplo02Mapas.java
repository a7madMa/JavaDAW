package ejemplosMapas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo02Mapas {

	public static void main(String[] args) {

		Map<Cliente, Ficha> registros = new HashMap<>();

		Cliente cliente1 = new Cliente("Martínez", "Nuria", "15200300R");
		Cliente cliente2 = new Cliente("Martínez", "Nuria", "15200300R");
		Cliente cliente3 = new Cliente("González", "Francisco", "30120120D");

		Ficha ficha1 = new Ficha(2000, "España", "1200-1200-1000-1000");
		Ficha ficha2 = new Ficha(1990, "Italia", "0000-1111-2222-3333");
		Ficha ficha3 = new Ficha(2005, "España", "3000-1000-2000-5000");

		registros.put(cliente1, ficha1);
		registros.put(cliente2, ficha2);
		registros.put(cliente3, ficha3);

		System.out.println(registros.get(cliente1).toString());
		System.out.println("\n" + registros.get(cliente2).toString());

		// Recorremos el mapa completo

		System.out.println("\nListdo completo del mapa");

		System.out.println("\nListado de clientes:");
		for (Cliente cliente : registros.keySet()) {
			System.out.println(cliente.toString() + "\n" + registros.get(cliente).toString());
		}
	}

}
