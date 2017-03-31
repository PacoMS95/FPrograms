public class PruebasArrays {

	public static void main(String[] args) {
		int [] miArray = new int[5];
		for (int i = 0; i < miArray.length; i++) {
			miArray[i] = i;
		}
		
		for (int i = 0; i < miArray.length; i++) {
			System.out.println(miArray[i]);
		}
	}
	
}