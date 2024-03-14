package hoja1;

public class Ejer03 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Uranus", "Neptuno" };
		double[] densidades = { 5.4, 5.2, 5.5, 3.9, 1.3, 0.7, 1.3, 1.6 };

		for (int i = 0; i < densidades.length; i++) {

			System.out.println(" la densidad de: " + planetas[i] + " és " + densidades[i] +  " g/cm3");
		}

	}

}
