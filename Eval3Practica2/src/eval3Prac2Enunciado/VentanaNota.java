package eval3Prac2Enunciado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

/**
 * VentanaNota es una clase que representa una ventana de diálogo para la
 * evaluación de una nota de un alumno. Permite al usuario ingresar una nota y
 * validarla, asegurándose de que esté dentro del rango permitido (0-10).
 * 
 * @see Alumno
 * @see Callback
 * @version 1.0 25 May 2024
 * @autor Ahmad Mawasli
 */
public class VentanaNota extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAlumno;
	private JLabel lblNota;
	private JTextField txtNota;
	private JButton btnAceptar;
	private Callback callback;

	public VentanaNota() {
		setTitle("Evaluación");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setBounds(100, 100, 272, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlumno = new JLabel("Alumno");
		lblAlumno.setBounds(10, 10, 68, 13);
		contentPane.add(lblAlumno);

		txtAlumno = new JTextField();
		txtAlumno.setEditable(false);
		txtAlumno.setBounds(10, 33, 238, 19);
		contentPane.add(txtAlumno);
		txtAlumno.setColumns(10);

		lblNota = new JLabel("Nota");
		lblNota.setBounds(10, 62, 68, 13);
		contentPane.add(lblNota);

		txtNota = new JTextField();
		txtNota.setColumns(10);
		txtNota.setBounds(10, 85, 238, 19);
		contentPane.add(txtNota);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				devolverNota();
			}
		});
		btnAceptar.setBounds(10, 114, 85, 21);
		contentPane.add(btnAceptar);

		// Configuraciones propias.
		this.getRootPane().setDefaultButton(btnAceptar);
		setVisible(true);
		txtNota.requestFocus();
	}

	/**
	 * Establece el nombre del alumno en el campo de texto.
	 * 
	 * @param alumno el alumno cuyo nombre se va a mostrar
	 */
	public void setAlumno(Alumno alumno) {
		txtAlumno.setText(alumno.getNombre().toUpperCase());
	}

	/**
	 * Establece la interfaz de callback para comunicar la nota ingresada de vuelta
	 * a la ventana principal.
	 * 
	 * @param callback la interfaz de callback a establecer
	 */
	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	/**
	 * Valida y devuelve la nota ingresada por el usuario. Muestra mensajes de error
	 * si la entrada no es un entero válido o no está dentro del rango válido
	 * (0-10).
	 */
	public void devolverNota() {
		try {
			// Obtener la nota ingresada como texto y convertirla a entero
			int nota = Integer.parseInt(txtNota.getText());

			// Verificar si la nota está dentro del rango válido (0-10)
			if (nota < 0 || nota > 10) {
				// Mostrar mensaje de error si la nota no está en el rango válido
				JOptionPane.showMessageDialog(this, "La nota debe ser un número entre 0 y 10", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				// Llamar al callback para actualizar la ventana principal y cerrar esta ventana
				callback.actualizarVentana(nota);
				dispose();
			}
		} catch (NumberFormatException e) {
			// Mostrar mensaje de error si la nota ingresada no es un número entero válido
			JOptionPane.showMessageDialog(this, "La nota debe ser un número entero", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
