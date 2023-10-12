package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramEx02 {

	public static void main(String[] args) {
		method01();
		System.out.println("END OF PROGRAM :! !!");
	}

	public static void method01()
	{
		System.out.println("***METHOD 01 START***");
		method02();
		System.out.println("***METHOD 01 END***");
	}
	
	public static void method02() {
		System.out.println("***METHOD 02 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();

			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("INPUT ERROR");
		}
		
		sc.close();
		System.out.println("***METHOD 02 END***");
	}

}
