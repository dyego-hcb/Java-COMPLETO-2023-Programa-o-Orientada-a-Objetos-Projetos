package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class ProgramEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valueDolar, valueChange;
		System.out.print("What is the dollar price?" );
		valueDolar = sc.nextDouble();
		System.out.print("How many dollars will be bougth?" );
		valueChange = sc.nextDouble();
		System.out.printf("Amoun to be paid in reais = %.2f", CurrencyConverter.valueTotal(valueDolar, valueChange));
		sc.close();
	}

}
