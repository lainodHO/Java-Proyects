import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
		// DanielHernandezOlague
		double resultado=0;
		double base, altura;;
		
		base=Double.parseDouble(JOptionPane.showInputDialog("Cual es la base del triangulo"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Cual es la altura del triangulo"));
		resultado=(base*altura)/2 ;
		JOptionPane.showMessageDialog(null, "EL es area"+resultado);;
		
		}
		

	}
