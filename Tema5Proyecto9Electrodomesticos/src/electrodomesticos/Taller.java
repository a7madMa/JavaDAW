package electrodomesticos;

import java.util.Iterator;

/**
 * Este clase consta de un taller de lavadoras donde podremos ver listado de las
 * lavadoras,añadirlas, borrarlas y buscarlas
 * 
 * @version 1-2024
 * @author Ahmad since 15-04-2024
 * 
 * 
 */

public class Taller {

	private final int MAX_LAVADORAS = 20; // Número máximo de lavadoras del taller
	private Lavadora lavadoras[] = new Lavadora[20]; // Array de Lavadora

	/**
	 * Método que nos muestra el listado de las lavadoras que se encuentran en stock
	 * 
	 */
	public void listaLavadoras() {

		System.out.println("\n---LISTADO DE LAVADORAS EN STOCK---");

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null) {
				System.out.println(lavadoras[i].toString());
			}

		}

	}

	/**
	 * Método que me permite añadir una lavadora al taller
	 * 
	 * @param lav -Nombre de la lavadora que se va a ingresar
	 */

	public void addLavadora(Lavadora lav) {

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] == null) {
				lavadoras[i] = lav;
				break;
			}

		}

	}

	/**
	 * Método que nos permite buscar una lavadora a partir de su código id
	 * 
	 * @param id -Código indentificativo de una lavadora
	 * @return si encuentra la lavadora nos devolverá el id y sino nos devolverá un
	 *         -1
	 */

	public int buscaLavadora(int id) {

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null && id == lavadoras[i].getId()) {
				return i;
			}

		}
		return -1;

	}

	/**
	 * Método que nos permite borrar una lavadora del taller a partir de su id
	 * 
	 * @param id -Código indentificativo de una lavadora
	 */

	public void borraLavadora(int id) {

		int pos = buscaLavadora(id);

		if (pos != -1) {
			lavadoras[pos] = null;
		}
	}

}
