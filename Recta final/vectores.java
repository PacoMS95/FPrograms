/* 
 * Análisis y pseudocódigo generalizado en el cuaderno de la US
 * 
 * Pseudocódigo detallado:
 
	Entorno
		Variables:
			Reales: X1, X2, Y1, Y2, modulo, vectorSumaX, vectorSumaY ,productoEscalar
			Enteras: opcion, repetir
 * 
 * Inicio
 * 		Repetir
 * 			//mostrar, leer y validar el menú
 * 			Repetir
 * 				//Leer coordenadas
	  				Leer X1
	  				Leer Y1
	  				Leer X2
	  				Leer Y2
	  				//Mostrar, leer y validar menú
	  				Mostrar "Elija opción 1) calcular m-ódulos de vectores 2) Calcular las coordenadas del vector suma 3)
	  				Calcular el producto escalar de los vectores o 4) Calcular las coordenadas del vecctor producto vectorial"
	  				Leer opcion
 * 			Mientras opción sea menor que 1 ó mayor que 4
	 * 		Según opcion
	 * 			Caso 1:
	 * 				//calcular y mostrar módulo de los vectores
					modulo = sqrt((x2 - x1)*(X2-X1) + (Y2-Y1)*(Y1-Y2))
					Mostrar ("El módulo vale..." + modulo);
	 * 			Caso 2:
					//Calcular y mostrar las coordenadas del vector suma
					vectorSumaX = X1+X2
					Mostrar ("El vector suma tiene como coordenada X..." + vectorSumaX)
					vectorSumaY= Y1+Y2
					Mostrar("El vector suma tiene como coordenada Y ..." + vectorSumaY)
	 * 			Caso 3:
					//Calcular y mostrar producto escalar
					productoEscalar = X1*X2 + Y1*Y2
					Mostrar "El producto escalar equivale a ..." + productoEscalar
	 * 			Caso 4:
					//Calcular y mostrar las coordenadas del vector producto
					Mostrar "En construcción"
			Fin según
			//Preguntar si repetir
			mostrar "Desea repetir? pulse 1 para sí y otro número para no"
			Leer repetir
 * 		Mientras repetir sea 1
 * Fin
 * 
 */


public class vectores {
	
	public static void main (String[] args) {
		
		//declaramos las variables
		
		
		
	}
}
