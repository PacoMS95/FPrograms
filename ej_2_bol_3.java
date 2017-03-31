/*
 * ej_2_bol_3.java
 * 
 * ANALISIS
 * 
 * Nombre del programa: ej_2_bol_3.java
 * 
 * Objetivo: Realizar un programa que lea una fecha de nacimiento de la forma día, mes, año, y dé como resultado el número de Tarot. 
	El programa verificará si la fecha es correcta.
	El número de Tarot se haya sumando los números de la fecha de nacimiento y luego reduciéndolos a un único dígito mediante la suma de los dígitos de la suma anterior.
	
 * 
 * Entrada de datos: tres números enteros, uno para el día, otro para el mes y otro para el año.
 * 
 * Salida de datos: un número entero (el número del tarot)
 * 
 * Restricciones: 
 * a) El día debe estar entre 1 y 31 para los meses 1, 3, 5, 7, 8, 10 y 12.
 * b) El día debe estar entre 1 y 30 para los meses 4, 6, 9, 11
 * c) El día debe estar entre
 * 	c.1) 1 y 28 si el año no es bisiesto
 * 	c.2) 1 y 29 si el año es bisiesto
 * 
 * Son bisiestos todos los años divisibles por 4, excluyendo los que sean divisibles por 100, pero no los que sean divisibles por 400.
 * 
 * [((año divisible por 4) Y ((año no divisible por 100) O (año divisible por 400)))]
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 	repetir
 * 		Mostrar instrucciones
 * 		Leer dia
 * 		Leer mes
 * 		Leer año
 * 		Hacer cálculos según el mes y año
 * 		Mostrar resultados
 * 		Leer y validar repetición
 * 	Mientras el usuario quiera
 * Fin
 * 
 */

import java.util.*;

public class ej_2_bol_3 {
	
	public static void main (String args[]) {
		
		int dia = 0;
		int mes = 0;
		int anio = 0;
		char respuesta = ' ';
		int intermedio = 0;
		int auxiliar = 0;
		int numeroTarot = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		/*estudio del bucle:
		 Se trata de un bucle controlado por suceso, concretamente por centinela.
		 El bucle repite su cuerpo hasta que se pulsa una tecla distinta de S o s.
		 Su inicialización ocurre por lectura anticipada, antes de la primera iteración
		 y su actualización ocurre físicamente al final del bucle, cuando se lee la variable respuesta.
		*/
		
		do{
			//mostrar instrucciones
			System.out.println("Introduzca dia, mes y anio. Pulse intro por cada uno de los datos introducidos");
			
			//leer dia
			dia = teclado.nextInt();
			
			//leer mes
			mes = teclado.nextInt();
			
			//leer anio
			anio = teclado.nextInt();
			
			//Calculamos el intermedio que nos servirá para luego
			intermedio = dia + mes + anio;
			 
			/*Módulo hacer cálculos según el mes y el año
 * 
 * Si el mes es 1, 3, 5, 7, 8, 10 ó 12 y el día está entre 1 y 31
 * 	mientras intermedio sea mayor a 0
 * 		calcular numeroTarot
 * 	fin mientras
 * Sino
 *		Si el mes es 4, 6, 9 u 11 y el día está entre 1 y 30
		  	mientras intermedio sea mayor a 0
		  		calcular numeroTarot
		 	fin mientras
		Sino
			Si el mes es 2, el año es bisiesto y el día está entre 1 y 29
				mientras intermedio sea mayor a 0
					calcular numeroTarot
				fin mientras
			Sino
				Si el mes es 2, el año no es bisiesto y el día está entre 1 y 28
					mientras intermedio sea mayor a 0
						calcular numeroTarot
					fin mientras
				Sino
					Mostrar mensaje de error
				Fin_si
			Fin_si
		Fin_si
	Fin_si
*/
			if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia > 0 && dia < 32)) {
				while(intermedio>0){
					//calcular número del tarot
					numeroTarot += intermedio % 10;
					intermedio = intermedio /10;
					}
					//Mostrar resultados
					System.out.println ("El numero del tarot es "+numeroTarot);
			}else{
				if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia > 0 && dia < 31)){
				while(intermedio>0){
					//calcular número del tarot
					numeroTarot += intermedio % 10;
					intermedio = intermedio /10;
					}
					//Mostrar resultados
					System.out.println ("El numero del tarot es "+numeroTarot);
				}else{
					if ((mes == 2) && ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) && (dia < 30 && dia > 0)){
						while(intermedio>0){
						//calcular número del tarot
						numeroTarot += intermedio % 10;
						intermedio = intermedio /10;
						}
						//Mostrar resultados
						System.out.println ("El numero del tarot es "+numeroTarot);
					}else{
						if ((mes == 2) && (dia < 29 && dia > 0)){
							while(intermedio>0){
							//calcular número del tarot
							numeroTarot += intermedio % 10;
							intermedio = intermedio /10;
							}
							//Mostrar resultados
							System.out.println ("El numero del tarot es "+numeroTarot);
						}else{
							System.out.println("Becerro, esa no es una fecha valida");
						}
					}
				}
			}
			
			
			//Leer y validar repetición
			System.out.println("Desea repetir? Introduzca S o s para repetir y otro caracter para salir");
			respuesta = Character.toUpperCase(teclado.next().charAt(0));
			
		} while(respuesta == 'S'); //fin del bucle
	}
}
