package presentacion;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PanelParcial3 extends JPanel {
	
	public JTextField getTxtR() {
		return txtR;
	}




	public JTextField getTxtB() {
		return txtB;
	}




	public JTextField getTxtG() {
		return txtG;
	}




	private JTextField txtR;
	private JTextField txtB;
	private JTextField txtG;
	

 
	
	 public PanelParcial3( )
	    {
	       
	    	JLabel R = new JLabel("R ");
	    	txtR = new JTextField();

	    	JLabel G = new JLabel("G ");
	    	txtB = new JTextField();
	    
	    	JLabel B = new JLabel("B ");
	    	txtG = new JTextField();
	    	
	    	setLayout(new GridLayout(3,2));
	    	add(R);
	    	add(txtR);
	    	add(G);
	    	add(txtG);
	    	add(B);
	    	add(txtB);
	    
	    	
	    }



}
