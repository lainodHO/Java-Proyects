import javax.swing.JOptionPane;

public class Rectangulo {

	public static void main(String[] args) {
		// DanielHernandezOlague
		double area=0;
		double base, altura,Perimetro;;
		base=Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la base del Rectangulo?"));
		altura=Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la altura del Rectangulo?"));
		area=base*altura ;
		Perimetro=2*base+2*altura ;
		JOptionPane.showMessageDialog(null, "El area es "+area + "El perimetro es "+Perimetro);;
		
		}
		

	}
