/*Autor: Francisco Mendoza Sánchez
 * 
 * Nombre: buenas.java 
 * 
 * Objetivo: Dada una hora, mostrar un mensaje que dependa de la última.
 * 
 * Entrada de datos: Un número entero
 * 
 * Salida de datos: Mensaje en pantalla.
 * 
 * Restricciones: Los números introducidos son números enteros.
 * 
 * Suposiciones: Los datos introducidos son los correctos.
 * 
 * 
 * 
 * 
 * PSEUDOCÓDIGO GENERAL
 * 
 * Inicio
 * 		Mostrar instrucciones
 * 		Leer dato
 * 		Calcular saludo y género
 * 		Mostrar saludo
 * Fin_PP
 * 
 * 
 * ENTORNO
 * 
 * 	Variables
 * 		Entero: hora
 * 		Cadena: saludo
 * 		Carácter: genero
 * 	
 * 
 * PSEUDOCÓDIGO DETALLADO
 * 
 * Inicio
 * 		//Mostrar instrucciones
 * 		Mostrar "Introduzca una hora como un número entero comprendido entre 0000 y 2359"
 * 		
 * 		//Leer dato
 * 		Pedir hora
 * 
 * 		//Calcular saludo y genero
 * 		Si ((hora >= 730 y hora <= 759) o (hora >= 800 y hora <= 859) o (hora >= 900 y hora <= 959) o (hora >=1000 y hora <= 1059) o (hora >= 1100 y hora <= 1159) o (hora >= 1200 y hora <= 1259) o (hora >= 1300 y hora <= 1359) o (hora == 1400))
 * 			saludo = "dias"
 * 			genero = 'o'
 * 		Sino
 * 			Si ((hora >= 1401 y hora <= 1459) o (hora >= 1500 y hora <= 1559) o (hora >= 1600 y hora <= 1659) o (hora >= 1700 y hora <= 1759) o (hora >=1800 y hora <= 1859) o (hora >= 1900 y hora <= 1959) o (hora >= 2000 y hora <= 2030))
 * 				saludo = "tardes"
 * 				genero = 'a'
 * 			Sino
 * 				Si ((hora >= 2031 y hora <= 2059) o (hora >= 2100 y hora <= 2159) o (hora <= 2200 y hora >= 2259) o (hora <= 2300 y hora >= 2359) o (hora <= 0 y hora >= 0059) o (hora <= 100 y hora >= 159) o (hora <= 200 y hora >= 259) o  (hora <= 300 y hora >= 359) o  (hora <= 400 y hora >= 459) o (hora <= 500 y hora >= 559) o (hora <= 600 y hora >= 659) o (hora <= 700 y hora >= 729))
 * 					saludo = "noches"
 * 					genero = 'a'
 * 				Sino
 * 					Mostrar "Eso no es una hora. El programa se terminará"
 * 				Fin_si
 * 			Fin_si
 * 		Fin_si
 * 
 * 		//Mostrar saludo
 * 		Si ((hora >= 730 y hora <= 759) o (hora >= 800 y hora <= 859) o (hora >= 900 y hora <= 959) o (hora >=1000 y hora <= 1059) o (hora >= 1100 y hora <= 1159) o (hora >= 1200 y hora <= 1259) o (hora >= 1300 y hora <= 1359) o (hora == 1400))
 * 			Mostrar "Buen",genero,"s ",saludo
 * 		Sino
 * 			Si ((hora >= 1401 y hora <= 1459) o (hora >= 1500 y hora <= 1559) o (hora >= 1600 y hora <= 1659) o (hora >= 1700 y hora <= 1759) o (hora >=1800 y hora <= 1859) o (hora >= 1900 y hora <= 1959) o (hora >= 2000 y hora <= 2030))
 * 				Mostrar "Buen",genero,"s ",saludo
 * 			Sino
 * 				Si  ((hora >= 2031 y hora <= 2059) o (hora >= 2100 y hora <= 2159) o (hora <= 2200 y hora >= 2259) o (hora <= 2300 y hora >= 2359) o  (hora <= 0000 y hora >= 0059) o  (hora <= 100 y hora >= 159) o  (hora <= 200 y hora >= 259) o  (hora <= 300 y hora >= 359) o  (hora <= 400 y hora >= 459) o (hora <= 500 y hora >= 559) o (hora <= 600 y hora >= 659) o (hora <= 700 y hora >= 729))
 * 					Mostrar "Buen",genero,"s ",saludo
 * 				Fin_si
 * 			Fin_si
 * 		Fin_si
 * 
 * 	Fin_PP
 * 
 */

import java.io.*;
import java.lang.*;
import java.util.*;

public class buenasVersionMal {
	
	public static void main (String args[]) {
		
		//Declaramos las variables y la clase teclado
		int hora = 0;
		String saludo = " ";
		char genero = ' ';
		
		Scanner teclado = new Scanner(System.in);
		
		//Mostramos instrucciones
		System.out.println("Introduzca una hora como un numero entero comprendido entre 0000 y 2359");
		
		//Pedimos la hora
		hora = teclado.nextInt();
		
		//Calcular saludo y genero
		if ((hora >= 730 && hora <= 759) || (hora >= 800 && hora <= 859) || (hora >= 900 && hora <= 959) || (hora >=1000 && hora <= 1059) || (hora >= 1100 && hora <= 1159) || (hora >= 1200 && hora <= 1259) || (hora >= 1300 && hora <= 1359) || (hora == 1400)){
				saludo = "dias";
				genero = 'o';
		}
		else {
			if ((hora >= 1401 && hora <= 1459) || (hora >= 1500 && hora <= 1559) || (hora >= 1600 && hora <= 1659) || (hora >= 1700 && hora <= 1759) || (hora >=1800 && hora <= 1859) || (hora >= 1900 && hora <= 1959) || (hora >= 2000 && hora <= 2030)) {
					saludo = "tardes";
					genero = 'a';
				}
			else {
				if ((hora >= 2031 && hora <= 2059) || (hora >= 2100 && hora <= 2159) || (hora <= 2200 && hora >= 2259) || (hora <= 2300 && hora >= 2359) || (hora <= 0 && hora >= 59) || (hora <= 100 && hora >= 159) || (hora <= 200 && hora >= 259) || (hora <= 300 && hora >= 359) || (hora <= 400 && hora >= 459) || (hora <= 500 && hora >= 559) || (hora <= 600 && hora >= 659) || (hora <= 700 && hora >= 729)) {
						saludo = "noches";
						genero = 'a';
					}
				else {
					System.out.println("Eso no es una hora. El programa terminara");
					}
						
				}
			}
			
		//Mostrar saludo
		if ((hora >= 730 && hora <= 759) || (hora >= 800 && hora <= 859) || (hora >= 900 && hora <= 959) || (hora >=1000 && hora <= 1059) || (hora >= 1100 && hora <= 1159) || (hora >= 1200 && hora <= 1259) || (hora >= 1300 && hora <= 1359) || (hora == 1400)){
				System.out.println("Buen"+genero+"s "+saludo);
		}
		else {
			if ((hora >= 1401 && hora <= 1459) || (hora >= 1500 && hora <= 1559) || (hora >= 1600 && hora <= 1659) || (hora >= 1700 && hora <= 1759) || (hora >=1800 && hora <= 1859) || (hora >= 1900 && hora <= 1959) || (hora >= 2000 && hora <= 2030)) {
					System.out.println("Buen"+genero+"s "+saludo);
				}
			else {
				if ((hora >= 2031 && hora <= 2059) || (hora >= 2100 && hora <= 2159) || (hora <= 2200 && hora >= 2259) || (hora <= 2300 && hora >= 2359) || (hora <= 0 && hora >= 59) || (hora <= 100 && hora >= 159) || (hora <= 200 && hora >= 259) || (hora <= 300 && hora >= 359) || (hora <= 400 && hora >= 459) || (hora <= 500 && hora >= 559) || (hora <= 600 && hora >= 659) || (hora <= 700 && hora >= 729)) {
						System.out.println("Buen"+genero+"s "+saludo);
					}
				}
			}
	}
}

