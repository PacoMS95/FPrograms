/* Autor: Francisco Mendoza Sánchez
 * 
 * 
 * Diseñar un algoritmo que escriba en pantalla los N primeros números naturales,
 *  sus raíces cuadradas, su potencia n-sima y el producto de todos ellos.
 *  Restricción N es un número entre 1 y 20 y n entre 2 y 5.
 * 
 * ANALISIS
 * 
 * 
 * Nombre: ej_1_bol_2.java
 * 
 * OBJETIVO: Crear un programa que sea capaz de sumar los N primeros números naturales, sus raíces cuadradas,
 * su potencia n-esima y el producto de todos ellos, siendo N un número comprendido entre 1 y 20 y n entre 2 y 5.
 * 
 * Entrada: un número entre uno y veinte y otro entre dos y cinco.
 * 
 * Salida: pinta en pantalla los N primeros números naturales, sus raíces cuadradas, su potencia n-sima y el producto de todos ellos.
 * 
 * Restricciones: N es un número entre 1 y 20 y n entre 2 y 5
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 	Mostrar instrucciones y leer y validar entrada
 * 	Mientras entrada sea S o s hacer
  		Mostrar instrucciones
  	  	leer N y n
  	  	Si N es un número entre 1 y 20 y n entre 2 y 5
			Hacer cálculos y mostrar resultados
			Leer y validar repetición
		Sino
			Mostrar mensaje de error
			Leer y validar repetición
 * 	Repetir
 * Fin
 * 
 * 
 */

import java.io.*;
import java.util.*;
import java.math.*; //esta librería es para las raíces cuadradas y potencias

public class ej_1_bol_2 {
	
	public static void main (String args[]) {
		//declaracion de variables y objetos
		int N = 0;
		int n = 0;
		char repeticion = ' ';
		int contadorNaturales = 0;
		int contadorPotencia = 0;
		int contadorMultiplicacion = 0;
		int suma = 0;
		double raizCuadrada = 0.0;
		double potenciaNEsima = 0.0;
		int multiplicacion = 1;
		Scanner teclado=new Scanner(System.in);
		

		//Mostrar instrucciones y validar entrada
		System.out.println("Desea ejecutar el programa? S o s para si y N o n para salir");
		repeticion = Character.toUpperCase(teclado.next().charAt(0));
		
		/*Bucle "repetir... mientras repetición sea S o s". Estudio:
		Se trata de un bucle controlado por suceso, concretamente uno por centinela. 
		Se inicializa por lectura anticipada, antes de la primera repetición, durante la declaración de variables, 
		y se actualiza al final del bucle.
		La condición de salida será que el usuario introduzca N o n.
		La condición de entrada será cuando introduzca S o s
		El bucle repetirá su cuerpo
		(que prácticamente será todo el programa) mientras la letra introducida sea S o s.*/
		
		while(repeticion == 'S') {

			//leer N y n
			System.out.println("Introduzca dos numeros, N y n, para que el programa escriba en pantalla los N primeros numeros naturales, sus raices cuadradas, su potencia n-sima y el producto de todos ellos");
			N=teclado.nextInt();
			n=teclado.nextInt();
			

			if ((N<=20 && N>=1) && (n>=2 && n<=5)) {
				
				//Definir contadores
				contadorPotencia = n;
				
				//Hacer cálculos y mostrar resultados
					//Sumar los N numeros naturales
					/*Estudio del bucle:
						Se trata de un bucle de tipo controlado por contador.
						El bucle permite determinar la suma de cada uno de los números entre 0 y N entre sí.
						El bucle se inicializa a cero antes de entrar en la primera iteración y 
						se actualiza cada final de iteración.
						La condición de terminación es llegar a N*/
				for (contadorNaturales = 0;contadorNaturales <= N; contadorNaturales++) {
					suma = suma + contadorNaturales;
					}
				System.out.println("La suma de los N numeros naturales es "+suma);
				
					//Calcular todas las raíces cuadradas de los N números naturales e imprimimos los resultados
					/*Estudio del bucle:
						Se trata de un bucle de tipo controlado por contador.
						El bucle permite determinar la raíz cuadrada de cada uno de los números entre 0 y N.
						El bucle se inicializa a cero antes de entrar en la primera iteración y 
						se actualiza cada final de iteración.
						La condición de terminación es llegar a N*/
				for (contadorNaturales = 0;contadorNaturales <= N; contadorNaturales++){
					
					//calculamos e imprimimos la raíz cuadrada de cada número
					raizCuadrada = Math.sqrt (contadorNaturales);
					System.out.println("La raiz cuadrada de "+contadorNaturales+" es "+raizCuadrada);
					}
				//calcular e imprimir la potencia n-esima de N
					potenciaNEsima = Math.pow(N,n);
					System.out.println("La potencia n-esima es "+potenciaNEsima);
				
				//calcular el producto de los N primeros numeros naturales
				/*Estudio del bucle:
					Se trata de un bucle de tipo controlado por contador.
					El bucle permite calcular el producto de los N primeros números naturales.
					El bucle se inicializa a cero antes de entrar en la primera iteración y 
					se actualiza cada final de iteración.
					La condición de terminación es llegar a N*/
					
				for(contadorMultiplicacion = 1;contadorMultiplicacion <= N;contadorMultiplicacion++){
					multiplicacion = multiplicacion * contadorMultiplicacion;
					}
					
				//Mostrar resultados de la multiplicación
				System.out.println("El resultado de multiplicar los numeros entres si es " +multiplicacion);
				//Leer y validar repetición
				System.out.println("Desea ejecutar el programa? S o s para si y N o n para salir");
				repeticion = Character.toUpperCase(teclado.next().charAt(0));
				
					}
				else{
						System.out.println("Error. Escriba valores correctos");
						System.out.println("Desea ejecutar el programa? S o s para si y N o n para salir");
						repeticion = Character.toUpperCase(teclado.next().charAt(0));
					}
			}
		
	}
}
