package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import exceptions.UnderageException;
import model.Album;
import model.Artista;
import model.Cancion;
import model.Usuario;
import model.UsuarioEstandar;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextArea;

public class Grafica {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica window = new Grafica();
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
	public Grafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Roboto", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.setBackground(new Color(51, 51, 51));
		frame.setBounds(100, 100, 992, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		HashSet<Cancion> base = new HashSet<>();
		
//		Blue Lights - Jorja
		Artista jorja = new Artista("Jorja Smith");
		Cancion blue = new Cancion("Blue Lights", jorja);
		base.add(blue);
		Album blueLights = new Album("Blue Lights", jorja, base); //single
		base.clear();
		
//		Un tiempo en casa solo - Roy Borland
		Artista roy = new Artista("Roy Borland");
		Cancion casa = new Cancion("Casa", roy);
		Cancion circulo = new Cancion("Circulo de Luz/Un Hogar Acogedor", roy);
		Cancion destrozado = new Cancion("Destrozado por tu amor", roy);
		Cancion abril = new Cancion("Abril", roy);
		Cancion amable = new Cancion("Amor Amable", roy);
		base.addAll(Arrays.asList(casa,circulo,destrozado,abril,amable));
		Album tiempoEnCasa = new Album("Un tiempo en casa solo", roy, base);  // EP
		base.clear();
		
		
//		LIKE Me - Nikita, the Wicked
		Artista nikita = new Artista("Nikita the Wicked"); 
		Cancion like = new Cancion("Like Me", nikita);
		base.add(like);
		Album likeMe = new Album("LIKE ME", nikita, base); // single
		
		
		

		
		
//		Label Plan Usuario
		JLabel lblPlanUsuario = new JLabel("Plan: Estandar");
		lblPlanUsuario.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblPlanUsuario.setForeground(new Color(128, 128, 255));
		lblPlanUsuario.setBounds(821, 17, 108, 19);
		frame.getContentPane().add(lblPlanUsuario);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Qué album quieres escuchar?");
		comboBox.setBounds(32, 196, 201, 36);
		frame.getContentPane().add(comboBox);
		comboBox.addItem(likeMe);
		comboBox.addItem(blueLights);
		comboBox.addItem(tiempoEnCasa);
		
		
		JLabel lblMusicBox = new JLabel("MusicBox");
		lblMusicBox.setForeground(new Color(0, 221, 221));
		lblMusicBox.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 17));
		lblMusicBox.setBounds(32, 16, 108, 19);
		frame.getContentPane().add(lblMusicBox);
		
		JLabel lblAlbumesHoy = new JLabel("Tus albumes de hoy:");
		lblAlbumesHoy.setForeground(new Color(0, 221, 221));
		lblAlbumesHoy.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblAlbumesHoy.setBounds(32, 166, 144, 19);
		frame.getContentPane().add(lblAlbumesHoy);
		
		JTextArea texto = new JTextArea();
		texto.setForeground(new Color(0, 225, 225));
		texto.setFont(new Font("Monospaced", Font.PLAIN, 12));
		texto.setEditable(false);
		texto.setBackground(new Color(62, 62, 62));
		texto.setBounds(262, 196, 457, 70);
		frame.getContentPane().add(texto);
		
		JButton btnReproducir = new JButton("Reproducir");
		btnReproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("Estás escuchando: " + comboBox.getSelectedItem().toString());
			}
		});
		btnReproducir.setBounds(32, 243, 108, 23);
		frame.getContentPane().add(btnReproducir);
		
		
		JLabel lblAnuncio = new JLabel("Pasate al plan premium para escuchar musica sin anuncios.");
		lblAnuncio.setForeground(new Color(0, 221, 221));
		lblAnuncio.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblAnuncio.setBounds(321, 266, 399, 36);
		lblAnuncio.setVisible(false);
		frame.getContentPane().add(lblAnuncio);
		
//		Boton Activar Plan Estandar
		JToggleButton btnEstandar = new JToggleButton("Estandar");
		btnEstandar.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnEstandar.setForeground(new Color(187, 94, 0));
		
		btnEstandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Usuario mati = new UsuarioEstandar("Mati", 30);
				} catch (UnderageException ex) {
					ex.printStackTrace();
				}
				lblPlanUsuario.setText("Plan Estandar");
				lblAnuncio.setVisible(true);
			}
		});
		btnEstandar.setBounds(32, 75, 86, 23);
		frame.getContentPane().add(btnEstandar);
		
		
//		Boton Activar Plan Premium
		JToggleButton btnPremium = new JToggleButton("Premium");
		btnPremium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario mati = new UsuarioEstandar("Mati", 30); // PREMIUUUUUUUUUUUUUM
				} catch (UnderageException ex) {
					ex.printStackTrace();
				}
				lblPlanUsuario.setText("Plan Premium");
				lblAnuncio.setVisible(false);
			}
		});
		btnPremium.setForeground(new Color(187, 94, 0));
		btnPremium.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnPremium.setBounds(128, 75, 86, 23);
		frame.getContentPane().add(btnPremium);
		
		JLabel lblElige = new JLabel("Elige tu plan:");
		lblElige.setForeground(new Color(0, 255, 255));
		lblElige.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblElige.setBounds(32, 45, 144, 19);
		frame.getContentPane().add(lblElige);
		
	}
}
