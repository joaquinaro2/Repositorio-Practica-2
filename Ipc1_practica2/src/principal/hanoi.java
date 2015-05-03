/**
 * 
 */
/**
 * @author Personal
 *
 */
package principal;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//123123123
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Rectangle;
public class hanoi extends JPanel{
	
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.ORANGE);
				
		g2d.fillRect(50, 0, 30, 30);
		g2d.drawRect(50, 50, 30, 30);
	
		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));
		
	}
	
	
	
	//la ventana principal
	public static void main (String [] args){
		javax.swing.JFrame ventana =new JFrame ("Torres de Hanoi");
		ventana.add(new hanoi());
		ventana.setSize(650,500);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		componentes(ventana);
		ventana.setVisible(true);
		
		
		
	}
	
	
	//los componentes de la ventana
	private static void componentes(JFrame ventana){
		ventana.setLayout(null);
		
		//botones
		JButton botton1 = new JButton ("Torre 1");
		botton1.setBounds(50,400,100,25);
		ventana.add(botton1);
		
		JButton botton2 = new JButton ("Torre 2");
		botton2.setBounds(200,400,100,25);
		ventana.add(botton2);

		JButton botton3 = new JButton ("Torre 3");
		botton3.setBounds(350,400,100,25);
		ventana.add(botton3);
		
		JButton botton4 = new JButton ("Nuevo Juego");
		botton4.setBounds(470,400,150,25);
		ventana.add(botton4);
	
		
		
		
		
		
		
		
		
		JButton instrucciones = new JButton ("Instrucciones");
		instrucciones.setBounds(460,430,115,25);
		ventana.add(instrucciones);
		
		//listener torres
		ActionListener myButtonListener = new Listeners();
		botton1.addActionListener(myButtonListener);
		botton2.addActionListener(myButtonListener);
		botton3.addActionListener(myButtonListener);
		
		//listener intrucciones
		ActionListener listenerInstrucciones = new Listener2();
		instrucciones.addActionListener(listenerInstrucciones);
		
	}
	
	
}