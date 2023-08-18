package application;

import java.util.Scanner;
import entities.Triangle;

public class ProgramExemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		RESOLUCAO SEM CLASSE
		double xA, xB, xC, yA, yB, yC, p, areaTX, areaTY;
		
		System.out.println("Enter the measures of triangles X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the measures of triangles Y:");
		yA = sc.nextDouble();
		yB= sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (xA + xB + xC) / 2.0;
		areaTX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		areaTY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaTX);
		System.out.printf("Triangle Y area: %.4f%n", areaTY);
		
		if(areaTX > areaTY)
		{
			System.out.println("Large area: X");
		}
		else
		{
			System.out.println("Large area: Y");
		}
		
//		RESOULCAO COM CLASSE
		double areaX, areaY;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangles X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangles Y:");
		y.a = sc.nextDouble();
		y.b= sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY)
		{
			System.out.println("Large area: X");
		}
		else
		{
			System.out.println("Large area: Y");
		}
		sc.close(); 
	}

}
