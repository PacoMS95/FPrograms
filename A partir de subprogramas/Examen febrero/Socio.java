/* NOMBRE: clase Socio.java
 * 
 *  Propiedades relevantes:
 * 
 * Identificador: entero, consultable, derivada de cálculo, básica
 * ApellidosNombre: String, consultable, básica.
 * TipoActividad: int, consultable, modificable, básica
 * Peso: float, consultable, modificable, básica
 * Categoría: entero, consultable, básica.
 * 
 * Métodos consultores y modificadores
 * 
 * 		Getters
 * int getIdentificador()
 * String getApellidosNombre()
 * int getTipoActividad()
 * float getPeso()
 * int getCategoria()
 * 
 * 		Setters
 * void setTipoActividad(String tipoActividad)
 * void setPeso(float peso)
 * 
 * Métodos añadidos
 * 
 * calcularCalorias (INTERFAZ ESTUDIADA MáS ABAJO)
 * 
 * Restricciones: 
 * 
 * El identificador debe ser número positivo
 * La categoría debe estar entre 1 y 5
 * 
 * OBSERVACIONES
 * 
 * Orden natural, Criterio de igualdad, representacion como cadena, hash y hashCode en el enunciado.
 */


public class Socio { //aquí, después de Socio, iría implements Cloneable, Comparable<Socio>, pero con eso de no acordarme de cómo hacer los métodos clone ni compareTo...
	
	private int identificador;
	private String apellidosNombre;
	private int tipoActividad;
	private int categoria;
	private float peso;
	
	//MÉTODOS CONSTRUCTORES
	
		//vacío
	public Socio(){
		identificador = 1;
		apellidosNombre = "Pepito de los Palotes";
		tipoActividad = 1;
		categoria = 1;
		peso = 80;
		}
			
		//de copia
	public Socio(Socio socio){

		}
		
		//sobrecargado





	//GETTERS Y SETTERS

			//GETTERS
	public int getIdentificador(){
		return identificador;
		}
		
	public String getApellidosNombre(){
		return apellidosNombre;
		}
		
	public int getTipoActividad(){
		return tipoActividad; 
		}
		
	public float getPeso(){
		return peso;
		}
		
	public int getCategoria(){
		return categoria;
		}
	  
			//SETTERS
		
	public void setTipoActividad(int tipoActividad){
		this.tipoActividad=tipoActividad;
		}
		
	public void setPeso(float peso){
		this.peso = peso;
		}
		
  
	//MÉTODOS HEREDADOS DE OBJECT
		//toString
		//equals
		//compareTo
		//hashCode
		
	//MÉTODOS AÑADIDOS
	
	/*	INTERFAZ
	 * Nombre: caloriasQuemadas
	 * 
	 * Proceso: Método que calcula las calorías quemadas del socio 
	 * 
	 * Precondiciones: todos los datos de entrada son positivos.
	 * 
	 * Entrada: CTE (float), minutos de duracion de la actividad (int) y peso en Kg del socio (float)
	 * 
	 * Salida: las calorías quemadas (double)
	 * 
	 * Postcondiciones: Calorías quemadas deben ser  igual o mayor que cero.
	 * 
	 * CABECERA, PROTOTIPO, SIGNATURA O FIRMA: float caloriasQuemadas(float CTE, int duracion, float peso)
	 * */

	public double caloriasQuemadas(float CTE, int duracion, float peso){
		
		double calorias=0.0;
		
		calorias = CTE * duracion * peso;
		return calorias;
		
		}
}
/*DUDAS (para hablarlo en la revisión del examen)
 * 1) Las propiedades derivadas de cálculo, ¿Pueden ser básicas?
 * 2) a los métodos Gets y Sets, ¿Se le añade la visibilidad public?
 * */
