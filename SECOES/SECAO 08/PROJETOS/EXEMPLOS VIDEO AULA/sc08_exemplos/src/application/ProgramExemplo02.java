package application;

import java.util.Scanner;
import entities.Product;

public class ProgramExemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.toString());
		System.out.println();
		System.out.print("Enter the number of products to be add in stock: ");
		int qunatity = sc.nextInt();
		product.addProducts(qunatity);
		System.out.println("Update dados:");
		System.out.println(product.toString());
		System.out.println();
		System.out.print("Enter the number of products to be remove in stock: ");
		qunatity = sc.nextInt();
		product.removeProducts(qunatity);
		System.out.println("Update dados:");
		System.out.println(product.toString());
		System.out.println();
		
		sc.close();
	}

}
