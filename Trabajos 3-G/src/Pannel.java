
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Pannel {
	private JFrame miFormulario;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Pannel window = new Pannel();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Pannel (){
		initialize();
		initialize();
	}
	private void initialize(){
		miFormulario=new JFrame();
		miFormulario.setTitle("Mi primer hijo");
		miFormulario.setBounds(50,100,400,300);
		
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
		miFormulario.getContentPane().setBackground(Color.red);

		JPanel sexo = new JPanel();
		sexo.setForeground(Color.BLUE);
		sexo.setBorder(new TitledBorder(null, "Etapa", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		sexo.setBackground(Color.YELLOW);
		sexo.setBounds(65, 50, 250, 110);
		miFormulario.getContentPane().add(sexo);
		sexo.setLayout(null);
		
		final JLabel e_prueba = new JLabel();
		e_prueba.setText("Hola Mundanos");
		e_prueba.setBounds(0,22,250,20);
		e_prueba.setOpaque(true);
		e_prueba.setBackground(Color.GREEN);
		e_prueba.setFont(new Font("Tahoma", Font.BOLD, 15));
		e_prueba.setForeground(Color.BLUE);
		e_prueba.setToolTipText("No tocar está etiqueta por favor");
		e_prueba.setHorizontalAlignment(0);
		e_prueba.setVerticalAlignment(3);
		sexo.add(e_prueba);

	}
}