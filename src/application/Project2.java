package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Project2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emplo = new Employee();
		
		System.out.println("Digite seu dados: ");
		System.out.print("Name: ");
		emplo.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emplo.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emplo.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emplo);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emplo.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emplo);
		
		sc.close();
	}

}
