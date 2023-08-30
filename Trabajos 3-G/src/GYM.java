import javax.swing.JOptionPane;

public class GYM {

	public static void main(String[] args) {
		// DanielHernandezOlague
		String sexo;
		double años;;
		sexo=JOptionPane.showInputDialog("¿Que sexo eres?");
		años=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos años tienes?"));
			   
		if(sexo.equalsIgnoreCase("mujer")){
			 if (años<16){
			double Dinero1 =300-150;
			JOptionPane.showMessageDialog(null,": $"+ Dinero1);
		}
		   else	if (años>15){
				double  Dinero=300-100;
				JOptionPane.showMessageDialog(null,": $"+ Dinero);
		} 
		}
		if(sexo.equalsIgnoreCase("hombre")){
			 if (años<16){
			double  Dinero2=300-50;
			JOptionPane.showMessageDialog(null,": $"+ Dinero2);
			 }
			 if (años>15){
					double  Dinero3=300;
					JOptionPane.showMessageDialog(null,": $"+ Dinero3);

		}
	}}
}