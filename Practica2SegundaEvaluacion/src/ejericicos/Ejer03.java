package ejericicos;

public class Ejer03 {

	public static void main(String[] args) {

		String xml = "<factura><fecha>2023-12-20</fecha><cliente>Rubén Martínez</cliente><articulos><articulo><nombre>Cuaderno Oxford A4</nombre><precio>3.25</precio></articulo><articulo><nombre>Archivador</nombre><precio>4</precio></articulo><articulo><nombre>Grapadora grande</nombre><precio>5.5</precio></articulo></articulos></factura>";

		System.out.println("#### MI JAVA PARSER ####");

		// Obtenemos la fecha de la factura
		// Creando dos Strings, uno para el inicio de la cadena y otro para el final.

		String inicioFecha = "<fecha>";
		String finFecha = "</fecha>";
		int inicioFechaIndex = xml.indexOf(inicioFecha) + inicioFecha.length();
		int finFechaIndex = xml.indexOf(finFecha);

		String fecha = xml.substring(inicioFechaIndex, finFechaIndex);
		System.out.println("\nFecha:");
		System.out.println(fecha);

		// Obtener el listado de artículos comprados
		String inicioNombre = "<nombre>";
		String finNombre = "</nombre>";

		int indexNombre = xml.indexOf(inicioNombre);

		System.out.println("\nArtículos: ");
		while (indexNombre != -1) {
			int finNombreIndex = xml.indexOf(finNombre, indexNombre + inicioNombre.length());

			String nombre = xml.substring(indexNombre + inicioNombre.length(), finNombreIndex);

			System.out.println("  *" + nombre);

			// Buscar el siguiente par de etiquetas
			indexNombre = xml.indexOf(inicioNombre, finNombreIndex);

		}
	}
}