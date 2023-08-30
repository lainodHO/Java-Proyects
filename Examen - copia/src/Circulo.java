import javax.swing.JOptionPane;
public class Circulo {

	public static void main(String[] args) {
		// DanielHernandezOlague
		double area=0;
		double radio;
		radio=Double.parseDouble(JOptionPane.showInputDialog("Cual es el radio"));
		area= 3.1416*radio*radio;
		JOptionPane.showMessageDialog(null, "EL area"+area);;
		
		}
		

	}




