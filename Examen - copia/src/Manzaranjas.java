
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
public class Manzaranjas {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Manzaranjas window = new Manzaranjas();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Manzaranjas (){
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
		
		 
		JLabel man =new JLabel();
		man.setText("Manzanas");
		man.setBounds(5,20,120,60);
		man.setFont(new Font("Tahoma", Font.PLAIN, 20));
		man.setForeground(Color.black);
		man.setHorizontalAlignment(0);
		man.setVerticalAlignment(0);
		f.getContentPane().add( man);
		
		JSpinner manS =new JSpinner();
		manS.setModel(new SpinnerNumberModel(1,1,50,1));
		manS.setFont(new Font("Thoma", Font.BOLD,20));
		manS.setBounds(110,35,60,30);
		 f.getContentPane().add( manS);

		
		
		JLabel nan =new JLabel();
		nan.setText("Naranjas");
		nan.setBounds(175,35,250,30);
		nan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nan.setForeground(Color.black);
		nan.setHorizontalAlignment(0);
		nan.setVerticalAlignment(0);
		f.getContentPane().add(nan);
		
		JSpinner nanS =new JSpinner();
		nanS.setModel(new SpinnerNumberModel(1,1,50,1));
		nanS.setFont(new Font("Thoma", Font.BOLD,20));
		nanS.setBounds(200,35,60,30);
		f.getContentPane().add(nanS);
		
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

	int nara,manz,to,td,res;
            manz=(Integer)(manS.getValue());
            to=manz*30;
            nara=(Integer)(nanS.getValue());
            td=nara*10;
            res=to+td;
            resultado.setText("El total es = $"+res);
            if(res>100){
            	  res=(to+td)-20;
            	  resultado.setText("El  descuento es = $"+res);
            }
		}
{
		}
		});
		f.getContentPane().add(b_botons);
	}
}