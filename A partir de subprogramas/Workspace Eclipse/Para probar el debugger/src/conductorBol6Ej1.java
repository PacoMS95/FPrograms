/*
 * Conductor del programa principal
 */
 
import java.io.*;
import java.util.*;



public class conductorBol6Ej1 {
	
	public static void main (String[] args) {
		//declaramos variables y objetos
		char salida = ' ';
		int opcionMenuPrincipal = 0;
		char caracter = ' ';
		int numero = 0;
		int numeroEvaluado = 0;
		int devolucionParONo = 0;
		String cadena = " ";
		int annio = 0;
		double equis1 = 0.0;
		double equis2 = 0.0;
		double igriega1 = 0.0;
		double igriega2 = 0.0;
		char caracterEsp = ' ';
		double hectareas;
		double x1 = 0.0;
		double x2 = 0.0;
		double iGriega1 = 0.0;
		double iGriega2 = 0.0;
		int numeroCompuesto = 0;
		Scanner teclado = new Scanner (System.in);
		
		//conductor para probar las funcionalidades
		do {
		System.out.println("Hola");
		System.out.println("Introduzca opcion");
		System.out.println("1.-Impresion");
		System.out.println("2.- Calcular si par o no");
		System.out.println("3.- De minusculas a mayusculas");
		System.out.println("4.- Comprobar si bisiesto");
		System.out.println("5.- Calcular distancia");
		System.out.println("6.- Comprobar si caracter espaniol");
		System.out.println("7.- Conversion superficie");
		System.out.println("8.- Comprobar si compuesto");
		System.out.println("9.- Calcular pendiente");
		System.out.println("10.- Factores primos");
		opcionMenuPrincipal = teclado.nextInt();
		
		
		switch (opcionMenuPrincipal){
			
			
					
		case 1:
		System.out.println("Caracter");
		caracter = teclado.next().charAt(0);
		System.out.println("Numero");
		numero = teclado.nextInt();
		impresion.impresion(caracter, numero);
		break;
		
		
		
		case 2:
		System.out.println("Numero");
		numeroEvaluado = teclado.nextInt();
		devolucionParONo = parONo.parONo(numeroEvaluado);
		break;
		
		
		
		case 3:
		System.out.println("escriba una cadena");
		cadena = teclado.nextLine();
		minusculasAMayusculas.minusculasAMayusculas(cadena);
		break;
		
			
		
		case 4:
		System.out.println("Introduzca un anio");
		annio = teclado.nextInt();
		bisiesto.bisiesto(annio);
		break;
		
		
		
		case 5:
		System.out.println("Introduzca la X de la primera coordenada");
		equis1 = teclado.nextFloat();
		System.out.println("Introduzca la Y de la primera coordenada");
		igriega1 = teclado.nextFloat();
		System.out.println("Introduzca la X de la segunda coordenada");
		equis2 = teclado.nextFloat();
		System.out.println("Introduzca la Y de la segunda coordenada");
		igriega2 = teclado.nextFloat();
		distancia.distancia(equis1, equis2, igriega1, igriega2);
		break;
		
		
		
		case 6:
		System.out.println("Introduzca un caracter");
		caracterEsp = teclado.next().charAt(0);
		caracterEspaniol.caracterEspaniol(caracterEsp);
		break;
		
		
		
		case 7:
		System.out.println("Introduzca un numero");
		hectareas = teclado.nextDouble();
		conversionSuperficie.conversionSuperficie(hectareas);
		break;
		
		
		
		case 8:
		System.out.println("Introduzca un numero");
		numeroCompuesto = teclado.nextInt();
		compuesto.compuesto(numeroCompuesto);
		break;
		
		
		
		case 9:
		System.out.println("Introduzca la X de la primera coordenada");
		x1 = teclado.nextDouble();
		System.out.println("Introduzca la Y de la primera coordenada");
		iGriega1 = teclado.nextDouble();
		System.out.println("Introduzca la X de la segunda coordenada");
		x2 = teclado.nextDouble();
		System.out.println("Introduzca la Y de la segunda coordenada");
		iGriega2 = teclado.nextDouble();
		pendiente.pendiente(x1,x2,iGriega1,iGriega2);
		break;
		
		
		
		case 10:
		System.out.println("Este programa se encuentra en construccion");
		break;
		
		}
		
		System.out.println("Desea salir? S para si y n para repetir");
		
		
		} while (salida != 'S');
	}
}
