import java.util.Scanner;

public class Matrimonio {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner entrada=new Scanner(System.in);
		int[][]O=new int[10][2];
		for(int x=0;x<10;x++){
			System.out.println("Teclea a que edad deseas casarte");
			O[x][0]=entrada.nextInt();
			System.out.println("Cuantos hijos deseas tener");
			O[x][1]=entrada.nextInt();
		}
			System.out.println("PM   PH");
			for(int d=1;d<10;d++){
				System.out.println();
				for(int y=0;y<2;y++){
					System.out.print(O[d][y]+"   ");
	}}
			{
			System.out.println();
			System.out.println("El promedio de años  que comunmente desea casarse: "+(O[0][0]+O[1][0]+O[2][0]+O[3][0]+O[4][0]+O[5][0]+O[6][0]+O[7][0]+O[8][0]+O[9][0])/10);
			System.out.println("El promedio de hijos que comunmente desea tener los encuestados: "+(O[0][1]+O[1][1]+O[2][1]+O[3][1]+O[4][1]+O[5][1]+O[6][1]+O[7][1]+O[8][1]+O[9][1])/10);
			}
	}
}