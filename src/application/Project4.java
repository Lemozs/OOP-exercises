package application;

import java.util.Locale;
import java.util.Scanner;

public class Project4 {

	
	public final static double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.println();
		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI value: " + PI);

		sc.close();
	}

	private static double circumference(double radius) {
	    return 2.0 * PI * radius;
	}

	private static double volume(double radius) {
	    return 4.0 * PI * radius * radius * radius / 3.0;
	}

	
	
	

}
