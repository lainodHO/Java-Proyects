import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
public class Separar_Nombre {
	private JFrame miFormulario;

	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Separar_Nombre window = new Separar_Nombre();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Separar_Nombre (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Cuadro");
		miFormulario.setBounds(50,100,500,350);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.black);
		
		JLabel B =new JLabel();
		B.setText("Nombre completo");
		B.setBounds(95,0,300,30);
		B.setFont(new Font("Tahoma", Font.PLAIN, 20));
		B.setForeground(Color.white);
		B.setHorizontalAlignment(0);
		B.setVerticalAlignment(0);
		miFormulario.getContentPane().add(B);
				
final JTextField texto=new JTextField();
	texto.setForeground(Color.blue);
	texto.setFont(new Font("Arial", Font.PLAIN,15));
	texto.setBackground(Color.cyan);
	texto.setBounds(0,30,485,25);
	miFormulario.getContentPane().add(texto);
	
	JLabel A =new JLabel();
	A.setText("");
	A.setBounds(180,150,300,30);
	A.setOpaque(true);
	A.setBackground(Color.cyan);
	A.setFont(new Font("Tahoma", Font.PLAIN, 15));
	A.setForeground(Color.blue);
	A.setHorizontalAlignment(0);
	A.setVerticalAlignment(0);
	miFormulario.getContentPane().add(A);
	
	JLabel A1 =new JLabel();
	A1.setText("");
	A1.setBounds(180,210,300,30);
	A1.setOpaque(true);
	A1.setBackground(Color.cyan);
	A1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	A1.setForeground(Color.blue);
	A1.setHorizontalAlignment(0);
	A1.setVerticalAlignment(0);
	miFormulario.getContentPane().add(A1);
	
	JLabel A2 =new JLabel();
	A2.setText("");
	A2.setBounds(180,270,300,30);
	A2.setOpaque(true);
	A2.setBackground(Color.cyan);
	A2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	A2.setForeground(Color.blue);
	A2.setHorizontalAlignment(0);
	A2.setVerticalAlignment(0);
	miFormulario.getContentPane().add(A2);
	
	JLabel B1 =new JLabel();
	B1.setText("Ape. Paterno");
	B1.setBounds(0,150,300,30);
	B1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	B1.setForeground(Color.white);
	B1.setVerticalAlignment(0);
	miFormulario.getContentPane().add(B1);
	
	JLabel B2 =new JLabel();
	B2.setText("Ape. Materno ");
	B2.setBounds(0,210,300,30);
	B2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	B2.setForeground(Color.white);
	B2.setVerticalAlignment(0);
	miFormulario.getContentPane().add(B2);
	
	JLabel B3 =new JLabel();
	B3.setText("Nombre ");
	B3.setBounds(0,270,300,30);
	B3.setFont(new Font("Tahoma", Font.PLAIN, 20));
	B3.setForeground(Color.white);
	B3.setVerticalAlignment(0);
	miFormulario.getContentPane().add(B3);
	
	JButton b = new JButton ("Separar");
	b.setBounds(175,75,150,30);
	b.addMouseListener(new MouseAdapter()
	{
		@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
			int espacios=0;
			String textote,juntador="";
			textote=texto.getText();
			int d;
			d=textote.length();
			for(int a=0; a<d; a=a+1){
				juntador=juntador +textote.charAt(a);
				if(textote.charAt(a)==32){
					espacios=espacios+1;
					
					if(espacios==1){
					A.setText(juntador);
					juntador="";
			} 
					if(espacios==2){
						A1.setText(juntador);
						juntador="";
			}
			} 
			}

				A2.setText(juntador);
			}
			
});
miFormulario.getContentPane().add(b);
	}
}