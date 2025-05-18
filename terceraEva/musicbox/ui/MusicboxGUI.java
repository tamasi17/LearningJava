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
import model.UsuarioPremium;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MusicboxGUI {

	private JFrame frame;
	private JTextField textNombre;
	private JTextField textEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicboxGUI window = new MusicboxGUI();
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
	public MusicboxGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(51, 51, 51));
		frame.setBackground(new Color(51, 51, 51));
		frame.setBounds(100, 100, 992, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		HashSet<Cancion> baseDemo = new HashSet<>();
//		Demo 2 - Prison Affair
		Artista prison = new Artista("Prison Affair");
		Cancion join = new Cancion("Join the plane", prison);
		Cancion barrotes = new Cancion("Entre barrotes", prison);
		Cancion caiman = new Cancion("Black Caiman", prison);
		Cancion romance = new Cancion("Jail Romance", prison);
		baseDemo.addAll(Arrays.asList(join,barrotes,caiman,romance));
		Album demo = new Album("Demo 2", prison, baseDemo); 			//EP
		
		HashSet<Cancion> baseBby = new HashSet<>();
//		Diamond Cut / Bby - Overmono
		Artista overmono = new Artista("Overmono");
		Cancion diamond = new Cancion("Diamond Cut", overmono);
		Cancion bby = new Cancion("Bby", overmono);
		baseBby.addAll(Arrays.asList(diamond,bby));
		Album diamondCut = new Album("Diamond Cut / Bby", overmono, baseBby); 			//EP
		
		HashSet<Cancion> baseTiempo = new HashSet<>();
//		Un tiempo en casa solo - Roy Borland
		Artista roy = new Artista("Roy Borland");
		Cancion casa = new Cancion("Casa", roy);
		Cancion circulo = new Cancion("Circulo de Luz/Un Hogar Acogedor", roy);
		Cancion destrozado = new Cancion("Destrozado por tu amor", roy);
		Cancion abril = new Cancion("Abril", roy);
		Cancion amable = new Cancion("Amor Amable", roy);
		baseTiempo.addAll(Arrays.asList(casa,circulo,destrozado,abril,amable));
		Album tiempoEnCasa = new Album("Un tiempo en casa solo", roy, baseTiempo);  // EP
		
//		LIKE Me - Nikita, the Wicked
		HashSet<Cancion> baseLM = new HashSet<>();

		Artista nikita = new Artista("Nikita the Wicked"); 
		Cancion like = new Cancion("Like Me", nikita);
		baseLM.add(like);
		Album likeMe = new Album("LIKE ME", nikita, baseLM); // single
		
		
//		COMPONENTES

		
		
//		Label Plan Usuario
		JLabel status = new JLabel("...");
		status.setFont(new Font("Roboto", Font.PLAIN, 12));
		status.setForeground(new Color(128, 128, 255));
		status.setBounds(719, 63, 162, 19);
		status.setVisible(false);
		frame.getContentPane().add(status);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Que album quieres escuchar?");
		comboBox.setBounds(32, 259, 201, 36);
		frame.getContentPane().add(comboBox);
		comboBox.addItem(diamondCut);
		comboBox.addItem(likeMe);
		comboBox.addItem(demo);
		comboBox.addItem(tiempoEnCasa);
		comboBox.setVisible(false);
		
		JLabel lblMusicBox = new JLabel("MusicBox");
		lblMusicBox.setForeground(new Color(0, 221, 221));
		lblMusicBox.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 19));
		lblMusicBox.setBounds(32, 16, 125, 35);
		frame.getContentPane().add(lblMusicBox);
		lblMusicBox.setVisible(false);
		
		JLabel lblAlbumesHoy = new JLabel("Tus albumes de hoy:");
		lblAlbumesHoy.setForeground(new Color(0, 221, 221));
		lblAlbumesHoy.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblAlbumesHoy.setBounds(32, 230, 144, 19);
		frame.getContentPane().add(lblAlbumesHoy);
		lblAlbumesHoy.setVisible(false);
		
		JTextArea texto = new JTextArea();
		texto.setForeground(new Color(0, 225, 225));
		texto.setFont(new Font("Monospaced", Font.PLAIN, 12));
		texto.setEditable(false);
		texto.setBackground(new Color(62, 62, 62));
		texto.setBounds(262, 266, 457, 19);
		frame.getContentPane().add(texto);
		texto.setVisible(false);
		
		JTextArea tituloLista = new JTextArea();
		tituloLista.setForeground(new Color(128, 128, 128));
		tituloLista.setFont(new Font("Monospaced", Font.PLAIN, 13));
		tituloLista.setLineWrap(true);
		tituloLista.setText("Lista de canciones:");
		tituloLista.setBackground(new Color(49, 49, 49));
		tituloLista.setBounds(262, 295, 162, 22);
		frame.getContentPane().add(tituloLista);
		tituloLista.setVisible(false);
		
		JTextArea canciones = new JTextArea();
		canciones.setTabSize(4);
		canciones.setForeground(new Color(252, 196, 3));
		canciones.setFont(new Font("Monospaced", Font.ITALIC, 11));
		canciones.setBackground(new Color(62, 62, 62));
		canciones.setBounds(262, 330, 457, 109);
		frame.getContentPane().add(canciones);
		canciones.setVisible(false);
		
		JButton reproducir = new JButton("Reproducir");
		reproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setVisible(true);
				canciones.setVisible(true);
				tituloLista.setVisible(true);
				Album album = (Album) comboBox.getSelectedItem();
				if (album != null) {
					texto.setText("  Estas escuchando: " +album.getTitulo() + " de " + album.getArtista());
				    StringBuilder sb = new StringBuilder();
				    for (Cancion c : album.getCanciones()) {
				        sb.append(c.toString()).append("\n");
				    }
				    canciones.setText(sb.toString());
				}
			
			}
		});
		reproducir.setBounds(32, 305, 108, 23);
		frame.getContentPane().add(reproducir);
		reproducir.setVisible(false);
		
		
		JLabel lblAnuncio = new JLabel("Pasate al plan premium para escuchar musica sin anuncios.");
		lblAnuncio.setForeground(new Color(0, 221, 221));
		lblAnuncio.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblAnuncio.setBounds(32, 160, 438, 36);
		lblAnuncio.setVisible(false);
		frame.getContentPane().add(lblAnuncio);
		
		JLabel plan = new JLabel("Plan:");
		plan.setForeground(new Color(128, 128, 255));
		plan.setFont(new Font("Dialog", Font.PLAIN, 12));
		plan.setBounds(719, 89, 152, 36);
		frame.getContentPane().add(plan);
		plan.setVisible(false);
		
		
		textNombre = new JTextField();
		textNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textNombre.setText("");
			}
		});
		textNombre.setForeground(new Color(192, 192, 192));
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNombre.setText("Nombre");
		textNombre.setBackground(new Color(80, 80, 80));
		textNombre.setBounds(32, 61, 144, 19);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		textNombre.setVisible(false);
		
		textEdad = new JTextField();
		textEdad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textEdad.setText("");
			}
		});
		textEdad.setForeground(new Color(192, 192, 192));
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textEdad.setText("Edad");
		textEdad.setColumns(10);
		textEdad.setBackground(new Color(80, 80, 80));
		textEdad.setBounds(190, 61, 75, 19);
		frame.getContentPane().add(textEdad);
		textEdad.setVisible(false);
		
//		Boton Activar Plan Estandar
		JToggleButton btnEstandar = new JToggleButton("Estandar");
		btnEstandar.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnEstandar.setForeground(new Color(187, 94, 0));
		btnEstandar.setVisible(false);
		btnEstandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int edad = Integer.parseInt(textEdad.getText().trim());
					UsuarioEstandar user = new UsuarioEstandar(textNombre.getText(), edad);
					comboBox.setVisible(true);
					reproducir.setVisible(true);
					plan.setVisible(true);
					plan.setText("Usuario Estandar");
					lblAnuncio.setVisible(true);
				} catch (UnderageException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnEstandar.setBounds(32, 127, 86, 23);
		frame.getContentPane().add(btnEstandar);
		
		
//		Boton Activar Plan Premium
		JToggleButton btnPremium = new JToggleButton("Premium");
		btnPremium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int edad = Integer.parseInt(textEdad.getText().trim());
					UsuarioPremium user = new UsuarioPremium(textNombre.getText(), edad);
					comboBox.setVisible(true);
					reproducir.setVisible(true);
					plan.setVisible(true);
					plan.setText(user.toString());
					lblAnuncio.setVisible(false);
				} catch (UnderageException ex) {
					ex.printStackTrace();
				}
			}
		});
		btnPremium.setForeground(new Color(213, 106, 0));
		btnPremium.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnPremium.setBounds(128, 127, 86, 23);
		frame.getContentPane().add(btnPremium);
		btnPremium.setVisible(false);
		
		JLabel lblElige = new JLabel("Elige tu plan:");
		lblElige.setForeground(new Color(0, 255, 255));
		lblElige.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblElige.setBounds(32, 98, 144, 19);
		frame.getContentPane().add(lblElige);
		lblElige.setVisible(false);
		
		
		
		JButton entrar = new JButton("Entrar");
		entrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				entrar.setText("Entrar");
			}
		});
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textEdad.getText().isBlank() | textNombre.getText().isBlank()){
					entrar.setText("Edad?");
				}
				try {
					int edad = Integer.parseInt(textEdad.getText().trim());
					if (edad < 13) {
						textEdad.setText("");
						status.setVisible(true);
						status.setText("Edad minima: 13");
					} else {
						textEdad.setVisible(false);
						textNombre.setVisible(false);
						entrar.setVisible(false);
						lblElige.setVisible(true);
						btnPremium.setVisible(true);
						btnEstandar.setVisible(true);
						status.setVisible(true);
						status.setText("User: " + textNombre.getText());
					}
					
				} catch (NumberFormatException number) {
				    textEdad.setText("");
				}
				
				
				
			}
		});
		entrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		entrar.setBounds(279, 61, 125, 21);
		frame.getContentPane().add(entrar);
		entrar.setVisible(false);
		
		JLabel welcome = new JLabel("Bienvenido a MusicBox:");
		welcome.setForeground(new Color(0, 255, 255));
		welcome.setFont(new Font("Dialog", Font.PLAIN, 12));
		welcome.setBounds(320, 197, 150, 19);
		frame.getContentPane().add(welcome);
		
		JButton btnStart = new JButton("Por favor, introduce tus datos.");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome.setVisible(false);
				btnStart.setVisible(false);
				textEdad.setVisible(true);
				textNombre.setVisible(true);
				textNombre.setVisible(true);
				entrar.setVisible(true);
				lblMusicBox.setVisible(true);
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnStart.setBounds(320, 226, 263, 21);
		frame.getContentPane().add(btnStart);
		
	
		
		
		
	}
}
