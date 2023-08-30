import javax.swing.JOptionPane;
public class FierroViejo {

	public static void main(String[] args) {
		// DanielHernandezOlague
		double total,total2=0;
		double lamina,fierro;;
		fierro=Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la cantidad de kilos de fierro que desea comprar?"));
		lamina=Double.parseDouble(JOptionPane.showInputDialog("¿Cual es la cantidad de kilos de laminas que desea comprar?"));
		total=fierro*5;
		total2=lamina*10;
		double resultado=total+total2;
		JOptionPane.showMessageDialog(null, "La cuenta es "+resultado );;
	}

}
