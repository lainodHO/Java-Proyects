
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
public class Cambio {
	private JFrame f;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Cambio window = new Cambio();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Cambio (){
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
		
		
	JLabel res =new JLabel();
	res.setText("Agregar");
	res.setBounds(20,20,120,60);
	res.setFont(new Font("Tahoma", Font.PLAIN, 20));
	res.setForeground(Color.blue);
	res.setHorizontalAlignment(0);
	res.setVerticalAlignment(0);
	f.getContentPane().add(res);
		
	
		JSpinner s =new JSpinner();
		s.setModel(new SpinnerNumberModel(1,1,6,1));
		s.setFont(new Font("Thoma", Font.BOLD,15));
		s.setBounds(45,65,60,30);
		f.getContentPane().add(s);
		s.addChangeListener(new ChangeListener(){ 
			public void stateChanged(ChangeEvent arg0){
				int popo,total;
				popo=(Integer)s.getValue();
				total=2*popo;
				res.setText(""+total);
						
			}});
	
				
				
				

	
	}
}
