package com.mati.mongodb.mongo_java_demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Button;
import java.awt.Choice;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JPanel;

public class GraficaMongo {

	private JFrame frame;
	private JTextField nombre;
	private JTextField rol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraficaMongo window = new GraficaMongo();
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
	public GraficaMongo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(54, 54, 54));
		frame.getContentPane().setBackground(new Color(54, 54, 54));
		frame.setBounds(100, 100, 604, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton start = new JButton("Conectarse a MongoDB");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					MongoConnection.getDatabase("testDAM"); // Define exceptions to throw here
					nombre.setEnabled(true);
					rol.setEnabled(true);
				} catch (Exception e2) {
					System.out.println("Try again."); 
				}
				
				
			}
		});
		start.setForeground(new Color(0, 255, 64));
		start.setBackground(new Color(128, 128, 128));
		start.setFont(new Font("Verdana", Font.PLAIN, 11));
		start.setBounds(203, 32, 183, 34);
		frame.getContentPane().add(start);
		
		nombre = new JTextField();
		nombre.setText("Name");
		nombre.setEnabled(false);
		nombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		nombre.setBounds(45, 119, 190, 20);
		frame.getContentPane().add(nombre);
		nombre.setColumns(10);
		
		rol = new JTextField();
		rol.setText("Role");
		rol.setFont(new Font("Verdana", Font.PLAIN, 12));
		rol.setEnabled(false);
		rol.setColumns(10);
		rol.setBounds(45, 150, 190, 20);
		frame.getContentPane().add(rol);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (nombre.getText()!="Name" && rol.getText()!="Role") {
					
					MongoDataInserter.insertData(nombre.getText(), rol.getText());

				}
				
			}
		});
		insert.setForeground(new Color(0, 255, 64));
		insert.setFont(new Font("Verdana", Font.PLAIN, 11));
		insert.setBackground(new Color(73, 73, 73));
		insert.setBounds(45, 191, 90, 34);
		frame.getContentPane().add(insert);
		
		
		JTextArea screen = new JTextArea();
		screen.setWrapStyleWord(true);
		screen.setForeground(new Color(255, 255, 255));
		screen.setLineWrap(true);
		screen.setText("The data from your document will appear here.");
		screen.setBackground(new Color(73, 73, 73));
		screen.setBounds(282, 118, 264, 109);
		frame.getContentPane().add(screen);
		
		JButton retrieve = new JButton("Retrieve");
		retrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result = MongoDataRetriever.retrieveData("name", nombre.getText());
				screen.setText(result);
				System.out.println("\n Resultado: \n " + result);
			}
		});
		retrieve.setForeground(new Color(0, 255, 64));
		retrieve.setFont(new Font("Verdana", Font.PLAIN, 11));
		retrieve.setBackground(new Color(73, 73, 73));
		retrieve.setBounds(145, 191, 90, 34);
		frame.getContentPane().add(retrieve);
		
	}
}
