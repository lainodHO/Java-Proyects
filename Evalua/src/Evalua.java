import java.util.Scanner;
public class Evalua {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner Evalua=new Scanner(System.in);
		int Dho=1;
	    while (Dho!=2){
	    	 System.out.println("Teclea tres numeros:");
			 System.out.println("Introduce el primer numero:");
			 int n1=Evalua.nextInt();
			 System.out.println("Introduce el segundo numero:");
			 int n2=Evalua.nextInt();
			 System.out.println("Introduce el tercer numero:");
			 int n3=Evalua.nextInt();
			
			 if(n1 > n2){
				 System.out.println("El primero es mayor");
			 }if(n2 > n1){
				 if(n3 < n1){
				 System.out.println("El segundo numero es mayor");	
			 }if(n1 < n3 ){
				 if(n1 != n2){
				 System.out.println("El tercer numero es mayor");
	    }
	}
}
}
	    }
}

