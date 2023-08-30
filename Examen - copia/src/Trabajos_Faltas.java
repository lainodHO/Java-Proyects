import javax.swing.JOptionPane;

public class Trabajos_Faltas {

	public static void main(String[] args) {
		// DanielHernandezOlague
				double total,total2=0;
				double Faltas,Dias;;
				Dias=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos dias asistio a trabajar?"));
				Faltas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos dias falto a trabajar?"));
		total=Dias*350;
	    total2=Faltas*200;
	    double resultado=total-total2;
	   JOptionPane.showMessageDialog(null, "La cuenta es "+resultado );;
}
	}


