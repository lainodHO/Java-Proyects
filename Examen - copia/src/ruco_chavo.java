import java.util.Scanner;

import javax.swing.JOptionPane;

public class ruco_chavo {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner dho=new Scanner(System.in);

		double total;
		double años;;
		años=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos años tienes?"));

		if (años > 24) {
			
			JOptionPane.showMessageDialog(null, "Ya estas ruco " );;
		}else if(años < 25){
			
			JOptionPane.showMessageDialog(null, "Estas chavo aun" );;

		}
	}	
		}
