
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Trabajo {
	private JFrame miFormulario;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Trabajo window = new Trabajo();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Trabajo (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(50,100,350,450);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.gray);
		
		final JLabel olague =new JLabel();
		olague.setText("A");
		olague.setFont(new Font("Tahoma", Font.PLAIN, 60));
		olague.setForeground(Color.cyan);
		olague.setHorizontalAlignment(0);
		olague.setVerticalAlignment(0);
		olague.setBounds(125,120,80,80);
		olague.setOpaque(true);
		olague.setBackground(Color.black);
		miFormulario.getContentPane().add(olague);
		
		JButton movedor = new JButton ("Da click Derecho");
		movedor.setBounds(60,340,250,30);
		movedor.addMouseListener(new MouseAdapter()
		{	
			@Override
		final	public void mouseClicked(MouseEvent gato)
			{
				if(gato.getModifiers()==4) {
				olague.setBounds(80,80,160,160);
				olague.setFont(new Font("Tahoma", Font.PLAIN, 120));
				olague.setBackground(Color.white);
				olague.setForeground(Color.cyan);
				movedor.setText("Da click izquierdo");
				miFormulario.getContentPane().setBackground(Color.black);
			}
				if(gato.getModifiers()==16) {
					olague.setBounds(120,120,80,80);
					olague.setFont(new Font("Tahoma", Font.PLAIN, 60));
					olague.setBackground(Color.blue);
					olague.setForeground(Color.yellow);
					movedor.setText("Da click Derecho");
					miFormulario.getContentPane().setBackground(Color.red);
			}
				if(gato.getModifiers()==8) {
					olague.setIcon(new ImageIcon ("F:\\Imagenes de eclipse\\Logo_Large.png"));
					olague.setBounds(50,100,245,280);
					
					movedor.setText("Da click central");
					miFormulario.getContentPane().setBackground(Color.red);
			}
			}
	});
		miFormulario.getContentPane().add(movedor);
	}
}