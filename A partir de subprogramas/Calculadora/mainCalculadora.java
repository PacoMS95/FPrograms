/* 
 * 
 * ENUNCIADO: Diseña e implementa una calculadora que sea capaz de 
	> Hacer las operaciones básicas(sumar, restar, dividir y multiplicar)
	> Calcular la raíz enésima y la potencia enésima de un número, así como su inverso y su opuesto
	> Almacenar y recuperar datos en la memoria (hasta dos slots de memoria)
	 
	 
	TENER EN CUENTA:
1º Seguir la metodología que se sigue en clase (véase en tema 5 la metodología que hay que seguir)
2º Manejar excepciones si surgiesen en un programa a parte (fijarse en proyecto de 11ivan)
3º Crear una clase de utilidades separada con métodos que vayan a ser usados tanto en este programa como en otro. ESTE DEBE INCLUiR RESGUARDOS, CONDUCTORES Y, POR SUPUESTO, LA FUNCIONALIDAD EN Si
4º Seguir las directrices de la POO, es decir, primero hacer los objetos que convengan y luego implementarlos en el PP
5º Seguir las normas de cohesión y acoplamiento aprendidas
6º En el PP solo deben aparecer: llamadas, alguna validación y lecturas. PP LIMPITO!
* 
 */
 
/*
 * ANALISIS
 * 
 * Nombre: Calculadora
 * 
 * Autor: Francisco Mendoza Sánchez
 * 
 * Proceso: se trata de un programa que simula una calculadora
 * 
 * Entradas: números reales
 * 
 * Salidas: dependiendo de la operación, se mostrará por pantalla los resultados.
 * 
 * Pseudocódigo generalizado
 * 
 * INICIO
	 * Repetir
	 * 		Mostrar menú de operaciones y validar entrada
	 * 		Pedir números y dar opción de guardar o recuperar números
	 * 		Realizar ccálculos
	 * 		Mostrar resultados
	 * 		Mostrar y validar repteción
	 * Mientras el usuario quiera
 * FIN
 * 
 * PSEUDOCÓDIGO DETALLADO
 * 
 * Inicio
 * 		Repetir
 * 			Repetir
 * 				Mostrar menú de operaciones
 * 				Leer entrada al menú
 * 			Mientras la entrada no sea correcta
 * 			Pedir o recuperar números*
 * 			Dar opcion de guardar número en memoria en el slot que se desee*
 * 			Realizar cálculos*
 * 			Mostrar resultados
 * 			Mostrar si repetir
 * 			repetir
 * 				leer repetición
 * 			mientras la entrada no sea correcta
 * 		Mientras el usuario quiera repetir
 * Fin
 * 
 * (*) Se convertirán en subprogramas
 * */
import java.io.*; 
import java.util.*;

public class mainCalculadora {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		char salida = ' ';
		int menuPrincipal = 0;
		int menuSecundario = 0;
		int menuTerciario = 0;
		int slot = 0;
		float numeroPorConsola1 = 0;
		float numeroPorConsola2 = 0;
		float resultado = 0;
		int cualGuardar = 0;
		int guardado = 0;
		do{//Repetir
			do{//Repetir
				System.out.println("Seleccione");
				System.out.println("1) Sumar dos numeros");
				System.out.println("2) REstar dos numeros");
				System.out.println("3) Multiplicar dos numeros");
				System.out.println("4) Dividir dos numeros");
				System.out.println("5) Calcular potencia n-esima");
				System.out.println("6) Calcular raiz n-esima");
				System.out.println("7) Calcular opuesto");
				System.out.println("8) calcular inverso");	//Mostrar menú de operaciones
  				menuPrincipal = teclado.nextInt();//Leer entrada al menú
  			}while(menuPrincipal > 8 && menuPrincipal < 1);//Mientras la entrada no sea correcta
  			do{
  			System.out.println("Introduzca opcion");
  			System.out.println("1) Recuperar numero de memoria");
  			System.out.println("2) Introducir numero por consola");
  			menuSecundario = teclado.nextInt();
			}while(menuSecundario < 1 || menuSecundario > 2);
  			if(menuSecundario == 1){
			do{
				System.out.println("que slot de memoria desea recuperar? elija entre 1 o 2");
				slot = teclado.nextInt();
			}while(slot < 1 || slot > 2);
  			
			numeroPorConsola1 = utilidadesCalculadora.recuperar(slot);
			System.out.println("Introduzca el segundo numero");
			numeroPorConsola2 = teclado.nextFloat();
			}else{
			System.out.println("Introduzca el primer numero");
			numeroPorConsola1 = teclado.nextFloat();
			System.out.println("Introduzca el segundo numero");
			numeroPorConsola2 = teclado.nextFloat();
			}//Pedir o recuperar números*
			do{
			System.out.println("Desea guardar alguno de los numeros introducidos en memoria? 1 para si y 2 para no");
			guardado = teclado.nextInt();
			}while (guardado < 1 || guardado > 2);
			if (guardado == 1){
				
				do{
			System.out.println("Que numero desea guardar? Introduzca 1 o 2 (para el primero y el segundo, respectivamente)");
			cualGuardar = teclado.nextInt();
			}while (cualGuardar < 1 || cualGuardar > 2);
			
			if (cualGuardar == 1){
				utilidadesCalculadora.guardar(numeroPorConsola1);
			}else{
				utilidadesCalculadora.guardar(numeroPorConsola2);
				}
				
				}//Dar opcion de guardar número en memoria en el slot que se desee*
			switch(menuPrincipal){
				
				case 1:
				resultado = utilidadesCalculadora.suma(numeroPorConsola1, numeroPorConsola2);
				
				break;
				
				case 2:
				resultado = utilidadesCalculadora.resta(numeroPorConsola1, numeroPorConsola2);
				break;
				
				case 3:
				resultado = utilidadesCalculadora.multiplicacion(numeroPorConsola1, numeroPorConsola2);
				break;
				
				case 4:
				resultado = utilidadesCalculadora.division(numeroPorConsola1, numeroPorConsola2);
				break;
				
				case 5:
				resultado = utilidadesCalculadora.potencia(numeroPorConsola1, numeroPorConsola2);
				break;
				
				case 6:
				resultado = utilidadesCalculadora.raiz(numeroPorConsola1, numeroPorConsola2);
				break;
				
				case 7:
				resultado = utilidadesCalculadora.opuesto(numeroPorConsola1);
				break;
				
				case 8:
				resultado = utilidadesCalculadora.inverso(numeroPorConsola1);
				break;
				
				
				}//Realizar cálculos*
  			System.out.println("El resultado de la operacion es "+ resultado);//Mostrar resultados
  			
				System.out.println("Desea repetir? S para si y otra para repetir");//Mostrar si repetir
  				salida = Character.toUpperCase(teclado.next().charAt(0));//leer repetición
  		
  	}while(salida == 'S');//Mientras el usuario quiera repetir
	 
		
	}
}

