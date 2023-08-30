
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Estados {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Estados window = new Estados();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Estados (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Estados");
		f.setBounds(600,200,470,150);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.orange);
		
		final JLabel Altura = new JLabel();
		Altura.setText("Resultado:");
		Altura.setBounds(310,25,190,60);
		Altura.setOpaque(true);
		Altura.setBackground(Color.orange);
		Altura.setFont(new Font("Tahoma", Font.BOLD, 15));
		Altura.setForeground(Color.black);
		f.getContentPane().add(Altura);
		
				final JComboBox c_animal = new JComboBox();
		c_animal.setBackground(Color.CYAN);
		c_animal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		c_animal.setModel(new DefaultComboBoxModel(new String[]
			{
				"Chihuahua", "Yucatan", "Jalisco", "Sonora", "Oaxaca","Veracruz","Michoacán"
			}));
		c_animal.setSelectedIndex(2);
		c_animal.setBounds(10, 40, 180, 30);
		f.getContentPane().add(c_animal);
		
		JButton b1 = new JButton("Capital");
		b1.setBounds(200, 40, 97, 30);
		b1.addMouseListener(new MouseAdapter()
			{
			@Override
			public void mouseClicked(MouseEvent arg0)
				{
				
				int Smite;
				Smite = c_animal.getSelectedIndex();
				if(Smite==0)
					{
					Altura.setText("Chihuahua");
					}
					if(Smite==1)
					{
						Altura.setText("Mérida");
					}
					if(Smite==2)
					{
						Altura.setText("Guadalajara");
					}
					if(Smite==3)
					{
						Altura.setText("Hermosillo");
			        }
					if(Smite==4)
					{
						Altura.setText("Oaxaca de Juárez");
				    }
					if(Smite==5)
					{
						Altura.setText("Xalapa");  
				    }
					if(Smite==6)
					{
						Altura.setText("Morelia"); 
				    }
					if(Smite==7)
					{
						Altura.setText("Aguascalientes"); 
					}
				}
			});
		f.getContentPane().add(b1);
		
	}
}