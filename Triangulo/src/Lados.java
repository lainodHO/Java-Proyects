import java.util.*;
public class Lados {
	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner triangulo=new Scanner (System.in);
		System.out.println("Teclea el primer lado del triangulo");
		int l1=triangulo.nextInt();
		System.out.println("Teclea el segundo lado del triangulo");
		int l2=triangulo.nextInt();
		System.out.println("Teclea el tercer lado del triangulo");
		int l3=triangulo.nextInt();
		if (l1 == l3){
			if (l2 == l3){
				System.out.println("Es un triangulo equilatero");
			}
		}if (l1 == l2){
			if (l2!=l3){
				System.out.println("Es un triangulo isoseles");
			}
		}if (l1!=l2){
			if (l2!=l3){
			System.out.println("Es un triangulo isoseles");
			}
		}if(l3 == l1){
			if(l2!=l1){
				System.out.println("Es un triangulo isoseles");
			}
		}if (l1!=l2){
			if(l1!=l3){
				if(l3!=l2){
					System.out.println("Es un triangulo escaleno");
				}
			}
	}
		}
}