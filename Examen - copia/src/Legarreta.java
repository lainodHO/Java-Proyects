import javax.swing.JOptionPane;

public class Legarreta {

	public static void main(String[] args) {
		// DanielHernandezOlague
		String relacion;
		int a�os;
		String extranjeros;
		relacion=JOptionPane.showInputDialog("�Que tipo de relacion tienes?");
		a�os=Integer.parseInt(JOptionPane.showInputDialog("�Cuantos a�os tienes ?"));
		extranjeros=JOptionPane.showInputDialog("�Eres extranjero o provienes de aqui?");

		int casados=400;
		int soltero =500;
		double mayores=500*.20;
		if(relacion.equalsIgnoreCase("comprometido")){
			 if (a�os==70){
				 
			double total=(400-80);
			JOptionPane.showMessageDialog(null,"Son casados asi que su paquete vale 400 , pero como son mayores de edad se les da un 20% de descuento: $"+ total);
		}
		}
		   	if(relacion.equalsIgnoreCase("soltero")){
			   if (a�os==70){
				   
					double total1=(480);
					JOptionPane.showMessageDialog(null,"Eres soltero tu paqueta vale 500, pero como eres mayor de 60 a�os te damos un descuento de el 20% y como eres extrnajero te sumamos 100 pesos :  $"+ total1);
				
			   
			   }	

		} 
		
		if(relacion.equalsIgnoreCase("soltero")){
			 if (a�os==30){
		
			JOptionPane.showMessageDialog(null,"Eres soltero asi que tu paquete vale 500 :  "+soltero);
			
		
	}}
	}
}
