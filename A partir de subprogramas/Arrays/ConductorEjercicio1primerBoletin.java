

public class ConductorEjercicio1primerBoletin {

	private static int[] cosas;

	public static void main(String[] args) {
		cosas = null;


		UtilidadEjercicio1.arrayAleatorioPares(cosas);// SO BURRO no pases la
								// cosa como array (el
								// compilador ya sabe
								// que es un array) -->
								// pusiste "cosa[]"
		
		UtilidadEjercicio1.veinteElementos(cosas);
		
		
		UtilidadEjercicio1.primos(cosas);
		
		UtilidadEjercicio1.insideOut(cosas);
		
		UtilidadEjercicio1.posicionDelArray(0, cosas);
		
		

	}

}
