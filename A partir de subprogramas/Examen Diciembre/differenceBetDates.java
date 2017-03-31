/*
 * INTERFAZ:
 * 
 * Nombre: differenceBetDates
 * 
 * Proceso: Muestra la diferencia de años, meses y días que hay entre dos fechas leidas por teclado
 * 
 * Precondiciones: los datos de entrada deben corresponder a fechas reales.
 * 
 * Entradas: seis numeros enteros
 * 
 * Salidas: Ninguna (pinta en pantalla)
 * 
 * Postcondiciones: Ninguna
 * 
 * Signatura: public static void differenceBetDates (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2)
 * */

public class differenceBetDates {
	
	public static void differenceBetDates (int anio1, int mes1, int dia1, int anio2, int mes2, int dia2){
		
		//resguardo
	//	System.out.println("Llamada correcta");
		
		int diferenciaAnios = 0;
		int diferenciaMeses = 0;
		int diferenciaDias = 0;
		
		if (anio1 > anio2 || (anio1 == anio2 && mes1 > mes2) || (anio1 == anio2 && mes1 == mes2 && dia1 > dia2) ) {
		diferenciaAnios = anio1 - anio2;
		diferenciaMeses = mes1 - mes2;
		diferenciaDias = dia1 - dia2;
		} else {
			diferenciaAnios = anio2 - anio1;
			diferenciaMeses = mes2 - mes1;
			diferenciaDias = dia2 - dia1;
		}
		
		System.out.println("La diferencia en anios es " + diferenciaAnios + ", la diferencia en meses es " + diferenciaMeses + "y la diferencia en dias es " +diferenciaDias);
		return;
	}
}
