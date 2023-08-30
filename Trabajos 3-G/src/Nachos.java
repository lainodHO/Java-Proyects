
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
public class Nachos {
	private JFrame f;
	private final ButtonGroup A=new ButtonGroup();

	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Nachos window = new Nachos();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Nachos (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Nachos y Elotes");
		f.setBounds(50,100,400,350);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.orange);
		
		JPanel Panel = new JPanel();
		Panel.setForeground(Color.BLUE);
		Panel.setBorder(new TitledBorder(null, "Comida", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Panel.setBackground(Color.green);
		Panel.setBounds(10, 50, 150, 110);
		f.getContentPane().add(Panel);
		Panel.setLayout(null);
		

		final JRadioButton BotonA = new JRadioButton("Nachos");
		BotonA.setOpaque(false);
		BotonA.setBounds(10, 30, 80, 23);
		BotonA.setOpaque(false);
		A.add(BotonA);
		Panel.add(BotonA);
		
		final JRadioButton BotonA1 = new JRadioButton("Elotes");
		BotonA1.setOpaque(false);
		BotonA1.setBounds(10, 60, 100, 23);
		BotonA1.setOpaque(false);
		A.add(BotonA1);
		Panel.add(BotonA1);
		
		JPanel Panel1 = new JPanel();
		Panel1.setForeground(Color.BLUE);
		Panel1.setBorder(new TitledBorder(null, "Complementos", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Panel1.setBackground(Color.green);
		Panel1.setBounds(185, 50, 180, 110);
		f.getContentPane().add(Panel1);
		Panel1.setLayout(null);
		
		final JCheckBox BB = new JCheckBox("Con Queso");
		BB.setSelected(false);
		BB.setBounds(10, 25, 120, 23);
		BB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BB.setOpaque(false);
		f.getContentPane().add(Panel1);
		Panel1.add(BB);
		
		final JCheckBox BB1 = new JCheckBox("Con Chile");
		BB1.setSelected(false);
		BB1.setBounds(10, 50, 100, 23);
		BB1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BB1.setOpaque(false);
		f.getContentPane().add(Panel1);
		Panel1.add(BB1);
		
		final JCheckBox BB2 = new JCheckBox("Con Crema");
		BB2.setSelected(false);
		BB2.setBounds(10, 75, 120, 23);
		BB2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		BB2.setOpaque(false);
		f.getContentPane().add(Panel1);
		Panel1.add(BB2);
		

		JSpinner s =new JSpinner();
		s.setModel(new SpinnerNumberModel(0,0,200,1));
		s.setFont(new Font("Thoma", Font.BOLD,20));
		s.setBounds(100,180,60,30);
		f.getContentPane().add(s);
		
	
		
		final JLabel Altura = new JLabel();
		Altura.setText("Cantidad:");
		Altura.setBounds(25,165,100,60);
		Altura.setOpaque(true);
		Altura.setBackground(Color.orange);
		Altura.setFont(new Font("Tahoma", Font.BOLD, 15));
		Altura.setForeground(Color.red);
		f.getContentPane().add(Altura);
		

		
		final JLabel Resultado = new JLabel();
		Resultado.setText("Resultado");
		Resultado.setBounds(150,220,100,60);
		Resultado.setOpaque(true);
		Resultado.setBackground(Color.orange);
		Resultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		Resultado.setForeground(Color.red);
		f.getContentPane().add(Resultado);
		
		JButton b_movedor = new JButton ("Calcular");
		b_movedor.setBounds(200,180,100,30);
		b_movedor.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
				{
				int can;
				can=(Integer)(s.getValue());
				int total;			
				if(BotonA.isSelected()){
					can=can*20;
					total=can;
					Resultado.setText("Pagar$"+total);
					if(BB.isSelected()){
					total=total+5;
					Resultado.setText("Pagar$"+total);
					}
					if(BB1.isSelected()){
						total=total+2;
						Resultado.setText("Pagar$"+total);
					}
					if(BB2.isSelected()){
						total=total+5;
						Resultado.setText("Pagar$"+total);
					}
					
				}
				if(BotonA1.isSelected()){
					can=can*10;
					total=can;
					Resultado.setText("Pagar$"+total);
					if(BB.isSelected()){
					total=total+5;
					Resultado.setText("Pagar$"+total);
					}
					if(BB1.isSelected()){
						total=total+2;
						Resultado.setText("Pagar$"+total);
					}
					if(BB2.isSelected()){
						total=total+5;
						Resultado.setText("Pagar$"+total);
					}
				}
				
					
				}
			});
	f.getContentPane().add(b_movedor);
	}
		
	}