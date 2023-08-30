import javax.swing.JOptionPane;
public class Equals {
public static void main(String[] args) {
		// TostitoCR
		Double total,edad,precio;
		String casado,extranjero;
		edad=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantos años tienes?"));
	if (edad<=18) {JOptionPane.showMessageDialog(null, "No vendemos a los menores de edad");}
	else if(edad>18) {
		casado=(JOptionPane.showInputDialog("¿eres casado o soltero?"));
		extranjero=(JOptionPane.showInputDialog("¿eres extranjero?"));
		
		if(casado.equalsIgnoreCase("casado")) {
			if(edad>60) {
				if(extranjero.equalsIgnoreCase("si")) {
					total=500*.20;
					JOptionPane.showMessageDialog(null, "El precio total es $ "+total);			
				}
			if(extranjero.equalsIgnoreCase("no")) {
				precio=400*.20;
				total=400-precio;
				JOptionPane.showMessageDialog(null, "El precio total es $ "+total);
			}
			}
			else if(edad<=60) {
				if(extranjero.equalsIgnoreCase("si")) {
				total=500.00;
				JOptionPane.showMessageDialog(null, "El precio total es $ "+total);
			if(extranjero.equalsIgnoreCase("no")) {
				total=400.00;
				JOptionPane.showMessageDialog(null, "El precio total es $ "+total);		
		}

	}			
			}
		}
		else if (casado.equalsIgnoreCase("soltero")){
			if(edad>60) {
				if(extranjero.equalsIgnoreCase("si")) {
					precio=500*.20;
					total=(500+100)-precio;
					JOptionPane.showMessageDialog(null, "El precio total es $ "+total);			
				}
			if(extranjero.equalsIgnoreCase("no")) {
				precio=500*.20;
				total=500-precio;
				JOptionPane.showMessageDialog(null, "El precio total es $ "+total);
			}
			}
			else if(edad<=60) {
				if(extranjero.equalsIgnoreCase("si")) {
				total=600.00;
				JOptionPane.showMessageDialog(null, "El precio total es $ "+total);
				}
			if(extranjero.equalsIgnoreCase("no")) {
				total=500.00;
				JOptionPane.showMessageDialog(null, "El precio total es $ "+total);		
		}

	}			
			}
	}
}
}