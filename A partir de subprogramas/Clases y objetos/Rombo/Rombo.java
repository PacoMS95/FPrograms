/*
 * Clase Rombo
 * 
 * Propiedades:
 * 
 * >diagonalMayor: Double, consultable, modificable, básica, propiedad de clase
 * >diagonalMenor: Double, consultable, modificable, básica, propiedad de clase
 * >Color: String, consultable, modificable, básica
 * >Perimetro: Double,consultable, derivada, propiedad de clase
 * >Area: Double, consultable, derivada, propiedad de clase
 * >Lado: Double, consultable, derivada, propiedad de clase
 * 
 * MÉTODOS
 * 
 * 	CONSULTABLES
 * 
 * Double getDiagonalMayor();
 * Double getDiagonalMenor();
 * String getColor();
 * Double getPerimetro();
 * Double getArea();
 * Double getLado();
 * 
 * 	MODIFICABLES
 * 
 * void setDiagonalMayor(Double DiagonalMayor);
 * void setDiagonalMenor(Double diagonalMenor);
 * void setColor(string setColor);
 * 
 * RESTRICCIONES
 * 
 * Ambas diagonales deben ser mayor de cero.
 */

import java.lang.*; //esta nos hará falta para luego después implementar las potencias y las raíces cuadradas. Si, ESTO SE PUEDE HACER EN UNA CLASE
import java.io.*;


public class Rombo implements Cloneable, Comparable <Rombo> {
	
	//Propiedades básicas
	
	private double diagonalMayor;
	private double diagonalMenor;
	private String color;
	
	//Métodos constructores
	
		//vacío
		
		public Rombo() {
			
			diagonalMayor = 1.; //aquí pusiste 0.0. Recuerda que las diagonales tienen que ser mayores que cero.
			diagonalMenor = 1.;//aquí pusiste 0.0. Recuerda que las diagonales tienen que ser mayores que cero.
			color = "blanco";
			
			}
		
		//de copia
		public Rombo(Rombo rombo){//le pasamos, a la clase pública Rombo, el objeto rombo de la clase Rombo (xD)
			
			this.diagonalMayor=rombo.diagonalMayor; //con la referencia a sí mismo(this), le pasamos el método de consulta "diagonalMayor" de la clase rombo
			this.diagonalMenor=rombo.diagonalMenor; //lo mismo que lo de arriba pero con diagonalMenor
			this.color=rombo.color;
			}
		//sobrecargados ordinarios (asigna valores a los objetos que crees)
		
		public Rombo(double diagonalMayor,double diagonalMenor,String color){
			
			this.diagonalMayor=diagonalMayor; //lo que hace es asignar el valor cuando creas el objeto.
			this.diagonalMenor=diagonalMenor;
			this.color=color;
			
			}
			
		//MÉTODOS GETTERS Y SETTERS
		//GETTERS
		public double getDiagonalMayor() {
			
			return diagonalMayor;
			
			}
			
		public double getDiagonalMenor() {
			
			return diagonalMenor;
			
			}
			
		public String getColor(){
			
			return color;
			
			}
			
		public double getPerimetro(){ //este no es un return a secas. Aquí hay que calcular y, para ello, hay que declarar una variable
			
			double perimetro = Math.sqrt(Math.pow(diagonalMayor/2,2.0)+Math.pow(diagonalMenor/2,2.0));
			return (perimetro);
			
			}
		
		public double getArea(){
			
			double area = (diagonalMayor*diagonalMenor)/2;
			return (area);
			}
		
		public double getLado() {
			
			double lado = 4*(Math.sqrt(Math.pow((diagonalMayor/2),2) + Math.pow(diagonalMenor/2,2)));
			return lado;
			
			}
		//SETTERS
		public void setDiagonalMayor(double diagonalMayor){
		
			this.diagonalMayor=diagonalMayor;
		
			}
		public void setDiagonalMenor(double diagonalMenor){
			
			this.diagonalMenor=diagonalMenor;
			}
			
		public void setColor(String color){
			
			this.color=color;
			}
		//toString: método que sirve para devolver un String con los datos del objeto referenciado
		@Override
		public String toString() {
			String s = "(" + this.getDiagonalMayor() + "," + this.getDiagonalMenor() + "," + this.getColor() + ")";
			return s;
			}
		//hashCode: devuelve la identidad del objeto
		@Override

		public int hashCode()
		{
			//return((int)(getDiagonalMayor()*getDiagonalMenor()*11311)/3); //este es el hashCode construido por Jaraner
			Double diagonalMayorWrapper = new Double (diagonalMayor);
			return(diagonalMayorWrapper.hashCode()); //este es el hashCode de servicio de Java. Para usarlo, lo que hemos hecho es usar la clase de envoltura Double (introduciéndole los datos de diagonalMayor) y hemos usado el método hashCode pasándole nada como parámentro
		}
			
		//clone: clona el objeto
		@Override
		public Rombo clone() { //usamos la clonación superficial porque no es una clase que viene de otra clase, sino que es una clase "básica" (no sé si se dice así xD)
			Rombo copia = null; //antes de un bloque try-catch hay que declarar lo que vamos a usar SIEMPRE
			//null significa que está vacío, que no contiene nada.
			try {
				copia = (Rombo) super.clone();
				}
			catch(CloneNotSupportedException error){
				System.out.println("Objeto no clonado");
				}
			return copia;
			} // el bloque try-catch siempre es necesario aquí.
		//equals: método que sirve para comprobar si dos objetos son iguales
		@Override
		public boolean equals(Object o) {//método público, que devuelve booleano, llamado equals y al que se le pasa un objeto o de tipo o.
			boolean igual = false; //empezamos diciendo que el resultado va a ser false de forma predeterminada.
			if (o != null && o instanceof Rombo){ //null significa "que está vacío". Si el objeto que se le pasa (o en este caso) NO es nulo y además es una instancia de la clase Rombo
				Rombo r = (Rombo) o; //Pues eso, si se cumple la condición de arriba, casteamos el objeto o a la clase rombo. Esto se hace porque el objeto o se pasa al subprograma pero no tiene por qué ser de la clase rombo, puede ser de cualquiera
				if(getLado() == r.getLado()){
					igual = true;
					}
			}
			return igual;
		}
		//compareTo: en este caso comparamos los lados de los rombos, ya que lo más natural es que un rombo sea mayor o menor que otro dependiendo de sus lados. Si hubiese sido una persona pues, qué se yo, podríamos haber usado su edad o su estatura según nos interesase
		public int compareTo(Rombo r){ //método público, que devuelve un entero y requiere de un objeto r de la clase Rombo
			int comparacion = 0;
			if(this.getLado() > r.getLado()){ //aquí dice: si el objeto que estamos tratando ("this") es mayor que el objeto que le hemos pasado. OJO! a cualquier método que invoques tienes que pasarle unos parámetros (es la función de los paréntesis). Lo digo porque se te olvidan.
				comparacion = 1;
			}else{
				if(this.getLado()< r.getLado()){
					comparacion = -1;
					}
				}
			return comparacion; //devuelve un -1 si el objeto pasado es menor que el rombo r, 1 si es mayor  y cero si son iguales
			}
}
