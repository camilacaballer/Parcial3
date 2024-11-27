package presentacion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;



public class PanelBotones extends JPanel implements ActionListener{
	
	private PanelParcial3 panel;
	private JButton btnCuadrado;
	private JButton btnCirculo;
	
	private int rojo;
	private int verde;
	private int azul; 
	
	private static final String CUADRADO = "nuevo";
	  
    private static final String CIRCULO = "ver";
	
	public PanelBotones(int rojo, int verde, int azul) {
		
		this.rojo = rojo;
		this.verde = verde;
		this.azul = azul;
		
		setLayout(new FlowLayout());
    	
    	btnCuadrado = new JButton("Cuadrado");
    	btnCuadrado.setActionCommand(CUADRADO);
        btnCuadrado.addActionListener(this);
        add(btnCuadrado);
    	btnCirculo = new JButton("Circulo");
    	btnCirculo.setActionCommand(CIRCULO);
        btnCirculo.addActionListener(this);
        add(btnCirculo);
	}
	
	
	 @Override
	    public void actionPerformed( ActionEvent e ){
	        String comando = e.getActionCommand( );
	        if( comando.equals( CUADRADO) )
	        {
	        	
	        	Graphics g = null;
	        	super.paint( g );
	 	        Graphics2D g2d = ( Graphics2D )g;	
	 	        
	 	        g2d.setColor(new Color(rojo,verde,azul));
	 	        g2d.fillRect(40, 40, 40, 40);
	 	        
	        	
	        	
	          
	        }
	        else if( comando.equals( CIRCULO ) )
	        {
	        	
	        	Graphics h = null;
	        	super.paint( h );
	 	        Graphics2D g2d = ( Graphics2D )h;	
	 	        
	 	        g2d.setColor(new Color(rojo,verde,azul));
	 	        g2d.fillOval(40, 40, 40, 40);
	 	        
	            
	         }
	        
	    }
	 
	



}
