package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Listeners implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		JOptionPane.showMessageDialog(source, source.getText() + " has presionado ese boton");
	}
	
	
}
