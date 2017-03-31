/*
 * EjemplosPagina16.java
 * 
 * Copyright 2017 fmendoza <fmendoza@106-02>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class EjemplosPagina16 {
	
	public static void main (String[] args) {
		
		
		System.out.println("ejemplo 1:");
				
		boolean[] array1 = new boolean[4];
		
		for(int i = 0 ; i < array1.length ; i++){
			
			System.out.print(array1[i] + " ");
			System.out.println(" ");
			}
			
		System.out.println("Se observa que los valores por defectos son false");
		
		System.out.println("Ejemplo 2: ");
		
		double[] array2 = new double[5];
		
		for(int i = 0; i < array2.length; i++){
			System.out.println(array2[i] + " ");
			}
		System.out.println("Se observa que los valores por defecto de un int son cero");
		
		System.out.println("Ejemplo 3:");
		
		double[] primos = {2, 3, 5, 7, 11, 13, 17, 19};
		
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i] + " ");
			}
		
	}
	
}
