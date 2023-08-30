
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class cuadro2 {
	private JFrame miFormulario;
	int tamano=0;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					cuadro2 window = new cuadro2();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public cuadro2 (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(1000,100,320,430);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.yellow);

		final JLabel olague =new JLabel();
		olague.setText("A");
		olague.setFont(new Font("Tahoma", Font.PLAIN, 60));
		olague.setForeground(Color.cyan);
		olague.setHorizontalAlignment(0);
		olague.setVerticalAlignment(0);
		olague.setBounds(120,120,80,80);
		olague.setOpaque(true);
		olague.setBackground(Color.green);
		miFormulario.getContentPane().add(olague);
		olague.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				if(tamano==0){
				olague.setBounds(80,80,160,160);
				olague.setFont(new Font("Tahoma", Font.PLAIN, 160));
				tamano=1;
			}
				else{
					olague.setBounds(120,120,80,80);
					olague.setFont(new Font("Tahoma", Font.PLAIN, 60));
					tamano=0;
				}
			
				}
				});

		
		final JLabel olagueh =new JLabel();
		olagueh.setBounds(0,320,320,4);
		olagueh.setOpaque(true);
		olagueh.setBackground(Color.blue);
		miFormulario.getContentPane().add(olagueh);
		
		
		JButton b_movedor = new JButton ("Anchar");
		b_movedor.setBounds(110,340,100,35);
		b_movedor.addMouseListener(new MouseAdapter()

		{	
			@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
				olague.setBounds(80,80,160,160);
				olague.setFont(new Font("Tahoma", Font.PLAIN, 160));
			}
			
	});

		miFormulario.getContentPane().add(b_movedor);
}
}