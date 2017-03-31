/*El análisis, junto con el diseño general y particular y la traza están en papel*/

import java.io.*;
import java.util.*;

public class Unidad3Pag4 {
	public static void main (String []args){
	
	double numero1 = 0.0;
	double numero2 = 0.0;
	double numero3 = 0.0;
	double resultado = 0.0;
	Scanner teclado = new Scanner(System.in);

	System.out.println("Introduzca tres números. Pulse 'INTRO' cada vez que introduzca uno");
	numero1 = teclado.nextDouble();	
	numero2 = teclado.nextDouble();
	numero3 = teclado.nextDouble();
	if(numero1<0){
		resultado = numero1 * numero2 * numero3;
		System.out.println("Se han multiplicado los números entre sí. El resultado es..."+resultado);
	}
	else{
		resultado = numero1 + numero2 + numero3;
		System.out.println("Se han sumado los números entre sí. El resultado es..." +resultado);
		}//fin del else
	}//fin del método principal
}//fin de la clase
