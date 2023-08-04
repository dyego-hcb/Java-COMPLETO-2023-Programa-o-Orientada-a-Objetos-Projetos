package Application;

import java.util.Locale;

public class MainEx01 {

	public static void main(String[] args) {
//		DIFERENCA ENTRE PRINT E PRINTLN
//		PRINTLN
		System.out.println("PRINTLN:");
		System.out.println("Ola Mundo!");
		System.out.println("Bom Dia!");
		System.out.println();
//		PRINT
		System.out.println("PRINT");
		System.out.print("Ola Mundo!");
		System.out.println("Bom Dia!");
		
//		COMO MOSTRAR VARIAVEL INTEIRA
		int y = 32;
		System.out.println(y);
		
//		COMO MOSTRAR VARIAVEL FLUTUANTE
		double x=10.35784;
		System.out.println(y); 
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
//		TROCAR O SEPARADOR
		Locale.setDefault(Locale.US);
		
//		CONCATENAR NO PRINT E PRINTLN
		System.out.println("RESULTADO = " + x + " METROS");
		
//		CONCATENAR NO PRINTF
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
//		CONCATENAR VARIOS ELEMENTOS DIFERENTES NO PRINTF
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s TEM %d ANOS E GANHA R$ %.2f%n", nome, idade, renda);
	}
}
