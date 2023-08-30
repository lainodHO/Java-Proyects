import javax.swing.JOptionPane;
public class Tunas {

	public static void main(String[] args) {
		// DanielHernandezOlague
		double Tunas, Piña,total;;
		Tunas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas tunas desea comprar?"));
		
		total=Tunas*5 ;

		total=Tunas;
		if (total >= 10) {
			total=Tunas*4;
			JOptionPane.showMessageDialog(null, "el total con descuento es  "+total );;
			
		}else if(total < 10){
			total=Tunas*5 ;
	
		JOptionPane.showMessageDialog(null, "El total es "+total);;
		
		}
	}


	}


