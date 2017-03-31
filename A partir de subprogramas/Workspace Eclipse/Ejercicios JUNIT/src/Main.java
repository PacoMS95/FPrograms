/* AUTOR: Francisco Mendoza Sánchez
 * 
 * ANÁLISIS
 * 
 * NOMBRE: Main.java
 * 
 * ENTRADAS: no hay
 * 
 * SALIDA: no hay (pinta en pantalla)
 * 
 * RESTRICCIONES: No hay
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 	Repetir
	 * 	Mostrar instrucciones
	 * 	Leer M
	 * 	Leer N
	 * 	Hacer cálculos
	 * 	Mostrar resultados
	 * 	Preguntar si repetir
	Mientras el usuario quiera
 * Fin_PP
 *  
 *  
 * */
import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float m = 0;
		float n = 0;
		char repetir = ' ';
		float ackerman = 0;
		do {
			System.out.println("Introduzca valor de m para la función de Ackerman");
			m = teclado.nextFloat();
			System.out.println("Introduzca valor de n para la función de Ackerman");
			n = teclado.nextFloat();
			ackerman = Calculo.funcionAckerman(m,n);
			
			System.out.println("Ackerman vale"+ackerman);
			
			System.out.println("¿Desea repetir? S para sí y otra tecla para salir");
			repetir = Character.toUpperCase(teclado.next().charAt(0));
		} while (repetir == 'S' );
		
		
	}
}