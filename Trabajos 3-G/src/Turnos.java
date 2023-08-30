
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
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Turnos {
	private final ButtonGroup A=new ButtonGroup();
	private JFrame f;
	int Matutino1,Vespertino1,total;	
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Turnos window = new Turnos();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Turnos (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Turnos");
		f.setBounds(500,100,450,350);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.red);
		

		JPanel Pa = new JPanel();
		Pa.setForeground(Color.BLUE);
		Pa.setBorder(new TitledBorder(null, "Turno", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		Pa.setBackground(Color.YELLOW);
		Pa.setBounds(50, 50, 180, 110);
		f.getContentPane().add(Pa);
		Pa.setLayout(null);
		

		final JRadioButton Matutino = new JRadioButton("Matutino");
		Matutino.setOpaque(false);
		Matutino.setBounds(10, 30, 80, 23);
		Matutino.setOpaque(false);
		A.add(Matutino);
		Pa.add(Matutino);
		
		final JRadioButton Vespertino = new JRadioButton("Vespertino");
		Vespertino.setOpaque(false);
		Vespertino.setBounds(10, 60, 100, 23);
		Vespertino.setOpaque(false);
		A.add(Vespertino);
		Pa.add(Vespertino);
		
		
		final JTextField Texto = new JTextField();
		Texto.setForeground(Color.BLUE);
		Texto.setFont(new Font("Arial", Font.PLAIN, 20));
		Texto.setBackground(Color.yellow);
		Texto.setBounds(190, 180, 180, 27);
		f.getContentPane().add(Texto);
		
		final JCheckBox VIP = new JCheckBox("Area VIP");
		VIP.setSelected(false);
		VIP.setBounds(300, 100, 200, 23);
		VIP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		VIP.setOpaque(false);
		f.getContentPane().add(VIP);
		
		final JLabel Es = new JLabel();
		Es.setText("Es:");
		Es.setBounds(150,165,100,60);
		Es.setOpaque(false);
		Es.setBackground(Color.orange);
		Es.setFont(new Font("Tahoma", Font.BOLD, 15));
		Es.setForeground(Color.black);
		f.getContentPane().add(Es);
		
		final JLabel r = new JLabel();
		r.setText("$");
		r.setBounds(290,225,100,60);
		r.setOpaque(false);
		r.setBackground(Color.orange);
		r.setFont(new Font("Tahoma", Font.BOLD, 20));
		r.setForeground(Color.black);
		f.getContentPane().add(r);
		

		
		JButton Calcular = new JButton ("Calcular");
		Calcular.setBounds(50,230,180,50);
		Calcular.setBackground(Color.yellow);
		Calcular.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
				{
				String ct;
				
				{
					 
					 
				if(Matutino.isSelected())
				{
					Matutino1=200;
			
				r.setText("$"+Matutino1);
					
					if(VIP.isSelected())
					{
						Matutino1=Matutino1+100;
					r.setText("$"+Matutino1);
					}
					
					 ct=Texto.getText();
					if(ct.equalsIgnoreCase("maestro")){
						Matutino1=Matutino1*2;
					r.setText("$"+Matutino1);
					
					}
					
				}
				if(Vespertino.isSelected())
				{
					Matutino1=300;
					
					r.setText("$"+Matutino1);
				
					if(VIP.isSelected())
					{
						Matutino1=Matutino1+100;
					r.setText("$"+Matutino1);
					
					}
					
					 ct=Texto.getText();
					if(ct.equalsIgnoreCase("maestro")){
						Matutino1=Matutino1*2;	
					r.setText("$"+Matutino1);
					
				
					}
				}
				}
				}
				
			});

		f.getContentPane().add(Calcular);
	}
}