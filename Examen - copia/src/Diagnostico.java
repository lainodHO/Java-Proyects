import java.util.Scanner;

public class Diagnostico {

	public static void main(String[] args) {
		// DanielHernandezOlaague
		Scanner dho=new Scanner(System.in);
		int b=1;
		while (b!=9){
			System.out.println("Ingrese (1 para calcular el area de cuadrado 2 para el perimetro de un cuadradro y 9 para salir)");
			 b=dho.nextInt();
			 switch (b){
			 case 1:System.out.println("Escribe el lado del cuadrado");
			 double l1=dho.nextDouble();
			 double TT=l1*l1;
			 System.out.println("El area del cuadrado es "+TT);break;
			 case 2:System.out.println("Escribe el lado del cuadrado");
			 double l11=dho.nextDouble();
			 double TTT=l11+l11+l11+l11;
			 System.out.println("El area del cuadrado es "+TTT);break;
			 default: System.out.println("Gracias por usar el sistema"); break;
	}
		

}
}
}