package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JLabel;

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
		frame.setBounds(100, 100, 852, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnActivarPremium = new JToggleButton("Activar Premium");
		tglbtnActivarPremium.setBounds(112, 11, 121, 23);
		frame.getContentPane().add(tglbtnActivarPremium);
		
		JLabel lblPlanUsuario = new JLabel("Plan: Estandar");
		lblPlanUsuario.setForeground(new Color(128, 128, 255));
		lblPlanUsuario.setBounds(32, 15, 70, 14);
		frame.getContentPane().add(lblPlanUsuario);
	}
}
