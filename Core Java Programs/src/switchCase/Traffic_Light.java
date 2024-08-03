package switchCase;

import java.util.Scanner;

/*
 * Write a program that takes a character representing a traffic light color
 * (R for Red, Y for Yellow, G for Green) and prints the corresponding action 
 * ("Stop" for Red, "Ready" for Yellow, "Go" for Green) using a switch case. 
 */

public class Traffic_Light {

	public static void main(String[] args) {
//		Importing Scanner class for taking input from user
		Scanner sc = new Scanner(System.in);
//		Taking the traffic light color character as an input
		System.out.println("Enter the color character: R, Y, G or r, y, g");
		char color = sc.next().charAt(0);
		
		switch (color) {
		case 'R':
			System.out.println("STOP");
			break;
		case 'Y':
			System.out.println("READY");
			break;
		case 'G':
			System.out.println("GO");
			break;
		case 'r':
			System.out.println("STOP");
			break;
		case 'y':
			System.out.println("READY");
			break;
		case 'g':
			System.out.println("GO");
			break;
		default:
			throw new IllegalStateException("Unexpected color "+ color);
		}
	}

}
