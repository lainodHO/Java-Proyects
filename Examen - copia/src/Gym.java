import javax.swing.JOptionPane;

public class Gym {

	public static void main(String[] args) {
		// DanielHernandezOlague
		String sexo;
		double a�os;;
		sexo=JOptionPane.showInputDialog("�Que sexo eres?");
		a�os=Double.parseDouble(JOptionPane.showInputDialog("�Cuantos a�os tienes?"));
			   
		if(sexo.equalsIgnoreCase("mujer")){
			 if (a�os<16){
			double Dinero1 =300-150;
			JOptionPane.showMessageDialog(null,": $"+ Dinero1);
		}
		   else	if (a�os>15){
				double  Dinero=300-100;
				JOptionPane.showMessageDialog(null,": $"+ Dinero);
		} 
		}
		if(sexo.equalsIgnoreCase("hombre")){
			 if (a�os<16){
			double  Dinero2=300-50;
			JOptionPane.showMessageDialog(null,": $"+ Dinero2);
			 }
			 if (a�os>15){
					double  Dinero3=300;
					JOptionPane.showMessageDialog(null,": $"+ Dinero3);

		}
	}}
}