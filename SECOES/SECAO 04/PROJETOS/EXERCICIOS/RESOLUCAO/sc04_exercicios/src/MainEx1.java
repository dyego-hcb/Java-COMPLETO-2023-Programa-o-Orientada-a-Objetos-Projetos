import java.util.Scanner;

public class MainEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		soma = num1 + num2;

		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
