package Application;

import java.util.Scanner;

public class MainEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int minutos = sc.nextInt();
		double conta = 50.00;
		
		if(minutos > 100)
		{
//			conta = conta + (minutos - 100) * 2;
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("Valor da Conta R$ %.2f", conta);
		
		sc.close();
	}

}
