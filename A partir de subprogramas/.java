/* 
 ***************************
 *FRANCISCO MENDOZA SANCHEZ*
 ***************************
 * 
PROCESO: Subprograma que teniendo como parámetros un carácter y un número, imprima una línea con tantas veces el carácter como indique el número.

MÉTODO:

	NECESIDADES: un caracter y un número

	RESTRICCIONES DE LAS NECESIDADES: el primer dato de entrada debe ser un carácter y el segundo dato un número.

	NECESIDADES/DEVOLUCIONES: ninguna

	EL SUBPROGRAMA SE VA A DISEÑAR COMO ... procedimiento (sin valor asociado al nombre)

	EL PASO DE PARAMETROS SE HARA POR ... valor

INTERFAZ:

	NOMBRE: numeroYCaracter

	PRECONDICIONES: Nada (los tipos ya lo controla Java según San Alvaro)

	ENTRADA: un caracter y un número

	SALIDA: Nada

	POSTCONDICIONES: Ninguna
	
	CABECERA: void numeroYCaracter (char caracter, int numero)
	
		
 */

import java.io.*;
import java.util.*;

public class InterfazA {
	//Hay que declarar el subprograma antes del main
	
	public static void numeroYCaracter (char caracter, int numero)
		
	{
		//RESGUARDO
		//System.out.print("Llamada al subprograma");
	
		
		//CONDUCTOR
		int contador = 0;
		for (contador = 1 ; contador <= numero ; contador++){
		
		System.out.println(caracter);
				
		}
		
	}
		
	//Declaración del main y llamada al subprograma
	public static void main (String args[]) {
		
		char caracter = 'a';
		int numero = 1;
		
		numeroYCaracter(caracter, numero);

		
	}
}
