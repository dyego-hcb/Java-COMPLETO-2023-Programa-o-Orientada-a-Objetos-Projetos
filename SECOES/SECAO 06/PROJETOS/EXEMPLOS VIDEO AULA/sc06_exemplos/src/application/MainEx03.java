package application;

import java.util.Scanner;

public class MainEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nParada = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<nParada; i++)
		{
			int numEntrada = sc.nextInt();
			soma += numEntrada;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
