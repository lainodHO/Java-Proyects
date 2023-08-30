import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// DanielHernandezOlague
		//If else
		

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre porfavor:");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce la edad porfavor:");
		
		int  edad=entrada.nextInt();
		 
		
		
	
		if (edad >= 18) {
			//true
			System.out.println("Si puedes entrar al antro"); 
		}else if(edad < 18){
			System.out.println("No puedes entrar al antro");		
		
			
		}	
	}

}
