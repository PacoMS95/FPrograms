/*
 * ANALISIS
 * 
 * Autor: Francisco Mendoza Sánchez
 * 
 * Proceso que se ejecuta: en este programa aparecerán como un menú las
 * distintas interfaces estudiadas en el boletín 05 ejercicio primero. 
 * Se incluirá la opción de salir del programa y repetir el proceso com
 * pleto.
 * 
 * Entrada: selección por menú del subprograma a ejecutar deseado. Entra
 * da y validación de datos correspondientes a cada subprograma
 * 
 * Salida: depende del subprograma
 * 
 * Suposiciones: ninguna (las entradas están validadas por el PP)
 * 
 * PSEUDOCÓDIGO DE NIVEL 0
 * 
 * INICIO
 * 		Repetir
 * 			Mostrar menu
 * 			leer y validar opcion
 * 			Si (opcion <> 11)
 * 				Según (opcion)
 * 					Caso opcion == 1
 * 						impresion
 * 					Caso opcion == 2
 * 						Calcular si par o no
 * 					Caso opcion == 3
 * 						convertir mayúsculas a minusculas
 * 					Caso opcion == 4
 * 						Calcular si bisiesto
 * 					Caso opcion == 5
 * 						Calcular distancia
 * 					Caso opcion == 6
 * 						Comprobar si caracter español
 * 					Caso opcion == 7
 * 						Convertir superficie
 * 					Caso opcion == 8
 * 						Calcular si compuesto
 * 					Caso opcion == 9
 * 						Calcular pendiente
 * 					Caso opcion == 10
 * 						Calcular factores primos
 * 				Fin_Según
 * 			SiNo
 * 			Preguntar si repetir
 * 			Fin_Si
 * 		Mientras el usuario quiera
 * FIN
 * 
 * 
 * 
 * 
 * 
 * PSEUDOCÓDIGO DE NIVEL 1
 * 
 * INICIO
 * 		Repetir
 * 			Mostrar menu
 * 			leer y validar opcion
 * 			Si (opcion <> 11)
 * 				Según (opcion)
 * 					Caso opcion == 1
 * 						Pedir numero y caracter
 * 						Comprobar si caracter es imprimible y el numero mayor que cero
 * 						llamar impresion
 * 					Caso opcion == 2
 * 						Pedir numero
 * 						comprobar si numero es entero
 * 						llamar parONo
 * 						mostrar si el numero es par o no
 * 					Caso opcion == 3
 * 						Pedir cadena de caracteres
 * 						Comprobar si caracteres están en abecedario
 * 						llamar minusculasAMayusculas
 * 					Caso opcion == 4
 * 						Pedir fecha
 * 						Comprobar fecha
 * 						llamar bisiesto
 * 					Caso opcion == 5
 * 						Pedir coordenadas
 * 						llamar distancia
 * 					Caso opcion == 6
 * 						Pedir caracter
 * 						llamar caracterEspaniol
 * 						mostrar si caracter es español
 * 					Caso opcion == 7
 * 						Pedir superficie
 * 						llamar conversionSuperficie
 * 					Caso opcion == 8
 * 						Pedir numero
 * 						Comprobar si natural
 * 						llamar compuesto
 * 					Caso opcion == 9
 * 						Pedir coordenadas
 * 						llamar pendiente
 * 					Caso opcion == 10
 * 						mostrar programa en construcci
 * 				Fin_Según
 * 			SiNo
 * 			Preguntar si repetir
 * 			Fin_Si
 * 		Mientras el usuario quiera
 * FIN
 */
import java.io.*;
import java.util.*;



public class bol6ej1 {
	
	public static void main (String[] args) {
		
		//declaramos variables y objetos
		char salida = ' ';
		int opcionMenuPrincipal = 0;
		char caracter = ' ';
		int numero = 0;
		int numeroEvaluado = 0;
		int devolucionParONo = 0;
		String cadena = " ";
		long annio = 0;
		double equis1 = 0.0;
		double equis2 = 0.0;
		double igriega1 = 0.0;
		double igriega2 = 0.0;
		char caracterEsp = ' ';
		boolean espaniol = false;
		double hectareas;
		double x1 = 0.0;
		double x2 = 0.0;
		double iGriega1 = 0.0;
		double iGriega2 = 0.0;
		int numeroCompuesto = 0;
		Scanner teclado = new Scanner (System.in);
		
		
		
		
		
		
  		

  					//Caso opcion == 7
  						//Pedir superficie
  						//llamar conversionSuperficie
  					//Caso opcion == 8
  						//Pedir numero
  						//Comprobar si natural
  						//llamar compuesto
  					//Caso opcion == 9
  						//Pedir coordenadas
  						//llamar pendiente
  					//Caso opcion == 10
  						//llamar factoresPrimos (en construcción)
  				//Fin_Según
  			//Fin_si
  			//Preguntar si repetir
  		//Mientras el usuario quiera		
		
		
		
		
		
		
		
		
		
		
		
		
		
		do { //Repetir
		//Mostrar menu
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
			System.out.println("11.- Salir");
			//leer y validar opcion
			
			opcionMenuPrincipal = teclado.nextInt();
			}while (opcionMenuPrincipal > 11 || opcionMenuPrincipal < 1); //mientras la opción esté entre las disponibles
			
			//Si (opcion <> 11)
			if(opcionMenuPrincipal !=11){
				switch (opcionMenuPrincipal){ //según la opción elegida
					
					
				case 1: //opción 1
				//pedir número y carácter y comprobar si dicho carácter es imprimible y el número de veces que se repite mayor que cero.
				
				do{
				System.out.println("Introduzca un caracter");
				caracter = teclado.next().charAt(0);
				}while(caracter < 'a' || caracter > 'z');
				
				do{
				System.out.println("Introduzca un numero");
				numero = teclado.nextInt();
				}while(numero <= 0);
				
				//llamar impresion
				impresion.impresion(caracter, numero);
				break;
				
				
				
				case 2://opción 2
				//pedir número y comprobar si es entero
				System.out.println("Numero");
				numeroEvaluado = teclado.nextInt();
				//llamada al subprograma
				devolucionParONo = parONo.parONo(numeroEvaluado);
				//mostrar si el número es par o no
				if (devolucionParONo == 1)
				System.out.println("El numero es par");
				else
				System.out.println("El numero no es par");
				break;
				
				
				
				case 3://opción 3
				System.out.println("Escriba una cadena");
				cadena = teclado.next();
				minusculasAMayusculas.minusculasAMayusculas(cadena);
				break;
				
					
				
				case 4://opción 4
				//pedir año y comprobar que existe
				System.out.println("Introduzca un anio");
				annio = teclado.nextLong(); //sólo se admiten enteros
				//comprobar si es bisiesto o no
				bisiesto.bisiesto(annio);
				break;
				
				
				
				case 5://opción 5
				//pedir coordenadas
				System.out.println("Introduzca la X de la primera coordenada");
				equis1 = teclado.nextFloat();
				System.out.println("Introduzca la Y de la primera coordenada");
				igriega1 = teclado.nextFloat();
				System.out.println("Introduzca la X de la segunda coordenada");
				equis2 = teclado.nextFloat();
				System.out.println("Introduzca la Y de la segunda coordenada");
				igriega2 = teclado.nextFloat();
				//calcular la distancia
				distancia.distancia(equis1, equis2, igriega1, igriega2);
				break;
				
				
				
				case 6://opción 6
				//pedir caracter
				System.out.println("Introduzca un caracter");
				caracterEsp = teclado.next().charAt(0);
				//llamar a caracterEspaniol
				caracterEspaniol.caracterEspaniol(caracterEsp);
				//mostrar si caracter espaniol
				if (espaniol == false)
				System.out.println("El caracter no es espaniol");
				else
				System.out.println("El caracter es espaniol");
				break;
				
				
				
				case 7://opción 7
				System.out.println("Introduzca un numero");
				hectareas = teclado.nextDouble();
				conversionSuperficie.conversionSuperficie(hectareas);
				break;
				
				
				
				case 8://opción 8
				System.out.println("Introduzca un numero");
				numeroCompuesto = teclado.nextInt();
				compuesto.compuesto(numeroCompuesto);
				break;
				
				
				
				case 9://opción 9
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
				
				
				
				case 10://opción 10
				System.out.println("Este programa se encuentra en construccion");
				break;
				
				} //fin según
		}else{ //SiNo
			//Preguntar si repetir
			System.out.println("Desea salir? S para si y n para repetir");
			salida = Character.toUpperCase(teclado.next().charAt(0));
		} //Fin_Si
		
		} while (salida != 'S'); //mientras el usuario quiera
	}
}
