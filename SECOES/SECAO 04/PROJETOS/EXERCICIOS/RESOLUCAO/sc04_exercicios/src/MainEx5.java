import java.util.Locale;
import java.util.Scanner;
public class MainEx5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("unused")
		int codPeca, qntdPecas;
		double valorPeca, valorPagar;
		
		codPeca = sc.nextInt();
		qntdPecas = sc.nextInt();
		valorPeca = sc.nextDouble();
		
		valorPagar = valorPeca * qntdPecas;
		
		codPeca = sc.nextInt();
		qntdPecas = sc.nextInt();
		valorPeca = sc.nextDouble();
		
		valorPagar = valorPagar + (valorPeca * qntdPecas);
		
		System.out.println("VALOR A PAGAR: R$ " + valorPagar);
		sc.close();
	}

}
