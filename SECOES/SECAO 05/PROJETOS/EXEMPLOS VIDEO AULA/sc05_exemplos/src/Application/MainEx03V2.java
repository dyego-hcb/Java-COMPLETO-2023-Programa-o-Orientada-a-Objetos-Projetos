package Application;

import java.util.Scanner;

public class MainEx03V2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		
//		TESTE COM EXPRESSAO CONDICIONAL TERNARIA
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;
		}
		else {
		desconto = preco * 0.05;
		}
//		PODE-SE MUDAR COM A EXPRESSAO CONDICIONAL TERNARIA O CODIGO ACIMA PARA
		double precoT = 34.5;
		double descontoT = (precoT < 20.0) ? precoT * 0.1 : precoT * 0.05;
		sc.close();

	}

}
