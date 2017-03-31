/* Programa para testear la clase rombo
 */


public class testRombo {
	
	public static void main (String[] args) {
		//inicializamos dos objetos de la clase rombo a null (no uno, sino dos. Esto es porque nos hará falta un segundo para probar el método equals)
		Rombo rombo1 = null;
		Rombo rombo2 = null; //este segundo es para la comparación
		
		//ahora los instanciamos, es decir, le damos unos valores concretos
		
		rombo1 = new Rombo(1.0, 3.0, "Azul");
		rombo2 = new Rombo(1.0, 2.0, "Verde"); //este segundo es para la comparación
		
		//y ahora probamos las funcionalidades (véase el documento "Y después de la interfaz-contrato, qué diantres hago". Todo lo que viene en ese documento hay que probarlo)
		
		System.out.println("La diagonal mayor del rombo primero vale " + rombo1.getDiagonalMayor()); //para llamar a la diagonal mayor del rombo primero primero llamamos al rombo1, le metemos un punto que es el "por favor" y luego llamamos al método get de la diagonal mayor 
		rombo1.setDiagonalMayor(2.0);
		System.out.println("La diagonal mayor vale ahora " + rombo1.getDiagonalMayor());
		System.out.println("La diagonal menor del primer rombo vale " + rombo1.getDiagonalMenor());
		rombo1.setDiagonalMenor(2.0);
		System.out.println("La diagonal menor vale ahora " + rombo1.getDiagonalMenor());
		System.out.println("El color del primer rombo es " + rombo1.getColor());
		rombo1.setColor("Rojo");
		System.out.println("El color del primer rombo ahora es " + rombo1.getColor());
		System.out.println("El area del primer rombo vale "+ rombo1.getArea());
		System.out.println("El lado del rombo vale "+ rombo1.getLado());
		System.out.println("toString: "+rombo1.toString());
		System.out.println("hashCode: "+rombo1.hashCode());
		System.out.println("clone: "+rombo1.clone());
		System.out.println("equals: "+rombo1.equals(rombo2));
		System.out.println("compareTo: "+rombo1.compareTo(rombo2));
		
	}
}
