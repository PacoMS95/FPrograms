/* Análisis
 * 
 * NOMBRE DEL PROGRAMA: Calculadora.java
 * 
 * Descripcion: Programa que simula una calculadora para un club de senderismo.
 * 
 * Entradas: nivel del recorrido del sendero que el usuario camina(int), duracion en minutos del mismo (int), peso del socio(double).
 * 
 * Salidas: las calorías que gasta en cada actividad el socio (float) 
 * 
 * Consideraciones: ninguna
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * INICIO
 * 		Hacer
 * 			Pedir e introducir el nombre del socio
 * 			Asignar Identificador al socio
 * 			Pedir e introducir la duracion de la actividad
 * 			Pedir e introducir el peso del socio
 * 			Pedir e introducir categoria del sendero
 * 			Hacer y mostrar cálculos
 * 			Preguntar si repetir
 * 		Mientras el usuario quiera
 * 
 * 		Hacer
 * 			Dar opcion de elegir cuántas personas han realizado una actividad
 * 		Mientras el usuario quiera
 * FIN
 * 
 * PSEUDOCODIGO DETALLADO (* indica que será gestionado por métodos separados)
 * 
 * Inicio
 * 		Hacer
 * 			Pedir nombre del socio
 * 			Asignar Identificador al socio
 * 			Pedir duración de la actividad 
 * 			Leer duracion de la actividad *
 * 			Pedir peso socio
 * 			Leer peso socio *
 * 			Pedir categoría del sendero
 * 			Leer categoría del sendero *
 * 			Sumar 1 al contador de la categoría correspondiente
 * 			Hacer cálculos *
 * 			Mostrar resultado
 * 			Preguntar si repetir
 * 		Mientras el usuario quiera seguir introduciendo socios
 *
 * 		Hacer
 * 			Pedir qué categoría mostrar
 * 			Segun categoría elegida
 * 				Caso 1
 * 					Mostrar personas que hicieron el nivel bajo
 * 				Caso 2
 * 					Mostrar personas que hicieron el nivel medio
 * 				Caso 3
 * 					Mostrar personas que hicieron el nivel alto
 * 			Fin_según
 * 			Pedir si repetir
 * 		Mientras el usuario quiera
 * 
 * fin_PP
 */

import java.io.*;
import java.util.*;

public class Calculadora {
	
	public static void main (String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	char repetir = ' ';
	Socio s = new Socio();
	String nombreApellidosSocio = " ";
	int duracionActividad = 0;
	double peso = 0.0;
	int CTE = 0;
	double resultado = 0.0;
	
	
	do{//Hacer
  			System.out.println("Introduzca el nombre del socio");//Pedir nombre del socio
  			nombreApellidosSocio = teclado.nextLine();
   			//Asignar Identificador al socio
  			//Pedir duración de la actividad 
  			//Leer duracion de la actividad *
  			//Pedir peso socio
  			//Leer peso socio *
  			//Pedir categoría del sendero
  			//Leer categoría del sendero *
  			//Sumar 1 al contador de la categoría correspondiente
  			//Hacer cálculos *
  			System.out.println("El resultado de las calorias quemadas por "+nombreApellidosSocio + "es"+ resultado);//Mostrar resultado
  			System.out.println("Desea seguir introduciendo socios?");//Preguntar si repetir
			repetir = teclado.next().charAt(0);
  		}while(repetir !='S');//Mientras el usuario quiera seguir introduciendo socios

  		//Hacer
  			//Pedir qué categoría mostrar
  			//Segun categoría elegida
  				//Caso 1
  					//Mostrar personas que hicieron el nivel bajo
  				//Caso 2
  					//Mostrar personas que hicieron el nivel medio
  				//Caso 3
  					//Mostrar personas que hicieron el nivel alto
  			//Fin_según
  			//Pedir si repetir
  		//Mientras el usuario quiera
  		
	}
}
