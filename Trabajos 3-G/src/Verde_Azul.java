
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Verde_Azul {
	private JFrame miFormulario;
	int tamano=0;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Verde_Azul window = new Verde_Azul();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Verde_Azul (){
		initialize();

	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Cambio de color");
		miFormulario.setBounds(200,100,400,400);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.green);
		
		JButton e_movedor = new JButton ("Azul");
		e_movedor.setForeground(Color.blue);
		e_movedor.setBounds(150,320,100,30);
		e_movedor.addMouseListener(new MouseAdapter()
				{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				if(tamano==0){
					e_movedor.setText("Verde");
					e_movedor.setForeground(Color.green);
				miFormulario.getContentPane().setBackground(Color.blue);
				tamano=1;
				}
				else{
					e_movedor.setText("Azul");
					e_movedor.setForeground(Color.blue);
					miFormulario.getContentPane().setBackground(Color.green);
					tamano=0;
				}
			
				}
				});

		
		miFormulario.getContentPane().add(e_movedor);

	
	}
}