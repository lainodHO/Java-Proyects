import java.util.*;

public class Diagnostico2 {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner dho=new Scanner(System.in);
	
		System.out.println("¿Que Cantidad de lonches desea llevar?");
		int lonche=dho.nextInt();
		
		System.out.println("¿Que Cantidad de burritos desea llevar?");
		int burrito=dho.nextInt();
		
	    System.out.println("¿Que Cantidad de sodas desea llevar?");
	    int sodas=dho.nextInt();
	    
	    int Resultadol=(lonche*15);
	    int  Resultado2=(burrito*10);
	    int  Resultado3=(sodas*7);
	    int  Resultado4=( Resultadol+Resultado2+Resultado3);
	    
	    System.out.println("El total a pagar es de:"+ Resultado4);
	   	   
	}
		
		
	}


