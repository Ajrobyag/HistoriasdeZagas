package es.thesinsprods.zagastales.juegozagas.ayuda.pnjs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import es.thesinsprods.resources.font.MorpheusFont;

public class AyudaHabilidades {

	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	private final JPanel contentPanel = new JPanel();
	MorpheusFont mf = new MorpheusFont();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AyudaHabilidades window = new AyudaHabilidades();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AyudaHabilidades() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setTitle("Historias de Zagas");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(
				AyudaCreacionPNJ.class
						.getResource("/images/Historias de Zagas, logo.png")));

		frame.setResizable(false);
		frame.setBounds(100, 100, 439, 462);
		frame.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblAspectosGeneralesDel = new JLabel(
				"Asignaci\u00F3n de Habilidades");
		lblAspectosGeneralesDel.setForeground(Color.WHITE);
		lblAspectosGeneralesDel.setFont(mf.MyFont(1, 17));
		lblAspectosGeneralesDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAspectosGeneralesDel.setBounds(10, 11, 414, 63);
		contentPanel.add(lblAspectosGeneralesDel);

		JTextArea txtrLoPrimeroQue = new JTextArea();
		txtrLoPrimeroQue.setBounds(10, 67, 414, 311);
		contentPanel.add(txtrLoPrimeroQue);
		txtrLoPrimeroQue.setForeground(Color.WHITE);
		txtrLoPrimeroQue.setEditable(false);
		txtrLoPrimeroQue
				.setText("A la hora de asignar nuestros puntos de habilidades, contaremos con un total de 60 puntos a repartir en las cuatro ramas que se ven en la pantalla de habilidades.\n\nPulsa en el bot�n de cada grupo de habilidades para abrir una nueva ventana en la que se podr�n ver los componentes de cada uno de ellos. Seg�n tu raza o bendici�n podr�s tener ya asignados algunos puntos de forma inicial. Para aumentar o disminuir los puntos de cada habilidad, pulsa el bot�n + o -. Los puntos necesarios para aumentar dicha habilidad se restar�n autom�ticamente.");
		txtrLoPrimeroQue.setLineWrap(true);
		txtrLoPrimeroQue.setOpaque(false);
		txtrLoPrimeroQue.setWrapStyleWord(true);
		txtrLoPrimeroQue.setFont(mf.MyFont(0, 12));

		final JButton btnNewButton = new JButton("\u00CDndice");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(AyudaHabilidades.class
						.getResource("/images/boton a�adir2.png")));

			}

			public void mouseReleased(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(AyudaHabilidades.class
						.getResource("/images/boton a�adir.png")));

			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AyudaCreacionPNJ window = new AyudaCreacionPNJ();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(mf.MyFont(0, 13));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(AyudaHabilidades.class
				.getResource("/images/boton a\u00F1adir.png")));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(158, 389, 120, 34);
		contentPanel.add(btnNewButton);

		final JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AyudaEquipo window = new AyudaEquipo();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				button.setIcon(new ImageIcon(AyudaHabilidades.class
						.getResource("/images/boton continuar2.png")));

			}

			public void mouseReleased(MouseEvent arg0) {
				button.setIcon(new ImageIcon(AyudaHabilidades.class
						.getResource("/images/boton continuar.png")));

			}

		});
		button.setFocusPainted(false);
		button.setIcon(new ImageIcon(AyudaHabilidades.class
				.getResource("/images/boton continuar.png")));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setForeground(Color.WHITE);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(325, 385, 99, 38);
		contentPanel.add(button);

		final JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon(AyudaHabilidades.class
						.getResource("/images/boton atras2.png")));

			}

			public void mouseReleased(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon(AyudaHabilidades.class
						.getResource("/images/boton atras.png")));

			}
		});
		button_1.setFocusPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AyudaAtributos window = new AyudaAtributos();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon(AyudaHabilidades.class
				.getResource("/images/boton atras.png")));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setForeground(Color.WHITE);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(10, 385, 99, 38);
		contentPanel.add(button_1);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AyudaHabilidades.class
				.getResource("/images/background-inicio.jpg")));
		label.setBounds(0, 0, 434, 434);
		contentPanel.add(label);
	}

}
