/*
 * Nombre: carreraCaballos.java
 * 
 * Autor: Francisco Mendoza Sánchez
 * 
 Diseña un programa para simular una carrera de tres caballos. 
 * Las probabilidades de ganar las simulará el diseñador según sus propios criterios.
 * El programa permitirá al usuario jugar repetidas veces si lo desea.
 * Puede incluirse la posibilidad de apostar interactivamente.
 * 
 * ANALISIS
 * 
 * OBJETIVO: desarrollar un programa para simular una carrera de tres caballos. 
 * 			
 * 			Habrá un número entre 1 y 999 apostadores (además del jugador) aleatorio,
 * 			que apostará una cantidad aleatoria entre 5 y 100 euros a uno de los tres caballos aleatoriamente
  			
  			El jugador apostará la cantidad que quiera, mientras esté entre el rango que apuesta
 * 			todo el mundo, al caballo que quiera. Antes que él, habrá un número aleatorio de jugadores que hayan apostado. 
 * 			De esto es consciente el jugador ya que se mostrará en pantalla cuántos jugadores han apostado
 * 			a cada caballo.
 * 
 * 			Podrá saber qué cantidad de jugadores han apostado a qué caballo y cuanto gana por cada euro que apuesta
 * 			Las probabilidades de que un caballo gane serán aleatorias.
 * 
 * 			El jugador que pierda la apuesta pierde el dinero apostado, mientras que el/los
 * 			jugador/es que ganan la apuesta reciben proporcionalmente el dinero acumulado (a
 * 			excepción del 80 % de éste que se lo queda la casa de apuestas).
 * 
 * 			El jugador empieza con quinientos (500) euros y se van sumando o restando a esta cantidad el dinero correspondiente
 * 			en función de lo que se gane o pierde respectivamente. 
 * 
 * 			El programa termina cuando el jugador tiene cero o menos euros o cuando quiera retirarse.
 * 
 * ENTRADA DE DATOS: El número de euros que queremos apostar
 * 
 * SALIDA DE DATOS: La cantidad de dinero ganado o perdido.
 * 
 * RESTRICCIONES: El dinero apostado no puede ser menor que cinco ni mayor que cien (o, en su defecto, mayor que el total que el usuario tenga)
 * 
 * 
 * 
 * 
 * ESTUDIO DE BUCLES:
 * 
 * (1) TIPO DE BUCLE: Bucle controlado por suceso, concretamente controlado por centinela.
 * ¿QUÉ HACE EL BUCLE?: El bucle permite repetir tantas veces como el usuario quiera el menú principal
 * INICIALIZACIÓN: Su inicialización es por lectura anticipada, antes de la primera iteración y su
 * ACTUALIZACIÓN: Actualización es por lectura final, físicamente al final del bucle. 
 * CONDICIÓN DE TERMINACIÓN: Ocurre cuando el usuario pulsa B.
 * 
 * 
 * (2) TIPO DE BUCLE: Bucle controlado por suceso, concretamente controlado por centinela
 * ¿QUÉ HACE EL BUCLE? Repite la petición de entrada de la apuesta mientras sea menor de 5 o mayor que 100
 * INICIALIZACIÓN: Su inicialización es por lectura anticipada, antes de la primera iteración y su
 * ACTUALIZACIÓN: Actualización es por lectura final, físicamente al final del bucle.
 * CONDICION DE TERMINACIÓN: Cuando el usuario introduce una apuesta válida (número entre 5 y 100)
 * 
 * 
 * (3) TIPO DE BUCLE: Bucle controlado por suceso, concretamente controlado por centinela
 * ¿QUÉ HACE EL BUCLE? Repite la petición del caballo por el que se apuesta mientras no esté entre 1 y 3
 * INICIALIZACIÓN: Su inicialización es por lectura anticipada, antes de la primera iteración y su
 * ACTUALIZACIÓN: Actualización es por lectura final, físicamente al final del bucle.
 * CONDICION DE TERMINACIÓN: Cuando se pulsa un número entre 1 y 3
 * 
 * (4) TIPO DE BUCLE: Bucle controlado por suceso, concretamente controlado por centinela
 * ¿QUÉ HACE EL BUCLE? Repite la petición de salida mientras que no se pulse s o n
 * INICIALIZACIÓN: Su inicialización es por lectura anticipada, antes de la primera iteración y su
 * ACTUALIZACIÓN: Actualización es por lectura final, físicamente al final del bucle.
 * CONDICION DE TERMINACIÓN: Cuando se pulsa S o N
 * 

   
 PSEUDOCÓDIGO GENERALIZADO (de nivel 1)
  
   Inicio
   
  	Repetir (1)
  	
  		Mostrar instrucciones y dinero restante
  		
		Imprimir menú
		
  		Pedir opción

		Si opción es A
			
				GNA entre 1 y 999 correspondiente al número de jugadores
				Asignar un número aleatorio de apostadores para cada caballo que en total sume el NGA previo
				Asignar aleatoriamente la cantidad que apuesta cada apostador
				Asignar ganancias de la casa
				Definir colecta
				Mostrar cuanto se gana por cada caballo (se incluyen cálculos en este módulo)
									
				Repetir (2)
					Mostrar rango de apuesta e introducir cifra de apuesta
				Mientras cifra sea menor que 5 o mayor que 100 o menor de lo que hay en cartera
				
				Repetir (3)
					Elegir caballo para apostar
				Mientras caballo para apostar sea distinto de 1, 2 ó 3
				
				GNA entre 1 y 3 y mostrar caballo ganador
				Asignar grupo de apostadores ganadores

				Asignar y mostrar ganancias o pérdidas del jugador
				
				Repetir (4)
					Imprimir mensaje de confirmación de salida
					Pedir salida
				Mientras opción sea distinta de S o N
		Sino
			Si opción es B
			
				Mostrar despedida
				
			Fin_Si
		Fin_Si
 * FinPP
 * 
 * 
 */

//importamos librerías necesarias
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class carreraCaballos { //clase principal

    public static void main(String args[]) { //Método main

            //declaramos objetos y variables
            Random aleatorio = new Random();
            Scanner teclado = new Scanner(System.in);
            double cartera = 500.0;
            char respuesta = 'S';
            int apuestaSobreCaballo1 = 0;
            int apuestaSobreCaballo2 = 0;
            int apuestaSobreCaballo3 = 0;
            int apostadoresSobreCaballo1 = 0;
            int apostadoresSobreCaballo2 = 0;
            int apostadoresSobreCaballo3 = 0;
            double cifra = 0.0;
            char menu = ' ';
            int caballoGanador = 0;
            int numeroJugadores = 0;
            double gananciasDeLaCasa = 0.0;
            int apostadoresSobreCaballoGanador = 0;
            double colecta = 0;
            int caballoApostado = 0;
            int opcion = 0;
            double gananciasSegunApostado = 0.0;

            do { //Repetir (1)

                // Mostrar instrucciones y dinero restante
                System.out.println("Apueste por un caballo. Solo puede apostar una cantidad entre 5 y 100 euros y no mas de lo que tiene en cartera");
                System.out.println("Le quedan " + cartera + " euros");

                // Imprimir menú
                System.out.println("Introduzca un caracter segun opcion");
                System.out.println("A.- Apostar por un caballo");
                System.out.println("B.- Salir");

                //Pedir opción
                menu = Character.toUpperCase(teclado.next().charAt(0));

                //AQUI ME EQUIVOQUÉ Y PUSE UN MIENTRAS POR LA CARA
                ////mientras sea distinta de A o B
                //while (menu != 'A' || menu != 'B') { /**SÉ QUE LO SUYO ES PONERLE UN RANGO PERO NO ME FUNCIONABA. PREGUNTAR.*/

                if (menu == 'A') {
                    //GNA entre 1 y 999 correspondiente al número de jugadores
                    numeroJugadores = aleatorio.nextInt(999) + 1;

                    //Asignar un número aleatorio de apostadores para cada caballo que en total sume el NGA previo
                    System.out.println(" ");
                    apostadoresSobreCaballo1 = aleatorio.nextInt(numeroJugadores) + 1;
                    System.out.println("El numero de jugadores que apostaron sobre el caballo 1 es " + apostadoresSobreCaballo1);
                    apostadoresSobreCaballo2 = aleatorio.nextInt(numeroJugadores - apostadoresSobreCaballo1 + 1) + 1;
                    System.out.println("El numero de jugadores que apostaron sobre el caballo 2 es " + apostadoresSobreCaballo2);
                    apostadoresSobreCaballo3 = aleatorio.nextInt(numeroJugadores - apostadoresSobreCaballo1 - apostadoresSobreCaballo2 + 1) + 1;
                    System.out.println("El numero de jugadores que apostaron sobre el caballo 3 es " + apostadoresSobreCaballo3);

                    //Asignar aleatoriamente la cantidad que apuesta cada apostador
                    apuestaSobreCaballo1 = (aleatorio.nextInt(96) + 5) * apostadoresSobreCaballo1;
                    apuestaSobreCaballo2 = (aleatorio.nextInt(96) + 5) * apostadoresSobreCaballo2;
                    apuestaSobreCaballo3 = (aleatorio.nextInt(96) + 5) * apostadoresSobreCaballo3;

                    //Asignar ganancias de la casa
                    gananciasDeLaCasa = 0.8 * (apuestaSobreCaballo1 + apuestaSobreCaballo2 + apuestaSobreCaballo3);

                    //Definir colecta
                    colecta = (apuestaSobreCaballo1 + apuestaSobreCaballo2 + apuestaSobreCaballo3) - gananciasDeLaCasa;

                    //mostrar cuanto se gana por cada caballo
                    System.out.println(" ");
                    System.out.println("Si gana el primer caballo, por cada euro que apueste ganara " + ((colecta * 0.8) / apostadoresSobreCaballo1) + " euros (ganancias de la casa de apuestas incluidas)");
                    System.out.println(" ");
                    System.out.println("Si gana el segundo caballo, por cada euro que apueste ganara " + ((colecta * 0.8)/ apostadoresSobreCaballo2) + " euros (ganancias de la casa de apuestas incluidas)");
                    System.out.println(" ");
                    System.out.println("Si gana el tercer caballo, por cada euro que apueste ganara " + ((colecta * 0.8)/ apostadoresSobreCaballo3) + " euros (ganancias de la casa de apuestas incluidas)");


                    do { //Repetir (2)
                        //Mostrar rango de apuesta e introducir cifra de apuesta
                        System.out.println(" ");
                        System.out.println("INTRODUZCA CUANTO QUIERE APOSTAR (cifra entre 5 y 100 euros y no mas de lo que tenga en cartera). Si pierde, pierde lo apostado. Si gana, recibira la parte proporcional que le corresponde (segun la formula (cifra x dinero acumulado por todos los apostadores / suma de jugadores ganadores)). La banca se lleva el 80% del total recaudado");
                        cifra = teclado.nextDouble();
                    } while ((cifra < 5 || cifra > 100) || cifra > cartera); //Mientras cifra sea menor que 5 o mayor que 100 o menor de lo que hay en la cartera

                    do { //Repetir (3)
                        //Elegir caballo para apostar
                        System.out.println(" ");
                        System.out.println("Elija el caballo sobre el que quiera apostar (numero entre 1 y 3)");
                        opcion = teclado.nextInt();
                    } while (opcion < 1 || opcion > 3); //Mientras caballo para apostar sea distinto de 1, 2 ó 3


                    //GNA entre 1 y 3 y mostrar caballo ganador
                    caballoGanador = aleatorio.nextInt(3) + 1;
                    System.out.println(" ");
                    System.out.println("El caballo ganador fue el numero " + caballoGanador);

                    //Asignar grupo de apostadores ganadores
                    //Según caballo ganador
                    switch (caballoGanador) {
                        //Caso 1
                        case 1:
                            //Grupo de apostadores ganadores es el primero
                            apostadoresSobreCaballoGanador = apostadoresSobreCaballo1;
                            //Caso 2
                        case 2:
                            //Grupo de apostadores ganadores es el segundo
                            apostadoresSobreCaballoGanador = apostadoresSobreCaballo2;
                            //Caso 3
                        case 3:
                            //Grupo de apostadores ganadores es el tercero
                            apostadoresSobreCaballoGanador = apostadoresSobreCaballo3;
                    }

                    //Asignar y mostrar ganancias o pérdidas del jugador
                    gananciasSegunApostado = (cifra * colecta) / apostadoresSobreCaballoGanador; //La formulita del reparto proporcional la tuve que buscar por vitutor.
                    if (opcion == caballoGanador) {
                        System.out.println("Usted ha ganado " + gananciasSegunApostado + " euros");
                        cartera = cartera + gananciasSegunApostado;
                        System.out.println("Le quedan " + cartera + " euros");
                    } else {
                        System.out.println("Usted a perdido " + cifra + " euros");
                        cartera = cartera - cifra;
                        System.out.println("Le quedan " + cartera + " euros");
                    }

                } else { //Sino
                    if (menu == 'B') { //Si opción es B
                        //Mostrar despedida
                        System.out.println("Adios");
                    } //Fin_Si
                    else
                        System.out.println("Becerro, has pulsado la tecla que no era");
                }
                do { //Repetir (4)
                //Imprimir mensaje de confirmacion de salida
                System.out.println(" ");
                System.out.println("Desea salir definitivamente del programa? S para salir y N para participar en una carrera");
                //Pedir salida
                respuesta = Character.toUpperCase(teclado.next().charAt(0));
				} while (respuesta != 'S' && respuesta != 'N'); //Mientras opción sea distinta de S o N
				
            } while (respuesta != 'S'); //mientras el usuario quiera

        } //Fin del método main
} //Fin de la clase principal
