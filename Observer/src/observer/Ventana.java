package observer;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ventana extends JFrame {
	public Ventana() {
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Programa AOP");
		this.setLocationRelativeTo(null);
		inicarComponentes();
	}
	private void inicarComponentes() {
		JPanel panel = new JPanel();
		this.getContentPane().add(panel);
		
		JButton boton1 = new JButton("VERDE");
		boton1.setBounds(100, 100, 100, 40);
		panel.add(boton1);
		
		JButton boton2 = new JButton("AZUL");
		boton1.setBounds(300, 300, 100, 40);
		panel.add(boton2);
		
		JButton boton3 = new JButton("ROJO");
		boton1.setBounds(500, 500, 100, 40);
		panel.add(boton3);
		ActionListener verde = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				panel.setBackground(Color.GREEN);
				System.out.println("COLOR DE FONDO VERDE");
				
			}
		};
		
		ActionListener azul = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				panel.setBackground(Color.BLUE);
				System.out.println("COLOR DE FONDO AZUL");
			}
		};
		
		ActionListener rojo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				
				panel.setBackground(Color.RED);
				System.out.println("COLOR DE FONDO ROJO");
			}
		};
		
		
			
		boton1.addActionListener(verde);
		boton2.addActionListener(azul);
		boton3.addActionListener(rojo);
		
	}
	

}
