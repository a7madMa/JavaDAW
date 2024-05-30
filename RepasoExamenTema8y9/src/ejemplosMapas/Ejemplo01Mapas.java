package ejemplosMapas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo01Mapas {

	public static void main(String[] args) {

		// Asi se declara un mapa

		Map<String, String> coches = new HashMap<>();

		// Asi se puede añadir coches al mapa

		coches.put("1000DEF", "Peugeot 308 5P");
		coches.put("2000EBA", "Mercedes Clase CL200");
		coches.put("3000ABC", "Renault Megan");

		// Accedemos a la informacion (valor) de un coce a partir de su matricula (id)

		System.out.println(coches.get("1000DEF"));

		// Asi se muestra el contenido del mapa.

		System.out.println(coches.toString());

		// Para borrar un coche del mapa se usa:

		coches.remove("1000DEF");

		// Mostramos el contenido del mapa para ver como se ha borrado

		System.out.println(coches.toString());
		// Efecitvamente se ha borrado.

		// Comprobamos si una matricula (id) existe en el mapa
		// Devuelve tru si exite y false si no.
		System.out.println("Existe la matricula 2000EBA en el mapa? " + coches.containsKey("2000EBA"));

		// Comprobamos si exsite el valor( nombre del coche) en el mapa.
		System.out.println("Existe el coche Renault Megan? " + coches.containsValue("Renault Megan"));

		// Para reemplazar un valor.

		coches.replace("2000EBA", "Mercedes CL200");
		System.out.println(coches.toString());

		// Añadimos un coche siempre que no exite la clave (id)

		coches.putIfAbsent("15000GFT", "Ford Fiesta");
		System.out.println(coches.toString());

		// Como recorrer un mapa: Sirve para que se muestre
		// Usando .keySet() ===> muestra el id

		System.out.println("\nMapa:");
		for (String matricula : coches.keySet()) {
			System.out.println(matricula + "\t\t" + coches.get(matricula));

		}
		// Como recorrer un mapa: Sirve para que se muestre
		// Usando .values() ===> muestra el valor (nombre del coche)

		System.out.println("\nMapa:");
		for (String descripcion : coches.values()) {
			System.out.println(descripcion);

		}

		// Mostramos el tamaño del coche

		System.out.println("\nTamaño del mapa: " + coches.size());

		// Vemos si el mapa esta vacio:
		System.out.println("\nEsta el mapa vacio? " + coches.isEmpty());

		// Para borrar todo el contenido del mapa usamos:
		coches.clear();
		System.out.println("\nEsta el mapa vacio? " + coches.isEmpty());

	}

}
