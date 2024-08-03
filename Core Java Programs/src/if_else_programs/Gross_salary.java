package if_else_programs;

/* 
 * Q) Find the gross salary of an employee using his base salary His HRA and DA   
 * If the salary is 10000 or less than 10k HRA is 20% and DA is 80%
 * If the salary is 10001 or less than 20k HRA is 25% and DA is 90%
 * If the salary is greater than 20k HRA is 30% and DA is 95%
 */

public class Gross_salary {
	public static void main(String[] args) {
		double BS = 40000;
		if (BS<=10000) {
			System.out.println("The HRA is 20%");
			System.out.println("The DA is 80%");
			double hra = (BS*20)/100;
			double DA = (BS/100)*80;
			double gs = BS + hra + DA;
			System.out.println("Your Total Salary Is " + gs);
		}
		else if (BS>10000 && BS<=20000) {
			System.out.println("The HRA is 25%");
			System.out.println("The DA is 90%");
			double hra = (BS*25)/100;
			double DA = (BS/100)*90;
			double gs = BS + hra + DA;
			System.out.println("Your Total Salary Is " + gs);
		}
		else {
			System.out.println("The HRA is 30%");
			System.out.println("The DA is 95%");
			double hra = (BS*30)/100;
			double DA = (BS/100)*95;
			double gs = BS + hra + DA;
			System.out.println("Your Total Salary Is " + gs);
		}
	}
}
