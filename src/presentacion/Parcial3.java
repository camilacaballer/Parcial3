package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Parcial3 extends JFrame {
	
	
	private PanelParcial3 panelIzquierdo;
	private PanelBotones panelBotones;
	
	public Parcial3() {
	
		
		this.setTitle("Parcial 3");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(700,700);
		
		
		this.setLayout(new BorderLayout());
	
		
		panelIzquierdo = new PanelParcial3();
		add(panelIzquierdo, BorderLayout.WEST);
		String rojo = panelIzquierdo.getTxtR().getText();
		String verde = panelIzquierdo.getTxtG().getText();
		String azul = panelIzquierdo.getTxtB().getText();
		
		int red, green, blue; 
		
		try {
			red = Integer.parseInt(rojo);
			green = Integer.parseInt(verde);
			blue = Integer.parseInt(azul);
		} catch (NumberFormatException e){
			red = 0;
			blue = 0;
			green = 0;
		}
		
		
		panelBotones = new PanelBotones(red, green, blue);
		add(panelBotones, BorderLayout.SOUTH);
	
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Parcial3();
	}
	
	
	
	
	
	
	
	

}
