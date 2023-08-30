import java.util.*;
public class For {
	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner tablas=new Scanner(System.in);
		int Dho=1;
		while (Dho!=2){
		System.out.print("Teclea la tabla que deseas saber");
		int tabla=tablas.nextInt();
		int D;
		for(D=0;D<11;D++){
			int DD=D*tabla;
			System.out.println(tabla+"X"+D+"="+DD);	
}
}
}
}