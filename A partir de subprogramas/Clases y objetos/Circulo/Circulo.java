/* A continuación tenemos otra forma de presentar la información para completar el estudio de
interfaz. Dados los tipos siguientes, estudia sus interfaces, escríbelas e implementa las
clases correspondientes.
  
 * Clase Círculo

Propiedades:
	Centro: Punto, consultable y modificable.
	Radio: real, consultable y modificable.
	Orden natural: por el centro y a igualdad de éste por el radio.
	Criterio de Igualdad: si tienen el mismo centro y el mismo radio.
	Representación como cadena: Centro y Radio separados por comas y entre paréntesis.


Funcionalidades:
	Desplazar: desplaza el centro pero conserva el radio.

Restricciones:

	centro no puede ser null
	radio no puede ser menor o igual a cero.

Consideraciones:
	Estamos interesados en saber el área y el perímetro.
 
 */
 
 /* INTERFAZ CONTRATO DE CíRCULO
   
	PROPIEDADES
   
		Centro: Punto, consultable y modificable, básica
		Radio: real, consultable y modificable, básica
		Area: double, derivada de cálculo
		Perímetro: double, derivada de cálculo


	MÉTODOS
	
		CONSULTABLES
			punto getCentro();
			double getRadio();
		MODIFICABLES
			void setCentro(punto p);
			void setRadio(double radio);
		OTROS o AÑADIDOS
			double getArea(radio);
			double getPerimetro(radio);
		
  
	RESTRICCIONES

	El centro no puede ser null
	El radio no puede ser menor o igual a cero.

	 OBSERVACIONES

		Orden natural: por el centro y a igualdad de éste por el radio.
		Criterio de Igualdad: si tienen el mismo centro y el mismo radio.
		Representación como cadena: Centro y Radio separados por comas
*/
//importamos librerías  necesarias

import java.io.*;
import java.lang.Math; //para el cálculo de potencias


public class Circulo implements Cloneable, Comparable <Circulo> {
	
	//PROPIEDADES BáSICAS
	private Punto centro;
	private double radio;
	
	
		//VACIO
	public Circulo () {
		Punto centro = null;
		double radio = 0;
		}
		
		//COPIA
	public Circulo (Circulo circulo) {
		this.centro = circulo.centro;
		this.radio = circulo.radio;
		}
		//SOBRECARGADOS ORDINARIOS
	public Circulo (Punto centro, double radio){
		this.centro=centro;
		this.radio=radio;
		}
	//MÉTODOS GETTERS Y SETTERS
	
		//GETTERS
	
	public Punto getCentro(){
		
		return centro;
		
		}
	
	public double getRadio(){
		
		return radio;
		
		}
		
		//SETTERS
		
	public void setCentro(Punto p){
		
		this.centro = centro;
		
		}
	
	public void setRadio(double radio){
		
		this.radio = radio;
		
		}
		
		
	//MÉTODOS SOBREESCRITOS Y SOBRECARGADOS
	
	//toString: método que sirve para devolver un String con los datos del objeto referenciado
	@Override
	public String toString(){
		
		String s = "(" + this.getCentro() + "," + this.getRadio() + ")";
		return (s);
		}
	
	
	//hashCode: devuelve la identidad del objeto
	@Override
	public int hashCode(){
		Punto centroWrapper = new Punto (centro);
		return (centroWrapper.hashCode());
		}	
		
	//clone: clona el objeto
	@Override
	public Circulo clone(){
		Circulo copia = null;
		try {
		copia = (Circulo) super.clone();
		}catch(CloneNotSupportedException error){
			System.out.println("Objeto no clonado");
		}
		return (copia);
		}
		
	//equals: método que sirve para comprobar si dos objetos son iguales
	@Override
	public boolean equals(Object o){
		boolean igual = false;
		if (o != null && o instanceof Circulo){
			Circulo c = (Circulo) o;
			if (this.getCentro() == c.getCentro()){
				igual = true;
				}
			}
		return (igual);
		}
	
	
	//compareTo: devuelve 0 si son iguales y 1 si no lo son
	
	public int compareTo(Circulo c){
		int comparacion = 0;
		if ((this.getCentro() == c.getCentro()) && (this.getRadio() == c.getRadio())){
			comparacion = 1;
			
			}return (comparacion);
		
		}
	
	
	}
