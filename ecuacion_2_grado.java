/* Autor: Francisco Mendoza Sánchez
 * 
 * Nombre: ecuacion_2_grado
 * 
 * Objetivo: Desarrollar un algoritmo que resuelva una ecuación de segundo grado
 * 
 * Entrada: tres números reales
 * 
 * Salida: un número real
 * 
 * Restricciones: Si delta es menor que cero, la ecuación no tiene solución real
 * 
 * Suponemos: que los datos de entrada son correctos
 * 
 * 
 * 
 * 
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 		Mostrar instrucciones
 * 
 * 		Pedir datos
 * 
 * 		Definir delta
 * 
 * 
 * 
 * 		Si delta menor que cero
 * 			Calcular los dos resultados
 * 		Sino
 * 			Si delta vale cero
 * 				Calcular un resultado
 * 			Sino
 * 				Mostrar mensaje de error
 * 			Fin_si
 * 		Fin_si
 * 
 * 
 * 
 * 		Si delta menor que cero
 * 			Mostrar los dos resultados
 * 		Sino
 * 			Si delta vale cero
 * 				Mostrar un resultado
 * 			Fin_si
 * 		Fin_si
 * Fin_PP
 * 
 * 
 * 
 * ENTORNO
 * Variables
 * 	Real: resultado1, resultado2, resultado3, a, b, c, delta
 * 
 * 
 * 
 * 
 * PSEUDOCÓDIGO DETALLADO
 *
 * Inicio
 * 		//Mostrar instrucciones
 * 		Mostrar "Introduzca los valores de a, b y c en su ec. de 2º Grado"
 * 
 * 		//Pedir datos
 * 		Pedir a
 * 		Pedir b
 * 		Pedir c
 * 
 * 		//Definir delta
 * 		delta = (b*b) - (4*a*c)
 * 
 * 		//Hacer cálculos
 * 		Si (delta > 0)
 * 			resultado1 = ((-1*b) + delta)/(2*a)
 * 			resultado2 = ((-1*b) - delta)/(2*a)
 * 		Sino
 * 			Si (delta = 0)
 * 				resultado3 = (-1*b)/(2*a)
 * 			Sino
 * 				Mostrar "Su ecuación no tiene solución real"
 * 			Fin_si
 * 		Fin_si
 * 
 * 		//Mostrar datos
 * 		Si (delta > 0)
 * 			Mostrar "Los resultados son " resultado1, resultado2
 * 		Sino
 * 			Si (delta = 0)
 * 				Mostrar "El único resultado es ", resultado3
 * 			Fin_si
 * 		Fin_si
 * 	Fin_PP
 * 
 */

import java.io.*;
import java.util.*;

public class ecuacion_2_grado {
	
	public static void main (String args[]) {
		
		//Declaramos las variables
		double resultado1 = 0;
		double resultado2 = 0;
		double resultado3 = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double delta = 0;
		
		//Declaramos el objeto teclado de la clase Scanner
		Scanner teclado = new Scanner (System.in);
		
		//Mostrar instrucciones
		System.out.println("Introduzca los valores de a, b y c en su ec. de segundo grado");
		
		//Pedimos los datos
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();
		
		//Definir delta
		delta = ((b*b)-(4*a*c));
		
		//Hacer cálculos
		if (delta > 0) {
			resultado1 = (((-1)*b) + delta)/(2*a);
			resultado2 = (((-1)*b) - delta)/(2*a);
			}	
		else {
			if (delta ==0){
				resultado3 = ((-1)*b)/(2*a);
			}else{
				System.out.println("Su ecuacion no tiene solucion real");
			}
		}
		//Mostrar datos
		if (delta > 0) {
			System.out.println("Los resultados son " +resultado1+", "+resultado2);
		}else{
			if (delta == 0) {
				System.out.println("El unico resultado es " +resultado3);
			}
		}
	}
}

