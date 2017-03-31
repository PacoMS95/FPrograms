public class apartadoG {
	
	public static boolean espaniolONo (char caracter){
		
		//RESGUARDO
//		System.out.println("Esto es un resguardo");
		boolean bolean2;
		if ((caracter <= 'z' && caracter >= 'a') || (caracter <= 'Z' && caracter >= 'A')){
			bolean2 = true;
			
		}else{
			bolean2 = false;
		}
		
//		if (('a'<=caracter && caracter<='z')||('A'<=caracter && caracter<='Z'))
//			bolean2 = true;
//		else
//			bolean2 = false;
//

		return bolean2;
		
		
	}
}
