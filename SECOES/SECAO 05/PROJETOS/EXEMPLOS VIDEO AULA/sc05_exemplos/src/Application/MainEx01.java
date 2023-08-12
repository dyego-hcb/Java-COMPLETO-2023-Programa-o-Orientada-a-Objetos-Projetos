package Application;

import java.util.Scanner;

public class MainEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		TESTES COM ESTRUTRAS CONDICIONAIS SIMPLES
		int x = 5;
		
		if(x > 0)
		{
			System.out.println("Boa Tarde!!");
		}
		System.out.println("Bom Dia!!");
//		ESSE BOA TARDE NAO APARECE PQ X = 5
		if(x > 5)
		{
			System.out.println("Boa Tarde!!");
		}
		System.out.println("Boa Noite!!");
		
//		TESTE COM ESTRUTURAS CONDICIONAIS COMMPOSTAS
		int hora;
		
		System.out.println("Quantas Horas ?");
		hora = sc.nextInt();
		
		if(hora < 12)
		{
			System.out.println("Bom Dia!!");
		}
		else
		{
			System.out.println("Boa Tarde !!");
		}
//		TESTE COM ESTRUTURAS CONDICIONAIS COMMPOSTAS POR VARIOS IF E ELSE
		if(hora < 12)
		{
			System.out.println("Bom Dia!!");
		}
		else
		{
			if(hora < 18)
			{
				System.out.println("Boa Tarde !!");
			}
			else
			{
				System.out.println("Boa Noite !!");
			}
		}
//		TESTE COM ESTRUTURAS CONDICIONAIS COMMPOSTAS POR IF E ELSE IF E ELSE
		if(hora < 12)
		{
			System.out.println("Bom Dia!!");
		}
		else if(hora < 18)
		{
			System.out.println("Boa Tarde !!");
		}
		else
		{
			System.out.println("Boa Noite !!");
		}		
		sc.close();
	}

}
