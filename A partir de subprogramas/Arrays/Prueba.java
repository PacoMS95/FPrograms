/*
 * Prueba.java
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
import java.util.*;

public class Prueba {
	
	public static void main (String[] args) {
	
	//iniciamos el escáner
	Scanner sc = new Scanner(System.in);
	//ahora declaramos(primer miembro de la asignación) e inicializamos (segundo miembro) el array
	short[] notas = new short[3]; 
	//también podríamos haber primero declarado la variable notas de tipo array y luego asignarle a notas los tres valore en memoria, así
	//short[] notas;
	
	//notas = new short[2];
	
	System.out.println("introduzca ahora tres notas seguidos de intro despues de cada nota Introduzca solo valores del 1 al 10");
	
	do{
	System.out.println("Introduzca la primera nota");
	notas[0]= sc.nextShort();
	} while (notas[0] <1 || notas[0] > 10);
	
	do {
	System.out.println("Introduzca la segunda nota");
	notas[1] = sc.nextShort();
	} while (notas[1] < 1 || notas[1] > 10);
	
	do{
	System.out.println("Introduzca la tercera nota");
	notas[2] = sc.nextShort();
	} while (notas[2] < 1 || notas[2] > 10);
	
	System.out.println("Las notas son " + notas[0] + " ," + notas[1] + " y "+ notas[2]);
	
	System.out.println("Vamos a recorrer el array ahora con un for");	
	for(int i = 0 ;i < 3 ; i++){
		System.out.println(notas[i]);
		}
	System.out.println("Ahora  vamos a asignar un valor predeterminado a las notas porque nos caen mal los alumnos");
	for(int i = 0; i< notas.length; i++){
		System.out.println("El alumno numero " + (i + 1) + " tiene la nota " + (i*i+2));
		}
	System.out.println("Ahora vamos aprobar un array de objetos. El objeto sera rombo");
	System.out.println(" ");
	
	//Declaración
	Rombo[] rombo;
	//Crear array
	rombo = new Rombo[3];
	//Inicializar los elementos del array
	rombo[0]=new Rombo(10, 20, "Negro");
	rombo[1]=new Rombo(20, 30, "Amarillo");
	rombo[2]=new Rombo(30, 40, "Rosa");
	
	//Y los mostramos
	for(int i = 0; i < rombo.length; i++){
	System.out.println("La diagonal mayor del rombo " + (i+1) + " es: " + rombo[i].getDiagonalMayor());
	System.out.println("La diagonal menor del rombo " + (i+1) + " es: " + rombo[i].getDiagonalMenor());
	System.out.println("El color del rombo " + (i+1) + " es: " + rombo[i].getColor());
	System.out.println(" ");
		}
	System.out.println("Vamos ahora a copiar el contenido del array primero en el segundo, y luego a mostrarlo");
	System.out.println(" ");
	System.out.println("Creamos dos arrays y los mostramos para ver que realmente lo hemos creado");
	//declaramos los arrays
	int [] a;
	int [] b;
	
	//creamos los arrays con tres elementos
	a = new int[3];
	b = new int[3];
	
	//asignamos valores al array
	for(int i = 0; i < a.length; i++){
	a[i] = i;
	System.out.println("En la posicion " + (i+1) + " el valor del array es " + i);
	}
	System.out.println("Posteriormente, copiamos el array a en b y lo imprimimos");
	System.arraycopy(a,0,b,0,a.length); //esta es la copia
	for(int i = 0; i < b.length ; i++ ){
	System.out.println("En la posicion " + (i+1) + " del array b el valor del array es " + i);
	
	}
	
	}
	
}

