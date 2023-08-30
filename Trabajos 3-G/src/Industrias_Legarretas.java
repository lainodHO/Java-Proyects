
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.Color;
public class Industrias_Legarretas {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Industrias_Legarretas window = new Industrias_Legarretas();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Industrias_Legarretas (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Industria_Legarreta");
		f.setBounds(700,200,380,300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.yellow);
		
		final JTextField texto=new JTextField();
		texto.setForeground(Color.blue);
		texto.setFont(new Font("Arial", Font.PLAIN,15));
		texto.setBackground(Color.white);
		texto.setBounds(20,85,135,35);
		f.getContentPane().add(texto);

		JSpinner s =new JSpinner();
		s.setModel(new SpinnerNumberModel(0,0,200,1));
		s.setFont(new Font("Thoma", Font.BOLD,20));
		s.setBounds(295,85,60,30);
		f.getContentPane().add(s);
		
		JSpinner s1 =new JSpinner();
		s1.setModel(new SpinnerNumberModel(0,0,200,1));
		s1.setFont(new Font("Thoma", Font.BOLD,20));
		s1.setBounds(295,120,60,30);
		f.getContentPane().add(s1);
		
		JLabel B =new JLabel();
		B.setText("Sexo");
		B.setBounds(65,50,300,30);
		B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B.setForeground(Color.red);
		B.setVerticalAlignment(0);
		f.getContentPane().add(B);
		
		JLabel B1 =new JLabel();
		B1.setText("Hrs. Normales");
		B1.setBounds(165,80,300,30);
		B1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B1.setForeground(Color.red);
		B1.setVerticalAlignment(0);
		f.getContentPane().add(B1);
		
		JLabel B2 =new JLabel();
		B2.setText("Hrs. Extras");
		B2.setBounds(180,120,300,30);
		B2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B2.setForeground(Color.red);
		B2.setVerticalAlignment(0);
		f.getContentPane().add(B2);
		
		JLabel r =new JLabel();
		r.setText("Resultado");
		r.setBounds(165,160,180,30);
		r.setOpaque(true);
		r.setBackground(Color.white);
		r.setFont(new Font("Tahoma", Font.PLAIN, 25));
		r.setForeground(Color.black);
		r.setHorizontalAlignment(0);
		r.setVerticalAlignment(0);
		f.getContentPane().add(r);
		
		JButton b_movedor = new JButton ("Calcular");
		b_movedor.setBounds(40,170,100,30);
		b_movedor.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
				{
				
				String j;
				 int v,t,v1,t1,total;
                 j=texto.getText();
				 if(j=="Hombre");
				 if(j.equalsIgnoreCase("hombre")){
	            v=(Integer)(s.getValue());
	            v1=(Integer)(s1.getValue());
	            t=15*v;
	            t1=30*v1;
	            total=t+t1;	 
	        r.setText("$"+total);
			}
			
			 if(j=="Mujer");
			 if(j.equalsIgnoreCase("mujer")){
			  v=(Integer)(s.getValue());
	            v1=(Integer)(s1.getValue());
	            t=7*v;
	            t1=15*v1;
	            total=t+t1;	 
	        r.setText("$"+total);
		}
	}
				
	});
	f.getContentPane().add(b_movedor);
	
	}
}