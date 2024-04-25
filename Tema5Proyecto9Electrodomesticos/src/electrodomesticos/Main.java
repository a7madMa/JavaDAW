package electrodomesticos;

/**
 * Método en el cual se prueban todos los otros métodos de las otras clases
 * 
 * @version 1-2024
 * @author ahmad since 15-04-2024
 */

public class Main {

	public static void main(String[] args) {

		Motor motor1 = new Motor(1, "Mitsubishi", "V3");
		Motor motor2 = new Motor(2, "Samsung", "A1");

		Lavadora lavadora1 = new Lavadora(201, motor1, "Balay", 450);
		Lavadora lavadora2 = new Lavadora(202, motor2, "Edesa", 410);
		Lavadora lavadora3 = new Lavadora(203, motor2, "Edesaaa", 410);

		Taller taller1 = new Taller();

		// toString Lavadora

		System.out.println("Primera lavadora");
		System.out.println(lavadora1.toString());

		// Agregamos lavadoras

		taller1.addLavadora(lavadora1);
		taller1.addLavadora(lavadora2);
		taller1.addLavadora(lavadora3);

		taller1.listaLavadoras();

		// Borramos lavadoras
		taller1.borraLavadora(201);

		taller1.listaLavadoras();

		// Borramos una lavadora que no existe
		taller1.borraLavadora(5);

		// Buscamos una lavadora
		System.out.println("La lavadora 3 se encuentra en la posicion " + taller1.buscaLavadora(203));

	}

}
