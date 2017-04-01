/*ANÁLISIS
Propósito: Leer números positivos y sumar aquellos que son múltiplos de cinco. La entrada acaba al introducir un número negativo. REALIZAR EL CONTROL DEL BUCLE CON INDICADOR.

Entradas: número(entero) 

Salidas: El resultado de la suma de los números enteros positivos múltiplos de cinco por pantalla.

Suposiciones: los datos de entrada son correctos.

PSEUDOCÓDIGO GENERALIZADO

Inicio
	Inicializar indicador
	Mientras indicador sea verdad
		Leer número
		Si número MOD 5 es 0
			Actualizar acumulador
		Sino
			Si el número es negativo
				Actualizar indicador a falso
			Fin_Si
		Fin_si	
	Fin_mientras
	Mostrar acumulador
Fin_PP

MODULOS

LEER NÚMERO(LN)

InicioLN
	Mostrar "Introduzca un número, negativo para finalizar."
	Leer numero
FinLN

MOSTRAR ACUMULADOR(MA)

InicioMA
	Mostrar "El número de números múltiplos de cinco fue", acumulador
FinMA

PSEUDOCÓDIGO DETALLADO
ENTORNO
	Variables: 
		Enteras: acumulador, numero (se inician a 0)
		Booleeanas: indicador(se inicia a verdadero)
Inicio
	Mientras indicador sea verdad
		Mostrar "Introduzca un número, negativo para finalizar"
		Leer número
		Si número MOD 5 es 0
			Actualizar acumulador
		Sino
			Si el número es negativo
				Actualizar indicador a falso
			Fin_Si
		Fin_si	
	Fin_mientras
	Mostrar acumulador
Fin_PP
			 
*/
import java.util.*;

public class Unidad3Pag32{

	public static void main (String []args){
		int acumulador = 0;
		int numero = 0;
		boolean indicador = true;
		Scanner teclado = new Scanner(System.in);
		
		while(indicador == true){
			System.out.println("Intoduzca un número, negativo para finalizar");
			numero = teclado.nextInt();
			if (numero % 5 == 0)
				acumulador = acumulador + numero;
			else if (numero < 0)
				indicador = false;

		}
		System.out.println("Se acumularon " + acumulador + " unidades");
	}

}
