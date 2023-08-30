import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
public class DosFormularios {
private JFrame Olague;
private JFrame Olague2;

	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					DosFormularios window = new DosFormularios();
					window.Olague.setVisible(true);
					window.Olague2.setVisible(true);
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public DosFormularios (){
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
		Olague2.setBounds(1500,100,400,300);
		
		Olague2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Olague2.getContentPane().setLayout(null);
		Olague2.getContentPane().setBackground(Color.black);
	}
}