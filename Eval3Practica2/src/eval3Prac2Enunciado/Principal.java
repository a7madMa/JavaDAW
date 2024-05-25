package eval3Prac2Enunciado;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

/**
 * Clase principal de la aplicación de Boletín. Permite importar una lista de
 * alumnos desde un archivo, mostrar la lista en una interfaz gráfica, editar
 * las notas de los alumnos y guardar el boletín de notas en un archivo.
 * 
 * @see Alumno
 * @see VentanaNota
 * @see Callback
 * @version 1.0 25 May 2024
 * @autor Ahmad Mawasli
 */

public class Principal extends JFrame {

	private final String RUTA_ARCHIVO = "ficheros/alumnos.txt";
	private final String rutaArchivo = "ficheros/boletin.txt";
	private List<Alumno> alumnos;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsignatura;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {

		setTitle("Boletín App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(this, "Error al cambiar el look and feel de la aplicación.", "Boletín App",
					JOptionPane.ERROR_MESSAGE);
		}

		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(10, 10, 100, 13);
		contentPane.add(lblAsignatura);

		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(10, 33, 164, 19);
		contentPane.add(txtAsignatura);
		txtAsignatura.setColumns(10);

		JLabel lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.setBounds(10, 62, 60, 13);
		contentPane.add(lblAlumnos);

		JScrollPane panelAlumnos = new JScrollPane();
		panelAlumnos.setBounds(10, 85, 508, 278);
		contentPane.add(panelAlumnos);

		DefaultListModel<Alumno> modelo = new DefaultListModel<>();
		JList<Alumno> lstAlumnos = new JList<>(modelo);
		lstAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {

					abrirFichaAlumno(lstAlumnos);

				}
			}
		});
		panelAlumnos.setViewportView(lstAlumnos);

		alumnos = new ArrayList<>();

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				guardarBoletin(rutaArchivo);

			}
		});
		btnGuardar.setBounds(142, 373, 115, 21);
		contentPane.add(btnGuardar);

		JButton btnImportarAlumnos = new JButton("Importar alumnos");
		btnImportarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				alumnos = importarAlumnos(RUTA_ARCHIVO);
				Principal.this.mostrarAlumnos(modelo);

			}
		});
		btnImportarAlumnos.setBounds(10, 373, 115, 21);
		contentPane.add(btnImportarAlumnos);

	}

	// METODOS GENERALES

	/**
	 * Importa una lista de alumnos desde un archivo especificado.
	 * 
	 * @param RUTA_ARCHIVO la ruta del archivo desde donde se importan los alumnos
	 * @return una lista de alumnos importados
	 */
	public ArrayList<Alumno> importarAlumnos(String RUTA_ARCHIVO) {
		ArrayList<Alumno> alumnos = new ArrayList<>();

		try (BufferedReader buffer = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
			String clase = buffer.readLine();
			JOptionPane.showMessageDialog(this, "Se van a importar los alumnos de " + clase, "Boletín App",
					JOptionPane.INFORMATION_MESSAGE);
			String linea;
			buffer.readLine();

			while ((linea = buffer.readLine()) != null) {
				String nombre = linea;
				int notaAlumno = -1;
				Alumno alumno = new Alumno(nombre, notaAlumno);
				alumnos.add(alumno);
			}
			buffer.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "Archivo no encontrado: " + RUTA_ARCHIVO, "Error",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "No se ha podido leer el archivo de tareas" + RUTA_ARCHIVO,
					"Error de E/S", JOptionPane.ERROR_MESSAGE);
		}
		return alumnos;
	}

	/**
	 * Muestra la lista de alumnos en el modelo especificado.
	 * 
	 * @param modelo el modelo de lista en el que se mostrarán los alumnos
	 */
	public void mostrarAlumnos(DefaultListModel<Alumno> modelo) {

		modelo.clear();

		for (Alumno alumno : alumnos) {
			modelo.addElement(alumno);
		}
	}

	/**
	 * Guarda la lista de alumnos en un archivo rutaArchivo.
	 */
	public void guardarAlumnos() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
			for (Alumno alumno : alumnos) {
				bw.write(alumno.getNombre() + "," + alumno.getNota());
				bw.newLine();
			}
			JOptionPane.showMessageDialog(this, "Se han guardado las notas de " + txtAsignatura, "Boletín App",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Error al guardar las notas: " + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Abre la ventana de ficha del alumno para editar su nota.
	 * 
	 * @param lstAlumnos la lista de alumnos en la interfaz gráfica
	 */
	public void abrirFichaAlumno(JList<Alumno> lstAlumnos) {

		VentanaNota ventanaNota = new VentanaNota();
		Alumno alumno = lstAlumnos.getSelectedValue();
		ventanaNota.setAlumno(alumno);
		ventanaNota.setCallback(new Callback() {

			@Override
			public void actualizarVentana(int nota) {

				alumno.setNota(nota);

			}
		});

	}

	/**
	 * Guarda el boletín de notas en un archivo especificado.
	 * 
	 * @param rutaArchivo la ruta del archivo donde se guardará el boletín
	 */
	public void guardarBoletin(String rutaArchivo) {

		if (txtAsignatura.getText().isEmpty() || alumnos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No hay datos para guardar", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(rutaArchivo));
			buffer.write("asignatura=" + txtAsignatura.getText());
			buffer.newLine();
			buffer.write("fecha=" + LocalDate.now());
			buffer.newLine();
			buffer.newLine();

			for (Alumno alumno : alumnos) {
				buffer.write("nombre=" + alumno.getNombre());
				buffer.newLine();
				buffer.write("nota=" + alumno.getNota());
				buffer.newLine();

			}
			buffer.close();
			JOptionPane.showMessageDialog(this, "Se han guardado las notas de " + txtAsignatura.getText(),
					"Boletín App", JOptionPane.INFORMATION_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Error al guardar el boletín: " + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
