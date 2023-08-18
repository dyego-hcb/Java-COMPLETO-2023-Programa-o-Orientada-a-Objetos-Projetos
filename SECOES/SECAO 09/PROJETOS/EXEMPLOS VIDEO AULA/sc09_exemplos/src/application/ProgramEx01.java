package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductV1;

public class ProgramEx01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ProductV1 product = new ProductV1();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		
//		VERSAO MELHORADA
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		ProductV1 product2 = new ProductV1(name, price);
		System.out.println();
		System.out.println("Product data: " + product2);
		System.out.println();
		System.out.print("Quantity in stock: ");
		quantity = sc.nextInt();
		product2.addProducts(quantity);
		System.out.println();
		System.out.println("Product data: " + product2);
		System.out.println();
		sc.close();
	}

}
