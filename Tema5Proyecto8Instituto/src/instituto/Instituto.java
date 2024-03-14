package instituto;

import java.util.Iterator;

import auxiliar.Alumno;

public class Instituto {

	private final int MAX_ALUMNOS = 20;
	private Alumno alumnos[] = new Alumno[20];

	public void addAlumno(Alumno alumno) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return;
			}

		}
	}

	public void delAlumno(int numExpediente) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExpediente) {

				alumnos[i] = null;
				break;
			}
		}

	}

	public void muestraAlumnos() {
		System.out.println("----ALUMNOS DE IES SONFERRER----");

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
		System.out.println();

	}

	public int numAlumnos() {
		int numAlumn = 0;
		for (int i = 0; i < this.alumnos.length; i++) {
			if (alumnos[i] != null) {
				numAlumn++;
			}

		}

		return numAlumn;

	}

	public int buscaAlumno(int numExp) {

		for (int i = 0; i < alumnos.length; i++) {

			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExp) {
			}
			return i;

		}

		return -1;
	}

}
