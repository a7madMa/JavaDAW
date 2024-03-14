package cadenasEjemplos;

public class Ejemplo06 {

	public static void main(String[] args) {

		String palabra1 = "Milán", palabra2 = "Florencia";

		if (palabra1.compareTo(palabra2) < 0) {
		

			System.out.println(palabra1 + " va antes de " + palabra2);

		} else if (palabra1.compareTo(palabra2) == 0) {

			System.out.println(palabra1 + " es igual a " + palabra2);

		} else {

			System.out.println(palabra1 + " va después de " + palabra2);
		}
		System.out.println(palabra1.compareTo(palabra2));
	}

}
