package application;

import java.util.Scanner;
import util.Calculator;

public class ProgramExemplo03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius, c, v;
		
//		V1 FUNCOES E CONSTANTE PI FORAM CRIADAS NA MAIN
		System.out.println("Enter radius: ");
		radius = sc.nextDouble();
		c = circumference(radius);
		v = volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
//		V2 FUNCOES E CONSTANTE PI FORAM CRIADAS NA CALSSE CALCULATOR, ONDE 
//		INSTANCIAMOS O OBJETO CALC
		Calculator calc = new Calculator();
		c = calc.circumference(radius);
		v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
//		V3 METODOS E E CONSTANTE STATICOS
		c = Calculator.circumferenceStatic(radius);
		v = Calculator.volumeStatic(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI_STATIC);
		sc.close();
	}
	public final static double PI = 3.14159;
	
	public static double circumference(double radius)
	{
		return 2.0 * PI * radius;
	}
	public static double volume(double radius)
	{
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
