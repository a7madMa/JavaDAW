package ejerciciosHoja2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Termostato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		JLabel lblTemperatura = new JLabel("Temperatura");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.WEST;
		add(lblTemperatura, gbc);

		JSlider sld = new JSlider(JSlider.VERTICAL, 0, 25, 17); // Rango de 0 a 25, valor inicial en 17
		sld.setPaintLabels(true);
		sld.setPaintTicks(true);
		sld.setMajorTickSpacing(5);
		sld.setMinorTickSpacing(1); // Marcas intermedias entre cada número
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.CENTER;
		add(sld, gbc);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer02 ventana = new Ejer02();

	}
}