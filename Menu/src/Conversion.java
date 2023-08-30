import java.util.*;
public class Conversion {
	public static void main(String[] args) {
		// DanielHernandezOlague
		String Dho="A";
		while (Dho!="M"){
		Scanner input=new Scanner(System.in);
			System.out.println("Ingrese A para calcular °C a °F");
			System.out.println("Ingrese B para calcular °F a °C");
			System.out.println("Ingrese C para calcular Km a Mlls");
			System.out.println("Ingrese D para calcular Mlls a Km");
			System.out.println("Ingrese E para calcular Cm a in");
			System.out.println("Ingrese F para calcular °in a Cm");
			System.out.println("Ingrese G para calcular Kg a Lbs");
			System.out.println("Ingrese H para calcular Lbs a Kg");
			System.out.println("Ingrese I para calcular Lts a Galones");
			System.out.println("Ingrese J para calcular Galones a Lts");
			System.out.println("Ingrese K para calcular Mts a Pies");
			System.out.println("Ingrese L para calcular Pies a Mts");
			System.out.println("Ingrese M para Salir del sistema");
			Dho=input.nextLine();
		switch (Dho){
		case "A":System.out.println("Escribe los °C que quieres convertir a °F ");
		int r=input.nextInt();
		double Ce=(r*1.8)+32;
		System.out.println("Sus grados fahrenheit: "+Ce); break;
		case "B":System.out.println("Escribe los °F que quieres convertir a °C ");
		int F=input.nextInt();
		double R=(F-32)*5/9;
		System.out.println("Sus grados Celsius: "+R); break;
		case "C":System.out.println("Escribe los Km que quieres convertir a Mlls");
		int Km=input.nextInt();
		double i=Km*0.621371;
		System.out.println("Sus Kilometros son: "+i); break;
		case "D":System.out.println("Escribe las Mlls que quieres convertir a Km ");
		int Mlls=input.nextInt();
		double I=Mlls*1.609344;
		System.out.println("Sus Millas son: "+I); break;
		case "E":System.out.println("Escribe los Cm que quieres convertir a in ");
		int Cm=input.nextInt();
		double RES=Cm*0.39370;
		System.out.println("Sus Centimetros son: "+RES); break;
		case "F":System.out.println("Escribe los in que quieres convertir a Cm ");
		int in=input.nextInt();
		double IG=in/0.39370;
		System.out.println("Sus  Pulgadas son: "+IG); break;
		case "G":System.out.println("Escribe los kG que quieres convertir a Lbs ");
		int Kg=input.nextInt();
		double res=Kg*2.2046;
		System.out.println("Sus Libras son: "+res); break;
		case "H":System.out.println("Escribe los Lbs que quieres convertir a Kg ");
		int Lbs=input.nextInt();
		double Res=Lbs/2.2046;
		System.out.println("Sus Kilogramos son: "+Res); break;
		case "I":System.out.println("Escribe los Lts que quieres convertir a Galones");
		int Galones=input.nextInt();
		double RE=Galones*0.26417;
		System.out.println("Sus Litros son: "+RE); break;
		case "J":System.out.println("Escribe los Galones que quieres convertir a Lts");
		int Lts=input.nextInt();
		double Con=Lts*3.7854118;
		System.out.println("Sus Galones son: "+Con); break;
		case "K":System.out.println("Escribe los Mts que quieres convertir a Pies");
		int Mts=input.nextInt();
		double c=Mts*3.2808;
		System.out.println("Sus Pies son: "+c); break;
		case "L":System.out.println("Escribe los Pies que quieres convertir a Mts");
		int Pies=input.nextInt();
		double CON=Pies/3.2808;
		System.out.println("Sus Metros son: "+CON); break;
		case "M":System.out.println("Gracias por usar el sistema");
		Dho="M";
		break;
		default:System.out.println("Esta opcion no exixte"); break;
		}
		}
	}
}	