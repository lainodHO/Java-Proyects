import javax.swing.JOptionPane;

public class Jicamas_Pi�as {
	

	public static void main(String[] args) {
		// DanielHernandezOlague

		double Jicama, Pi�a,total,total2;;
		Jicama=Double.parseDouble(JOptionPane.showInputDialog("�Cuantos chicles de jicamas desea?"));
		Pi�a=Double.parseDouble(JOptionPane.showInputDialog("�Cuantos chicles de Pi�a desea?"));
		Jicama=Jicama*2.5 ;
		Pi�a=Pi�a*5 ;
		total=Pi�a+Jicama;
		if (total > 30) {
			total=total-6 ;
			JOptionPane.showMessageDialog(null, "el total con descuento es  "+total );;
			
		}else if(total < 30){
			total2=total ;
	
		JOptionPane.showMessageDialog(null, "El total es "+total);;
		
		}
	}
}
