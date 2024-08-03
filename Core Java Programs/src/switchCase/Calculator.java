package switchCase;

import java.util.Scanner;

//Developing calculator using switch case 
public class Calculator {
	public static void main(String[] args) {
//		Importing Scanner class for taking input from user
		Scanner sc = new Scanner(System.in);
//		Taking first number as an input
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
//		Taking operator input from user
		System.out.print("Enter Operator: ");
		char ope = sc.next().charAt(0);
//		Taking second number as an input
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
//		Creating variable for storing answers
		int answer = 0;
		double answer1 = 0.0;
//		Starting switch block
		switch (ope) {
		case '+':
			answer = num1 + num2;
			System.out.println("Answer is: " + answer);
			answer = 0;
			break;
		case '-':
			answer = num1 - num2;
			System.out.println("Answer is: " + answer);
			answer = 0;
			break;
		case '*':
			answer = num1 * num2;
			System.out.println("Answer is: " + answer);
			answer = 0;
			break;
		case '/':
			try {
				answer1 = num1 / num2;
				System.out.println("Answer is: " + answer1);
				answer1 = 0.0;
				break;
			} catch (Exception e) {
				System.out.println("Can't divide by zero");
			}
		case '%':
			answer1 = num1 % num2;
			System.out.println("Answer is: " + answer1);
			answer1 = 0.0;
			break;
		default:
			sc.close();
			throw new IllegalArgumentException("Unexpected value: " + ope);
		}
//		End switch block
//		Closing scanner
		sc.close();
	}

}
