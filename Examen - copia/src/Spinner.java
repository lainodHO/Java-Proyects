
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
public class Spinner {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Spinner window = new Spinner();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Spinner (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Ventana");
		f.setBounds(50,100,400,300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.red);
		
		JLabel lpeso =new JLabel();
		lpeso.setText("Peso");
		lpeso.setBounds(20,20,120,60);
		lpeso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lpeso.setForeground(Color.blue);
		lpeso.setHorizontalAlignment(0);
		lpeso.setVerticalAlignment(0);
		f.getContentPane().add(lpeso);
		
		JSpinner p =new JSpinner();
		p.setModel(new SpinnerNumberModel(60,25,200,1));
		p.setFont(new Font("Thoma", Font.BOLD,20));
		p.setBounds(130,35,60,30);
		f.getContentPane().add(p);
		
		JLabel l =new JLabel();
		l.setText("");
		l.setBounds(40,100,250,30);
		l.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l.setForeground(Color.cyan);
		l.setHorizontalAlignment(0);
		l.setVerticalAlignment(0);
		f.getContentPane().add(l);
		
		JButton b_boton = new JButton ("Calcular");
		b_boton.setBounds(48,207,97,30);
		b_boton.addMouseListener(new MouseAdapter()
		{
	@Override
	public void mouseClicked(MouseEvent arg0)
	{

	int peso,total;
            peso=(Integer)(p.getValue());
            total=3*peso;
        	l.setText("Inscripcion "+total);
		}
{
		}
		});
		f.getContentPane().add(b_boton);
	}
}
