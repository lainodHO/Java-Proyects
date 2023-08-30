import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Mover_Imagen {
	private JFrame miFormulario;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Mover_Imagen window = new Mover_Imagen();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Mover_Imagen (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(950,100,325,475);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.cyan);
		
		JLabel imagen =new JLabel();
		imagen.setIcon(new ImageIcon ("F:\\Imagenes de eclipse\\Logo_Large.png"));
		imagen.setBounds(20,20,250,300);
		
		miFormulario.getContentPane().add(imagen);
		
		JButton b_movedor = new JButton ("Mover");
		b_movedor.setBounds(105,370,100,30);
		b_movedor.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
				{
				imagen.setBounds(30 ,20,250,300);
			}
	});
	miFormulario.getContentPane().add(b_movedor);
}
	}
