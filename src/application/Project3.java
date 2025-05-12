package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Project3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.print("Your name: ");
		s.name = sc.next();
		System.out.print("Grade 1: ");
		s.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		s.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		s.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Final Grade = " + s.sumGrades());
		System.out.println(s.verification());
		
		
		sc.close();
	}

}
