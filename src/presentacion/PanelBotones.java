package presentacion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import uniandes.dpoo.swing.mundo.Restaurante;

public class PanelBotones extends JPanel implements ActionListener{
	
	private PanelParcial3 panel;
	private JButton btnCuadrado;
	private JButton btnCirculo;
	private static final String CUADRADO = "nuevo";
	  
    private static final String CIRCULO = "ver";
	
	public PanelBotones() {
		
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
	        	
	        	
	          
	        }
	        else if( comando.equals( CIRCULO ) )
	        {
	            
	         }
	        
	    }
	 
	 
	 @Override
	    public void paint( Graphics g )
	   {
	        super.paint( g );
	        Graphics2D g2d = ( Graphics2D )g;	
	        
	        
	       

	    
	    }




}
