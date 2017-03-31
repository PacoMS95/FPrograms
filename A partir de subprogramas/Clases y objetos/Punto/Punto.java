/*
 * Clase Punto:
 * 
 * 
 * Propiedades relevantes:
 * 
 * 	BáSICAS
 * coordenadaX : tipo double, consultable y modificable
 * coordenadaY : tipo double, consultable y modificable
 * 
 * 	DERIVADAS
 * 
 * No hay
 * 
 * MÉTODOS:
 * 
 * 	CONSULTABLES (getters)
 * 
 * double getCoordenadaX();
 * double getCoordenadaY();
 * 
 * 	MODIFICABLES (setters)
 * 
 * void setCoordenadaX(double coordenadaX);
 * void setCoordenadaY(double coordenadaY);
 * 
 * 	OTROS (añadidos) --> Se consideran métodos añadidos aquellos que no recuperan propiedades básicas ni derivadas
 * 
 * punto getOrigen();
 * double getDistanciaOrigen();
 * double getDistanciaDosPuntos (double coordenadaX2, double coordenadaY2);
 * 
 * 
 * 	RESTRICCIONES
 * 
 * Ninguna
 * 
 * */
 
 import java.io.*;
 import java.lang.Math;
 
public class Punto implements Cloneable, Comparable <Punto> {
	
	//propiedades básicas
	private double coordenadaX;
	private double coordenadaY;
	
	//Métodos constructores
	
		//Vacío
	public Punto () {
		double coordenadaX = 0.;
		double coordenadaY = 0.;
		
		}
	
		//De copia
	public Punto (Punto punto) {
		
		this.coordenadaX=punto.coordenadaX;
		this.coordenadaY=punto.coordenadaY;
		
		}
		
		//Sobrecargados ordinarios
	public Punto(double coordenadaX, double coordenadaY) { 
		
		this.coordenadaX=coordenadaX;
		this.coordenadaY=coordenadaY;
		
		}
	//MÉTODOS GETTERS Y SETTERS
	//GETTERS
	public double getCoordenadaX(){
		
		return coordenadaX;
		
		}
	
	public double getCoordenadaY(){
		
		return coordenadaY;
		
		}
		
	//SETTERS
	
	public void setCoordenadaX(double coordenadaX){
		
		this.coordenadaX=coordenadaX;
		}
	
	public void setCoordenadaY(double coordenadaY){
		this.coordenadaY=coordenadaY;
		}
	
	//MÉTODOS SOBREESCRITOS Y SOBRECARGADOS
	
	//toString: método que sirve para devolver un String con los datos del objeto referenciado
	@Override
	public String toString() {
		
		String s = "(" + this.getCoordenadaX() + "," + this.getCoordenadaY() + ")";
		return(s);
		
		}
	
	//hashCode: devuelve la identidad del objeto
	@Override
	public int hashCode(){
		Double coordenadaXWrapper = new Double (coordenadaX);
		return(coordenadaXWrapper.hashCode());
		
		}
		
	//clone: clona el objeto
	@Override
	public Punto clone(){
		Punto copia = null;
		try{
		copia = (Punto) super.clone();
		}
		catch(CloneNotSupportedException error){
			System.out.println("Objeto no clonado");
			}
		return (copia);
		}
	
	//equals: método que sirve para comprobar si dos objetos son iguales
	@Override
	public boolean equals(Object o){
	boolean igual = false;
	if (o != null && o instanceof Punto){
		Punto p = (Punto) o;
		if(this.getCoordenadaX() == p.getCoordenadaX()){
			igual = true;
			}
		}
	return (igual);
	}
	
	//compareTo: devuelve 0 si las coordenadas X e Y son las mismas y 1 si no lo son
	public int compareTo (Punto p){
		int comparacion = 0;
		if(this.getCoordenadaX() != p.getCoordenadaX() || (this.getCoordenadaY() != p.getCoordenadaY())){
			comparacion = 1;
			}
		return (comparacion);
		}
	
	

	//MÉTODOS AÑADIDOS
	
	public Punto getOrigen(){
		
		Punto pOrigen = new Punto();
		pOrigen.coordenadaX=0.0;
		pOrigen.coordenadaY=0.0;
		return (pOrigen);
		
		}
	
	public double getDistanciaOrigen(){
		
		double distanciaAlOrigen = Math.sqrt(Math.pow(coordenadaX,2) + Math.pow(coordenadaY,2)) ;
		
		return (distanciaAlOrigen);
		}
	
	public double getDistanciaDosPuntos(double coordenadaX2, double coordenadaY2){
		
		double distanciaDosPuntos = Math.sqrt(Math.pow(coordenadaX-coordenadaX2, 2)+Math.pow(coordenadaY-coordenadaY2, 2));
		return (distanciaDosPuntos);
		}
		
	
	}
