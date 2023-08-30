import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Profe {
	private JFrame miFormulario;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profe window = new Profe();
					window.miFormulario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Profe() {
		initialize();
	}
	private void initialize() {
		miFormulario = new JFrame();
		miFormulario.getContentPane().setBackground(Color.YELLOW);
		miFormulario.setTitle("Creacion de Formularios");
		miFormulario.setBounds(50, 100, 400, 500);
		miFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miFormulario.getContentPane().setLayout(null);
	
		final JLabel e_mexico1 = new JLabel();
		e_mexico1.setText("MEXICO VIVE MEXICO");
		e_mexico1.setBounds(50,100,250,25);
		e_mexico1.setOpaque(true);
		e_mexico1.setBackground(Color.BLUE);
		e_mexico1.setFont(new Font("Arial", Font.BOLD, 20));
		e_mexico1.setForeground(Color.WHITE);
		e_mexico1.setHorizontalAlignment(0);
		e_mexico1.setVerticalAlignment(0);
		miFormulario.getContentPane().add(e_mexico1);
		
		final JLabel e_l1 = new JLabel();
		e_l1.setBounds(50,135,250,10);
		e_l1.setOpaque(true);
		e_l1.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l1);

		final JLabel e_l2a = new JLabel();
		e_l2a.setBounds(50,155,100,10);
		e_l2a.setOpaque(true);
		e_l2a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l2a);
		
		final JLabel e_l2b = new JLabel();
		e_l2b.setBounds(200,155,100,10);
		e_l2b.setOpaque(true);
		e_l2b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l2b);
		
		final JLabel e_l3a = new JLabel();
		e_l3a.setBounds(50,175,75,10);
		e_l3a.setOpaque(true);
		e_l3a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l3a);
		
		final JLabel e_l3b = new JLabel();
		e_l3b.setBounds(225,175,75,10);
		e_l3b.setOpaque(true);
		e_l3b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l3b);
		
		final JLabel e_l4a = new JLabel();
		e_l4a.setBounds(50,195,50,10);
		e_l4a.setOpaque(true);
		e_l4a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l4a);
		
		final JLabel e_l4b = new JLabel();
		e_l4b.setBounds(250,195,50,10);
		e_l4b.setOpaque(true);
		e_l4b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l4b);

		final JLabel e_l5a = new JLabel();
		e_l5a.setBounds(50,215,25,10);
		e_l5a.setOpaque(true);
		e_l5a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l5a);
		
		final JLabel e_l5b = new JLabel();
		e_l5b.setBounds(275,215,25,10);
		e_l5b.setOpaque(true);
		e_l5b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l5b);
		
		final JLabel e_l6a = new JLabel();
		e_l6a.setBounds(50,235,50,10);
		e_l6a.setOpaque(true);
		e_l6a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l6a);
		
		final JLabel e_l6b = new JLabel();
		e_l6b.setBounds(250,235,50,10);
		e_l6b.setOpaque(true);
		e_l6b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l6b);
		
		final JLabel e_l7a = new JLabel();
		e_l7a.setBounds(50,255,75,10);
		e_l7a.setOpaque(true);
		e_l7a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l7a);
		
		final JLabel e_l7b = new JLabel();
		e_l7b.setBounds(225,255,75,10);
		e_l7b.setOpaque(true);
		e_l7b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l7b);
		
		final JLabel e_l8a = new JLabel();
		e_l8a.setBounds(50,275,100,10);
		e_l8a.setOpaque(true);
		e_l8a.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l8a);
		
		final JLabel e_l8b = new JLabel();
		e_l8b.setBounds(200,275,100,10);
		e_l8b.setOpaque(true);
		e_l8b.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l8b);
		
		final JLabel e_l9 = new JLabel();
		e_l9.setBounds(50,295,250,10);
		e_l9.setOpaque(true);
		e_l9.setBackground(Color.BLUE);
		miFormulario.getContentPane().add(e_l9);

		JLabel e_Prueba =new JLabel();
		e_Prueba.setText("MX");
		e_Prueba.setBounds(50,175,250,80);
		e_Prueba.setOpaque(true);
		e_Prueba.setBackground(Color.yellow);
		e_Prueba.setFont(new Font("Tahoma", Font.PLAIN, 60));
		e_Prueba.setForeground(Color.BLUE);
		e_Prueba.setHorizontalAlignment(0);
		e_Prueba.setVerticalAlignment(0);
		miFormulario.getContentPane().add(e_Prueba);
		
		final JLabel e_mexico2 = new JLabel();
		e_mexico2.setText("MEXICO VIVE MEXICO");
		e_mexico2.setBounds(50,315,250,25);
		e_mexico2.setOpaque(true);
		e_mexico2.setBackground(Color.BLUE);
		e_mexico2.setFont(new Font("Arial", Font.BOLD, 20));
		e_mexico2.setForeground(Color.WHITE);
		e_mexico2.setHorizontalAlignment(0);
		e_mexico2.setVerticalAlignment(0);
		miFormulario.getContentPane().add(e_mexico2);

		
		
		
		
		
		

	}
}