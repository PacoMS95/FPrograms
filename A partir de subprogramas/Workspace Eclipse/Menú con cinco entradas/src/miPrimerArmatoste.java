
/*
 * Autor: Francisco Mendoza Sánchez
 * 
 * ANÁLISIS
 * 
 * Nombre del programa: miPrimerArmatoste.java
 * 
 * Objetivo: Realizar un programa que nos permita elegir por menú que subprograma ejecutar. 
 * Los subprogramas a ejecutar son los apartados a, c, d, g y j del boletín cinco.
 * El programa podrá ejecutarse tantas veces como quiera el usuario
 * 
 * Entrada de datos: un número para la opción del menú, letra para saber si se repite el proceso completo.
 * 
 * Salida de datos: no hay
 * 
 * Restricciones: no hay.
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * INICIO
 * 	Repetir
		Repetir
			Mostrar menú
		  	Leer opcion del menú
		Mientras opción no esté entre el 0 y 5
	 	Según opcion del menú
	 		caso 0
	 			No hacer nada
	 		caso 1
	 			Ejecutar apartadoA
	 		caso 2
	 			Ejecutar apartadoC
	 		caso 3
	 			Ejecutar apartadoD
	 		caso 4
	 			Ejecutar apartadoG
	 		caso 5
	 			Ejecutar apartadoJ
	 	Preguntar si repetir
	 Mientras el usuario quiera
  FIN_PP
 */

import java.util.Scanner;

public class miPrimerArmatoste {

	public static void main(String[] args) {
		char respuesta = ' ';
		Scanner teclado = new Scanner(System.in);
		int opcionMenu = 0;
		char caracterApartadoA = ' ';
		int numeroApartadoA = 0;
		String minusculas =" ";
		String mayusculas = " ";
		int anio = 0;
		int mes = 0;
		int dia = 0;
		boolean bulean = true; //Esta variable dice si la fecha señalada corresponde a un año bisiesto
		char caracterApartadoG = ' ';
		
		do {
			do {
				System.out.println("Hola y bienvenido! Introduzca un número para elegir una de las opciones siguientes");
				System.out.println("0.- Salir del menú principal");
				System.out.println("1.- Ejecutar apartado A, donde introducirá un carácter y un número e imprimirá tantas veces el carácter como indique el número");
				System.out.println("2.- Ejecutar apartado C, donde se convertirá en mayúsculas lo que introduzcamos por el teclado");
				System.out.println("3.- Ejecutar apartado D, donde se calculará una fecha como perteneciente a año bisiesto o no ");
				System.out.println("4.- Ejecutar apartado G, donde se le pasará un carácter y devolverá como salida un valor booleano true si se trata de una letra del alfabeto español y false si no lo es");
				System.out.println("5.- Ejecutar apartado J, donde se calculará la pendiente de una recta definida por dos puntos en el plano");
				opcionMenu = teclado.nextInt();
			} while (opcionMenu > 5 || opcionMenu < 0);
			switch (opcionMenu) {
			
			case 0:
			System.out.println("Pues nada, adiós");
			break;
			
			case 1:
			System.out.println("Introduzca caracter que desea repetir");
			caracterApartadoA = teclado.next().charAt(0);
			System.out.println("Introduzca cuantas veces desea repetir el carácter");
			numeroApartadoA = teclado.nextInt();
			
			//llamada al método
			
//			INTERFAZ:
//
//				NOMBRE: numeroYCaracter
//
//				PRECONDICIONES: Nada (los tipos ya lo controla Java según San Álvaro)
//
//				ENTRADA: un caracter y un número
//
//				SALIDA: Nada
//
//				POSTCONDICIONES:  Ninguna
			
			apartadoA.numeroYCaracter(caracterApartadoA, numeroApartadoA);
			
			break;
			
			case 2:
				System.out.println("Introduzca su texto en minusculas");
				minusculas = teclado.next();
				
//				INTERFAZ 
//
//				NOMBRE: minusculasAMayusculas
//
//				PRECONDICIONES: ninguna
//
//				ENTRADA: cadena de carácteres.
//
//				SALIDA: cadena de carácteres en mayúsculas
//
//				POSTCONDICIONES: cadena introducida por teclado debe estar en mayúsculas.
				
//				CABECERA: String minusculasAMayusculas (string minusculas)
				
			mayusculas=apartadoC.minusculasAMayusculas(minusculas);	
			System.out.println("Su cadena en mayúsculas es "+mayusculas);
			
			break;
			
			case 3:
			System.out.println("Introduzca un año");
			anio = teclado.nextInt();
			System.out.println("Introduzca un mes");
			mes = teclado.nextInt();
			System.out.println("Introduzca un dia");
			dia = teclado.nextInt();
				
//			INTERFAZ
//
//			NOMBRE: bisiesto
//
//			PRECONDICIONES: la fecha introducida debe existir en el calendario. 
//
//			ENTRADA: tres números enteros (un día, un mes y un año)
//
//			SALIDA: valor booleano.
//
//			POSTCONDICIONES: la salida debe ser cierta si el año es bisiesto y falso si no lo es.
			
			bulean=apartadoD.bisiesto(anio,mes,dia);
			
			if (bulean = false) {
				System.out.println("La fecha introducida no es un bisiesto");
				
			}else {
				System.out.println("La fecha introducida corresponde a un bisiesto");
			}
			//aquí cometiste el error de no incluir como variable local un booleano. Existía para el PP, pero no para el SP.
			break;
						
			case 4:
				
				System.out.println("Introduzca un carácter");
				
			
////				INTERFAZ
//				NOMBRE: espaniolONo
//				PROCESO: se le pasa un carácter y averigua si pertenece al alfabeto español
//				PRECONDICIONES: 
//				ENTRADA: un carácter

//				SALIDA: un booleano
//				POSTCONDICIONES: el booleano es true si el carácter pertenece al alfabeto español y false si no pertenece.
//				CABECERA: public static boolean espaniolONo (char caracter)
				
				caracterApartadoG = teclado.next().charAt(0);
				
				bulean = apartadoG.espaniolONo(caracterApartadoG);

				if (bulean == false){
					System.out.println("Ese carácter no pertenece al alfabeto español");
				}else{
					System.out.println("Ese carácter pertenece al alfabeto español");
				}
			break;
			
			case 5:
			
			break;
			
			}
			System.out.println("Desea repetir? Pulse S para sí y otra tecla para no");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));

		} while (respuesta == 'S');

	}
}
