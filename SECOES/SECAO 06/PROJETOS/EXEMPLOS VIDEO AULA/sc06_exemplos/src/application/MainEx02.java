package application;

import java.util.Scanner;

public class MainEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int soma = 0;
		
		while(num != 0)
		{
			num = sc.nextInt();
			soma += num;
		}
		System.out.println(soma);
		
		sc.close();
	}

}
