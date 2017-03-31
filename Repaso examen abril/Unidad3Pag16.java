/*El análisis, pseudocódigo y traza se encuentran en papel aparte*/
import java.io.*;
import java.util.*;
public class Unidad3Pag16 {
	public static void main (String []args){
		int contadorPares=0;
		int contadorNegativos=0;
		int opcion=0;
		int numero=0;
		Scanner teclado = new Scanner(System.in);
		while (opcion!=1){
			System.out.println("Introduzca un número por teclado");
			numero = teclado.nextInt();//leer número del teclado
			if(numero % 2 == 0){
				contadorPares++;
			}else
				if(numero < 0){
					contadorNegativos++;
				}
			System.out.println("¿Quiere salir? Introduzca 1 para si y otro número para seguir");
			opcion = teclado.nextInt();

		}//fin del mientras
		System.out.println("El resultado es..." + contadorPares + " números pares y... "+ contadorNegativos+ "números negativos.");
	}//fin de la clase principal
}//fin del programa


