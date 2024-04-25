package notasIncompleto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main extends JFrame implements ListSelectionListener {

	private Libreta libreta;

	private JList<String> lstTitulos;
	private DefaultListModel<String> modeloLista;
	private JTextField txtTitulo;
	private JTextArea txtDescripcion;
	private JButton btnGuardar;

	public static void main(String[] args) {
		new Main();
		// Prueba de leerNotas()
	}

	public Main() {

		super("Bloc de notas");
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		setResizable(false);

		modeloLista = new DefaultListModel<String>();

		// MENÚ.
		JMenuBar barraMenu = new JMenuBar();

		JMenuItem itemNuevaNota = new JMenuItem("Nueva nota");
		itemNuevaNota.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				crearNota();
			}
		});

		JMenuItem itemBorrarNota = new JMenuItem("Borrar nota");
		itemBorrarNota.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				borrarNotaSeleccionada();
			}
		});

		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);

			}
		});

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemNuevaNota);
		menuArchivo.addSeparator();
		menuArchivo.add(itemBorrarNota);
		menuArchivo.addSeparator();
		menuArchivo.add(itemSalir);

		barraMenu.add(menuArchivo);

		setJMenuBar(barraMenu);

		// PANEL CENTRAL-IZQUIERDO.
		JPanel panelIzquierdo = new JPanel();

		JLabel lblNota = new JLabel("Notas");

		lstTitulos = new JList<String>(modeloLista);
		lstTitulos.addListSelectionListener(this);
		JScrollPane panelTitulos = new JScrollPane(lstTitulos);
		panelTitulos.setPreferredSize(new Dimension(280, 320));
		panelTitulos.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		panelIzquierdo.add(lblNota);
		panelIzquierdo.add(panelTitulos);

		panelIzquierdo.setBorder(new EmptyBorder(5, 5, 0, 0));

		// PANEL CENTRAL-DERECHO.
		JPanel panelDerecho = new JPanel();

		JLabel lblTitulo = new JLabel("Título");
		txtTitulo = new JTextField();
		txtTitulo.setPreferredSize(new Dimension(280, 25));
		txtTitulo.setEnabled(false);

		JLabel lblDescripcion = new JLabel("Descripción");
		txtDescripcion = new JTextArea();
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setWrapStyleWord(true);
		txtDescripcion.setEnabled(false);

		JScrollPane panelDescripcion = new JScrollPane(txtDescripcion);
		panelDescripcion.setPreferredSize(new Dimension(280, 269));

		panelDerecho.add(lblTitulo);
		panelDerecho.add(txtTitulo);
		panelDerecho.add(lblDescripcion);
		panelDerecho.add(panelDescripcion);

		panelDerecho.setBorder(new EmptyBorder(5, 0, 0, 0));

		// PANEL CENTRAL-COMPLETO.
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new GridLayout(1, 2));

		panelCentral.add(panelIzquierdo);
		panelCentral.add(panelDerecho);

		// PANEL INFERIOR.
		JPanel panelInferior = new JPanel();
		panelInferior.setLayout(new FlowLayout(FlowLayout.RIGHT));

		btnGuardar = new JButton("Guardar");
		btnGuardar.setEnabled(false);

		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarNotaSeleccionada();
			}
		});

		panelInferior.add(btnGuardar);

		// VENTANA COMPLETA
		add(panelCentral, BorderLayout.CENTER);
		add(panelInferior, BorderLayout.SOUTH);

		setLocationRelativeTo(null);

		setVisible(true);

		libreta = new Libreta();

		cargarNotas();

	}

	private void cargarNotas() {

		// Recorremos la libreta de notas y añadimos los títulos al JList.
		for (int i = 0; i < libreta.getNumNotas(); i++) {
			if (libreta.getNota(i) != null) {
				modeloLista.addElement(libreta.getNota(i).getTitulo());
			}
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {

		int notaSeleccionada = lstTitulos.getSelectedIndex();

		// Comprobamos que haya una nota seleccionada. Si no, nos podría dar un
		// error al recargar la lista o al borrar un elemento de la misma.
		if (notaSeleccionada >= 0) {

			txtTitulo.setEnabled(true);
			txtDescripcion.setEnabled(true);
			btnGuardar.setEnabled(true);

			txtTitulo.setText(libreta.getNota(notaSeleccionada).getTitulo());
			txtDescripcion.setText(libreta.getNota(notaSeleccionada).getDescripcion());

		}

	}

	private void guardarNotaSeleccionada() {

		// No guardaremos la nota si el título está en blanco.
		if (txtTitulo.getText().equals("")) {
			return;
		}

		// Actualizamos la libreta de notas.
		int notaSeleccionada = lstTitulos.getSelectedIndex();
		libreta.setNota(notaSeleccionada, new Nota(txtTitulo.getText(), txtDescripcion.getText()));

		// Actualizamos el JList
		modeloLista.set(notaSeleccionada, txtTitulo.getText());

		// Guardamos los cambios en el disco.
		libreta.guardarNotas();

	}

	private void crearNota() {

		/*
		 * TODO: Crear nueva nota, añadirla a la libreta y mostrar su título al final
		 * del JList. Seleccionar la nueva nota en el JList. Borrar la casilla de título
		 * y pasarle el foco a la casilla de título.
		 */

	}

	private void borrarNotaSeleccionada() {

		// Guardamos la posición del elemento seleccionado del JList.
		int posNotaSeleccionada = lstTitulos.getSelectedIndex();
		if (posNotaSeleccionada < 0) {
			return;
		}

		// Borramos la nota de la libreta
		libreta.delNota(posNotaSeleccionada);

		// Borramos la nota del JList.
		modeloLista.remove(posNotaSeleccionada);

		// Borramos las casillas de título y descripción.
		txtTitulo.setText("");
		txtDescripcion.setText("");

		// Guardamos los cambios en el disco.
		libreta.guardarNotas();

		// Si ya no quedan notas en la lista, deshabilitamos el botón Guardar y las
		// casillas de texto.
		if (modeloLista.getSize() == 0) {
			txtTitulo.setEnabled(false);
			txtDescripcion.setEnabled(false);
			btnGuardar.setEnabled(false);
		}

	}

}
