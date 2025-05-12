package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Project {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		System.out.print("Width: ");
		rect.width = sc.nextDouble();
		System.out.print("Height: ");
		rect.height = sc.nextDouble();
		
		System.out.println("Area: " + rect.area());
		System.out.println("Perimeter: " + rect.perimeter());
		System.out.println("Diagonal: " + rect.diagonal());
		
		sc.nextDouble();
	}

}
