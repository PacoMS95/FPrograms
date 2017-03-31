/* Enunciado:
 * 
 * Implementa las interfaces del primer ejerccio del tema 6 en un menú que permita elegir entre cualquiera de las interfaces
 * 
 * NOMBRE: interfacesMenu.java
 * 
 * AUTORES: Francisco Mendoza Sánchez
 * 
 * ANALISIS
 * 
 * Objetivo: Implementar uin programa que nos permita elegir mediante menú cinco de las interfaces estudiadas en el tema anterior a modo de subprogramas.
 * 
 * Entrada: La opción del menú que quiera el usuario y un carácter para indicar si se repite el programa.
 * 
 * Salida: Nada
 * 
 * Restricciones: no hay
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 	Repetir
 * 		Repetir
 * 			Mostrar menú principal
 * 			Pedir opción
 * 		Mientras opción no esté entre 0 y 12
 * 		Según opción
 * 			Caso 0
 * 				Salir del programa
 * 			Caso 1
 * 				pintarLineas
 * 			Caso 2
 * 				parImpar
 * 			Caso 3
 * 				minusMayus
 * 			Caso 4
 * 				anioBisiesto
 * 			Caso 5
 * 				digitoHex
 * 			Fin_según
 * 		Preguntar si repetir
 * 	Mientras el usuario quiera
 * Fin_PP
 * 				
 */

import java.io.*;
import java.util.*;

public class interfacesMenu {
	
	
	/* PROCESO: Subprograma que teniendo como parámetros un carácter y un número, imprima una línea con tantas veces el carácter como indique el número.
INTERFAZ:
	NOMBRE: numeroYCaracter
	PRECONDICIONES: Nada (los tipos ya lo controla Java según San Alvaro)
	ENTRADA: un caracter y un número
	SALIDA: Nada
	POSTCONDICIONES: Ninguna
	CABECERA: void numeroYCaracter (char caracter, int numero)	
 */

	public static void main (String args[]) {
		
		//declaramos las variables
		int opcionMenuPrincipal = 0;
		char respuesta = ' ';
		
		Scanner teclado = new Scanner (System.in);
		
		do {//Hacer
			do { //Hacer
				System.out.println("Hola! Elija el subprograma que desee ejecutar");
				System.out.println("0: Salir");
				System.out.println("1: Pintar lineas");
				System.out.println("2: Par o no par");
				System.out.println("3: Conversion de minusculas a mayusculas");
				System.out.println("4: Comprobar si un anio es bisiesto");
				System.out.println("5: Comprobar si un digito es hexadecimal");
				System.out.println("6: Calcular la distancia entre dos puntos");
				System.out.println("7: Comprobar si un caracter pertenece al alfabeto español");
				System.out.println("8: Convertir de hectareas y areas a metros cuadrados");
				System.out.println("9: Comprobar si un numero es primo");
				System.out.println("10: Calcular la pendiente de una recta");
				System.out.println("11: Calcular los factores primos de un numero ");
				System.out.println("12: Resolver ecuacion de segundo grado");
				opcionMenuPrincipal = teclado.nextInt();
								
			}while (opcionMenuPrincipal <0 || opcionMenuPrincipal > 12);
			
			//
			
			switch (opcionMenuPrincipal){
				case 0:
				
				break;
				
				case 1:
				
				break;
				
				case 2:
				
				break;
				
				case 3:
				
				break;
				
				case 4:
				
				break;
				
				case 5:
				
				break;
				
				}
			
			System.out.println("Realmente desea salir? S para si y otra para repetir");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
			
		} while (respuesta !='S');
	}
}

