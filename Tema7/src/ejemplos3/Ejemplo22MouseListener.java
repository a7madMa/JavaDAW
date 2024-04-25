package ejemplos3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo22MouseListener extends JFrame {
	private JLabel lblCoordenadas;

	public Ejemplo22MouseListener() {

		super("Mouse Listener");

		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		lblCoordenadas = new JLabel("Haz clic en esta ventana!");
		JLabel lblBoton = new JLabel("");

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("MouseReleased()");
				// Si queremos cambiar de color una ventana con esto, debemos poner
//				 getContentPane().setBackground(Color.BLUE);

				getContentPane().setBackground(Color.black);

			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("MousePressed()");
				getContentPane().setBackground(Color.blue);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("MouseExited()");
				getContentPane().setBackground(Color.cyan);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("MouseEntered()");
				getContentPane().setBackground(Color.gray);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("MouseClicked()");
				getContentPane().setBackground(Color.orange);

				int x = e.getX();
				int y = e.getY();
				lblCoordenadas.setText("Las coordenadas de x: " + x + "y las de y: " + y);

				int boton = e.getButton();
				if (boton == MouseEvent.BUTTON1) {
					lblBoton.setText("Has pulsado el botón izquierdo");
				} else if (boton == MouseEvent.BUTTON3) {
					lblBoton.setText("Has pulsado el botón derecho");

				} else if (boton == MouseEvent.BUTTON2) {
					lblBoton.setText("Has pulsado la rueda del ratón");

				}
			}
		});

		add(lblCoordenadas);
		add(lblBoton);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo22MouseListener();
	}

}
