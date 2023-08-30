
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Helicoptero {
	private JFrame miFormulario;
	int Gato=66;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Helicoptero window = new Helicoptero();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Helicoptero (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Subir y Bajar");
		miFormulario.setBounds(950,100,350,500);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.cyan);
	
	JLabel imagen =new JLabel();
	imagen.setIcon(new ImageIcon ("F:\\Imagenes de eclipse\\ss.png"));
	imagen.setBounds(30,66,250,300);
	imagen.setHorizontalAlignment(0);
	imagen.setVerticalAlignment(3);
	miFormulario.getContentPane().add(imagen);
	
	JLabel imagens =new JLabel();
	imagens.setBounds(0,365,350,10);
	imagens.setOpaque(true);
	imagens.setBackground(Color.green);
	miFormulario.getContentPane().add(imagens);
	
	JButton b_movedor = new JButton ("Subir");
	JButton u_movedor ;
	b_movedor.setBounds(125,20,100,30);
	
	b_movedor.addMouseListener(new MouseAdapter()

	{
		
		
		
		@Override
	final	public void mouseClicked(MouseEvent arg0)
		{
			Gato=Gato-5;
		imagen.setBounds(30,Gato,250,295);
		
	
			
			
		}
		
});
	JButton e_movedor = new JButton ("Bajar");
	e_movedor.setBounds(125,420,100,30);
	e_movedor.addMouseListener(new MouseAdapter()
			{
		@Override
		public void mouseClicked(MouseEvent arg0)
		{
			Gato=Gato+5;
			imagen.setBounds(30,Gato,250,295);
		
		}
			});

	miFormulario.getContentPane().add(e_movedor);
	}
}
