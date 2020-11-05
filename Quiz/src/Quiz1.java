import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input a value for feet: ");
		double feet = in.nextDouble();
		System.out.print("Input a value for inches: ");
		double inches = in.nextDouble();
		
		double feet_remain = feet-5;
		double inch_new = feet_remain*12;
		double inches_new= inches+inch_new;
		
		System.out.println("Ideal weight for female is "+ (40+(5*inches_new))+ " kg");
		System.out.println("Ideal weight for male is "+ (50+(6*inches_new))+ " kg");
		
	}
	
}
