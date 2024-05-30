package repasoExamen;

import java.io.File;
import java.util.Scanner;

public class CrearRistasCarpetas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una rista de carpetas y te la creo");

		String ristaCarpeta = entrada.nextLine();

		String rutaCarpetaPersonal = System.getProperty("user.home");

		File nuevaCarpeta = new File(rutaCarpetaPersonal + "/" + ristaCarpeta);
		System.out.println("Se van a crear la carpetas: " + rutaCarpetaPersonal + "/" + ristaCarpeta);

		boolean resultado = nuevaCarpeta.mkdirs();

		if (resultado) {
			System.out.println("ok");
		} else {
			System.out.println("ERROR");
		}

	}

}
