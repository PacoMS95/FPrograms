/*
 * yoDogHeardYouLikeCoding.java
 * 
 * Autor: Francisco Mendoza Sánchez
 * 
 * NO ME RESPONSABILIZO DEL MAL USO DE ESTE PROGRAMA.
 * 
 * Objetivo: Crear un programa que nos guíe en el proceso de crear bucles y su estudio, y que además nos muestre la sintaxis básica de todas
 * las estructuras de control que entran en el primer examen de programación. También muestra la sintaxis que hay que aprender de memoria para el examen.
 * Habrá menús y se podrá elegir entre ellos.
 *  
 * Entrada de datos: Números enteros para las opciones del menú, además de texto para generar el estudio del bucle automáticamente.
 * 
 * Salida de datos: Según opción, imprimirá en pantalla la estructura de control que seleccionemos o nos mostrará el estudio del bucle.
 * 
 * Restricciones: Las opciones del menú serán las que se imprimen. 
 * 
 * ESTUDIOS DE BUCLE:
 * 
 * (1) CONTROL: 
 * FUNCIÓN:
 * VCB
 * 	INICIALIZACIÓN:
 * 	ACTUALIZACIÓN:
 * CONDICIÓN DE SALIDA:
 * 
 * 
 * PSEUDOCÓDIGO GENERALIZADO DE PRIMER NIVEL
 * Inicio
 * 	Repetir (1)
 * 		Repetir (2)
	 * 		Mostrar saludo y menú principal
	 * 		Leer opcion
	 * 	Mientras opcion sea menor que 1 o mayor que 4
	 * 		Segun opcion
	 * 
	 * 			caso == 1
	 * 				Mostrar menú de estructuras de control en pseudocódigo y en Java
	 * 				Segun opcion
	 * 
	 * 					caso == 1
	 *	 					Mostrar menú estructuras alternativas //aquí se incluye un breve comentario sobre cada una, para saber cuando se usa una u otra
	 * 					Segun opcion
	 * 						caso == 1
	 * 							Mostrar estructura Si simple
	 * 						caso == 2
	 * 							Mostrar estructura Si Anidada
	 * 						caso == 3
	 * 							Mostrar estructura Si - Sino - Si
	 * 					Fin_según
	 * 
	 * 					caso == 2
	 * 						Mostrar menú estructuras repetitivas  //aquí se incluye un breve comentario sobre cada una, para saber cuando se usa una u otra
	 * 						Según opcion
	 * 
	 * 							caso == 1
	 * 								Mostrar estructura Mientras
	 * 							caso == 2
	 * 								Mostrar estructura Mientras anidada
	 * 							caso == 3
	 * 								Mostrar estructura Repetir ... mientras
	 * 							caso == 4
	 * 								Mostrar estructura Repetir ... hasta
	 * 							caso == 5
	 * 								Mostrar estructura Para
	 * 						Fin_segun
	 * 
	 * 					caso == 3
	 * 						Mostrar estructura según
	 * 					Fin_segun
	 * 
	 * 				caso == 2
	 * 					Mostrar criterios de utilización de bucles
	 * 
	 * 				caso == 3
	 * 
	 * 				Preguntar por el objetivo del bucle
	 * 				Leer objetivo del bucle
	 * 
	 * 				Mostrar tipos de bucle existentes con una breve descripción
	 * 				Preguntar por tipo de bucle
	 * 				Leer tipo de bucle
	 * 				
	 * 
	 * 				Definir VCB
	 * 				Preguntar por VCB
	 * 				Leer VCB
	 * 				
	 * 				Preguntar por condición de terminación del bucle
	 * 				Leer condición de terminación del bucle.
	 * 			
	 * 				Mostrar menú tipos de bucle
	 * 				Según opcion
	 * 					caso = 1
	 * 						Mostrar estudio de bucle completo para Bucle controlado por contador
	 * 					caso = 2
	 * 						Mostrar estudio de bucle completo para Bucle controlado por centinela
	 * 					caso = 3
	 * 						Mostrar estudio de bucle completo para bucle controlado por indicador
	 * 				Fin_según
	 * 				
	 * 				caso == 4
	  // 				Mostrar elegir opción
	  * 				Según opción
						//caso == 1
							//Mostrar clase Scanner + utilización
						//caso == 2
							//Mostrar clase Random + utilización
						Fin_según
	 * 		Preguntar si repetir
	 * 
	 * 	Mientras el usuario quiera
	 * 
 * FinPP
 * */

import java.io.*;
import java.util.*;

public class yoDogHeardYouLikeCoding {
	
	public static void main (String args[]) {
		
		//declaración de variables y objetos
		Scanner teclado = new Scanner (System.in);
		char respuestaRepeticion = ' ';
		int opcionMenuPrincipal = 0;
		int opcionMenuEstructurasControl = 0;
		int tipoDeBucle = 0;
		int subtipoDeBucle = 0;
		int tipoDePalabreja = 0;
		int tipoDeSi = 0;
		String objetivoDelBucle = " " ;
		String entradaDelBucle = " ";
		String VCB = " ";
		String descripcionVCB = " ";
		
				
		do {//repetir
			
			do {//repetir
			//Mostrar saludo y menú principal
			System.out.println("");
			System.out.println("Bienvenido a la chuleta para el primer examen de programacion. Elija que desea ver");
			System.out.println("1.- Estructuras de control en pseudocodigo y Java");
			System.out.println("2.- Criterios de utilizacion de bucles");
			System.out.println("3.- Plantilla para estudio de bucle");
			System.out.println("4.- Palabrejas para aprender de memoria (clase Scanner y Random)");
			opcionMenuPrincipal = teclado.nextInt();//			Leer opcion
			} while (opcionMenuPrincipal <1 || opcionMenuPrincipal > 4); //mientras opcionMenuPrincipal sea menor que uno o mayor que 4
			
			switch (opcionMenuPrincipal)
			{
				case 1:
				do{
				System.out.println("");
				System.out.println("Elija las estructuras de control que desee mostrar");
				System.out.println("1.- Estructuras de control alternativas");
				System.out.println("2.- Estructuras de control repetitivas");
				System.out.println("3.- Estructura segun");
				opcionMenuEstructurasControl = teclado.nextInt();
				}while (opcionMenuEstructurasControl > 3 || opcionMenuEstructurasControl < 1);
				
				switch (opcionMenuEstructurasControl) {
					
					case 1:
					do {
					System.out.println("");
					System.out.println("Elija la más adecuada y le mostrare el pseudocodigo y el codigo generico en Java, asi como para que se utiliza");
					System.out.println("1.- Si simple");
					System.out.println("2.- Si sino si");
					System.out.println("3.- Si anidado");
					tipoDeSi = teclado.nextInt();
					System.out.println("");
					}while(tipoDeSi < 1 || tipoDeSi > 3);
					break;
					
					case 2:
					System.out.println("En construccion");
					break;
					
					case 3:
					System.out.println("En construccion");
					break;
					
					}
				
				break;
				
				case 2:
				System.out.println("");
				System.out.println("CRITERIOS DE UTILIZACION DE BUCLES:");
				System.out.println("Si es controlado por contador, usar PARA");
				System.out.println("Si es controlado por contador y suceso usar PARA o MIENTRAS. Si el numero de iteraciones es grande, usar PARA");
				System.out.println("Si es controlado por suceso y debe realizarse al menos una vez, usar REPETIR");
				System.out.println("Si es controlado por suceso y no se sabe nada sobre la primera iteracion, usar MIENTRAS");
				System.out.println("Si es apropiado MIENTRAS o REPETIR, usar el que mejor refleje el contexto");
				System.out.println("Siempre que exista duda, usar MIENTRAS");
				break;
				
				case 3:
				System.out.println("");
				System.out.println("PLANTILLA PARA ESTUDIO DE BUCLE");
				System.out.println("Cual es el proposito de su bucle? O lo que es lo mismo, que hace el bucle?");
				teclado.nextLine();
				objetivoDelBucle = teclado.nextLine();
				
				System.out.println("");
				System.out.println("Cual es la condicion de entrada de su bucle?");
				entradaDelBucle = teclado.nextLine();
				
				System.out.println("");
				System.out.println("Cual es la VCB (variable de control del bucle)? La VCB es el objeto que pertenece a una expresion/orden que controla la condicion de repeticion del bucle");
				descripcionVCB = teclado.nextLine();

				do{
				System.out.println("");
				System.out.println("Va a alegir uno de estos tipos de bucles. Escoja el que mas se adecue a sus necesidades");
				System.out.println("1.- Controlado por contador (se ejecuta un numero de veces sabido de antemano)");
				System.out.println("2.- Controlado por suceso (se ejecuta un numero de veces NO sabido de antemano)");
				tipoDeBucle = teclado.nextInt();
				
				} while (tipoDeBucle < 1 || tipoDeBucle > 3);
				
				if (tipoDeBucle == 2) {
					do{
					System.out.println("");
					System.out.println("Ahora va a elegir uno de estos subtipos de bucle controlado por suceso");
					System.out.println("1.- Controlado por centinela (Hay un valor de la VCB que provoca la salida del bucle, puesto que no es valido para la entrada de datos a procesar)");
					System.out.println("2.- Controlado por indicador (variable booleana) (El cuerpo del bucle registra si se ha producido o no el suceso que controla el proceso de repeticion del bucle)");
					subtipoDeBucle = teclado.nextInt();
					}while(subtipoDeBucle < 1 || subtipoDeBucle > 2);
					
					if(subtipoDeBucle == 1){
						VCB = "Inicializacion por lectura anticipada, antes de la primera iteracion y actualizacion por lectura final, fisicamente al final de bucle";
						}else{
							VCB = "Inicializacion a verdadero o falso, antes de la primera iteracion, y actualizacion a modo de cambio de estado cuando ocurra el proceso evaluado";
							}
				}else{
					VCB = "Inicializacion antes de la primera iteracion y actualizacion al final de cada iteracion.";
					}
				
				
				
				System.out.println("");
				System.out.println("A continuacion se imprime el analisis de su bucle");
				System.out.println("");
				System.out.println("");
				System.out.println("OBJETIVO DEL BUCLE: "+objetivoDelBucle);
				System.out.println("TIPO DE BUCLE: controlado por contador");
				System.out.println("VARIABLE DE CONTROL DEL BUCLE: Consiste en "+descripcionVCB+ " Y su inicializacion/actualizacion tiene el formato: "+VCB);
				System.out.println("CONDICION DE ENTRADA"+entradaDelBucle);
				System.out.println("CONDICION DE SALIDA: la complementaria a la entrada");
				
				break;
				
				case 4:
				
				do {
				System.out.println("");
				System.out.println("COSAS QUE HAY QUE APRENDER DE MEMORIA (ELIJA)");
				System.out.println("1.- Clase Scanner");
				System.out.println("2.- Clase Random");
				tipoDePalabreja = teclado.nextInt();
				} while(tipoDePalabreja < 1 || tipoDePalabreja > 2);
				if (tipoDePalabreja == 1){
					System.out.println("");
					System.out.println("Lo puedes ver en el codigo fuente de este programa");
				}else{
					System.out.println("");
					System.out.println("Random aleatorio = new Random();");
					System.out.println("int numero = aleatorio.nextInt(rango) + min");
					System.out.println("");
					System.out.println("Para rango max - min + 1");
					}
				break;
			}
			System.out.println("");
			System.out.println("Desea repetir? S para si y otra tecla para salir");
			respuestaRepeticion = Character.toUpperCase(teclado.next().charAt(0));
			
		}while (respuestaRepeticion == 'S'); //mientras la respuesta sea S
		
		
	}
}
//MODIFICA EL PSEUDOCÓDIGO!!!

