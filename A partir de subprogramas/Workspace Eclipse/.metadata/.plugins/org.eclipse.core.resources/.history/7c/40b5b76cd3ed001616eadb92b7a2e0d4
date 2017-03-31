/*
 * Nombre del programa: ordenadaYAbscisa.java
 * Autor: Francisco Mendoza Sánchez
 * 
 * ANALISIS:
 * 
 * Objetivo: Dada la función y = 1/4 x diseñar un programa que para cada valor de abscisa leído por teclado dé el correspondiente a la ordenada
 * 
 * Entrada: un número real
 * 
 * Salida: Un número real
 * 
 * Restricciones: Ninguna
 * 
 * Suposiciones: los datos de entrada son correctos
 *  
 * PSEUDOCÓDIGO DETALLADO
 * 
 * Inicio
 * 		Hacer
			Mostrar instrucciones
			Leer abscisa
	 		Calcular ordenada
	 		Mostrar ordenada
	 		Preguntar si repetir
		Mientras respuesta sea afirmativa
 * Fin_PP
 */
 
import java.io.*;
import java.util.*;


public class ordenadaYAbscisa {
	
	public static void main (String args[]) {
		//Preparamos el entorno
		Scanner teclado = new Scanner(System.in);
		double ordenada = 0.0;
		double abscisa = 0.0;
		char respuesta = ' ';
		
		do {
		//Mostrar instrucciones
		System.out.println("Introduzca una abscisa y yo le mostrare una ordenada para la funcion y = 1/4 x");
		
		//Leer abscisa
		abscisa = teclado.nextDouble();
		
		//Calcular ordenada
		ordenada = 1.0/4 * abscisa;
		
		//Mostrar ordenada
		System.out.println("La ordenada es "+ordenada);
		
		//Preguntar si repetir
		System.out.println("Quiere continuar? S para si y N para no");
		//aquí me equivoqué y puse teclado.charAt(0);
		respuesta = Character.toUpperCase(teclado.next().charAt(0)); //Esto significa que el siguiente carácter que cojamos será convertido a Uppercase
		
		}while (respuesta == 'S');
	}
}
