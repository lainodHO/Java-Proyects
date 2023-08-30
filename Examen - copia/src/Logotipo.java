
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
public class Logotipo {
	private JFrame mi;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Logotipo window = new Logotipo();
					window.mi.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Logotipo (){
		initialize();
		initialize();
	}
	private void initialize(){
		mi=new JFrame();
		mi.setTitle("Mi primer hijo");
		mi.setBounds(50,100,500,260);
		
		mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mi.getContentPane().setLayout(null);
		mi.getContentPane().setBackground(new Color(0,255,255));
		
		JLabel ee_Prueba =new JLabel();
		ee_Prueba.setBounds(225,25,30,10);
		ee_Prueba.setOpaque(true);
		ee_Prueba.setBackground(Color.black);
		mi.getContentPane().add(ee_Prueba);
		
		JLabel e_Prueba =new JLabel();
		e_Prueba.setBounds(210,50,60,10);
		e_Prueba.setOpaque(true);
		e_Prueba.setBackground(Color.black);
		mi.getContentPane().add(e_Prueba);
		
		JLabel e_Prueb =new JLabel();
		e_Prueb.setBounds(180,75,120,10);
		e_Prueb.setOpaque(true);
		e_Prueb.setBackground(Color.black);
		mi.getContentPane().add(e_Prueb);
		
		JLabel e_Preba =new JLabel();
		e_Preba.setBounds(150,100,180,10);
		e_Preba.setOpaque(true);
		e_Preba.setBackground(Color.black);
		e_Preba.setForeground(Color.blue);		
		mi.getContentPane().add(e_Preba);
		
		JLabel e_Pruebas =new JLabel();
		e_Pruebas.setBounds(130,125,60,10);
		e_Pruebas.setOpaque(true);
		e_Pruebas.setBackground(Color.black);
		e_Pruebas.setForeground(Color.blue);		
		mi.getContentPane().add(e_Pruebas);
		
		JLabel e_Pruebass =new JLabel();
		e_Pruebass.setText("ATS");
		e_Pruebass.setBounds(110,100,250,60);
		e_Pruebass.setFont(new Font("Tahoma", Font.PLAIN, 35));
		e_Pruebass.setForeground(Color.black);
		e_Pruebass.setToolTipText("Etiqueta echa por End");
		e_Pruebass.setHorizontalAlignment(0);
		e_Pruebass.setVerticalAlignment(0);
		mi.getContentPane().add(e_Pruebass);
		
		JLabel e_P =new JLabel();
		e_P.setBounds(285,125,60,10);
		e_P.setOpaque(true);
		e_P.setBackground(Color.black);
		e_P.setForeground(Color.blue);		
		mi.getContentPane().add(e_P);
		
		JLabel e_Pruebaa =new JLabel();
		e_Pruebaa.setBounds(115,150,250,10);
		e_Pruebaa.setOpaque(true);
		e_Pruebaa.setBackground(Color.black);
		mi.getContentPane().add(e_Pruebaa);

		JLabel e_Pruebaas =new JLabel();
		e_Pruebaas.setBounds(90,175,300,10);
		e_Pruebaas.setOpaque(true);
		e_Pruebaas.setBackground(Color.black);
		mi.getContentPane().add(e_Pruebaas);
	}
}