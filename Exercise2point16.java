/*
This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <http://unlicense.org/>


* ANALYSIS
* 
* Name of the program: Exercise2point16.java
* 
* Goal: "write a program that ask for to integers, and show the biggest on display. If the numbers are equal, show message like 'they are equal'"
* 
* Imput: two integers.
* 
* Output: display on screen.
* 
* Supossitions: imput data are integer.
* 
* PSEUDOCODE
* 
* VARIABLES
* Integer: number1, number2
* 
* Start
* 	Display "enter two integers"
* 	Read number1
* 	Read number2
* 	if number1 > number2
* 		Show "Number 1 is bigger"
* 	else if number1 < number2
* 		Show "Number 2 is bigger"
* 	else
* 		Show "These number are equal"
* End
* 
*/

import java.util.Scanner;

public class Exercise2point16 {
	
	public static void main (String args[]) {
		
		//we declare the variables
		int number1;
		int number2;
		
		Scanner enter = new Scanner (System.in); //We declare an Scanner object called "enter"
		
		System.out.println("Enter an integer and press enter. Then, enter another one and press enter."); //instructions
		
		number1 = enter.nextInt();
		number2 = enter.nextInt(); //we ask for two integers
		
		//we start the decision-making structure
		if (number1>number2) {
			System.out.println(number1+" is bigger");
		}//fin if (number1>number2)
			
		else if (number1<number2) {
			System.out.println(number2+" is bigger");
			
		}//end else if (number1<number2)
		
		else {
			System.out.println("Both numbers are equal");
		}//end else
		
	}//end of main method
}//end of principal class

