
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Chumelito {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Chumelito window = new Chumelito();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Chumelito (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Mi primer hijo");
		f.setBounds(50,100,400,300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.red);

		JPanel sexo = new JPanel();
		sexo.setForeground(Color.BLUE);
		sexo.setBorder(new TitledBorder(null, "Etapa", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), Color.RED));
		sexo.setBackground(Color.YELLOW);
		sexo.setBounds(15, 115, 75, 110);
		f.getContentPane().add(sexo);
		sexo.setLayout(null);
		
		final JSpinner s_prueba = new JSpinner();
		s_prueba.setModel(new SpinnerNumberModel(1, 1, 6, 1));
		s_prueba.setFont(new Font("Tahoma", Font.BOLD, 15));
		s_prueba.setBounds(20, 90, 60, 25);
		f.getContentPane().add(s_prueba);
		
		JLabel B =new JLabel();
		B.setText("Dias trabajados");
		B.setBounds(20,10,300,30);
		B.setFont(new Font("Tahoma", Font.PLAIN, 13));
		B.setForeground(Color.red);
		B.setVerticalAlignment(0);
		f.getContentPane().add(B);
	
		final JTextField texto=new JTextField();
		texto.setForeground(Color.blue);
		texto.setFont(new Font("Arial", Font.PLAIN,15));
		texto.setBackground(Color.white);
		texto.setBounds(20,35,135,35);
		f.getContentPane().add(texto);
		
		JPanel sexo1 = new JPanel();
		sexo1.setForeground(Color.BLUE);
		sexo1.setBorder(new TitledBorder(null, "Etapa", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 15), Color.RED));
		sexo1.setBackground(Color.YELLOW);
		sexo1.setBounds(15, 115, 75, 110);
		f.getContentPane().add(sexo1);
		sexo1.setLayout(null);
	
	}
}