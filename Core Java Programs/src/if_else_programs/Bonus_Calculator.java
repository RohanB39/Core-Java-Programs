package if_else_programs;

import java.util.Scanner;

/* 
 * Q) Calculate the total salary and bonus, Bonus gives only
 * when the experience is more than 5 years
 * 
 */
public class Bonus_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary: ");
		int salary = sc.nextInt();
		int bonus = 0;
		System.out.println("Enter Experience: ");
		int exp = sc.nextInt();
		bonus = (salary*exp)/100;
		if (exp >= 5) {
			salary = salary + bonus;
			System.out.println("Your total salary including bonus = "+salary);
		}else {
			System.out.println("You are not eligible for bonus");
		}
		
		sc.close();
	}
}
