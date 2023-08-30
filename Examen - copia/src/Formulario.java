
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
public class Formulario {
	private JFrame miFormulario;
	protected Object Olague;
	public static void main(String[] args) {
		// DanielHernandezOlague
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				try {
					Formulario window = new Formulario();
					window.miFormulario.setVisible(true);
					
				} catch (Exception e){
					e.printStackTrace();
	              }
	          }
		});
   }
	public Formulario (){
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

	
	}
}
