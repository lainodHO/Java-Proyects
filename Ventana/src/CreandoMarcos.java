import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		// DanielHernandezOlague
		miMarco marco1=new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
 class miMarco extends JFrame{
	 public miMarco(){
		 setSize(500,300);
		 setTitle("                                                        Chrome");

		 int a;
		 a=JOptionPane.showConfirmDialog(null,"1¿Tienes un horario y un plan de trabajo para cada dia y te ajustas a el?");
		 if (a==JOptionPane.YES_OPTION){
		 JOptionPane.showMessageDialog(null, "Elegiste si tienes 5 puntos");
	 }
	 else if (a==JOptionPane.NO_OPTION){
		 JOptionPane.showMessageDialog(null,"Elegiste no, tienes 2,5 puntos");
	 }
 
 }
 }
 