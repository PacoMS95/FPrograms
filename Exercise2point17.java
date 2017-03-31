/* Year/author: 2016/Francisco Mendoza Sánchez

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


  ANALYSIS
  
  Name: Exercise2point17.java
  
  Goal: Write an application that reads five integers and determines and prints thouse integers
  that are the biggest and the smallest.
  
  Input: five integers via keyboard.
  
  Output: those five integers from the input but in descendant order.
  
  Suppositions: the input numbers are really integers and no other type.
  
  GENERAL PSEUDOCODE
  Variables
  	integers: number1,number2,number3,number4,number5.
  Start
  	show instructions
  	ask for numbers
  	find&show biggest
  	find&show smallest	
  End
  
  PSEUDOCODE
  
  Variables
  	integers: number1,number2,number3,number4,number5
  
  Start
  
  	Show "Enter five numbers. Press enter key for every number"
  
  	ask for number1
  	ask for number2
  	ask for number3
  	ask for number4
 	ask for number5
  	
  	if(number1>number2 && number1>number3 && number1>number4 && number1>number5)
  		Show "Number 1 is the biggest"
  
  	else if(number2>number1 && number2>number3 && number2>number4 && number2>number5)
  		Show "Number 2 is the biggest"
  
  	else if(number3>number2 && number3>number1 && number3>number4 && number3>number5)
  		Show "Number 3 is the biggest"
  
 	else if(number4>number2 && number2>number3 && number4>number1 && number2>number5)
  		Show "Number 4 is the biggest"
  
  	else if(number5>number2 && number5>number3 && number5>number4 && number5>number1)
  		Show "Number 5 is the biggest"
  	else
  		Show "Numbers are repeated"
 
  
  	if(number1<number2&&number1<number3&&number1<number4&&number1<number5)
		Show "First is the smallest"
		
	else if(number2<number1&&number2<number3&&number2<number4&&number2<number5)
		Show "Second is the smallest"
		
	else if(number3<number2&&number3<number1&&number3<number4&&number3<number5)
		Show "Third is the smallest"
	
	else if(number4<number2&&number2<number3&&number4<number1&&number4<number5)
		Show "Fourth is the smallest"
	
	else if(number5<number2&&number5<number3&&number5<number4&&number5<number1)
		Show "Fifth number is the smallest"
	
	else 
		Show("Numbers are repeated when I calculate the smallest");
			
 * end_of_program	
 */
 
 
// importing from libraries

import java.util.Scanner;

public class Exercise2point17 {
	
	public static void main (String args[]) {
		//declaration of variables
		double number1;
		double number2;
		double number3;
		double number4;
		double number5;
		//Create keyboard object type scanner
		Scanner keyboard = new Scanner (System.in);
		//showing the instructions
		System.out.println("Enter five numbers, real or integer. Press enter key for every number");
		//entering the numbers via keyboard
		number1 = keyboard.nextInt();
		number2 = keyboard.nextInt();
		number3 = keyboard.nextInt();
		number4 = keyboard.nextInt();
		number5 = keyboard.nextInt();
		
		//find&show biggest		
		if(number1>number2&&number1>number3&&number1>number4&&number1>number5){
			System.out.println("First is the biggest");
			}
		else if(number2>number1&&number2>number3&&number2>number4&&number2>number5){
		System.out.println("Second is the biggest");
		}
		else if(number3>number2&&number3>number1&&number3>number4&&number3>number5){
		System.out.println("Third is the biggest");
		}
		else if(number4>number2&&number2>number3&&number4>number1&&number4>number5){
		System.out.println("Fourth is the biggest");
		}
		else if(number5>number2&&number5>number3&&number5>number4&&number5>number1){
		System.out.println("Fifth number is the biggest");
		}
		else{ 
			System.out.println("Numbers are repeated when I calculate the biggest");
			}
			
		//find&show smallest
		if(number1<number2&&number1<number3&&number1<number4&&number1<number5){
		System.out.println("First is the smallest");
		}
		else if(number2<number1&&number2<number3&&number2<number4&&number2<number5){
		System.out.println("Second is the smallest");
		}
		else if(number3<number2&&number3<number1&&number3<number4&&number3<number5){
		System.out.println("Third is the smallest");
		}
		else if(number4<number2&&number2<number3&&number4<number1&&number4<number5){
		System.out.println("Fourth is the smallest");
		}
		else if(number5<number2&&number5<number3&&number5<number4&&number5<number1){
		System.out.println("Fifth number is the smallest");
		}
		else{ 
			System.out.println("Numbers are repeated when I calculate the smallest");
			}
		}//end of main
	}//end of class
