package Electrodomesitcos;

public class Taller {

	private int MAX_LAVADORAS = 20;
	private Lavadora lavadoras[] = new Lavadora[20];

	public void listaLavadoras() {

		System.out.println("\n--- LISTADO DE LAVADORAS EN STOCK ---");

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null) {
				System.out.println(lavadoras[i].toString());
			}

		}

	}

	public void addLavadora(Lavadora lava) {

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null) {
				lavadoras[i] = lava;
				break;
			}

		}

	}

	public int buscaLavadora(int id) {

		for (int i = 0; i < lavadoras.length; i++) {

			if (lavadoras[i] != null && lavadoras[i].getId() == id) {
				return i;
			}

		}
		return -1;

	}

	public void borraLavadora(int id) {

		int pos = buscaLavadora(id);

		if (pos != -1) {
			lavadoras[pos] = null;
		}

	}
}
