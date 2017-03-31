/* CLASE RECTANGULO
 * 
 * Propiedades relevantes: alto, ancho y área
 * 
 * Desglose de las propiedades
 * 
 * P. Alto: float, consultable y modificable, básica
 * 
 * P. Ancho: float, consultable y modificable, básica
 * 
 * P. Area: float, consultable, derivada de cálculo (ancho * alto) .
 * 
 * GETTTERS Y SETTERS
 * 
 * public float getAlto();
 * 
 * public void setAlto(float alto);
 * 
 * public float getAncho();
 * 
 * public void setAncho(float ancho);
 * 
 * public float getArea(loat ancho, float alto);
 * 
 * ORDEN NATURAL: por ancho y a igualdad por largo 
 * 
 * CRITERIO DE IGUALDAD: Dos rectángulos son iguales si su área es la misma
 * 
 * REPRESENTACIÓN COMO CADENA: ancho, largo y área separados por comas
 * 
 * 
 * RESTRICCIONES
 * 
 * Lados deben ser mayor que cero.
 * 
 * 
 * */

public class Rectangulo  {
	private int x,y;
	
	Rectangulo(){
		
	x=1;y=1;
		
	}
	
	Rectangulo(int xEntrante, int y){
		this();
		if(xEntrante<1 && y<1){
			
			throws new Exception("Error n puede ser menor q 0");
			}
			else{
			this.x=x;
			this.y=y;
		}
		}
		
		public int getX(){
			return this.x;
			}
			
		public void setX(int x){
			
			if(!(x<1))
			this.x=x;
			else throw new Exception("Error x");
		}
	
}
