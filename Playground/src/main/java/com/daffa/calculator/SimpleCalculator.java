package main.java.com.daffa.calculator;
import java.util.Scanner;


/**
 * @author Daffa Firtiyan
 *	A simple calculator program that scans keyboard input and add it with each other
 */
public class SimpleCalculator {

	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = keyboardInput.nextDouble();
		
		System.out.print("Enter second number: ");
		double num2 = keyboardInput.nextDouble();
		
		System.out.println(num1+num2);
	}

}
