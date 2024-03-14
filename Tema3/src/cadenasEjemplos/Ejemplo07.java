package cadenasEjemplos;

public class Ejemplo07 {

	public static void main(String[] args) {

		double pulgadasTv = 15.6;
		
		String pulgadas = String.valueOf(pulgadasTv);
		
		
		//forma mas rápida
		
		String pulgadas2 = "" + pulgadasTv;
		
		System.out.println("El tamaño del monitor es de " + pulgadas + " pulgadas");

	
	}

}
