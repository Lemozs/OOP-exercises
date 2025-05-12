package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Utility_2;

public class Project5_2 {

	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter radius: ");
			double radius = sc.nextDouble();
			
			double c = Utility_2.circumference(radius);
			double v = Utility_2.volume(radius);
			
			System.out.println();
			System.out.println("Circumference: " + c);
			System.out.println("Volume: " + v);
			System.out.println("PI value: " + Utility_2.PI);

			sc.close();
		}

	}