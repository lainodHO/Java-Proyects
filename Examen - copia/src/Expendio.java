import javax.swing.JOptionPane;

public class Expendio {

	public static void main(String[] args) {
		String dia;
		double caguamas,latas,medias,total;;
		dia=JOptionPane.showInputDialog("¿Que dia se realiza loa compra?");
		caguamas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas caguamas desea?"));
		 latas=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas latas desea?"));
		 medias=Double.parseDouble(JOptionPane.showInputDialog("¿Cuantas medias desea?"));
		 
			   total=caguamas+latas+medias;
		if(dia.equalsIgnoreCase("martes")){
			double Dinero1 =caguamas*7.5+latas*5+medias*4.5;
			JOptionPane.showMessageDialog(null,": $"+ Dinero1);
		
		}
		if(dia.equalsIgnoreCase("lunes")){
			double  Dinero2=caguamas*15+latas*10+medias*7;
			JOptionPane.showMessageDialog(null,": $"+ Dinero2);
			 
		}
	}}