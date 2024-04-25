
package hoja4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Actividad3 extends JFrame implements ItemListener {

	private JCheckBox checkAvion;
	private JCheckBox checkAeropuerto;
	private JCheckBox checkHotel;
	private JCheckBox checkPensionCompleta;
	private JLabel lblPrecioTotal;

	public Actividad3() {

		super("Viajes Gorrión");
		setSize(220, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOpciones = new JLabel("Opciones:");

		checkAvion = new JCheckBox("Billetes de avión");
		checkAvion.addItemListener(this);

		checkAeropuerto = new JCheckBox("Transporte aeropuerto");
		checkAeropuerto.addItemListener(this);

		checkHotel = new JCheckBox("Estancia en el hotel");
		checkHotel.addItemListener(this);

		checkPensionCompleta = new JCheckBox("Pensión completa");
		checkPensionCompleta.addItemListener(this);

		lblPrecioTotal = new JLabel("Precio total:");

		add(lblOpciones);
		add(checkAvion);
		add(checkAeropuerto);
		add(checkHotel);
		add(checkPensionCompleta);
		add(lblPrecioTotal);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int Preciototal = 0;

		if (checkAvion.isSelected()) {
			Preciototal += 120;
		}
		if (checkAeropuerto.isSelected()) {
			Preciototal += 40;
		}
		if (checkHotel.isSelected()) {
			Preciototal += 180;
		}
		if (checkPensionCompleta.isSelected()) {
			Preciototal += 70;
		}

		lblPrecioTotal.setText("Precio total: " + Preciototal + "€");
	}

	public static void main(String[] args) {
		new Actividad3();

	}

}
