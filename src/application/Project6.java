package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Converter;

public class Project6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		Converter.cotacao = sc.nextDouble();		
		System.out.println("How many dollars will be bought? ");
		Converter.dolar = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + Converter.currencyConverter());
		
		sc.close();
	}


}
