
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
public class Texto {
	private JFrame miFormulario;
	String gato="";
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Texto window = new Texto();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Texto (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Cuadro");
		miFormulario.setBounds(50,100,400,300);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.black);
				
final JTextField texto=new JTextField();
	texto.setForeground(Color.blue);
	texto.setFont(new Font("Arial", Font.PLAIN,15));
	texto.setBackground(Color.cyan);
	texto.setBounds(30,30,300,30);
	miFormulario.getContentPane().add(texto);
	
	JLabel A =new JLabel();
	A.setText("resutados");
	A.setBounds(30,90,300,30);
	A.setOpaque(true);
	A.setBackground(Color.cyan);
	A.setFont(new Font("Tahoma", Font.PLAIN, 15));
	A.setForeground(Color.blue);
	A.setToolTipText("Que estas viendo");
	A.setHorizontalAlignment(0);
	A.setVerticalAlignment(0);
	miFormulario.getContentPane().add(A);
	
	JButton b = new JButton ("Contar");
	b.setBounds(110,150,150,30);
	b.addMouseListener(new MouseAdapter()
	{
		@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
			String o;
			o=texto.getText();
			int as;
			as=o.length();
			for(int a=as-1; a>=0; a=a-1){
				gato=gato+o.charAt(a);
				A.setText(gato);
			}             
		}
		
});
miFormulario.getContentPane().add(b);
	}
}