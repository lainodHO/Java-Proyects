
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
import javax.swing.border.TitledBorder;

import java.awt.Color;
public class Hondureño {
	private JFrame f;
	private final ButtonGroup A=new ButtonGroup();
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Hondureño window = new Hondureño();
					window.f.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Hondureño (){
		initialize();
		initialize();
	}
	private void initialize(){
		f=new JFrame();
		f.setTitle("Hondureños");
		f.setBounds(500,100,400,300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.green);
	
		JPanel p = new JPanel();
		p.setForeground(Color.BLUE);
		p.setBorder(new TitledBorder(null, "Bufette", TitledBorder.CENTER, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 20), Color.RED));
		p.setBackground(Color.YELLOW);
		p.setBounds(10, 10, 170, 110);
		f.getContentPane().add(p);
		p.setLayout(null);
		
		final JRadioButton h = new JRadioButton("Hombre");
		h.setOpaque(false);
		h.setBounds(10, 30, 80, 23);
		h.setOpaque(false);
		A.add(h);
		p.add(h);
		
		final JRadioButton m = new JRadioButton("Mujer");
		m.setOpaque(false);
		m.setBounds(10, 60, 100, 23);
		m.setOpaque(false);
		A.add(m);
		p.add(m);
	
		
		final JCheckBox hu = new JCheckBox("Hondureño");
		hu.setSelected(false);
	    hu.setForeground(Color.red);
		hu.setBounds(10, 140, 120, 23);
		hu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hu.setOpaque(false);
		f.getContentPane().add(hu);
		
		final JLabel res = new JLabel();
		res.setText("Resultado");
		res.setBounds(240,70,100,60);
		res.setOpaque(false);
		res.setBackground(Color.orange);
		res.setFont(new Font("Tahoma", Font.BOLD, 15));
		res.setForeground(Color.red);
		f.getContentPane().add(res);
		
		final JLabel r = new JLabel();
		r.setText("");
		r.setBounds(230,120,90,40);
		r.setOpaque(true);
		r.setBackground(Color.yellow);
		r.setFont(new Font("Tahoma", Font.BOLD, 15));
		r.setForeground(Color.black);
		f.getContentPane().add(r);
		
		JButton c = new JButton ("Calcular");
		c.setBounds(10,190,100,30);
		c.addMouseListener(new MouseAdapter()
		{
			@Override
			final	public void mouseClicked(MouseEvent arg0)
			{
				
				int total,can = 0;			
				if(h.isSelected()){
				can=500;
					total=can;
					r.setText("Pagar$"+total);
					if(hu.isSelected()){
					total=can*0;
					r.setText(" Es gratis");
					}
			
					
					
				}
				if(m.isSelected()){
					can=400;
					total=can;
					r.setText("Pagar$"+total);
					if(hu.isSelected()){
					total=total*0;
					r.setText(" Es gratis");
					}
				
					}
				}
		
					
				
	});
	f.getContentPane().add(c);
	

	
	}
}