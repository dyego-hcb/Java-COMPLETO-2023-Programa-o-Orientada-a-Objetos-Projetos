package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductV2;

public class ProgramEx02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		ProductV2 product = new ProductV2(name, price, quantity);
		System.out.println(product.toString());
		sc.close();
	}

}
