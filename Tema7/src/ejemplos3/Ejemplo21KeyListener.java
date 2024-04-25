
package ejemplos3;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class Ejemplo21KeyListener extends JFrame {

	private int x = 375, y = 240;

	public Ejemplo21KeyListener() {

		super("Eventos de teclado");

		setSize(400, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);

		setLocationRelativeTo(null);

		JLabel lblCorazon = new JLabel(new ImageIcon("iconos/15.png"));

		lblCorazon.setBounds(x, y, 24, 24);

		addKeyListener(new KeyListener() {

			@Override

			public void keyTyped(KeyEvent arg0) {

// NO lo usamos

			}

			@Override

			public void keyReleased(KeyEvent arg0) {

// NO lo usamos

			}

			@Override

			public void keyPressed(KeyEvent e) {

				int codigoTecla = e.getKeyCode();

				int velocidad = 3;

				if (codigoTecla == KeyEvent.VK_UP) {

					if (y > 0) {

						y = y - velocidad;

					}

				} else if (codigoTecla == KeyEvent.VK_DOWN) {

					if (y < 240) {

						y = y + velocidad;

					}

				} else if (codigoTecla == KeyEvent.VK_LEFT) {

					if (x > 0) {

						x = x - velocidad;

					}

				} else if (codigoTecla == KeyEvent.VK_RIGHT) {

					if (x < 375) {

						x = x + velocidad;

					}

				}

				lblCorazon.setBounds(x, y, 24, 24);

			}

		});

		add(lblCorazon);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo21KeyListener();

	}

}
