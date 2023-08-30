
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Giro {
	private JFrame miFormulario;
	int m,m2,m3,m4;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Giro window = new Giro();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Giro (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Giro");
		miFormulario.setBounds(500,100,480,380);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.white);

		
	JLabel a1 =new JLabel();
	a1.setBounds(275,50,25,25);
	a1.setOpaque(true);
	a1.setBackground(Color.blue);
	miFormulario.getContentPane().add(a1);
	
	JLabel a2 =new JLabel();
	a2.setBounds(345,85,25,25);
	a2.setOpaque(true);
	a2.setBackground(Color.gray);
	miFormulario.getContentPane().add(a2);

	JLabel a3 =new JLabel();
	a3.setBounds(375,150,25,25);
	a3.setOpaque(true);
	a3.setBackground(Color.green);
	miFormulario.getContentPane().add(a3);
	
	JLabel a4 =new JLabel();
	a4.setBounds(345,210,25,25);
	a4.setOpaque(true);
	a4.setBackground(Color.red);
	miFormulario.getContentPane().add(a4);
	
	JLabel a5 =new JLabel();
	a5.setBounds(275,245,25,25);
	a5.setOpaque(true);
	a5.setBackground(Color.MAGENTA);
	miFormulario.getContentPane().add(a5);
	

	JLabel a6 =new JLabel();
	a6.setBounds(200,210,25,25);
	a6.setOpaque(true);
	a6.setBackground(Color.black);
	miFormulario.getContentPane().add(a6);

	JLabel a7 =new JLabel();
	a7.setBounds(175,150,25,25);
	a7.setOpaque(true);
	a7.setBackground(Color.cyan);
	miFormulario.getContentPane().add(a7);
	
	JLabel a8 =new JLabel();
	a8.setBounds(200,85,25,25);
	a8.setOpaque(true);
	a8.setBackground(Color.yellow);
	miFormulario.getContentPane().add(a8);

	


	
	JButton move = new JButton ("Girar");
	move.setBounds(245,150,80,30);
	move.addMouseListener(new MouseAdapter()
	{
		@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
			if(m==0){
			a1.setBackground(Color.yellow);
			a2.setBackground(Color.blue);
			a3.setBackground(Color.gray);
			a4.setBackground(Color.green);
			a5.setBackground(Color.red);
			a6.setBackground(Color.magenta);
			a7.setBackground(Color.black);
			a8.setBackground(Color.cyan);

		
			m=1;
		}
			else if(m==1){
				a1.setBackground(Color.cyan);
				a2.setBackground(Color.yellow);
				a3.setBackground(Color.blue);
				a4.setBackground(Color.gray);
				a5.setBackground(Color.green);
				a6.setBackground(Color.red);
				a7.setBackground(Color.magenta);
				a8.setBackground(Color.black);
			
				m=2;
			}
			else if(m==2){
				a1.setBackground(Color.black);
				a2.setBackground(Color.cyan);
				a3.setBackground(Color.yellow);
				a4.setBackground(Color.blue);
				a5.setBackground(Color.gray);
				a6.setBackground(Color.green);
				a7.setBackground(Color.red);
				a8.setBackground(Color.MAGENTA);
	
				m=3;
		  }
			else if(m==3){
				a1.setBackground(Color.magenta);
				a2.setBackground(Color.black);
				a3.setBackground(Color.cyan);
				a4.setBackground(Color.yellow);
				a5.setBackground(Color.blue);
				a6.setBackground(Color.gray);
				a7.setBackground(Color.green);
				a8.setBackground(Color.red);
				m=4;
			
			}
			else if(m==4){
				a1.setBackground(Color.red);
				a2.setBackground(Color.magenta);
				a3.setBackground(Color.black);
				a4.setBackground(Color.cyan);
				a5.setBackground(Color.yellow);
				a6.setBackground(Color.blue);
				a7.setBackground(Color.gray);
				a8.setBackground(Color.green);
				m=5;

			}
			else if(m==5){
				a1.setBackground(Color.green);
				a2.setBackground(Color.red);
				a3.setBackground(Color.magenta);
				a4.setBackground(Color.black);
				a5.setBackground(Color.cyan);
				a6.setBackground(Color.yellow);
				a7.setBackground(Color.blue);
				a8.setBackground(Color.gray);
				m=6;
			}
			else if(m==6){
				a1.setBackground(Color.gray);
				a2.setBackground(Color.green);
				a3.setBackground(Color.red);
				a4.setBackground(Color.magenta);
				a5.setBackground(Color.black);
				a6.setBackground(Color.cyan);
				a7.setBackground(Color.yellow);
				a8.setBackground(Color.blue);
				m=7;
			}
			else if(m==7){
				a1.setBackground(Color.blue);
				a2.setBackground(Color.gray);
				a3.setBackground(Color.green);
				a4.setBackground(Color.red);
				a5.setBackground(Color.magenta);
				a6.setBackground(Color.black);
				a7.setBackground(Color.cyan);
				a8.setBackground(Color.yellow);
				m=0;
			}
			}
});
miFormulario.getContentPane().add(move);

}
}