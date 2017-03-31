/*
 * Programa para testear la clase punto
 */


public class testPunto {
	
	public static void main (String[] args) {
		
		//Primero creamos los objetos
		Punto punto1 = null;
		Punto punto2 = null;
		
		//luego los instanciamos, es decir, le damos unos valores concretos.
		punto1 = new Punto (1, 2);
		punto2 = new Punto (3, 4);
		
		//Y ahora probamos las funcionalidades
		
		System.out.println("La coordenada X del primer punto es " + punto1.getCoordenadaX());
		punto1.setCoordenadaX(2.0);
		System.out.println("La coordenada X del primer punto vale ahora " + punto1.getCoordenadaX());
		System.out.println("La coordenada Y del primer punto vale " + punto1.getCoordenadaY());
		punto1.setCoordenadaY(3);
		System.out.println("La coordenada Y del primer punto vale ahora " + punto1.getCoordenadaY());
		System.out.println("Metodo toString " + punto1.toString());
		System.out.println("Metodo hashCode " + punto1.hashCode());
		System.out.println("Metodo clone para el punto1" + punto1.clone());
		System.out.println("Metodo equals " + punto1.equals(punto2));
		System.out.println("Metodo compareTo " + punto1.compareTo(punto2));
		System.out.println("Metodo aniadido getOrigen " + punto1.getOrigen());
		System.out.println("Metodo aniadido getDistanciaAlOrigen " + punto1.getDistanciaOrigen());
		System.out.println("Metodo aniadido getDistanciaDosPuntos " + punto1.getDistanciaDosPuntos(2, 2));
			
		
	}
}

