
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Cuadro {
	private JFrame miFormulario;
int O=120;
int D=120;
int a=120;
int l=220;
	protected Object Olague;
	public Cuadro (){
		initialize();
		initialize();
	}
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Cuadro window = new Cuadro();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Subir y Bajar");
		miFormulario.setBounds(950,100,400,600);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.white);
	
	JLabel imagens =new JLabel();
	imagens.setText("A");
		imagens.setBounds(120,220,120,120);
		imagens.setFont(new Font("Tahoma", Font.PLAIN, 60));
		imagens.setOpaque(true);
		imagens.setBackground(Color.black);
		imagens.setToolTipText("ee");
		imagens.setHorizontalAlignment(0);
		imagens.setVerticalAlignment(0);
		miFormulario.getContentPane().add(imagens);
		imagens.addMouseListener(new MouseAdapter()
		
		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				O=O+8;
				D=D+8;
				a=a+8;
				l=l+8;
				imagens.setBounds(a,l,O,D);	
				imagens.setFont(new Font("Tahoma", Font.PLAIN, 100));
			}
			
	});
	JButton b_movedor = new JButton ("Anchar");
	b_movedor.setBounds(150,20,100,30);
	
	b_movedor.addMouseListener(new MouseAdapter()

	{	
		@Override
	final	public void mouseClicked(MouseEvent arg0)
		{
			imagens.setBounds(80,160,220,220);	
			imagens.setFont(new Font("Tahoma", Font.PLAIN, 100));
		}
		
});

	miFormulario.getContentPane().add(b_movedor);

	}
}
