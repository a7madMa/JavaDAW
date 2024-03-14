import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cual es la temperatura corporal? ");

		float temp = entrada.nextFloat();

		String diagnostico;

//		if(temp <= 36.5) {
//			
//			diagnostico = "Estas sano como una manzana";
//		}else {
//			diagnostico = "Tienes fiebre.";
//		}

		diagnostico = (temp <= 36.5) ? "Estas sano como una manzana" : "Tienes fiebre.";

		System.out.println("Diagnóstico: " + diagnostico);

	}

}
