/*ESTUDIO INTEFAZ
 * 
 * Proceso: calcula cu�nto vale Ackerman seg�n los par�metros que se le pasan
 * Precondiciones: Ninguna (El subprograma se encarga de validar la entrada)
 * Entrada: Dos n�meros reales
 * Salida: un n�mero real
 * Postcondiciones: no hay
 * 
 * Cabecera: public static float funcionAckerman (int m, int n)
 * */
public class Calculo {

	public static float funcionAckerman (float m, float f){
		float resultado = 0;
		
		if(m == 0)
			resultado = f + 1;
		else if(m>0 && f ==0)
			resultado = Calculo.funcionAckerman((m - 1), 1);
		else
			resultado = Calculo.funcionAckerman((m - 1), Calculo.funcionAckerman(m, (f-1)));
		return resultado;
		
	}
}
