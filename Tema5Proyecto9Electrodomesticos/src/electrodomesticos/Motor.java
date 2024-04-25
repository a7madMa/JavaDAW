package electrodomesticos;

/**
 * Esta clase consta del motor que irá asignado a cada lavadora
 * 
 * @version 1-2024
 * @author Ahmad since 15-04-2024
 * 
 */

public class Motor {

	private int id; // id de la lavadora
	private String fabricante; // Fabricante de la lavadora
	private String modelo; // Modelo de la lavadora

	/**
	 * Método Constructor del Motor
	 * 
	 * @param id         -id de la lavadora
	 * @param fabricante -Fabricante de la lavadora
	 * @param modelo     -Modelo de la lavadora
	 */
	public Motor(int id, String fabricante, String modelo) {

		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;

	}

	/**
	 * Método getter para obtener el Fabricante
	 * 
	 * @return el fabricante del motor
	 */

	public String getFabricante() {
		return fabricante;
	}

}
