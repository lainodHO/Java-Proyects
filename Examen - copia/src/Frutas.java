import javax.swing.JOptionPane;

public class Frutas {

	public static void main(String[] args) {
		// DanielHernandezOlague

		double peras, manzanas,mangos,total,camotes,frutas,total2;;
		peras=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos kilos de peras desea?"));
		manzanas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos  kilos de manzanas desea?"));
		mangos=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos kilos de mangos desea?"));
		camotes=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos kilos de camotes desea?"));
		
        frutas=peras+manzanas+mangos+camotes;

        
        
		if (frutas<=7){
			total=(peras*35+manzanas*40+mangos*40+camotes*20);
			JOptionPane.showMessageDialog(null,"El total con Descuento es de: $"+total);
}
		if(frutas>=13){
			total2=peras*35+manzanas*40+mangos*40+camotes*20-108;
			JOptionPane.showMessageDialog(null,"El camote se le regala asi que el precio sera de: $"+total2);
		}
		}
	}