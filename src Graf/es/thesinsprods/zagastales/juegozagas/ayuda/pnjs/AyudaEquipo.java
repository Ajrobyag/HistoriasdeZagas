package es.thesinsprods.zagastales.juegozagas.ayuda.pnjs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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

public class AyudaEquipo {

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
					AyudaEquipo window = new AyudaEquipo();
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
	public AyudaEquipo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
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

		JLabel lblAspectosGeneralesDel = new JLabel("Asignaci\u00F3n de Equipo");
		lblAspectosGeneralesDel.setForeground(Color.WHITE);
		lblAspectosGeneralesDel.setFont(mf.MyFont(1, 17));
		lblAspectosGeneralesDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAspectosGeneralesDel.setBounds(10, 11, 414, 63);
		contentPanel.add(lblAspectosGeneralesDel);

		JTextArea txtrLoPrimeroQue = new JTextArea();
		txtrLoPrimeroQue
				.setText("Aqu� se elige qu� es lo que va a llevar encima el personaje. Se engloba en tres grandes grupos: Armas, armaduras y objetos.\n\nEn cada categor�a estar� marcado una cantidad m�xima de piezas de equipo que se pueden llevar, salvo en armaduras donde solo se puede llevar una. Este m�ximo depende del nivel de fuerza del personaje: hasta nivel 10 se puede llevar un arma y dos objetos, desde el nivel once al doce inclusive se pueden llevar dos armas y dos objetos, del nivel 13 al 16 se puede hasta tres armas y tres objetos y para cualquier nivel mayor de 16 el m�ximo estar� en cuatro armas y cuatro objetos.\n\nPara a�adir equipo primero hay que hacer clic en el bot�n de �a�adir� correspondiente (p.e. para a�adir un arma se pulsa el bot�n �A�adir armas�). Al pulsar el bot�n se mostrar� una nueva ventana en la que se deben introducir las propiedades de la pieza de quipo en cuesti�n, como el nombre, una descripci�n (opcional) y en el caso de armas y armaduras tambi�n se tiene que marcar la casilla que indique su tipo.");
		txtrLoPrimeroQue.setForeground(Color.WHITE);
		txtrLoPrimeroQue.setEditable(false);
		txtrLoPrimeroQue.setLineWrap(true);
		txtrLoPrimeroQue.setOpaque(false);
		txtrLoPrimeroQue.setWrapStyleWord(true);
		txtrLoPrimeroQue.setFont(mf.MyFont(0, 12));
		txtrLoPrimeroQue.setBounds(10, 67, 414, 311);
		contentPanel.add(txtrLoPrimeroQue);

		final JButton btnNewButton = new JButton("\u00CDndice");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(AyudaEquipo.class
						.getResource("/images/boton a�adir2.png")));

			}

			public void mouseReleased(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon(AyudaEquipo.class
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
		btnNewButton.setIcon(new ImageIcon(AyudaEquipo.class
				.getResource("/images/boton a\u00F1adir.png")));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setBounds(304, 389, 120, 34);
		contentPanel.add(btnNewButton);

		final JButton button_1 = new JButton("");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon(AyudaEquipo.class
						.getResource("/images/boton atras2.png")));

			}

			public void mouseReleased(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon(AyudaEquipo.class
						.getResource("/images/boton atras.png")));

			}
		});
		button_1.setFocusPainted(false);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AyudaHabilidades window = new AyudaHabilidades();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		button_1.setIcon(new ImageIcon(AyudaEquipo.class
				.getResource("/images/boton atras.png")));
		button_1.setHorizontalTextPosition(SwingConstants.CENTER);
		button_1.setForeground(Color.WHITE);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(10, 385, 99, 38);
		contentPanel.add(button_1);

		final JButton btnPosesiones = new JButton("Posesiones");
		btnPosesiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AyudaPosesiones window = new AyudaPosesiones();
				window.getFrame().setVisible(true);
			}
		});
		btnPosesiones.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				btnPosesiones.setIcon(new ImageIcon(AyudaEquipo.class
						.getResource("/images/boton a\u00F1adir2.png")));

			}

			public void mouseReleased(MouseEvent arg0) {
				btnPosesiones.setIcon(new ImageIcon(AyudaEquipo.class
						.getResource("/images/boton a\u00F1adir.png")));

			}
		});
		btnPosesiones.setIcon(new ImageIcon(AyudaEquipo.class
				.getResource("/images/boton a\u00F1adir.png")));
		btnPosesiones.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPosesiones.setForeground(Color.WHITE);
		btnPosesiones.setFont(new Font("Morpheus", Font.PLAIN, 13));
		btnPosesiones.setFocusPainted(false);
		btnPosesiones.setContentAreaFilled(false);
		btnPosesiones.setBorderPainted(false);
		btnPosesiones.setBorder(null);
		btnPosesiones.setBounds(158, 389, 120, 34);
		contentPanel.add(btnPosesiones);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AyudaEquipo.class
				.getResource("/images/background-inicio.jpg")));
		label.setBounds(0, 0, 434, 434);
		contentPanel.add(label);
	}

}
