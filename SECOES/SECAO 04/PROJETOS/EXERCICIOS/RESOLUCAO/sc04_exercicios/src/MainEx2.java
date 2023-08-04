import java.util.Scanner;
public class MainEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio_circulo, area_ciruclo, pi = 3.14159;
		
		raio_circulo = sc.nextDouble();
		
		area_ciruclo = pi * (raio_circulo * raio_circulo);
		
		System.out.println("A = " + area_ciruclo);
		
		sc.close();
	}

}
