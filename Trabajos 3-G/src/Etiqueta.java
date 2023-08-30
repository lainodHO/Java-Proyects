import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Etiqueta {
	private JFrame miFormulario;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Etiqueta window = new Etiqueta();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Etiqueta (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(50,100,400,300);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.cyan);
		
		JLabel e_Prueba =new JLabel();
		e_Prueba.setText("Hola que hace");
		e_Prueba.setBounds(20,50,250,60);
		e_Prueba.setOpaque(true);
		e_Prueba.setBackground(Color.yellow);
		e_Prueba.setFont(new Font("Tahoma", Font.PLAIN, 35));
		e_Prueba.setForeground(Color.blue);
		e_Prueba.setToolTipText("Etiqueta echa por Daniel");
		e_Prueba.setHorizontalAlignment(0);
		e_Prueba.setVerticalAlignment(0);
		miFormulario.getContentPane().add(e_Prueba);
		
		JLabel e_Prueb =new JLabel();
		e_Prueb.setText("Hola que hace");
		e_Prueb.setBounds(100,150,250,60);
		e_Prueb.setOpaque(true);
		e_Prueb.setBackground(Color.green);
		e_Prueb.setFont(new Font("Tahoma", Font.PLAIN, 35));
		e_Prueb.setForeground(Color.red);
		e_Prueb.setToolTipText("Etiqueta echa por End");
		e_Prueb.setHorizontalAlignment(0);
		e_Prueb.setVerticalAlignment(0);
		miFormulario.getContentPane().add(e_Prueb);

	
	}
}