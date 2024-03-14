package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;

	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Numero de expediente: ");
		numExpediente = entrada.nextInt();

		System.out.println("Apellidos: ");
		apellidos = entrada.nextLine();

		System.out.println("Nombre: ");
		nombre = entrada.nextLine();

		grupo = new Grupo();

		grupo.leeDatos();

	}

	public int getNumExpediente() {
		return numExpediente;
	}
}
