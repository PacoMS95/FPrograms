
public class apartadoD {

		public static boolean bisiesto(int anio, int mes, int dia) {
			//RESGUARDO
//			System.out.println("Probando");
			boolean bolean=true;
		    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
		    bolean = true;
		    }else{
		    bolean = false;
		    }
			return bolean;
	}
}