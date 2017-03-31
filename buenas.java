/*Autor: Francisco Mendoza Sánchez
 * 
 * Nombre: buenas.java 
 * 
 * Objetivo: Dada una hora, mostrar un mensaje que dependa de la última según el enunciado
 * 
 * Entrada de datos: Un número entero
 * 
 * Salida de datos: Mensaje en pantalla.
 * 
 * Restricciones: Los números introducidos son números enteros.
 * 
 * Suposiciones: Los datos introducidos son los correctos. 
 * 
 * PSEUDOCÓDIGO GENERAL (MAL HECHO, LAS CONDICIONES SE PONEN EN LENGUAJE NATURAL Y NO SE ESPECIFICAN VARIABLES)
 * 
 * Inicio
 * 		MostrarInstrucciones
 * 		LeerHora
 * 		LeerMinuto
 * 		Si (hora == 20 y min >= 31 y min <= 59) o (hora >= 21 y hora <= 23 y hora >=0 y hora <= 7 y min <= 59 y min >= 0) o (hora == 7 y min <= 29 y minuto >= 0)
 * 			Mostrar buenas noches
 * 		Sino
	 		Si (hora == 14 y min >= 1 min <= 59) o (hora >= 15 y min < 20 y min >= 0 y min <= 59) o (hora == 20 y min >= 0 y min <= 30)
	  			Mostrar buenas tardes
 * 			Sino
 * 				Mostrar buenos días
 * 			Fin_si
 * 		Fin_si 		
 * Fin_PP
 * 
 *   PSEUDOCÓDIGO GENERAL (con bucle)
 * 
 * Inicio
 * 		Leer y validar entrada
 * 		Mientras se desee ejecutar
	  		MostrarInstrucciones
	  		LeerHora
	  		LeerMinuto
	  		Si hora está entre 7:30 y 14:00
	  			Mostrar buenos días
	  		Sino
				Si hora está entre 14:01 y 20:30
					Mostrar buenas tardes
	  			Sino
					Si hora está entre 20:31 y 7:29
						Mostrar buenas noches
					Sino
						Mostrar error
					Fin_si
	  			Fin_si
	  		Fin_si 		
	  		Leer y validar entrada
	  	fin_mientras
 * Fin_PP
 * 
 */
 
import java.io.*;
import java.util.*;

public class buenas {
	
	public static void main (String args[]) {
		
		//Aquí declaramos las variables y el objeto teclado
		int hora = 0;
		int min = 0;
		char respuesta = ' ';
		Scanner teclado = new Scanner(System.in);
		
		//leer y validar entrada
		System.out.println("Desea ejecutar? s o S para si, otra para salir");
		respuesta = Character.toUpperCase(teclado.next().charAt(0));
		
		//mientras respuesta sea positiva
		while (respuesta == 'S') {
			
			//Mostrar instrucciones
			System.out.println ("Introduzca hora y luego minutos");
			
			//Leer hora
			hora = teclado.nextInt();
			
			//Leer minuto
			min = teclado. nextInt();
			
			//Mostramos saludo según hora y minuto
			if ((hora == 7 && min >= 31 && min <= 59) || (hora >= 8 && hora <= 13 && min >= 0 && min <= 59) || (hora == 14 && min == 0)) {
				System.out.println ("Buenos dias");
			}else{
				if ((hora == 14 && min >= 1 && min <= 59) || (hora >= 15 && hora <= 19 && min >= 0 && min <= 59) || (hora == 20 && min >= 0 && min <= 30)){
					System.out.println("Buenas tardes");
				}else {
					if((hora == 20 && min >= 31 && min <= 59) || (hora >= 21 && hora <= 23 && min >= 0 && min <= 59) || (hora >= 0 && hora <= 6 && min >= 0 && min <= 59) || (hora == 7 && min >= 0 && min <= 29)) {
					System.out.println("Buenas noches");	
						}
						else {
							System.out.println("Error. Eso no es una hora");
							}
						}
					}
			//leer y validar entrada
			System.out.println("Desea ejecutar? s o S para si, otra para salir");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
		}
	}
}

