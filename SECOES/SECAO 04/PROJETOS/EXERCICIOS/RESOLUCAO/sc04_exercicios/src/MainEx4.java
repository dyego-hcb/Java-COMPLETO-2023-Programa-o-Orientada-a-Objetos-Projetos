import java.util.Locale;
import java.util.Scanner;
public class MainEx4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int number;
		double sal, valHora, hrsTrab;
		
		number = sc.nextInt();
		valHora = sc.nextDouble();
		hrsTrab = sc.nextDouble();
		
		sal = valHora * hrsTrab;
		
		System.out.printf("NUMBER = " + number + "\nSALARY = U$ %.2f%n", sal);
		sc.close();
	}

}
