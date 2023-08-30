
import javax.swing.JOptionPane;

public class Caseta {

	public static void main(String[] args) {
		// DanielHernandezOlague

		double Dias, auto,total,total2,total3;;
		Dias=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos Dias trabajo?"));
		auto=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos autos cobro peaje?"));
	
		if(auto>= 1000) {
			total=Dias*400+auto*2+100;
			JOptionPane.showMessageDialog(null, "El total de monton a recibir es:  "+total );;
		}		
 if(auto <=50){
		total2=Dias*300+auto*2 ;
		
		JOptionPane.showMessageDialog(null, "El descuneto por faltas"+total2);;
 }
		if(auto<= 100) {
			total3=Dias*400+auto*2;
			JOptionPane.showMessageDialog(null, "El total de monton a recibir es:  "+total3 );;
}
 }}