/* Autor: Francisco Mendoza Sánchez
 * 
 * Nombre: ej_2_bol_2.java
 * 
 * ANALISIS
 * 
 * Objetivo: Hallar el menor, el mayor y la media de n números positivos leídos de teclado.
 * 
 * Entrada de datos: un número arbitrario de números positivos reales.
 * 
 * Salida de datos: un mensaje en pantalla que diga cuál es el menor de los números introducidos, el mayor y la media de dichos números introducidos por teclado.
 * 
 * Restricciones: solo se admmitiran números reales positivos, de lo contrario, controlar la entrada.
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 	Mostrar instrucciones
 * 	mientras el usuario quiera hacer
 * 		Leer numero
 * 		Si numero es real y positivo
	  		aumentar contador de numeros, aumentar el sumatorio y comparar números
	  		Validar salida
	  		Mostrar instrucciones
	  	Sino
			Mostrar mensaje de error
			Validar salida
			Mostrar instrucciones
 * 	fin mientras
 *	Calcular media
 * 	Mostrar resultados
 */

import java.util.*;


public class ej_2_bol_2 {
	
	public static void main (String args[]) {
		//declaramos variables y objetos
		char salida = ' ';
		double numero = 0.1; //tuve que inicializar a 0.1 porque si no me daría error
		double auxiliar = 0.0;
		double mayor = 0.0;
		double menor = 0.0;
		double media = 0.0;
		double suma = 0.0;
		int contadorDeNumeros = 0;
		Scanner teclado=new Scanner(System.in);
		
		//Mostrar instrucciones
		System.out.println("Introduzca un numero real. Positivos plis. Y no, cero no es positivo.");
		
		//mientras el usuario quiera hacer
		while (salida != 'S'){
			//leer numero
			numero = teclado.nextDouble();
			//Si numero es real y positivo
			if (numero > 0.0) {
				//Aumentar el contador de numeros
				contadorDeNumeros++;
				//Sumar numeros
				suma = numero + suma;
				//Comparar numeros
				if (numero > auxiliar){
					mayor = numero;
					auxiliar = numero;
					}
				else {
					menor = numero;
					auxiliar = numero;
					}
				//Validar salida
				System.out.println("Desea salir? S para salir y otra tecla para seguir con la orgia numeril");
				salida = Character.toUpperCase(teclado.next().charAt(0));
				//Mostrar instrucciones
				System.out.println("Introduzca un numero real. Positivos plis. Y no, cero no es positivo.");
			}
			//Si no
			else{
				//Mostrar mensaje de error
				System.out.println("Pero que has hecho becerro? Introduzca un numero real. Positivos plis. Y no, cero no es positivo.");
				//Validar salida
				System.out.println("Desea salir? S para salir y otra tecla para seguir con la orgia numeril");
				salida = Character.toUpperCase(teclado.next().charAt(0));
				//Mostrar instrucciones
				System.out.println("Introduzca un numero real. Positivos plis. Y no, cero no es positivo.");
			}//Fin si-sino
		}//fin mientras
		//calcular media
		media = suma/contadorDeNumeros;
		//Mostrar resultados
		System.out.println("El mayor es "+mayor);
		System.out.println("El menor es "+menor);
		System.out.println("La media es "+media);
	}
}
