package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;



public class Listener2 implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		JOptionPane.showMessageDialog(source, source.getText() + ": Presiones  el boton  de la  pila  que "
				+ "\ndesea mover, luego presione el boton de la torres "
				+ "\na la que desea llevar el disco.  Debe  mover  todos "
				+ "\nlos discos de una torre a  otra  torre.  Y  no  puede "
				+ "\ncolocar  un  disco  mas grande  sobre  otro  disco "
				+ "\nmas pequeño.");
		
	}
	}
