package ejemploJavadoc;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Clase que muestra una ventana donde el usuario puede elegir los extras de un
 * viaje.
 * <p>
 * El usuario podrá elegir uno de estos cuatro paquetes:
 * <ul>
 * <li>Billetes de avión</li>
 * <li>Transporte al aeropuerto</li>
 * <li>Hotel</li>
 * <li>Pensión completa</li>
 * </ul>
 * Esta clase utiliza la clase {@link Extras}
 * @author Carlos Sogorb
 * @version 1.0, 24 May 2024
 * @see Extras
 */
public class Ejemplo01Javadoc extends JFrame {

	/**
	 * Casilla que el usuario puede marcar para seleccionar los billetes de avión.
	 * <p>
	 * JCheckbox donde el usuario hace clic con el ratón y bla, bla, bla....
	 */
	private JCheckBox checkAvion;

	/**
	 * Casilla que el usuario puede marcar para seleccionar el transporte al
	 * aeropuerto.
	 */
	private JCheckBox checkAeropuerto;

	/**
	 * Casilla que el usuario puede marcar para seleccionar la estancia en el hotel.
	 */
	private JCheckBox checkHotel;

	/**
	 * Casilla que el usuario puede marcar para seleccionar la pensión completa.
	 */
	private JCheckBox checkPensionCompleta;

	/**
	 * Etiqueta que mostrará en cada momento el coste de las opciones seleccionadas.
	 */
	private JLabel lblPrecioTotal;

	/**
	 * Constructor de la clase.
	 * <p>
	 * Inicializa la ventana.
	 */
	public Ejemplo01Javadoc() {

		super("Viajes Gorrión");
		setSize(220, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOpciones = new JLabel("Opciones:");

		checkAvion = new JCheckBox("Billetes de avión", true);
		checkAvion.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		checkAeropuerto = new JCheckBox("Transporte aeropuerto");
		checkAeropuerto.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		checkHotel = new JCheckBox("Estancia en el hotel");
		checkHotel.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		checkPensionCompleta = new JCheckBox("Pensión completa");
		checkPensionCompleta.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		lblPrecioTotal = new JLabel("Precio total: 120 €");

		add(lblOpciones);
		add(checkAvion);
		add(checkAeropuerto);
		add(checkHotel);
		add(checkPensionCompleta);
		add(lblPrecioTotal);

		setVisible(true);

	}

	/**
	 * Calcula el precio total en función de las opciones que ha elegido el viajero.
	 * 
	 * @return el precio total del viaje.
	 */
	private double actualizaPrecio() {

		int precioTotal = 0;

		if (checkAvion.isSelected()) {
			precioTotal += 120;
		}
		if (checkAeropuerto.isSelected()) {
			precioTotal += 40;
		}
		if (checkHotel.isSelected()) {
			precioTotal += 180;
		}
		if (checkPensionCompleta.isSelected()) {
			precioTotal += 70;
		}

		lblPrecioTotal.setText("Precio total: " + precioTotal + " €");

		return precioTotal;

	}

	/**
	 * Método que nos inventamos para probar la documentación del Javadoc
	 * 
	 * @param nombreViajero Nombre del viajero
	 * @param edadViajero   Edad del viajero
	 * @return Cadena con las opciones elegidas o <code>null</code>.
	 */
	private String mostrarOpciones(String nombreViajero, int edadViajero) {
		return null;
	}

	/**
	 * Método que se ejecuta al arrancar la aplicación
	 * @param args Argumentos introducidos en la terminal
	 */
	public static void main(String[] args) {
		new Ejemplo01Javadoc();

	}

}