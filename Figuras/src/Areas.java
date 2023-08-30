import java.util.*;
public class Areas {
	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner shape=new Scanner(System.in);
		int b=1;
		while (b!=9){
			System.out.println("Ingrese (1 para calcular el area de un circulo 2 para triangulo 3 para rectangulo y 9 para salir)");
			 b=shape.nextInt();
		switch (b){
			case 1:System.out.println("Escribe el radio del circulo");
				double r=shape.nextDouble();
				double TR= r*3.14;
				System.out.println("El total es "+TR);break;
			case 2:System.out.println("Escribe la base del triangulo");
			double bt=shape.nextDouble();
			System.out.println("Escribe la altura del triangulo");
			double at=shape.nextDouble();
			double TT=bt*at/2;
			System.out.println("El area del triangulo es "+TT);break;
			case 3:System.out.println("Escribe un lado del cuadro");
			double lc=shape.nextDouble();
			double TC=lc*lc;
			System.out.println("El area del cuadro es "+TC); break;	
			case 9: System.out.println("Gracias por utilizar el sistema"); break;
			default: System.out.println("Esa no es una de la opciones"); break;
			}	
	}		
}
}