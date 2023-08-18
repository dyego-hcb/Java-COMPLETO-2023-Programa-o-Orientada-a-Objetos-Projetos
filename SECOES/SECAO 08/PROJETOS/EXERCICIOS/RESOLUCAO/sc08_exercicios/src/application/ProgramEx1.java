package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
	}

}
