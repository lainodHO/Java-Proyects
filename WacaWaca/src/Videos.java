import java.util.Scanner;
public class Videos {

	public static void main(String[] args) {
		// YairAndreRamirezMercado

		Scanner musica=new Scanner(System.in);
		String[][]Dho=new String[6][2];
		
		Dho[0][0]="CANCION            ";
		Dho[1][0]="Mad World          ";
		Dho[2][0]="Unity              ";
		Dho[3][0]="Monody             ";
		Dho[4][0]="You Owe Me         ";
		Dho[5][0]="Sick Boy           ";
		
		Dho[0][1]="CANTANTE";
		Dho[1][1]="Gary Jules";
		Dho[2][1]="TheFatRat";
		Dho[3][1]="TheFatRat";
		Dho[4][1]="The Chainsmokers";
		Dho[5][1]="The Chainsmokers";
		for(int x=0;x<6;x++){
			System.out.println();
			for(int y=0;y<2;y++){
				System.out.print(Dho[x][y]);
			}
		}
			int[][]Dh=new int[10][10];
			for(int p=0;p<3;p++){
				System.out.println();
			System.out.println("Califica la cancion de Mad World");
			Dh[p][0]=musica.nextInt();
			System.out.println("Califica la cancion de Unity");
			Dh[p][1]=musica.nextInt();
			System.out.println("Califica la cancion se Monody");
			Dh[p][2]=musica.nextInt();
			System.out.println("Califica la cancion de You Owe Me ");
			Dh[p][3]=musica.nextInt();
			System.out.println("Califica la cancion de Sick Boy");
			Dh[p][4]=musica.nextInt();
			}
			System.out.println("C1 C2 C3 C4 C5");
			for (int o=0; o<3; o++){
				System.out.println();
			for (int w=0; w<5; w++){
				System.out.print(Dh[o][w]+"  ");			
			}
		}
				System.out.println();
				System.out.println("El promedio de la cancion Mad World es: "+(Dh[0][0]+Dh[1][0]+Dh[2][0])/3);
				System.out.println("El promedio de la cancion Unity es: "+(Dh[0][1]+Dh[1][1]+Dh[2][1])/3);
				System.out.println("El promedio de la cancion Monody: "+(Dh[0][2]+Dh[1][2]+Dh[2][2])/3);
				System.out.println("El promedio de la cancion You Owe Me es: " +(Dh[0][3]+Dh[1][3]+Dh[2][3])/3);
				System.out.println("El promedio de la cancion Sick Boy es: "+(Dh[0][4]+Dh[1][4]+Dh[2][4])/3);
			}
	}
		
	


