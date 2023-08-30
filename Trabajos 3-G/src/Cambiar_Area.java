
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
public class Cambiar_Area {
	private JFrame f;
	protected Object Olague;
	int an,la;
	int t1=0;
	int t2=0;
	int total;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Cambiar_Area window = new Cambiar_Area();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Cambiar_Area (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Area");
		f.setBounds(50,100,400,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.red);
		
		
	JLabel res =new JLabel();
	res.setText("");
	res.setBounds(20,20,120,60);
	res.setFont(new Font("Tahoma", Font.PLAIN, 20));
	res.setForeground(Color.blue);
	res.setHorizontalAlignment(0);
	res.setVerticalAlignment(0);
	f.getContentPane().add(res);
	
	JLabel A =new JLabel();
	A.setText("");
	A.setBounds(200,75,10,0);
	A.setOpaque(true);
	A.setBackground(Color.blue);
	A.setFont(new Font("Tahoma", Font.PLAIN, 35));
	A.setForeground(Color.blue);
	A.setHorizontalAlignment(0);
	A.setVerticalAlignment(0);
	f.getContentPane().add(A);
	
		
	
		JSpinner san =new JSpinner();
		san.setModel(new SpinnerNumberModel(1,1,100,1));
		san.setFont(new Font("Thoma", Font.BOLD,15));
		san.setBounds(45,65,60,30);
		f.getContentPane().add(san);
		san.addChangeListener(new ChangeListener(){ 
			public void stateChanged(ChangeEvent arg0){
				
				an=(Integer)san.getValue();
				t1=la;
				t2=an;
				total=t1*t2;
				A.setBounds(200,75,t1,t2);
				res.setText("Area "+total);
						
			}});
		
		JSpinner s2a =new JSpinner();
		s2a.setModel(new SpinnerNumberModel(1,1,100,1));
		s2a.setFont(new Font("Thoma", Font.BOLD,15));
		s2a.setBounds(45,95,60,30);
		f.getContentPane().add(s2a);
		s2a.addChangeListener(new ChangeListener(){ 
			public void stateChanged(ChangeEvent arg0){
		
				la=(Integer)s2a.getValue();
				t1=la;
				t2=an;
				total=t1*t2;
				A.setBounds(200,75,t1,t2);
				res.setText("Area "+total);
						
			}});
				
				
				

	
	}
}