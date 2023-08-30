
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class ExamenUnoB {
	private JFrame miFormulario;
	int lado=0;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					ExamenUnoB window = new ExamenUnoB();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public ExamenUnoB (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(400,100,650,400);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.gray);

		JLabel ee_Prueba =new JLabel();
		ee_Prueba.setBounds(80,125,200,10);
		ee_Prueba.setOpaque(true);
		ee_Prueba.setBackground(Color.black);
		miFormulario.getContentPane().add(ee_Prueba);
		
		JLabel ee_P =new JLabel();
		ee_P.setBounds(80,150,75,10);
		ee_P.setOpaque(true);
		ee_P.setBackground(Color.black);
		miFormulario.getContentPane().add(ee_P);
		
		JLabel ee_Ps =new JLabel();
		ee_Ps.setBounds(205,150,75,10);
		ee_Ps.setOpaque(true);
		ee_Ps.setBackground(Color.black);
		miFormulario.getContentPane().add(ee_Ps);

		JLabel e =new JLabel();
		e.setBounds(80,175,50,10);
		e.setOpaque(true);
		e.setBackground(Color.black);
		miFormulario.getContentPane().add(e);
		
		JLabel ee =new JLabel();
		ee.setBounds(80,200,50,10);
		ee.setOpaque(true);
		ee.setBackground(Color.black);
		miFormulario.getContentPane().add(ee);
		
		JLabel el =new JLabel();
		el.setBounds(230,200,50,10);
		el.setOpaque(true);
		el.setBackground(Color.black);
		miFormulario.getContentPane().add(el);
		
		JLabel els =new JLabel();
		els.setBounds(230,175,50,10);
		els.setOpaque(true);
		els.setBackground(Color.black);
		miFormulario.getContentPane().add(els);
		
		JLabel ee_Pruebas =new JLabel();
		ee_Pruebas.setBounds(80,225,75,10);
		ee_Pruebas.setOpaque(true);
		ee_Pruebas.setBackground(Color.black);
		miFormulario.getContentPane().add(ee_Pruebas);
		
		JLabel ee_Pe =new JLabel();
		ee_Pe.setBounds(205,225,75,10);
		ee_Pe.setOpaque(true);
		ee_Pe.setBackground(Color.black);
		miFormulario.getContentPane().add(ee_Pe);
		
		JLabel ee_Prueb =new JLabel();
		ee_Prueb.setBounds(80,250,200,10);
		ee_Prueb.setOpaque(true);
		ee_Prueb.setBackground(Color.black);
		miFormulario.getContentPane().add(ee_Prueb);
		
		JLabel e_Pruebass =new JLabel();
		e_Pruebass.setText("MX");
		e_Pruebass.setBounds(55,158,250,60);
		e_Pruebass.setFont(new Font("Tahoma", Font.PLAIN, 65));
		e_Pruebass.setForeground(Color.black);
		e_Pruebass.setToolTipText("Etiqueta echa por End");
		e_Pruebass.setHorizontalAlignment(0);
		e_Pruebass.setVerticalAlignment(0);
		miFormulario.getContentPane().add(e_Pruebass);
		
		JLabel eees =new JLabel();
		eees.setText("MEXICO VIVE MEXICO");
		eees.setBounds(80,110,200,10);
		eees.setFont(new Font("Tahoma", Font.PLAIN, 19));
		eees.setForeground(Color.black);
		eees.setToolTipText("Etiqueta echa por End");
		eees.setHorizontalAlignment(0);
		eees.setVerticalAlignment(0);
		miFormulario.getContentPane().add(eees);
		
		JLabel eee =new JLabel();
		eee.setText("MEXICO VIVE MEXICO");
		eee.setBounds(80,265,200,10);
		eee.setFont(new Font("Tahoma", Font.PLAIN, 19));
		eee.setForeground(Color.black);
		eee.setToolTipText("Etiqueta echa por End");
		eee.setHorizontalAlignment(0);
		eee.setVerticalAlignment(0);
		miFormulario.getContentPane().add(eee);
		
		JLabel u =new JLabel();
		u.setBounds(340,105,35,35);
		u.setOpaque(true);
		u.setBackground(Color.cyan);
		miFormulario.getContentPane().add(u);
		u.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
				{
				ee_Prueba.setBackground(Color.cyan);
				ee_P.setBackground(Color.cyan);
				ee_Ps.setBackground(Color.cyan);
				e.setBackground(Color.cyan);
				ee.setBackground(Color.cyan);
				el.setBackground(Color.cyan);
				els.setBackground(Color.cyan);
				ee_Pruebas.setBackground(Color.cyan);
				ee_Pe.setBackground(Color.cyan);
				ee_Prueb.setBackground(Color.cyan);
				e_Pruebass.setForeground(Color.cyan);
				eees.setForeground(Color.cyan);
				eee.setForeground(Color.cyan);
			}
	});
	miFormulario.getContentPane().add(u);
	
	JLabel us =new JLabel();
	us.setBounds(340,165,35,35);
	us.setOpaque(true);
	us.setBackground(Color.red);
	miFormulario.getContentPane().add(us);
	us.addMouseListener(new MouseAdapter()
	{
		@Override
		final	public void mouseClicked(MouseEvent arg0)
			{
			ee_Prueba.setBackground(Color.red);
			ee_P.setBackground(Color.red);
			ee_Ps.setBackground(Color.red);
			e.setBackground(Color.red);
			ee.setBackground(Color.red);
			el.setBackground(Color.red);
			els.setBackground(Color.red);
			ee_Pruebas.setBackground(Color.red);
			ee_Pe.setBackground(Color.red);
			ee_Prueb.setBackground(Color.red);
			e_Pruebass.setForeground(Color.red);
			eees.setForeground(Color.red);
			eee.setForeground(Color.red);
		}
});
miFormulario.getContentPane().add(us);
		
JLabel ua =new JLabel();
ua.setBounds(340,225,35,35);
ua.setOpaque(true);
ua.setBackground(Color.green);
miFormulario.getContentPane().add(ua);
ua.addMouseListener(new MouseAdapter()
{
	@Override
	final	public void mouseClicked(MouseEvent arg0)
		{
		ee_Prueba.setBackground(Color.green);
		ee_P.setBackground(Color.green);
		ee_Ps.setBackground(Color.green);
		e.setBackground(Color.green);
		ee.setBackground(Color.green);
		el.setBackground(Color.green);
		els.setBackground(Color.green);
		ee_Pruebas.setBackground(Color.green);
		ee_Pe.setBackground(Color.green);
		ee_Prueb.setBackground(Color.green);
		e_Pruebass.setForeground(Color.green);
		eees.setForeground(Color.green);
		eee.setForeground(Color.green);
	}
});
miFormulario.getContentPane().add(ua);

JLabel imagen =new JLabel();
imagen.setBounds(20,20,250,300);

miFormulario.getContentPane().add(imagen);

JButton b_movedor = new JButton ();
b_movedor.setText("ARRIBA");
b_movedor.setBounds(130,295,100,30);
b_movedor.addMouseListener(new MouseAdapter()
{
	@Override
	final	public void mouseClicked(MouseEvent arg0)
		{
		if(lado==0){
		b_movedor.setText("ABAJO");
		b_movedor.setBounds(130,67,100,30);
		lado=1;
	}
		else{
			b_movedor.setText("ARRIBA");
			b_movedor.setBounds(130,295,100,30);
			lado=0;
		}
		}
});
miFormulario.getContentPane().add(b_movedor);
	
	}
}