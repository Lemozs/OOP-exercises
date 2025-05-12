package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Utility;

public class Project5 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Utility uti = new Utility();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = uti.circumference(radius);
		double v = uti.volume(radius);
		
		System.out.println();
		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI value: " + uti.PI);

		sc.close();
	}



	
	
	

}