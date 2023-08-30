
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Trabajo_Profe {
	private JFrame miFormulario;
int o=20;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Trabajo_Profe window = new Trabajo_Profe();
					window.miFormulario.setVisible(true);
				
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Trabajo_Profe (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(120,0,780,450);
		
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.white);
		
		final JLabel olague =new JLabel();
		olague.setIcon(new ImageIcon ("F:\\Imagenes de eclipse\\fifa.jpg"));
		olague.setBounds(0,0,765,418);

		miFormulario.getContentPane().add(olague);
		
		JButton movedor = new JButton ("Start");
		movedor.setBounds(260,340,250,30);
		movedor.addMouseListener(new MouseAdapter()
		{	
			@Override
		final	public void mouseClicked(MouseEvent gato)
			{
				if(gato.getModifiers()==4) {
				olague.setIcon(new ImageIcon ("F:\\Imagenes de eclipse\\c.png"));
				o=o+5;
				olague.setBounds(o,80,160,160);
				movedor.setText("Da click izquierdo");
		
			}
				if(gato.getModifiers()==16) {
					olague.setIcon(new ImageIcon ("F:\\Imagenes de eclipse\\w.png"));
					o=o-5;
					olague.setBounds(o,80,160,160);
					movedor.setText("Da click Derecho");
				
					if(o==140) {
						
					}
			}
		
			}
			
	});
		miFormulario.getContentPane().add(movedor);
	}
}