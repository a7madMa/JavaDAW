package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejemplo07JSlider extends JFrame {

	public Ejemplo07JSlider() {

		super("Volumen");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblVolumen = new JLabel("Volumen");
		JSlider sldVolumen = new JSlider(JSlider.VERTICAL, 0, 100, 20);
		sldVolumen.setMajorTickSpacing(10);
		sldVolumen.setMinorTickSpacing(5);
		sldVolumen.setPaintLabels(true);
		sldVolumen.setPaintTicks(true);
		sldVolumen.setPreferredSize(new Dimension(150,300));
		
		
		
		add(lblVolumen);
		add(sldVolumen);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo07JSlider ventana = new Ejemplo07JSlider();

	}
}
