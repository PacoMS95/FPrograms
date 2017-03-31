
public class calculadoraPrueba {

	public int calculadoraPrueba(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		
		return (resultado);
	}

	public static void main(String[] args) {
		int numero1 = 2;
		int numero2 = 2;
		calculadoraPrueba calculadora = new calculadoraPrueba();
		calculadora.calculadoraPrueba(numero1, numero2);
	}

}
