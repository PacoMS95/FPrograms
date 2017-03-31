/*Clase de utilidad
 */
import java.lang.*;
import java.util.*;

public class utilidadesCalculadora {
		static float slot1 = 0;
		static float slot2 = 0;
	/*
	 * INTERFAZ SUMA:
	 * 	proceso: suma dos números entre sí
	 * 	Nombre: suma
	 * 	Precondiciones: los datos a sumar deben ser números reales
	 * 	Entrada: dos nuḿeros
	 * 	Salida: se devuelve al PP la suma de ambos números
	 * 	Postcondiciones: la salida es el resultado de la suma de los números de entrada.
	 * CABECERA: float suma(float numero1, float numero2)
	 * */
	 public static float suma (float numero1, float numero2){
		 //RESGUARDO
		 //float ret = 0;
		 //System.out.println("Llamada correcta");
		 //return ret;
		 float resultado = 0;
		 resultado = numero1 + numero2;
		 return resultado;
		 }
	 /* INTERFAZ RESTA
	 * 	proceso: resta dos números entre sí
	 * 	Nombre: resta
	 * 	Precondiciones: los datos a restar deben ser números reales
	 * 	Entrada: dos nuḿeros
	 * 	Salida: la resta de ambos numeros al PP
	 * 	Postcondiciones: la salida es el resultado de la resta de los números de entrada.
	 * 	CABECERA: float resta (float numero1, float numero2)
	  * */
	 public static float resta (float numero1, float numero2){
		 //RESGUARDO
		//float ret = 0;
		//System.out.println("Llamada correcta");
		//return ret;
		float resultado = 0;
		resultado = numero1 - numero2;
		return resultado;
		 }
	  
	 /* INTERFAZ MULTIPLICACION
	 * 	proceso: multiplica dos números entre sí
	 * 	Nombre: multiplicacion
	 * 	Precondiciones: los datos a multiplicar deben ser números reales
	 * 	Entrada: dos nuḿeros
	 * 	Salida: la multiplicacion de ambos numeros al PP
	 * 	Postcondiciones: la salida es el resultado de la multiplicacion de los números de entrada.
	 * 	CABECERA: float multiplicacion (float numero1, float numero2)
	  * */
	  public static float multiplicacion (float numero1, float numero2){
		 //RESGUARDO
		 //float ret=0;
		 //System.out.println("Llamada correcta");
		 //return ret;	
		 float resultado = 0;
		 resultado = numero1 * numero2;
		 return resultado;	  
		  }
	  /* INTERFAZ DIVISIÓN 
	 * 	proceso: divide dos números entre sí
	 * 	Nombre: division
	 * 	Precondiciones: los datos a dividir deben ser números reales. El divisor no puede ser cero.
	 * 	Entrada: dos nuḿeros
	 * 	Salida: la division de ambos numeros al PP
	 * 	Postcondiciones: la salida es el resultado de la resta de los números de entrada.
	  * CABECERA: float division (float numero1, float numero2)
	  * */
	  public static float division (float numero1, float numero2){
		  		 //RESGUARDO
		  		 //float ret = 0;
			 //System.out.println("Llamada correcta");
			 //return ret; 		 
		float resultado = 0;
		resultado = numero1/numero2;
		return resultado;
		  }
	  /* INTERFAZ POTENCIA
	   * 
	   * proceso: eleva el primer número a la potencia del segundo
	   * nombre: potencia
	   * Precondiciones: los datos de entrada deben ser numeros reales
	   * Entrada: dos numeros reales
	   * Salida: la potencia del primer número a la del segundo
	   * Postcondiones: la salida es el resultado de elevar el primer número a la potencia del segundo
	   * CABECERA: float potencia (float numero1, float numero2)
	   * 
	   * */
	   
	   public static float potencia (float numero1, float numero2){
		   		 //RESGUARDO
		   //float ret = 0;
		//System.out.println("Llamada correcta");
			//return ret;
		float resultado = 0;
		
		resultado = (float)Math.pow(numero1, numero2);
		return resultado;
		   }
	  
	  /* INTERFAZ RAiZ
	   * 
	   * Proceso: calcula la raíz enésima (siendo N el segundo número) de un número (siendo este el primero)
	   * Nombre: Raíz
	   * Precondiciones: los datos de entrada deben ser números reales positivos
	   * Entrada: dos números reales
	   * Salida: la raiz enésima de un número
	   * Postcondiciones: se retorna la raíz enésima de los números pedidos por entrada
	   * CABECERA: float raiz (float numero1, float numero2)
	   * 
	   * */
	  public static float raiz (float numero1, float numero2){
		  		 //RESGUARDO
		  	float ret = 0;
			 System.out.println("En construccion");
			 return ret;
		  }
	  /*INTERFAZ OPUESTO
	   * 
	   * Proceso: calcula el opuesto de un número
	   * Nombre: opuesto
	   * Precondiciones: los datos de entrada deben ser números reales
	   * Entrada: un número real
	   * Salida: el opuesto del número
	   * Postcondicones: se devueve el opuesto del número introducido
	   * CABECERA: float opuesto (float numero1)
	   * */
	   public static float opuesto (float numero1){
		   		 //RESGUARDO
		   		 float ret = 0;
		  			 System.out.println("En construccion");
		  			 return ret;
		   		    }
	   /* INTERFAZ INVERSO
	    * 
	    * Proceso: calcula el inverso de un número
	    * Nombre: inverso
	    * Precondiciones: los datos de entrada deben de ser números reales distintos de cero
	    * Entrada: un número real
	    * Salida: su inverso (resultado de dividir 1 entre dicho número)
	    * Postcondiciones: se devuelve al programa principal el inverso del número introducido
	    * CABECERA: float inverso (float numero1)ç
	    * */
	    
	    public static float inverso (float numero1){
					 //RESGUARDO
					 float ret = 0;
			System.out.println("En construccion");
			return ret;
			}
	    /* INTERFAZ GUARDAR
	     * 
	     * proceso: permite guardar hasta dos números reales en los slots a elegir
	     * Nombre: guardar
	     * Precondiciones: los datos de entrada deben de ser números reales
	     * Entrada: un numero
	     * Salida: ninguna
	     * Postcondiciones; ninguna
	     * CABECCERA: void guardar (float numero1)
	     * */

	     public static void guardar (float numero1){
		////RESGUARDO
			 		 
			//System.out.println("Llamada correcta");
			//return ;
			 //}
			 
		Scanner teclado = new Scanner(System.in);
		int slot = 0;
		do{
		System.out.println("En que slot desea guardar su numero? presione 1 o 2");
		slot = teclado.nextInt();
		}while(slot < 1 || slot > 2);
		
		 if (slot == 1){
			 slot1 = numero1;
			 }else{
				 slot2 = numero1;
				 }
		 
			return;
	     
		}
	     /* INTERFAZ RECUPERAR
	      * 
	      * Proceso: recupera un número guardado en memoria
	      * Nombre; recuperar
	      * Precondiciones: previamente se ha debido de guardar al menos un número en memoria
	      * Entrada: el slot que quiera recuperarse 
	      * Salida: el contenido de dicho slot
	      * Postcondiciones: el número pedido se devuelve al PP
	      * CABECERA: float recuperar(int numeroPedido)
	      * */
	      
	      public static float recuperar(int numeroPedido){
			  //RESGUARDO
			  //float ret = 0;
			 //System.out.println("Llamada correcta");
			 //return (ret);
			 float devolver = 0;
			 if (numeroPedido ==1){
				 devolver = slot1;}
				 else{
				 devolver = slot2;}
				 
				 return (devolver);
				
			  }
}
