package ejemplosSets;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo02 {

	public static void main(String[] args) {

		Set<Mascota> mascotas = new HashSet<>();

		mascotas.add(new Mascota(1, "Pedro Sanchez", "Podemita")); // 1
		mascotas.add(new Mascota(2, "El Coletas", "Catalufo")); // 2
		mascotas.add(new Mascota(3, "Francisco Franco", "Facha")); // 3
		mascotas.add(new Mascota(4, "Iker Molina Hugen", "Evangelico")); // 4
		mascotas.add(new Mascota(2, "El Coletas", "Catalufo"));
		mascotas.add(new Mascota(4, "Iker Molina Hugen", "Evangelico"));
		mascotas.add(new Mascota(4, "Iker Molina Hugen", "Evangelico")); 
		mascotas.add(new Mascota(4, "Iker Molina Hugen", "Evangelico"));
		mascotas.add(new Mascota(4, "Iker Molina Hugen", "Evangelico"));
		mascotas.add(new Mascota(6, "Iker Molina Hugen", "Evangelico")); // 5

		System.out.println("Hay " + mascotas.size() + " Mascotas.");

	}

}
