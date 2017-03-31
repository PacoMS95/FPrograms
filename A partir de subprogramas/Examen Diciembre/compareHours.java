/*
 * INTERFAZ:
 * 
 * Nombre: compareHours
 * 
 * 
 * Proceso: verifica si la primera fecha introducida es anterior, posterior o igual a la segunda.
 * 
 * Precondiciones: los numeros introducidos son enteros
 * 
 * Entradas: tres números.
 * 
 * Salidas: un numero
 * 
 * Postcondiciones: el número será 1 si es anterior, 2 si es igual y 3 si es posterior.
 * 
 * Signatura: public static int compareHours (int hours1, int minutes1, int seconds1, int hours2, int minutes2, int seconds2)
 * */

public class compareHours {

	public static int compareHours (int hours1, int minutes1, int seconds1, int hours2, int minutes2, int seconds2){
		
		int resultadoDeLaComparacion = 0;
		
		//Resguardo
//		System.out.println("Llamada realizada correctamente");
		
		//CONDUCTOR
if (hours1 < hours2) 
	resultadoDeLaComparacion = 1;
	else 
		if (hours1 == hours2 && minutes1<minutes2)
			resultadoDeLaComparacion = 1;
		else
			if (hours1 == hours2 && minutes1==minutes2 && seconds1 < seconds2)
				resultadoDeLaComparacion = 1;
			else
				if (hours1 == hours2 && minutes1==minutes2 && seconds1 == seconds2)
					resultadoDeLaComparacion = 2;
				else 
					resultadoDeLaComparacion = 3;
		
		
		return resultadoDeLaComparacion;
	}
}
