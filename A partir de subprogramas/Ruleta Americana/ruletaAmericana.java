/* ENUNCIADO: Programa que simula el clásico juego de casino de la ruleta americana. Debes de
 * 
 * 
1º Seguir la metodología que se sigue en clase (véase en tema 5 la metodología que hay que seguir)
2º Manejar excepciones si surgiesen en un programa a parte
3º Crear una clase de utilidades separada con métodos que vayan a ser usados tanto en este programa como en otro
4º Seguir las directrices de la POO, es decir, primero hacer los objetos que convengan y luego implementarlos en el PP
* 
* 
* http://ruletagratis.pe/reglas-de-la-ruleta/ <-- REGLAS DEL JUEGO
* 
 */

/*
 * ANALISIS
 * 
 * Proceso que se ejecuta: el programa simula el juego de la ruleta americana con apuestas interactivas
 * Entrada: el jugador puede apostar la cantidad que quiera mientras no sea mayor que el dinero que tiene en su cartera virtual. Se podrá
 * 			elegir a qué casillas se quiere apostar siendo estas: 
 * 			En apuestas sencillas: apostar del número 1-18 o del 19-36, par o impar, o color (rojo o negro). Si se gana, el casino pagará en proporcion 1:1
 * 			En apuestas mútiples: se puede apostar desde 1 sólo número hasta 24, siendo las posibilidades
 * 				1) a pleno: se juega un sólo número de los 36 posibles, se paga 35 a 1.
 * 				2) A 2 números: se paga 17 a 1
 * 				3) A 3 números: se paga 11 a 1
 * 				4) A 4 números: se paga 8 a 1
 * 				5) A 6 números: se paga 5 a 1
 * 				6) A 12 números: se puede jugar a columna o a docena. Aquí se paga 2 a 1.
 * 				7) A 24 números: se puede hacer combinado de dos docenas o dos columnas. El pago es 1/2 a 1.
 * 
 * Salida: la ruleta calculará por medio aleatorio la casilla ganadora y dará o sustraerá al usuario la cantidad que le corresponda
 * 
 * Pseudocódigo generalizado:
 * 
 * INICIO
	  	Hacer
			Mostrar menú de apuestas y validar opción
			Definir casilla ganadora aleatoriamente
			Actualizar monedero *
			Preguntar si repetir
	  	Mientras el usuario lo desee
	  	Mostrar despedida
 * FIN
  (*) Se convertirá en Subprograma
 * 
 * 
 * PSEUDOCÓDIGO DETALLADO
 * INICIO
 * 		Hacer
 * 			Repetir
 * 				Mostrar menú apuestas (sencillas, múltiples o salir)
 * 				Leer Opcion del menú
 * 			Mientras la opción elegida no esté entre las disponibles
 * 
 * 			Si se eligió las apuestas sencillas
 * 				Repetir
 * 					Mostrar menú apuestas sencillas (1 a 18, 19 a 36, Par, impar, rojo, negro o salir)
 * 					Leer opción menú apuestas sencillas
 * 					Según opcion
 * 						Caso 1 (1 a 18)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 2 (19 a 36)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 						
 * 						Caso 3 (Par)
	 *   					Repetir
	 * 							Pedir cantidad apostada
	 * 							GNA, comparar y mostrar 
	 * 							Llamar actualizar cartera
	 * 						Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 4 (Impar)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 5 (rojo)
 *   						Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 						
 * 						Caso 6 (negro)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 7 (salir)
 * 							Mostrar despedida
 * 				Mientras la opción elegida no esté entre las disponibles
 * 
 * 			Si se eligió las apuestas múltiples
 * 				Repetir
					Mostrar menú apuestas Múltiples (A pleno, A 2, A 3, A 4, A 6, A 12, A 24 ó salir)
 * 					Leer opción menú apuestas Múltiples
 * 					Según opcion
 * 						Caso 1 (A pleno)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 2 (A 2)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 						
 * 						Caso 3 (A 3)
	 *   					Repetir
	 * 							Pedir cantidad apostada
	 * 							GNA, comparar y mostrar 
	 * 							Llamar actualizar cartera
	 * 						Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 4 (A 4)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 
 * 						Caso 5 (A 6)
 *   						Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 						
 * 						Caso 6 (A 12)
 * 							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								Llamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 * 						
 * 						Caso 7 (a 24)
							Repetir
 * 								Pedir cantidad apostada
 * 								GNA, comparar y mostrar 
 * 								ALlamar actualizar cartera
 * 							Mientras la cantidad apostada sea mayor que la que tiene en la cartera 
 * 
 * 						Caso 8 (salir)
 * 							Mostrar despedida
 * 
 * 				Mientras la opción elegida no esté entre las disponibles
 * 			
 * 			Si se eligió salir
 * 				Mostrar despedida
 * 			Fin_Si
 * 
 * 			Repetir
 * 				Mostrar si repetir
 * 				Leer si repetir
 *			Mientras no se diga Sí o No
 * 
 * 		Mientras el usuario quiera seguir jugando
 * 		Mostrar despedida
 * FIN
 * 
 * 
 * 
 * */
 import java.util.*;
 import java.io.*;
 import java.lang.*;
 
 public class ruletaAmericana {
	
	public static void main (String[] args) {

	//declaramos los objetos que vamos a utilizar
	Scanner teclado = new Scanner(System.in);
	int opcionMenu1 = 0;
	int opcionSencillas = 0;
	int opcionMultiple= 0;
	char salida = ' ';
		do{//Hacer
			do{//Repetir
  				System.out.println("Que desea hacer?");
  				System.out.println("1) Apuesta sencilla");
  				System.out.println("2) Apuesta Multiple");
  				System.out.println("3) Salir");//Mostrar menú apuestas (sencillas, múltiples o salir)
  				opcionMenu1 = teclado.nextInt();//Leer Opcion del menú
  			}while(opcionMenu1 < 1 || opcionMenu1 > 3);//Mientras la opción elegida no esté entre las disponibles
  
  			if(opcionMenu1 == 1){//Si se eligió las apuestas sencillas
  				do{//Repetir
  					System.out.println("Elija la apuesta");
  					System.out.println("1) De 1 a 18");
  					System.out.println("2) De 19 a 36");
  					System.out.println("3) Numeros pares");
  					System.out.println("4) Numeros impares");
  					System.out.println("5) Numeros rojos");
  					System.out.println("6) Numeros negros");
  					System.out.println("7) Salir");//Mostrar menú apuestas sencillas (1 a 18, 19 a 36, Par, impar, rojo, negro o salir)
  					opcionSencillas = teclado.nextInt(); //Leer opción menú apuestas sencillas
  					//Según opcion
  						//Caso 1 (1 a 18)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 2 (19 a 36)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  						
  						//Caso 3 (Par)
	    					//Repetir
	  							//Pedir cantidad apostada
	  							//GNA, comparar y mostrar 
	  							//Llamar actualizar cartera
	  						//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 4 (Impar)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 5 (rojo)
    						//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  						
  						//Caso 6 (negro)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 7 (salir)
  							//Mostrar despedida
  				}while(opcionSencillas <1 || opcionSencillas > 7);//Mientras la opción elegida no esté entre las disponibles
			}else if (opcionMenu1 == 2){//Si se eligió las apuestas múltiples
  				do{//Repetir
					//Mostrar menú apuestas Múltiples (A pleno, A 2, A 3, A 4, A 6, A 12, A 24 ó salir)
  					//Leer opción menú apuestas Múltiples
  					//Según opcion
  						//Caso 1 (A pleno)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 2 (A 2)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  						
  						//Caso 3 (A 3)
	    					//Repetir
	  							//Pedir cantidad apostada
	 							//GNA, comparar y mostrar 
	  							//Llamar actualizar cartera
	 						//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 4 (A 4)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  
  						//Caso 5 (A 6)
    						//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//Llamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
  						
  						//Caso 6 (A 12)
  							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
 								//Llamar actualizar cartera
 							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera
 						
 						//Caso 7 (a 24)
							//Repetir
  								//Pedir cantidad apostada
  								//GNA, comparar y mostrar 
  								//ALlamar actualizar cartera
  							//Mientras la cantidad apostada sea mayor que la que tiene en la cartera 
  
  						//Caso 8 (salir)
  							//Mostrar despedida
  
  				}while(opcionMultiple <1|| opcionMultiple > 8);//Mientras la opción elegida no esté entre las disponibles
  			
  			}else{//Si se eligió salir
  				//Mostrar despedida
  			//Fin_Si
			}
  			//Repetir
  				//Mostrar si repetir
  				//Leer si repetir
 			//Mientras no se diga Sí o No
  
  		}while (salida !='s' || salida != 'n');//Mientras el usuario quiera seguir jugando
  		//Mostrar despedida


		
	}
}

//COMPROBAR: CUMPLISTE TODOS LOS REQUISITOS QUE SE TE PIDIERON AL PRINCIPIO?

