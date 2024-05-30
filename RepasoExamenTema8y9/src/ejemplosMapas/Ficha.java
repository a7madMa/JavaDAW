package ejemplosMapas;

public class Ficha {

	private int anyoNacimiento;
	private String nacionalidad;
	private String visa;

	public Ficha(int anyoNacimiento, String nacionaldiad, String visa) {

		this.anyoNacimiento = anyoNacimiento;
		this.nacionalidad = nacionaldiad;
		this.visa = visa;
	}

	@Override
	public String toString() {
		return "Año de nacimiento: " + anyoNacimiento + "\nNacionalidad: " + nacionalidad + "\nVISA: " + visa;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getNacionaldiad() {
		return nacionalidad;
	}

	public void setNacionaldiad(String nacionaldiad) {
		this.nacionalidad = nacionaldiad;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}
