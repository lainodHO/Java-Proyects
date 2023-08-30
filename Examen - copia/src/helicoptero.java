import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
public class helicoptero {
	private static final boolean FALSE = false;
	private JFrame miformulario;
	private JFrame imagen;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
		try{
			helicoptero window =new helicoptero ();
			window.miformulario.setVisible(true);
			window.imagen.setVisible(true);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		});
}
public helicoptero () {
	initialize();
}
private void initialize(){
	miformulario = new JFrame ();
	miformulario.setTitle("Helicoptero");
	miformulario.setBounds(950,100,350,500);
	
	miformulario.setDefaultCloseOperation(JFrame .EXIT_ON_CLOSE);
	miformulario.getContentPane().setLayout(null);
	miformulario.getContentPane().setBackground( Color.cyan);	
	
final JLabel imagen =new JLabel();
	imagen.setIcon(new ImageIcon("F:\\Imagenes de eclipse\\ss.png"));
	imagen.setBounds(45,20,250,300);
	imagen.setHorizontalAlignment(0);
	imagen.setVerticalAlignment(3);
	miformulario.getContentPane().add(imagen);
	
	
	JButton b_movedor = new JButton ("Subir");
	JButton u_movedor ;
	b_movedor.setBounds(125,20,100,30);
	
	b_movedor.addMouseListener(new MouseAdapter()

	{
		
		
		
		@Override
	final	public void mouseClicked(MouseEvent arg0)
		{
		imagen.setBounds(45,20,250,295);
		
		
	
	

		}
		
	
		public void mouseClicked1(MouseEvent arg1)
			{
			imagen.setBounds(20,20,250,290);
			
			
		}
		
});
	JButton e_movedor = new JButton ("Bajar");
	e_movedor.setBounds(125,420,100,30);
	e_movedor.addMouseListener(new MouseAdapter()
			{
		@Override
		public void mouseClicked(MouseEvent arg0)
		{
			imagen.setBounds(45,20,250,305);
		
		}
			});

	miformulario.getContentPane().add(b_movedor);
	miformulario.getContentPane().add(e_movedor);
	}
}

	
