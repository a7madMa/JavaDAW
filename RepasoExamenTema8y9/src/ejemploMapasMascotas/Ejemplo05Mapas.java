package ejemploMapasMascotas;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo05Mapas {

	public static void main(String[] args) {

		Map<Mascota, Propietario> clinica = new HashMap<>();

		Mascota mascota1 = new Mascota(1, "Mishu", "Gato");
		Mascota mascota2 = new Mascota(202, "Funky", "Gato");
		Mascota mascota3 = new Mascota(145, "Bebop", "Periquito");

		Propietario propietario1 = new Propietario("100100F", "Pedro", "Pascal");
		Propietario propietario2 = new Propietario("20200300H", "Marga", "Rita");
		Propietario propietario3 = new Propietario("40500600K", "Tati", "Ana");

		clinica.put(mascota1, propietario1);
		clinica.put(mascota2, propietario2);
		clinica.put(mascota3, propietario3);

		for (Mascota mascota : clinica.keySet()) {
			System.out.println(mascota.getNombre() + clinica.get(mascota).toString() + "\n");

		}

	}

}
