package entities;

public class Converter {

	
public static double dolar;
public static double cotacao;

public static double currencyConverter() {
	
	double valorBRL = dolar * cotacao;
	
	double valorComIOF = valorBRL * 1.06; 
	
    return valorComIOF;
	
	}
		
	
}
