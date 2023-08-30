
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.Color;
public class Area_Triangulo {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Area_Triangulo window = new Area_Triangulo();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Area_Triangulo (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Ventana");
		f.setBounds(50,100,400,300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.gray);
		
		 
		JLabel base =new JLabel();
		 base.setText("Base");
		 base.setBounds(20,20,120,60);
		 base.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 base.setForeground(Color.black);
		 base.setHorizontalAlignment(0);
		 base.setVerticalAlignment(0);
		f.getContentPane().add( base);
		
		JSpinner baseS =new JSpinner();
		 baseS.setModel(new SpinnerNumberModel(1,1,50,1));
		 baseS.setFont(new Font("Thoma", Font.BOLD,20));
		 baseS.setBounds(110,35,60,30);
		 f.getContentPane().add( baseS);

		
		
		JLabel altura =new JLabel();
		altura.setText("Altura");
		altura.setBounds(175,35,250,30);
		altura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		altura.setForeground(Color.black);
		altura.setHorizontalAlignment(0);
		altura.setVerticalAlignment(0);
		f.getContentPane().add(altura);
		
		JSpinner alturaS =new JSpinner();
		alturaS.setModel(new SpinnerNumberModel(1,1,50,1));
		alturaS.setFont(new Font("Thoma", Font.BOLD,20));
		alturaS.setBounds(200,35,60,30);
		f.getContentPane().add(alturaS);
		
		JLabel resultado =new JLabel();
		resultado.setText("");
		resultado.setBounds(65,75,250,30);
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		resultado.setForeground(Color.black);
		resultado.setHorizontalAlignment(0);
		resultado.setVerticalAlignment(0);
		f.getContentPane().add(resultado);
		
		JButton b_botons = new JButton ("Calcular");
		b_botons.setBounds(135,207,97,30);
		b_botons.addMouseListener(new MouseAdapter()
		{
	@Override
	public void mouseClicked(MouseEvent arg0)
	{

	int alturaa,basee,total;
            alturaa=(Integer)(alturaS.getValue());
            basee=(Integer)(baseS.getValue());
            total=basee*alturaa/2;
            resultado.setText("Area = "+total);
		}
{
		}
		});
		f.getContentPane().add(b_botons);
	}
}
