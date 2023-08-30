
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Chivo {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Chivo window = new Chivo();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Chivo (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Mi primer hijo");
		f.setBounds(600,200,300,150);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.red);
		
				final JComboBox c_animal = new JComboBox();
		c_animal.setBackground(Color.CYAN);
		c_animal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c_animal.setModel(new DefaultComboBoxModel(new String[]
			{
				"Perro", "Chivo", "Cerdo", "Gato", "Caballo","Burro"
			}));
		c_animal.setSelectedIndex(2);
		c_animal.setBounds(20, 40, 120, 30);
		f.getContentPane().add(c_animal);
		
		JButton b1 = new JButton("CALCULAR");
		b1.setBounds(170, 40, 97, 30);
		b1.addMouseListener(new MouseAdapter()
			{
			@Override
			public void mouseClicked(MouseEvent arg0)
				{
				
				int Smite;
				Smite = c_animal.getSelectedIndex();
				if(Smite==0)
					{
				    JOptionPane.showMessageDialog(null,"Compañia");
					}
					if(Smite==1)
					{
					JOptionPane.showMessageDialog(null,"Leche y Carne");
					}
					if(Smite==2)
					{
				    JOptionPane.showMessageDialog(null,"Carne y Menudo");   
					}
					if(Smite==3)
					{
				    JOptionPane.showMessageDialog(null,"Mascota y Entretenimiento");   
			        }
					if(Smite==4)
					{
				   JOptionPane.showMessageDialog(null,"Montarlo y Alimentarlo");   
				    }
					if(Smite==5)
					{
				   JOptionPane.showMessageDialog(null,"Montarlo y Montacargas");   
				    }
				    }
			});
		f.getContentPane().add(b1);
		
	}
}