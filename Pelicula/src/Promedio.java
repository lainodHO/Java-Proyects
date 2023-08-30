import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// DanielHernandezOlague
		Scanner entrada=new Scanner(System.in);
		String[][]B=new String[11][2];
				B[0][0]="Pelicula                   ";
				B[1][0]="1 Ted                      ";
				B[2][0]="2 Spectro                  ";
				B[3][0]="3 Assesing Creed           ";
				B[4][0]="4 Piratas del Caribe       ";
				B[5][0]="5 Eragon                   ";       
				B[6][0]="6 Infinity War             ";
				B[7][0]="7 Ready Player One         ";
				B[8][0]="8 Furia de Titanes         ";
				B[9][0]="9 REC                      ";
				B[10][0]="10 WWZ                    ";
				
				B[0][1]="Tipos";
				B[1][1]="Comedia";
				B[2][1]="Accion y Fantasia";
				B[3][1]="Suspenso y Accion";
				B[4][1]="Terror";
				B[5][1]="Accion y Fantasia";
				B[6][1]="Accion y Ciencia Ficcion";
				B[7][1]="Misterio y Ciencia Ficcion";
				B[8][1]="Terror";
				B[9][1]="Suspenso y Terror";
				B[10][1]="Terror";
				
				for(int x=0;x<11;x++){
					System.out.println();
					for(int y=0;y<2;y++){
						System.out.print(B[x][y]);
					}
				}
		
				int[][]DO=new int[10][10];
				for(int x=0;x<10;x++){
					System.out.println();
					System.out.println("Teclea el valor de de Ted");
					DO[x][0]=entrada.nextInt();
					System.out.println("Teclea el valor de de Spectro");
					DO[x][1]=entrada.nextInt();
					System.out.println("Teclea el valor de de Assesing Creed ");
					DO[x][2]=entrada.nextInt();
					System.out.println("Teclea el valor de de Piratas del Caribe");
					DO[x][3]=entrada.nextInt();
					System.out.println("Teclea el valor de de Eragon");
					DO[x][4]=entrada.nextInt();
					System.out.println("Teclea el valor de de Infinity War  ");
					DO[x][5]=entrada.nextInt();
					System.out.println("Teclea el valor de de Ready Player One ");
					DO[x][6]=entrada.nextInt();
					System.out.println("Teclea el valor de de Furia de Titanes");
					DO[x][7]=entrada.nextInt();
					System.out.println("Teclea el valor de de REC");
					DO[x][8]=entrada.nextInt();
					System.out.println("Teclea el valor de de WWZ ");
					DO[x][9]=entrada.nextInt();
					System.out.println("Sigiente entrevista");
				}
					System.out.println("Resultados");
					for(int d=1;d<0;d++){
						System.out.println();
						for(int y=0;y<0;y++){
							System.out.print("  ");	
	}
}
					{
						System.out.println();
						System.out.println("El promedio de Ted es: "+(DO[0][0]+DO[1][0]+DO[2][0]+DO[3][0]+DO[4][0]+DO[5][0]+DO[6][0]+DO[7][0]+DO[8][0]+DO[9][0])/10);
						System.out.println("El promedio de Spectro es: "+(DO[0][1]+DO[1][1]+DO[2][1]+DO[3][1]+DO[4][1]+DO[5][1]+DO[6][1]+DO[7][1]+DO[8][1]+DO[9][1])/10);
						System.out.println("El promedio de Assesing Creed es: "+(DO[0][2]+DO[1][2]+DO[2][2]+DO[3][2]+DO[4][2]+DO[5][2]+DO[6][2]+DO[7][2]+DO[8][2]+DO[9][2])/10);
						System.out.println("El promedio de Piratas del Caribe es: " +(DO[0][3]+DO[1][3]+DO[2][3]+DO[3][3]+DO[4][3]+DO[5][3]+DO[6][3]+DO[7][3]+DO[8][3]+DO[9][3])/10);
						System.out.println("El promedio de Eragon es: "+(DO[0][4]+DO[1][4]+DO[2][4]+DO[3][4]+DO[4][4]+DO[5][4]+DO[6][4]+DO[7][4]+DO[8][4]+DO[9][4])/10);
						System.out.println("El promedio de Infinity War es: "+(DO[0][5]+DO[1][5]+DO[2][5]+DO[3][5]+DO[4][5]+DO[5][5]+DO[6][5]+DO[7][5]+DO[8][5]+DO[9][5])/10);
						System.out.println("El promedio de Ready Player One es: "+(DO[0][6]+DO[1][6]+DO[2][6]+DO[3][6]+DO[4][6]+DO[5][6]+DO[6][6]+DO[7][6]+DO[8][6]+DO[9][6])/10);
						System.out.println("El promedio de Furia de Titanes es: "+(DO[0][7]+DO[1][7]+DO[2][7]+DO[3][7]+DO[4][7]+DO[5][7]+DO[6][7]+DO[7][7]+DO[8][7]+DO[9][7])/10);
						System.out.println("El promedio de REC es: "+(DO[0][8]+DO[1][8]+DO[2][8]+DO[3][8]+DO[4][8]+DO[5][8]+DO[6][8]+DO[7][8]+DO[8][8]+DO[9][8])/10);
						System.out.println("El promedio de WWZ es: "+(DO[0][9]+DO[1][9]+DO[2][9]+DO[3][9]+DO[4][9]+DO[5][9]+DO[6][9]+DO[7][9]+DO[8][9]+DO[9][9])/10);
						}
	}
}
