
/*
 * Autor: Francisco Mendoza S�nchez
 * 
 * AN�LISIS
 * 
 * Nombre del programa: miPrimerArmatoste.java
 * 
 * Objetivo: Realizar un programa que nos permita elegir por men� que subprograma ejecutar. 
 * Los subprogramas a ejecutar son los apartados a, c, d, g y j del bolet�n cinco.
 * El programa podr� ejecutarse tantas veces como quiera el usuario
 * 
 * Entrada de datos: un n�mero para la opci�n del men�, letra para saber si se repite el proceso completo.
 * 
 * Salida de datos: no hay
 * 
 * Restricciones: no hay.
 * 
 * PSEUDOC�DIGO GENERALIZADO
 * INICIO
 * 	Repetir
		Repetir
			Mostrar men�
		  	Leer opcion del men�
		Mientras opci�n no est� entre el 0 y 5
	 	Seg�n opcion del men�
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
		boolean bulean = true; //Esta variable dice si la fecha se�alada corresponde a un a�o bisiesto
		char caracterApartadoG = ' ';
		
		do {
			do {
				System.out.println("Hola y bienvenido! Introduzca un n�mero para elegir una de las opciones siguientes");
				System.out.println("0.- Salir del men� principal");
				System.out.println("1.- Ejecutar apartado A, donde introducir� un car�cter y un n�mero e imprimir� tantas veces el car�cter como indique el n�mero");
				System.out.println("2.- Ejecutar apartado C, donde se convertir� en may�sculas lo que introduzcamos por el teclado");
				System.out.println("3.- Ejecutar apartado D, donde se calcular� una fecha como perteneciente a a�o bisiesto o no ");
				System.out.println("4.- Ejecutar apartado G, donde se le pasar� un car�cter y devolver� como salida un valor booleano true si se trata de una letra del alfabeto espa�ol y false si no lo es");
				System.out.println("5.- Ejecutar apartado J, donde se calcular� la pendiente de una recta definida por dos puntos en el plano");
				opcionMenu = teclado.nextInt();
			} while (opcionMenu > 5 || opcionMenu < 0);
			switch (opcionMenu) {
			
			case 0:
			System.out.println("Pues nada, adi�s");
			break;
			
			case 1:
			System.out.println("Introduzca caracter que desea repetir");
			caracterApartadoA = teclado.next().charAt(0);
			System.out.println("Introduzca cuantas veces desea repetir el car�cter");
			numeroApartadoA = teclado.nextInt();
			
			//llamada al m�todo
			
//			INTERFAZ:
//
//				NOMBRE: numeroYCaracter
//
//				PRECONDICIONES: Nada (los tipos ya lo controla Java seg�n San �lvaro)
//
//				ENTRADA: un caracter y un n�mero
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
//				ENTRADA: cadena de car�cteres.
//
//				SALIDA: cadena de car�cteres en may�sculas
//
//				POSTCONDICIONES: cadena introducida por teclado debe estar en may�sculas.
				
//				CABECERA: String minusculasAMayusculas (string minusculas)
				
			mayusculas=apartadoC.minusculasAMayusculas(minusculas);	
			System.out.println("Su cadena en may�sculas es "+mayusculas);
			
			break;
			
			case 3:
			System.out.println("Introduzca un a�o");
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
//			ENTRADA: tres n�meros enteros (un d�a, un mes y un a�o)
//
//			SALIDA: valor booleano.
//
//			POSTCONDICIONES: la salida debe ser cierta si el a�o es bisiesto y falso si no lo es.
			
			bulean=apartadoD.bisiesto(anio,mes,dia);
			
			if (bulean = false) {
				System.out.println("La fecha introducida no es un bisiesto");
				
			}else {
				System.out.println("La fecha introducida corresponde a un bisiesto");
			}
			//aqu� cometiste el error de no incluir como variable local un booleano. Exist�a para el PP, pero no para el SP.
			break;
						
			case 4:
				
				System.out.println("Introduzca un car�cter");
				
			
////				INTERFAZ
//				NOMBRE: espaniolONo
//				PROCESO: se le pasa un car�cter y averigua si pertenece al alfabeto espa�ol
//				PRECONDICIONES: 
//				ENTRADA: un car�cter

//				SALIDA: un booleano
//				POSTCONDICIONES: el booleano es true si el car�cter pertenece al alfabeto espa�ol y false si no pertenece.
//				CABECERA: public static boolean espaniolONo (char caracter)
				
				caracterApartadoG = teclado.next().charAt(0);
				
				bulean = apartadoG.espaniolONo(caracterApartadoG);

				if (bulean == false){
					System.out.println("Ese car�cter no pertenece al alfabeto espa�ol");
				}else{
					System.out.println("Ese car�cter pertenece al alfabeto espa�ol");
				}
			break;
			
			case 5:
			
			break;
			
			}
			System.out.println("Desea repetir? Pulse S para s� y otra tecla para no");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));

		} while (respuesta == 'S');

	}
}
