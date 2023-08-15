import java.util.Scanner;

public class MainExemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, higger;
		
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		higger = max(a, b, c);
		showResult(higger);
		
		sc.close();
	}
	public static int max(int x, int y, int z)
	{
		int aux;
		if(x > z && x > y)
		{
			aux = x;
		}
		else if(y > z)
		{
			aux = y;
		}
		else
		{
			aux = z;
		}
		return aux;
	}
	private static void showResult(int higger) {
		System.out.println("Higger = " + higger);
	}
}
