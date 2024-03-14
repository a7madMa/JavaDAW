package hoja3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejer04 extends JFrame {

	public Ejer04() {

		super("Asistente matemático");
		setSize(350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JMenu menuMates = new JMenu("Aritmética");

		JMenuItem itemSuma = new JMenuItem("Suma");
		JMenuItem itemResta = new JMenuItem("Resta");
		JMenuItem itemMult = new JMenuItem("Multiplicación");
		JMenuItem itemDiv = new JMenuItem("División");
		JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");

		menuMates.add(itemSuma);
		menuMates.add(itemResta);
		menuMates.addSeparator();
		menuMates.add(itemMult);
		menuMates.add(itemDiv);
		menuMates.addSeparator();
		menuMates.add(itemPorcentaje);

		JMenu menuCalculo = new JMenu("Cálculo");

		JMenuItem itemDerivada = new JMenuItem("Derivada");
		JMenuItem itemIntergral = new JMenuItem("Intergral");
		JMenuItem itemPoli = new JMenuItem("Polinomio de Taylor");
		JMenuItem itemEcua = new JMenuItem("Ecuación diferencial");

		menuCalculo.add(itemDerivada);
		menuCalculo.add(itemIntergral);
		menuCalculo.addSeparator();
		menuCalculo.add(itemPoli);
		menuCalculo.add(itemEcua);

		JMenuBar barraMenu = new JMenuBar();

		barraMenu.add(menuMates);
		barraMenu.add(menuCalculo);

		setJMenuBar(barraMenu);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ejer04();
	}

}
