import javax.swing.JOptionPane;

public class Faltas_Dias {

	public static void main(String[] args) {
		// DanielHernandezOlague
		String dias;
		double horas;;
		dias=JOptionPane.showInputDialog("¿Que dias trabajo?");
		horas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas horas trabajo?"));
			   
		if(dias.equalsIgnoreCase("domingo")){
			 if (horas>8){
			double Dinero1=(horas*10+50)*3;
			JOptionPane.showMessageDialog(null,": $"+ Dinero1);
		}
		   else	if (horas<=8){
				double  Dinero=(horas*10)*3;
				JOptionPane.showMessageDialog(null,": $"+ Dinero);
		} 
		}
		if(dias.equalsIgnoreCase("lunes")){
			 if (horas>8){
			double  Dinero2=horas*10+50;
			JOptionPane.showMessageDialog(null,": $"+ Dinero2);
			 }
			 if (horas<=8){
					double  Dinero3=horas*10;
					JOptionPane.showMessageDialog(null,": $"+ Dinero3);

		}
	}}
}