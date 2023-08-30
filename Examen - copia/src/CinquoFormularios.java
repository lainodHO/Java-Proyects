import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
public class CinquoFormularios {
private JFrame Olague;
private JFrame Olague2;
private JFrame Olague3;
private JFrame Olague4;
private JFrame Olague5;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					CinquoFormularios window = new CinquoFormularios();
					window.Olague.setVisible(true);
					window.Olague2.setVisible(true);
					window.Olague3.setVisible(true);
					window.Olague4.setVisible(true);
					window.Olague5.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public CinquoFormularios (){
		initialize();
	}
	private void initialize(){
		Olague=new JFrame();
		Olague.setTitle("Mi primer hijo");
		Olague.setBounds(50,100,400,300);
		
		Olague.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Olague.getContentPane().setLayout(null);
		Olague.getContentPane().setBackground(Color.gray);
		
		Olague2=new JFrame();
		Olague2.setTitle("Mi segundo hijo");
		Olague2.setBounds(75,125,400,300);
		
		Olague2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Olague2.getContentPane().setLayout(null);
		Olague2.getContentPane().setBackground(Color.black);
		
		Olague3=new JFrame();
		Olague3.setTitle("Mi tercer hijo");
		Olague3.setBounds(100,150,400,300);
		
		Olague3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Olague3.getContentPane().setLayout(null);
		Olague3.getContentPane().setBackground(Color.CYAN);
		
		Olague4=new JFrame();
		Olague4.setTitle("Mi cuarto hijo");
		Olague4.setBounds(125,175,400,300);
		
		Olague4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Olague4.getContentPane().setLayout(null);
		Olague4.getContentPane().setBackground(Color.GREEN);
		
		Olague5=new JFrame();
		Olague5.setTitle("Mi quinto hijo");
		Olague5.setBounds(150,200,400,300);
		
		Olague5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Olague5.getContentPane().setLayout(null);
		Olague5.getContentPane().setBackground(Color.ORANGE);
	}
}