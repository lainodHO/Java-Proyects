import java.io.InputStream;
import java.util.*;

public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// DanielHernandezOlague
	
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre porfavor:");
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce la edad porfavor:");
		int  edad=entrada.nextInt();
	}

	private String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
