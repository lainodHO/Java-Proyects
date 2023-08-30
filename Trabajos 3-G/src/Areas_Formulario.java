
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Areas_Formulario {
	private JFrame f;
	private final ButtonGroup ff=new ButtonGroup();
	private final ButtonGroup ff1=new ButtonGroup();
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Areas_Formulario window = new Areas_Formulario();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Areas_Formulario (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Mi primer hijo");
		f.setBounds(50,100,400,350);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.orange);
		
		JPanel Panel = new JPanel();
		Panel.setForeground(Color.BLUE);
		Panel.setBorder(new TitledBorder(null, "Calculo", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Panel.setBackground(Color.green);
		Panel.setBounds(10, 50, 150, 110);
		f.getContentPane().add(Panel);
		Panel.setLayout(null);
		

		final JRadioButton BotonA = new JRadioButton("Area");
		BotonA.setOpaque(false);
		BotonA.setBounds(10, 30, 80, 23);
		BotonA.setOpaque(false);
		ff.add(BotonA);
		Panel.add(BotonA);
		
		final JRadioButton BotonA1 = new JRadioButton("Perimetro");
		BotonA1.setOpaque(false);
		BotonA1.setBounds(10, 60, 100, 23);
		BotonA1.setOpaque(false);
		ff.add(BotonA1);
		Panel.add(BotonA1);
		
		JPanel Panel1 = new JPanel();
		Panel1.setForeground(Color.BLUE);
		Panel1.setBorder(new TitledBorder(null, "Objeto", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Panel1.setBackground(Color.green);
		Panel1.setBounds(185, 50, 180, 110);
		f.getContentPane().add(Panel1);
		Panel1.setLayout(null);
		
		final JRadioButton BotonB = new JRadioButton("Cuadrado");
		BotonB.setOpaque(false);
		BotonB.setBounds(10, 25, 80, 23);
		BotonB.setOpaque(false);
		ff1.add(BotonB);
		Panel1.add(BotonB);
		
		final JRadioButton BotonB1 = new JRadioButton("Rectangulo");
		BotonB1.setOpaque(false);
		BotonB1.setBounds(10, 50, 100, 23);
		BotonB1.setOpaque(false);
		ff1.add(BotonB1);
		Panel1.add(BotonB1);
		
		final JRadioButton BotonB2 = new JRadioButton("Circulo");
		BotonB2.setOpaque(false);
		BotonB2.setBounds(10, 75, 100, 23);
		BotonB2.setOpaque(false);
		ff1.add(BotonB2);
		Panel1.add(BotonB2);
		
		JSpinner s =new JSpinner();
		s.setModel(new SpinnerNumberModel(0,0,200,1));
		s.setFont(new Font("Thoma", Font.BOLD,20));
		s.setBounds(100,200,60,30);
		f.getContentPane().add(s);
		
		JSpinner s1 =new JSpinner();
		s1.setModel(new SpinnerNumberModel(0,0,200,1));
		s1.setFont(new Font("Thoma", Font.BOLD,20));
		s1.setBounds(100,250,60,30);
		f.getContentPane().add(s1);
		
		JSpinner s2 =new JSpinner();
		s2.setModel(new SpinnerNumberModel(0,0,200,1));
		s2.setFont(new Font("Thoma", Font.BOLD,20));
		s2.setBounds(300,200,60,30);
		f.getContentPane().add(s2);
		
		JSpinner s3 =new JSpinner();
		s3.setModel(new SpinnerNumberModel(0,0,200,1));
		s3.setFont(new Font("Thoma", Font.BOLD,20));
		s3.setBounds(300,250,60,30);
		f.getContentPane().add(s3);
		
		final JLabel Base = new JLabel();
		Base.setText("Base:");
		Base.setBounds(50,185,100,60);
		Base.setOpaque(true);
		Base.setBackground(Color.orange);
		Base.setFont(new Font("Tahoma", Font.BOLD, 15));
		Base.setForeground(Color.red);
		f.getContentPane().add(Base);

		
		final JLabel Altura = new JLabel();
		Altura.setText("Altura:");
		Altura.setBounds(45,235,100,60);
		Altura.setOpaque(true);
		Altura.setBackground(Color.orange);
		Altura.setFont(new Font("Tahoma", Font.BOLD, 15));
		Altura.setForeground(Color.red);
		f.getContentPane().add(Altura);
		
		final JLabel Lado = new JLabel();
		Lado.setText("Lado:");
		Lado.setBounds(253,185,100,60);
		Lado.setOpaque(true);
		Lado.setBackground(Color.orange);
		Lado.setFont(new Font("Tahoma", Font.BOLD, 15));
		Lado.setForeground(Color.red);
		f.getContentPane().add(Lado);
		
		final JLabel Radio = new JLabel();
		Radio.setText("Radio:");
		Radio.setBounds(250,235,100,60);
		Radio.setOpaque(true);
		Radio.setBackground(Color.orange);
		Radio.setFont(new Font("Tahoma", Font.BOLD, 15));
		Radio.setForeground(Color.red);
		f.getContentPane().add(Radio);
		
		final JLabel Resultado = new JLabel();
		Resultado.setText("Resultado");
		Resultado.setBounds(200,1,100,60);
		Resultado.setOpaque(true);
		Resultado.setBackground(Color.orange);
		Resultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		Resultado.setForeground(Color.red);
		f.getContentPane().add(Resultado);
		
		JButton b_movedor = new JButton ("Calcular");
		b_movedor.setBounds(50,10,100,30);
		b_movedor.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
				{
		
				Resultado.setOpaque(false);
			}
	});
	f.getContentPane().add(b_movedor);
		
	}
}