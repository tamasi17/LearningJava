package pooCircuitosGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


/**
 *  Versión simplificada del ejercicio Circuitos para probar WindowsBuilder.
 */
public class TestCircuitosGrafica {

	private JFrame frame;
	private JTextField crearPlaca;
	private JTextField crearCircuito;
	private JTextField addResistencia1;
	private JTextField crearVoltaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestCircuitosGrafica window = new TestCircuitosGrafica();
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
	public TestCircuitosGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		CircuitoSerie c1 = new CircuitoSerie(0);

		
		JLabel getIntensidad = new JLabel("Total Intensidad");
		getIntensidad.setEnabled(false);
		getIntensidad.setBounds(442, 335, 222, 13);
		frame.getContentPane().add(getIntensidad);
		
		
		JButton calculaIntensidad = new JButton("Calcular Intensidad");
		calculaIntensidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getIntensidad.setText(String.valueOf(c1.totalIntensidad()));
				getIntensidad.setEnabled(true);
			}
		});
		calculaIntensidad.setEnabled(false);
		calculaIntensidad.setBounds(441, 295, 150, 21);
		frame.getContentPane().add(calculaIntensidad);
		
		
		
		
		JLabel contadorResistencias = new JLabel("Total Resistencias");
		contadorResistencias.setEnabled(false);
		contadorResistencias.setBounds(58, 335, 222, 13);
		frame.getContentPane().add(contadorResistencias);
		
		addResistencia1 = new JTextField();
		addResistencia1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contadorResistencias.setText(addResistencia1.getText());
				contadorResistencias.setEnabled(true);
				Resistencia r = new Resistencia(Double.parseDouble(addResistencia1.getText()));
				c1.resistencias.add(r);
				calculaIntensidad.setEnabled(true);
			}
		});
		addResistencia1.setEnabled(false);
		addResistencia1.setText("Añade resistencia 1");
		addResistencia1.setBounds(58, 296, 107, 19);
		frame.getContentPane().add(addResistencia1);
		addResistencia1.setColumns(10);
		
		
//		Crear circuito
		
		JButton nuevoCircuitoSerie = new JButton("Nuevo circuito en serie");
		nuevoCircuitoSerie.setEnabled(false);
		nuevoCircuitoSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addResistencia1.setEnabled(true);
				contadorResistencias.setEnabled(true);
				nuevoCircuitoSerie.setEnabled(false);
			}
		});
		nuevoCircuitoSerie.setFont(new Font("Monospaced", Font.BOLD, 12));
		nuevoCircuitoSerie.setBounds(58, 179, 199, 25);
		frame.getContentPane().add(nuevoCircuitoSerie);
		
		JLabel getVoltaje = new JLabel("Voltaje del circuito");
		getVoltaje.setEnabled(false);
		getVoltaje.setBounds(250, 246, 222, 13);
		frame.getContentPane().add(getVoltaje);
		
		crearVoltaje = new JTextField();
		crearVoltaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setVoltaje(Double.parseDouble(crearVoltaje.getText()));
				getVoltaje.setText(crearVoltaje.getText());
			}
		});
		crearVoltaje.setText("Marca el voltaje de tu circuito");
		crearVoltaje.setEnabled(false);
		crearVoltaje.setColumns(10);
		crearVoltaje.setBounds(58, 243, 168, 19);
		frame.getContentPane().add(crearVoltaje);
		
		
		crearCircuito = new JTextField();
		crearCircuito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setVoltaje(Double.parseDouble(crearCircuito.getText()));
				crearVoltaje.setEnabled(true);
				getVoltaje.setText(crearCircuito.getText());
				getVoltaje.setEnabled(true);
				nuevoCircuitoSerie.setEnabled(true);
				crearCircuito.setEnabled(false);
			}
		});
		crearCircuito.setText("Voltaje inicial del circuito");
		crearCircuito.setEnabled(false);
		crearCircuito.setColumns(10);
		crearCircuito.setBounds(58, 214, 168, 19);
		frame.getContentPane().add(crearCircuito);
		
		
		
		
		
//		Creación placa:
		
		JLabel nombrePlaca = new JLabel("Aqui aparecera el nombre de tu placa");
		nombrePlaca.setEnabled(false);
		nombrePlaca.setBounds(250, 94, 222, 13);
		frame.getContentPane().add(nombrePlaca);
		
		crearPlaca = new JTextField();
		crearPlaca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nombrePlaca.setEnabled(true);
				nombrePlaca.setText(crearPlaca.getText());
				crearCircuito.setEnabled(true);
				
			}
		});
		crearPlaca.setText("Añadir nombre de la placa");
		crearPlaca.setBounds(58, 91, 168, 19);
		frame.getContentPane().add(crearPlaca);
		crearPlaca.setColumns(10);
		
	
		
		
	}
}
