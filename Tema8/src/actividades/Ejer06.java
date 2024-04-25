package actividades;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejer06 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblMostrarRuta;
	private JMenuItem itemOpen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer06 frame = new Ejer06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejer06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);

		JMenu mnuFile = new JMenu("File");
		barraMenu.add(mnuFile);

		itemOpen = new JMenuItem("Open File");
		itemOpen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				elegirArchivo(e);
			}
		});
		mnuFile.add(itemOpen);
		JMenuItem itemSave = new JMenuItem("Save");
		itemSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				elegirArchivo(e);
			}
		});
		mnuFile.add(itemSave);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblMostrarRuta = new JLabel("Selecciona un archivo");
		lblMostrarRuta.setBounds(12, 12, 366, 15);
		contentPane.add(lblMostrarRuta);
	}

	private void elegirArchivo(ActionEvent e) {

		JFileChooser elegirArchivo = new JFileChooser();

		int eleccion;
		if (e.getSource() == itemOpen) {
			eleccion = elegirArchivo.showOpenDialog(elegirArchivo);
		} else {
			eleccion = elegirArchivo.showSaveDialog(elegirArchivo);
		}

		if (eleccion == JFileChooser.CANCEL_OPTION) {
			return;
		}

		lblMostrarRuta.setText("Archivo: " + elegirArchivo.getSelectedFile().toString());

	}

}
