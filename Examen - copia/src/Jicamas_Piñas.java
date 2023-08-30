import javax.swing.JOptionPane;

public class Jicamas_Piñas {
	

	public static void main(String[] args) {
		// DanielHernandezOlague

		double Jicama, Piña,total,total2;;
		Jicama=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos chicles de jicamas desea?"));
		Piña=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos chicles de Piña desea?"));
		Jicama=Jicama*2.5 ;
		Piña=Piña*5 ;
		total=Piña+Jicama;
		if (total > 30) {
			total=total-6 ;
			JOptionPane.showMessageDialog(null, "el total con descuento es  "+total );;
			
		}else if(total < 30){
			total2=total ;
	
		JOptionPane.showMessageDialog(null, "El total es "+total);;
		
		}
	}
}
