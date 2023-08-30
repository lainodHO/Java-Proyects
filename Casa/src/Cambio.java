import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner casa=new Scanner (System.in);
		System.out.println("Cuantos dolares quieres cambiar a pesos");
		double dolares=casa.nextDouble();
		System.out.println("Cuantos pesos vale el dolar");
		double valor=casa.nextDouble();
		double total=dolares*valor;
		System.out.println("$"+total+"Pesos");
	}

}
