package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int anyoNacimiento;

	public Autor(String nombre, String email, int anyoNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.anyoNacimiento = anyoNacimiento;
	}

	public Autor(String nombre) {
		this(nombre, "Unknown", 0);
//		También podríamos haber escrito:
//		this.nombre = nombre;
//		this.email = "Unknown";
//		this.anyoNacimiento = 0;
	}

	public String toString() {
		return "Nombre: " + nombre + ", Email: " + email + ", Año de nacimiento: " + anyoNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

}
