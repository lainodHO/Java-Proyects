
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Formulario {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Formulario window = new Formulario();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Formulario (){
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
		sexo.setBorder(new TitledBorder(null, "Etapa", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		sexo.setBackground(Color.YELLOW);
		sexo.setBounds(65, 50, 250, 110);
		f.getContentPane().add(sexo);
		sexo.setLayout(null);
		

	
	}
}