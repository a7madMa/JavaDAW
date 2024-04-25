package electrodomesticos;

/**
 * Esta clase consta de la creación de una lavadora
 * 
 * @version 1-2024 since 15-04-2024
 * @author ahmad
 * 
 */

public class Lavadora {

	private int id; // id de la lavadora
	private Motor motor; // motor
	private String marca; // Marca
	private float precio; // Precio
	private static int iva; // Iva añadido al precio de la lavadora

	/**
	 * 
	 * Método Constructor de la lavadora
	 * 
	 * @param id     - id de la lavadora
	 * @param motor  - Motor
	 * @param marca  - Marca
	 * @param precio -Precio
	 */

	public Lavadora(int id, Motor motor, String marca, float precio) {

		this.id = id;
		this.motor = motor;
		this.marca = marca;
		this.precio = precio;

	}

	/**
	 * Método toString que imprime la lavadora en pantalla
	 */

	public String toString() {

		return "Código: " + id + ", Motor: " + motor.getFabricante() + ", Marca: " + marca + ", Precio: " + precio
				+ ".";
	}

	/**
	 * Getter del id
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter del id
	 * 
	 * @param id identificador de la lavadora
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Método que coge todos los atributos del motor de la clase motor
	 * 
	 * @return Atributos del motor
	 */

	public Motor getMotor() {
		return motor;
	}

	/**
	 * Metodo Setter de motor
	 * 
	 * @param motor
	 */

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * Getter Marca
	 * 
	 * @return
	 */

	public String getMarca() {
		return marca;
	}

	/**
	 * Setter de marca
	 * 
	 * @param marca
	 */

	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Getter de precio
	 * 
	 * @return
	 */

	public float getPrecio() {
		return precio;
	}

	/**
	 * Setter de Precio
	 * 
	 * @param precio
	 */

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * Getter de Iva
	 * 
	 * @return
	 */

	public static int getIva() {
		return iva;
	}

	/**
	 * Setter Iva
	 * 
	 * @param iva
	 */

	public static void setIva(int iva) {
		Lavadora.iva = iva;
	}

}
